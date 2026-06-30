package k91;

/* loaded from: classes4.dex */
public class v extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f387320e = {l75.n0.m145250x3fdc6f77(k91.u.f387307p, "AppBrandCommonKVData")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f387321d;

    public v(l75.k0 k0Var) {
        super(k0Var, k91.u.f387307p, "AppBrandCommonKVData", null);
        this.f387321d = k0Var;
    }

    public boolean P2(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        k91.u uVar = new k91.u();
        uVar.f68630x4b6e619a = str;
        uVar.f68631x29f571ec = str2;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? !super.mo9951xb06685ab(uVar, new java.lang.String[0]) : super.mo11260x413cb2b4(uVar);
    }

    public boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        k91.u uVar = new k91.u();
        uVar.f68630x4b6e619a = str;
        java.lang.String z07 = z0(str, "");
        uVar.f68631x29f571ec = z07;
        return android.text.TextUtils.isEmpty(z07) || super.mo9951xb06685ab(uVar, new java.lang.String[0]);
    }

    public void y0(java.lang.String str) {
        super.m145253xb158737d("AppBrandCommonKVData", java.lang.String.format("delete from %s where %s like '%s%%'", "AppBrandCommonKVData", "key", str));
    }

    public java.lang.String z0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str2;
        }
        k91.u uVar = new k91.u();
        uVar.f68630x4b6e619a = str;
        return super.get(uVar, new java.lang.String[0]) ? uVar.f68631x29f571ec : str2;
    }
}
