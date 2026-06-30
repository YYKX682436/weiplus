package qj1;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f445399d = {l75.n0.m145250x3fdc6f77(qj1.a.f445398d, "AppBrandCommonKVBinaryData")};

    public b(l75.k0 k0Var) {
        super(k0Var, qj1.a.f445398d, "AppBrandCommonKVBinaryData", null);
    }

    public void D0(java.lang.String str, byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        qj1.a aVar = new qj1.a();
        aVar.f76485x4b6e619a = str;
        aVar.f76486x29f571ec = bArr;
        super.mo11260x413cb2b4(aVar);
    }

    public void y0(java.lang.String str) {
        qj1.a aVar = new qj1.a();
        aVar.f76485x4b6e619a = str;
        aVar.f76486x29f571ec = new byte[0];
        super.mo11260x413cb2b4(aVar);
    }

    public byte[] z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        qj1.a aVar = new qj1.a();
        aVar.f76485x4b6e619a = str;
        if (super.get(aVar, new java.lang.String[0])) {
            return aVar.f76486x29f571ec;
        }
        return null;
    }
}
