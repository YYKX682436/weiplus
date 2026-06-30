package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public class QuirkSettingsLoader implements r.a {
    public static final java.lang.String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final java.lang.String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final java.lang.String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final java.lang.String TAG = "QuirkSettingsLoader";

    /* loaded from: classes13.dex */
    public static class MetadataHolderService extends android.app.Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static androidx.camera.core.impl.QuirkSettings buildQuirkSettings(android.content.Context context, android.os.Bundle bundle) {
        boolean z17 = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
        java.lang.String[] loadQuirks = loadQuirks(context, bundle, KEY_QUIRK_FORCE_ENABLED);
        java.lang.String[] loadQuirks2 = loadQuirks(context, bundle, KEY_QUIRK_FORCE_DISABLED);
        androidx.camera.core.Logger.d(TAG, "Loaded quirk settings from metadata:");
        androidx.camera.core.Logger.d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = " + z17);
        androidx.camera.core.Logger.d(TAG, "  KEY_QUIRK_FORCE_ENABLED = " + java.util.Arrays.toString(loadQuirks));
        androidx.camera.core.Logger.d(TAG, "  KEY_QUIRK_FORCE_DISABLED = " + java.util.Arrays.toString(loadQuirks2));
        return new androidx.camera.core.impl.QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z17).forceEnableQuirks(resolveQuirkNames(loadQuirks)).forceDisableQuirks(resolveQuirkNames(loadQuirks2)).build();
    }

    private static java.lang.String[] loadQuirks(android.content.Context context, android.os.Bundle bundle, java.lang.String str) {
        if (!bundle.containsKey(str)) {
            return new java.lang.String[0];
        }
        int i17 = bundle.getInt(str, -1);
        if (i17 == -1) {
            androidx.camera.core.Logger.w(TAG, "Resource ID not found for key: " + str);
            return new java.lang.String[0];
        }
        try {
            return context.getResources().getStringArray(i17);
        } catch (android.content.res.Resources.NotFoundException e17) {
            androidx.camera.core.Logger.w(TAG, "Quirk class names resource not found: " + i17, e17);
            return new java.lang.String[0];
        }
    }

    private static java.lang.Class<? extends androidx.camera.core.impl.Quirk> resolveQuirkName(java.lang.String str) {
        try {
            java.lang.Class cls = java.lang.Class.forName(str);
            if (androidx.camera.core.impl.Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            androidx.camera.core.Logger.w(TAG, str + " does not implement the Quirk interface.");
            return null;
        } catch (java.lang.ClassNotFoundException e17) {
            androidx.camera.core.Logger.w(TAG, "Class not found: " + str, e17);
            return null;
        }
    }

    private static java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> resolveQuirkNames(java.lang.String[] strArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : strArr) {
            java.lang.Class<? extends androidx.camera.core.impl.Quirk> resolveQuirkName = resolveQuirkName(str);
            if (resolveQuirkName != null) {
                hashSet.add(resolveQuirkName);
            }
        }
        return hashSet;
    }

    @Override // r.a
    public androidx.camera.core.impl.QuirkSettings apply(android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.camera.core.impl.QuirkSettingsLoader.MetadataHolderService.class), 640).metaData;
            if (bundle == null) {
                androidx.camera.core.Logger.w(TAG, "No metadata in MetadataHolderService.");
                return null;
            }
            return buildQuirkSettings(context, bundle);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            androidx.camera.core.Logger.d(TAG, "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
