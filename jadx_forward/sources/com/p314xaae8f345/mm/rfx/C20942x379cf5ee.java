package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagFile */
/* loaded from: classes13.dex */
public class C20942x379cf5ee extends com.p314xaae8f345.mm.rfx.C20940x143804f8 {
    static {
        tq5.k.a("xlabeffect");
        m77396xb90145c7();
    }

    private C20942x379cf5ee(long j17) {
        super(j17);
    }

    /* renamed from: Load */
    public static com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906(java.lang.String str) {
        return m77395xc1e4215(str);
    }

    /* renamed from: LoadFromAssets */
    private static native com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77393x64fa9573(android.content.res.AssetManager assetManager, java.lang.String str);

    /* renamed from: LoadFromBytes */
    private static native com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77394x76efa07b(byte[] bArr, int i17, java.lang.String str);

    /* renamed from: LoadFromPath */
    private static native com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77395xc1e4215(java.lang.String str);

    /* renamed from: nativeInit */
    private static final native void m77396xb90145c7();

    /* renamed from: analyze */
    public native java.lang.String m77397xcc7b5d4c();

    /* renamed from: copyOriginal */
    public native com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77398xd3635866();

    /* renamed from: getEditableIndices */
    public native int[] m77399x315b0e6d(int i17);

    /* renamed from: getLayersByEditableIndex */
    public native com.p314xaae8f345.mm.rfx.C20946xbc52e31f[] m77400x11cb1a5f(int i17, int i18);

    /* renamed from: getTextData */
    public native com.p314xaae8f345.mm.rfx.C20952x37a3459f m77401x400087ed(int i17);

    /* renamed from: nativeReplaceImage */
    public native void m77402x721dd0be(int i17, long j17);

    /* renamed from: numImages */
    public native int m77403x3817dd9e();

    /* renamed from: numTexts */
    public native int m77404x8eca0900();

    /* renamed from: numVideos */
    public native int m77405x4e0fd67e();

    /* renamed from: path */
    public native java.lang.String m77406x346425();

    /* renamed from: replaceImage */
    public void m77407x1a429707(int i17, com.p314xaae8f345.mm.rfx.C20945xbc2db729 c20945xbc2db729) {
        if (c20945xbc2db729 == null) {
            m77402x721dd0be(i17, 0L);
        } else {
            m77402x721dd0be(i17, c20945xbc2db729.f39081xffae8598);
        }
    }

    /* renamed from: replaceText */
    public native void m77408x19a3f201(int i17, com.p314xaae8f345.mm.rfx.C20952x37a3459f c20952x37a3459f);

    /* renamed from: resetTextforAllTextLayersWithName */
    public native void m77409x7a94dfb4(java.lang.String str);

    /* renamed from: setDuration */
    public native void m77410xffd6ec16(long j17);

    /* renamed from: setTextforAllTextLayersWithName */
    public native void m77411xb579f447(java.lang.String str, java.lang.String str2);

    /* renamed from: setTimeStretchMode */
    public native void m77412xae5a7879(int i17);

    /* renamed from: timeStretchMode */
    public native int m77413x93220d3b();

    /* renamed from: Load */
    public static com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77392x243906(byte[] bArr) {
        return m77394x76efa07b(bArr, bArr.length, "");
    }

    /* renamed from: Load */
    public static com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77390x243906(android.content.res.AssetManager assetManager, java.lang.String str) {
        return m77393x64fa9573(assetManager, str);
    }
}
