package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* renamed from: com.tencent.maas.imagestudio.MJImageScene */
/* loaded from: classes5.dex */
public class C4060x7aac656e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f129605a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15926x39e86013;

    public C4060x7aac656e(com.p166x1da19ac6.jni.C1545xd48843e6 c1545xd48843e6, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671) {
        this.f15926x39e86013 = c1545xd48843e6;
        this.f129605a = c4099x76754671;
    }

    /* renamed from: nativeAddEmoticonLayer */
    private native java.lang.String m33072x68b75581(java.lang.String str, int i17, int i18);

    /* renamed from: nativeAddTextLayer */
    private native java.lang.String m33073x10b6da3a(java.lang.String str);

    /* renamed from: nativeAddWhenWhereLayer */
    private native java.lang.String m33074xc35fbf2e(java.lang.String str);

    /* renamed from: nativeGetCreationTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33075xaffc97ab();

    /* renamed from: nativeGetFilterID */
    private native java.lang.String m33076x2a694772();

    /* renamed from: nativeGetFilterIntensity */
    private native float m33077x691079dc();

    /* renamed from: nativeGetFilterOptions */
    private native java.lang.String m33078x68e23e87();

    /* renamed from: nativeGetImageCropDesc */
    private native com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4055x5079551f m33079xacc82a3d();

    /* renamed from: nativeGetImageLayer */
    private native com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 m33080x3ab991d5(java.lang.String str);

    /* renamed from: nativeGetImageLayers */
    private native java.lang.Object[] m33081x1c78a93e();

    /* renamed from: nativeGetLivePhotoUsage */
    private native int m33082x838dc23a();

    /* renamed from: nativeGetLocation */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072 m33083xc6b51094();

    /* renamed from: nativeGetModificationTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33084x99318c68();

    /* renamed from: nativeGetPointSize */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33085xb4890cb2();

    /* renamed from: nativeGetSceneID */
    private native java.lang.String m33086x95e8a5e8();

    /* renamed from: nativeIsFilterAdjusted */
    private native boolean m33087x7c1ae207();

    /* renamed from: nativeIsFilterEnabled */
    private native boolean m33088xe822ae88();

    /* renamed from: nativeIsLivePhoto */
    private native boolean m33089x5b13c605();

    /* renamed from: nativeIsModified */
    private native boolean m33090x9203e58a();

    /* renamed from: nativeRemoveLayer */
    private native boolean m33091xc6f7d296(java.lang.String str);

    /* renamed from: nativeSaveSnapshot */
    private native void m33092x64ff6818(java.lang.String str, int i17, int i18);

    /* renamed from: nativeSetFilterEnabled */
    private native void m33093xe641a99e(boolean z17);

    /* renamed from: nativeSetFilterID */
    private native void m33094x2521a87e(java.lang.String str);

    /* renamed from: nativeSetFilterIntensity */
    private native void m33095x9fe71350(float f17);

    /* renamed from: nativeSetFilterOptions */
    private native void m33096xfbb8a4fb(java.lang.String str);

    /* renamed from: nativeSetLivePhotoUsage */
    private native void m33097x4b842a46(int i17);

    /* renamed from: nativeUpdateAspectRatio */
    private native boolean m33098xd2b1cab3(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 c4132xa482ea73);

    /* renamed from: nativeUpdateCropRegion */
    private native boolean m33099x130f9584(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae);

    public java.lang.String a(java.lang.String str, int i17, int i18) {
        return m33072x68b75581(str, i17, i18);
    }

    public java.lang.String b(java.lang.String str) {
        return m33073x10b6da3a(str);
    }

    public java.lang.String c(java.lang.String str) {
        return m33074xc35fbf2e(str);
    }

    public com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 d(java.lang.String str) {
        return m33080x3ab991d5(str);
    }

    public boolean e(java.lang.String str) {
        return m33091xc6f7d296(str);
    }

    public void f(java.lang.String str, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c cVar, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.e eVar) {
        m33092x64ff6818(str, cVar.f129624d, this.f129605a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p469xb845a2f1.f(this, eVar)));
    }

    /* renamed from: getCreationTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33100xbf7b40c2() {
        return m33075xaffc97ab();
    }

    /* renamed from: getFilterID */
    public java.lang.String m33101x50de1409() {
        return m33076x2a694772();
    }

    /* renamed from: getFilterIntensity */
    public float m33102x8dafa565() {
        return m33077x691079dc();
    }

    /* renamed from: getFilterOptions */
    public java.lang.String m33103x4938b850() {
        return m33078x68e23e87();
    }

    /* renamed from: getImageCropDesc */
    public com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4055x5079551f m33104x8d1ea406() {
        return m33079xacc82a3d();
    }

    /* renamed from: getImageLayers */
    public com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233[] m33105x4e850147() {
        java.lang.Object[] m33081x1c78a93e = m33081x1c78a93e();
        return (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233[]) java.util.Arrays.copyOf(m33081x1c78a93e, m33081x1c78a93e.length, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233[].class);
    }

    /* renamed from: getLivePhotoUsage */
    public com.p314xaae8f345.p457x3304c6.p469xb845a2f1.d m33106xae068191() {
        int m33082x838dc23a = m33082x838dc23a();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.d dVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.d.None;
        return m33082x838dc23a != 0 ? m33082x838dc23a != 1 ? m33082x838dc23a != 2 ? m33082x838dc23a != 3 ? dVar : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.d.Both : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.d.Video : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.d.Photo : dVar;
    }

    /* renamed from: getLocation */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072 m33107xed29dd2b() {
        return m33083xc6b51094();
    }

    /* renamed from: getModificationTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33108x877d1ff() {
        return m33084x99318c68();
    }

    /* renamed from: getPointSize */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33109x5cadd2fb() {
        return m33085xb4890cb2();
    }

    /* renamed from: getSceneID */
    public java.lang.String m33110xafec6a71() {
        return m33086x95e8a5e8();
    }

    /* renamed from: isFilterAdjusted */
    public boolean m33111x5c715bd0() {
        return m33087x7c1ae207();
    }

    /* renamed from: isFilterEnabled */
    public boolean m33112xf7a1579f() {
        return m33088xe822ae88();
    }

    /* renamed from: isLivePhoto */
    public boolean m33113x8188929c() {
        return m33089x5b13c605();
    }

    /* renamed from: isModified */
    public boolean m33114xac07aa13() {
        return m33090x9203e58a();
    }
}
