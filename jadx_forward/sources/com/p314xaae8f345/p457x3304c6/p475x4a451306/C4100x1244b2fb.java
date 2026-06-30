package com.p314xaae8f345.p457x3304c6.p475x4a451306;

/* renamed from: com.tencent.maas.lowerthird.MJLowerThirdImageGenerator */
/* loaded from: classes5.dex */
public class C4100x1244b2fb {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129746a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16082x39e86013;

    public C4100x1244b2fb(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f129746a = c4099x76754671;
        this.f16082x39e86013 = m33789xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m33789xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeGenerate */
    private native void m33790x83dac2ac(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, int i17, int i18);

    /* renamed from: nativeGenerateWithScaleFactor */
    private native void m33791xa164f647(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, float f17, float f18, int i17);

    /* renamed from: nativeGetFontNamesForLowerThird */
    private native java.lang.String[] m33792x92c04375(java.lang.String str);

    /* renamed from: nativeRegisterFont */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33793xf20adf49(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeRegisterLowerThird */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33794x744d5260(java.lang.String str, java.lang.String str2);

    public void a(java.lang.String str, java.util.Map map, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p475x4a451306.a aVar, com.p314xaae8f345.p457x3304c6.p475x4a451306.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f129746a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p475x4a451306.c(this, bVar));
        } else {
            i17 = -1;
        }
        m33790x83dac2ac(str, map, c3974x289f3e, aVar.f129749d, i17);
    }

    public java.util.List b(java.lang.String str) {
        return java.util.Arrays.asList(m33792x92c04375(str));
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c(java.lang.String str, java.io.File file) {
        return m33793xf20adf49(str, file.getAbsolutePath());
    }

    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b d(java.lang.String str, java.io.File file) {
        return m33794x744d5260(str, file.getAbsolutePath());
    }

    public void e() {
        this.f16082x39e86013.m16727xc85fe246();
    }
}
