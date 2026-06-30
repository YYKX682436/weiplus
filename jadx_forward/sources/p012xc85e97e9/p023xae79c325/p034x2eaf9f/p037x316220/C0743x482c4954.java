package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.QuirkSettingsLoader */
/* loaded from: classes13.dex */
public class C0743x482c4954 implements r.a {

    /* renamed from: KEY_DEFAULT_QUIRK_ENABLED */
    public static final java.lang.String f1725xd8f86fe2 = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";

    /* renamed from: KEY_QUIRK_FORCE_DISABLED */
    public static final java.lang.String f1726x12d93231 = "androidx.camera.core.quirks.FORCE_DISABLED";

    /* renamed from: KEY_QUIRK_FORCE_ENABLED */
    public static final java.lang.String f1727x97e3c4cc = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final java.lang.String TAG = "QuirkSettingsLoader";

    /* renamed from: androidx.camera.core.impl.QuirkSettingsLoader$MetadataHolderService */
    /* loaded from: classes13.dex */
    public static class MetadataHolderService extends android.app.Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* renamed from: buildQuirkSettings */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m5561xeda17633(android.content.Context context, android.os.Bundle bundle) {
        boolean z17 = bundle.getBoolean(f1725xd8f86fe2, true);
        java.lang.String[] m5562xefc3bcfb = m5562xefc3bcfb(context, bundle, f1727x97e3c4cc);
        java.lang.String[] m5562xefc3bcfb2 = m5562xefc3bcfb(context, bundle, f1726x12d93231);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Loaded quirk settings from metadata:");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = " + z17);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "  KEY_QUIRK_FORCE_ENABLED = " + java.util.Arrays.toString(m5562xefc3bcfb));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "  KEY_QUIRK_FORCE_DISABLED = " + java.util.Arrays.toString(m5562xefc3bcfb2));
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder().m5556x178d9a73(z17).m5555x9f54a63(m5564x13c4cd36(m5562xefc3bcfb)).m5554x95330c52(m5564x13c4cd36(m5562xefc3bcfb2)).m5553x59bc66e();
    }

    /* renamed from: loadQuirks */
    private static java.lang.String[] m5562xefc3bcfb(android.content.Context context, android.os.Bundle bundle, java.lang.String str) {
        if (!bundle.containsKey(str)) {
            return new java.lang.String[0];
        }
        int i17 = bundle.getInt(str, -1);
        if (i17 == -1) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Resource ID not found for key: " + str);
            return new java.lang.String[0];
        }
        try {
            return context.getResources().getStringArray(i17);
        } catch (android.content.res.Resources.NotFoundException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Quirk class names resource not found: " + i17, e17);
            return new java.lang.String[0];
        }
    }

    /* renamed from: resolveQuirkName */
    private static java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> m5563xe7dd0edd(java.lang.String str) {
        try {
            java.lang.Class cls = java.lang.Class.forName(str);
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e.class.isAssignableFrom(cls)) {
                return cls;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, str + " does not implement the Quirk interface.");
            return null;
        } catch (java.lang.ClassNotFoundException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Class not found: " + str, e17);
            return null;
        }
    }

    /* renamed from: resolveQuirkNames */
    private static java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> m5564x13c4cd36(java.lang.String[] strArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : strArr) {
            java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> m5563xe7dd0edd = m5563xe7dd0edd(str);
            if (m5563xe7dd0edd != null) {
                hashSet.add(m5563xe7dd0edd);
            }
        }
        return hashSet;
    }

    @Override // r.a
    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 mo1850x58b836e(android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0743x482c4954.MetadataHolderService.class), 640).metaData;
            if (bundle == null) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "No metadata in MetadataHolderService.");
                return null;
            }
            return m5561xeda17633(context, bundle);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
