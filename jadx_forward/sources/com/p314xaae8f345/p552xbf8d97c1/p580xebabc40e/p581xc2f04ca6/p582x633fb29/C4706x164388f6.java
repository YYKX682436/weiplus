package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29;

/* renamed from: com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo */
/* loaded from: classes12.dex */
public class C4706x164388f6 {

    /* renamed from: ACTIVITY_REFKEY_PREFIX */
    private static final java.lang.String f20015x39ca8415 = "MATRIX_REFKEY_";

    /* renamed from: isNotActivity */
    public boolean f20016x623a1b78;

    /* renamed from: mActivityName */
    public final java.lang.String f20017xf8a7db47;

    /* renamed from: mActivityRef */
    public final java.lang.ref.WeakReference<java.lang.Object> f20018x73605057;

    /* renamed from: mDetectedCount */
    public int f20019x5dcb1440 = 0;

    /* renamed from: mKey */
    public final java.lang.String f20020x32b2b2;

    public C4706x164388f6(java.lang.String str, java.lang.Object obj, java.lang.String str2) {
        this.f20016x623a1b78 = false;
        this.f20020x32b2b2 = str;
        this.f20017xf8a7db47 = str2;
        this.f20018x73605057 = new java.lang.ref.WeakReference<>(obj);
        if (obj instanceof android.app.Activity) {
            return;
        }
        this.f20016x623a1b78 = true;
    }

    /* renamed from: getActivityNameFromKey */
    public static java.lang.String m41232x6bae9385(java.lang.String str) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("MATRIX_REFKEY_(.*)@").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: newInstance */
    public static com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 m41233x6bff0255(java.lang.String str, java.lang.Object obj) {
        return new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6(f20015x39ca8415 + str + "@" + obj.hashCode() + '_' + java.lang.Long.toHexString(java.util.UUID.randomUUID().getMostSignificantBits()), obj, str);
    }
}
