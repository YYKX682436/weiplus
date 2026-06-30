package j43;

/* loaded from: classes4.dex */
public class c extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f379204d = {l75.n0.m145250x3fdc6f77(j43.b.f379203p, "PBCache")};

    public c(l75.k0 k0Var) {
        super(k0Var, j43.b.f379203p, "PBCache", null);
    }

    public boolean D0(java.lang.String str, byte[] bArr) {
        boolean mo880xb970c2b9;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        j43.b bVar = new j43.b();
        bVar.f65997x4b6e619a = str;
        if (super.get(bVar, new java.lang.String[0])) {
            bVar.f65998x29f571ec = bArr;
            mo880xb970c2b9 = super.mo9952xce0038c9(bVar, new java.lang.String[0]);
        } else {
            bVar.f65998x29f571ec = bArr;
            mo880xb970c2b9 = super.mo880xb970c2b9(bVar);
        }
        if (!mo880xb970c2b9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PBCacheStorage", "Saving cache failed (update or insert)");
        }
        return mo880xb970c2b9;
    }

    public void y0(java.lang.String str) {
        j43.b bVar = new j43.b();
        bVar.f65997x4b6e619a = str;
        super.mo9951xb06685ab(bVar, new java.lang.String[0]);
    }

    public byte[] z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        j43.b bVar = new j43.b();
        bVar.f65997x4b6e619a = str;
        if (super.get(bVar, new java.lang.String[0])) {
            return bVar.f65998x29f571ec;
        }
        return null;
    }
}
