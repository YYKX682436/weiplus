package cw1;

/* loaded from: classes12.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer[][] f304866a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean[] f304867b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f304868c;

    static {
        java.lang.Integer[][] numArr = {new java.lang.Integer[]{0, 20, 2, 3, 16}, new java.lang.Integer[]{4}, new java.lang.Integer[]{5}, new java.lang.Integer[]{6}, new java.lang.Integer[]{7}, new java.lang.Integer[]{8}, new java.lang.Integer[]{9}, new java.lang.Integer[]{15}, new java.lang.Integer[]{18}, new java.lang.Integer[]{17}, new java.lang.Integer[]{10, 11}, new java.lang.Integer[]{19}};
        f304866a = numArr;
        boolean[] zArr = new boolean[numArr.length];
        zArr[3] = true;
        f304867b = zArr;
        f304868c = kz5.z.D0(new java.lang.String[]{"wxaFlattenFileSystem", "wxaNonFlattenFileSystem", "WxaJsCodeCache", "WxaSnapshotJsCodeCache", "WxaWASMCache", "appBrandXnetModelCache", "WxaCodePkgsCache", "WxaCodePkgsCacheGlobal", "AppBrandWxAudioCache", "WxaShaderCache"});
    }

    public static final long a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var) {
        return (m0Var.f157798a.hashCode() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & ((m0Var.f157800c.hashCode() ^ m0Var.f157799b.hashCode()) & Integer.MAX_VALUE)) << 32);
    }
}
