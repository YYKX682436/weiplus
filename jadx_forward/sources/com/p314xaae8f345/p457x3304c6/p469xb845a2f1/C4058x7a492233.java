package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* renamed from: com.tencent.maas.imagestudio.MJImageLayer */
/* loaded from: classes5.dex */
public class C4058x7a492233 {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15925x39e86013;

    private C4058x7a492233(com.p166x1da19ac6.jni.C1545xd48843e6 c1545xd48843e6) {
        this.f15925x39e86013 = c1545xd48843e6;
    }

    /* renamed from: nativeGetAnimatedImageEncoderType */
    private native int m33019x6ead5cbd();

    /* renamed from: nativeGetAnimatedImageFilePath */
    private native java.lang.String m33020x43806ada();

    /* renamed from: nativeGetDateTimeDisplayOptions */
    private native int m33021x1fd31696();

    /* renamed from: nativeGetGeoInfo */
    private native com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 m33022x1f03cee0();

    /* renamed from: nativeGetLayerID */
    private native java.lang.String m33023x2149456d();

    /* renamed from: nativeGetLayerPosition */
    private native com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33024x5e98341b();

    /* renamed from: nativeGetLayerRotation */
    private native float m33025x2f9eaa70();

    /* renamed from: nativeGetLayerScale */
    private native float m33026x8e42a398();

    /* renamed from: nativeGetLayerType */
    private native int m33027xf413732c();

    /* renamed from: nativeGetMaterialID */
    private native java.lang.String m33028x7c5b75a1();

    /* renamed from: nativeGetPlaceholder */
    private native java.lang.String m33029xcb727434();

    /* renamed from: nativeGetSubtitle */
    private native java.lang.String m33030xda94bcf7();

    /* renamed from: nativeGetTimestamp */
    private native long m33031x5a91d417();

    /* renamed from: nativeGetTimingFillMode */
    private native int m33032xc046a1cf();

    /* renamed from: nativeGetTitle */
    private native java.lang.String m33033x8d2475d9();

    /* renamed from: nativeIsDisplayingDateTime */
    private native boolean m33034x4821891c();

    /* renamed from: nativeIsDisplayingLocation */
    private native boolean m33035x4e95f936();

    /* renamed from: nativeReplaceEmoticonWithFilePath */
    private native boolean m33036xbeb8de8a(java.lang.String str, int i17, int i18);

    /* renamed from: nativeUpdateLayerPosition */
    private native boolean m33037xf25f1ba(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e);

    /* renamed from: nativeUpdateLayerRotation */
    private native boolean m33038xe02c680f(float f17);

    /* renamed from: nativeUpdateLayerScale */
    private native boolean m33039xcf9be259(float f17);

    /* renamed from: nativeUpdateLocationWithGeoInfo */
    private native boolean m33040xa786f124(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5);

    /* renamed from: nativeUpdateStyleWithMaterialID */
    private native boolean m33041x810c9619(java.lang.String str);

    /* renamed from: nativeUpdateSubtitle */
    private native boolean m33042x8700b7f8(java.lang.String str);

    /* renamed from: nativeUpdateTimestampWithDate */
    private native boolean m33043x158c48ea(long j17);

    /* renamed from: nativeUpdateTitle */
    private native boolean m33044xb6bd4278(java.lang.String str);

    public boolean a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        return m33037xf25f1ba(c3974x289f3e);
    }

    public boolean b(float f17) {
        return m33038xe02c680f(f17);
    }

    public boolean c(float f17) {
        return m33039xcf9be259(f17);
    }

    public boolean d(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5) {
        return m33040xa786f124(c4186x9bb007e5);
    }

    public boolean e(java.lang.String str) {
        return m33041x810c9619(str);
    }

    public boolean f(long j17) {
        return m33043x158c48ea(j17);
    }

    public boolean g(java.lang.String str) {
        return m33044xb6bd4278(str);
    }

    /* renamed from: getAnimatedImageEncoderType */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.b m33045x1e3c1b54() {
        int m33019x6ead5cbd = m33019x6ead5cbd();
        for (com.p314xaae8f345.p457x3304c6.p479x4179489f.b bVar : com.p314xaae8f345.p457x3304c6.p479x4179489f.b.m34306xcee59d22()) {
            if (bVar.f129996d == m33019x6ead5cbd) {
                return bVar;
            }
        }
        return com.p314xaae8f345.p457x3304c6.p479x4179489f.b.Platform;
    }

    /* renamed from: getAnimatedImageFilePath */
    public java.lang.String m33046x30090ba3() {
        return m33020x43806ada();
    }

    /* renamed from: getDateTimeDisplayOptions */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.e m33047xc45e8eed() {
        int m33021x1fd31696 = m33021x1fd31696();
        return new com.p314xaae8f345.p457x3304c6.p479x4179489f.e((m33021x1fd31696 & 1) != 0, (m33021x1fd31696 & 2) != 0, (m33021x1fd31696 & 4) != 0, (m33021x1fd31696 & 8) != 0, (m33021x1fd31696 & 16) != 0, (m33021x1fd31696 & 32) != 0);
    }

    /* renamed from: getGeoInfo */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 m33048x39079369() {
        return m33022x1f03cee0();
    }

    /* renamed from: getLayerID */
    public java.lang.String m33049x3b4d09f6() {
        return m33023x2149456d();
    }

    /* renamed from: getLayerPosition */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33050x3eeeade4() {
        return m33024x5e98341b();
    }

    /* renamed from: getLayerRotation */
    public float m33051xff52439() {
        return m33025x2f9eaa70();
    }

    /* renamed from: getLayerScale */
    public float m33052xeab6a66f() {
        return m33026x8e42a398();
    }

    /* renamed from: getLayerType */
    public com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b m33053x9c383975() {
        int m33027xf413732c = m33027xf413732c();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b bVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b.None;
        return m33027xf413732c != 0 ? m33027xf413732c != 1 ? m33027xf413732c != 2 ? m33027xf413732c != 3 ? m33027xf413732c != 4 ? bVar : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b.WhenWhere : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b.Sticker : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b.Emoticon : com.p314xaae8f345.p457x3304c6.p469xb845a2f1.b.Text : bVar;
    }

    /* renamed from: getMaterialID */
    public java.lang.String m33054xd8cf7878() {
        return m33028x7c5b75a1();
    }

    /* renamed from: getPlaceholder */
    public java.lang.String m33055xfd7ecc3d() {
        return m33029xcb727434();
    }

    /* renamed from: getSubtitle */
    public java.lang.String m33056x109898e() {
        return m33030xda94bcf7();
    }

    /* renamed from: getTimestamp */
    public long m33057x2b69a60() {
        return m33031x5a91d417();
    }

    /* renamed from: getTimingFillMode */
    public sg.c m33058xeabf6126() {
        int m33032xc046a1cf = m33032xc046a1cf();
        for (sg.c cVar : sg.c.m164425xcee59d22()) {
            if (cVar.f489195d == m33032xc046a1cf) {
                return cVar;
            }
        }
        return sg.c.None;
    }

    /* renamed from: getTitle */
    public java.lang.String m33059x7531c8a2() {
        return m33033x8d2475d9();
    }

    /* renamed from: isDisplayingDateTime */
    public boolean m33060xc1a3f665() {
        return m33034x4821891c();
    }

    /* renamed from: isDisplayingLocation */
    public boolean m33061xc818667f() {
        return m33035x4e95f936();
    }
}
