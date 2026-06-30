package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagLayer */
/* loaded from: classes13.dex */
public class C20946xbc52e31f {

    /* renamed from: LayerTypeImage */
    public static final int f39082x2c912010 = 5;

    /* renamed from: LayerTypeNull */
    public static final int f39083x5c492432 = 1;

    /* renamed from: LayerTypePreCompose */
    public static final int f39084x96321bda = 6;

    /* renamed from: LayerTypeShape */
    public static final int f39085x2d1bc656 = 4;

    /* renamed from: LayerTypeSolid */
    public static final int f39086x2d1f1d60 = 2;

    /* renamed from: LayerTypeText */
    public static final int f39087x5c4ba3d8 = 3;

    /* renamed from: LayerTypeUnknown */
    public static final int f39088xc9d949bf = 0;

    /* renamed from: nativeContext */
    protected long f39089xffae8598;

    static {
        tq5.k.a("xlabeffect");
        m77461xb90145c7();
    }

    public C20946xbc52e31f(long j17) {
        this.f39089xffae8598 = j17;
    }

    /* renamed from: nativeEquals */
    private native boolean m77460x77230eb6(com.p314xaae8f345.mm.rfx.C20946xbc52e31f c20946xbc52e31f);

    /* renamed from: nativeInit */
    private static native void m77461xb90145c7();

    /* renamed from: nativeRelease */
    private native void m77462x7f877f0();

    /* renamed from: duration */
    public native long m77463x89444d94();

    /* renamed from: editableIndex */
    public native int m77464xd1fea8ce();

    /* renamed from: equals */
    public boolean m77465xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.rfx.C20946xbc52e31f) {
            return m77460x77230eb6((com.p314xaae8f345.mm.rfx.C20946xbc52e31f) obj);
        }
        return false;
    }

    /* renamed from: finalize */
    public void m77466xd764dc1e() {
        m77462x7f877f0();
    }

    /* renamed from: frameRate */
    public native float m77467x207cebed();

    /* renamed from: hashCode */
    public int m77468x8cdac1b() {
        long j17 = this.f39089xffae8598;
        return ((int) (j17 ^ (j17 >>> 32))) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de;
    }

    /* renamed from: layerName */
    public native java.lang.String m77469x9cc7b37c();

    /* renamed from: layerType */
    public native int m77470x9ccac82b();

    /* renamed from: startTime */
    public native long m77471x81158a4f();
}
