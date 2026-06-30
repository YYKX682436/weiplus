package com.tencent.matrix.resource.analyzer.model;

/* loaded from: classes12.dex */
public class DestroyedActivityInfo {
    private static final java.lang.String ACTIVITY_REFKEY_PREFIX = "MATRIX_REFKEY_";
    public boolean isNotActivity;
    public final java.lang.String mActivityName;
    public final java.lang.ref.WeakReference<java.lang.Object> mActivityRef;
    public int mDetectedCount = 0;
    public final java.lang.String mKey;

    public DestroyedActivityInfo(java.lang.String str, java.lang.Object obj, java.lang.String str2) {
        this.isNotActivity = false;
        this.mKey = str;
        this.mActivityName = str2;
        this.mActivityRef = new java.lang.ref.WeakReference<>(obj);
        if (obj instanceof android.app.Activity) {
            return;
        }
        this.isNotActivity = true;
    }

    public static java.lang.String getActivityNameFromKey(java.lang.String str) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("MATRIX_REFKEY_(.*)@").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo newInstance(java.lang.String str, java.lang.Object obj) {
        return new com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo(ACTIVITY_REFKEY_PREFIX + str + "@" + obj.hashCode() + '_' + java.lang.Long.toHexString(java.util.UUID.randomUUID().getMostSignificantBits()), obj, str);
    }
}
