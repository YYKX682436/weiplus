package r45;

/* loaded from: classes8.dex */
public class z66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473286d;

    /* renamed from: e, reason: collision with root package name */
    public int f473287e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z66)) {
            return false;
        }
        r45.z66 z66Var = (r45.z66) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473286d), java.lang.Integer.valueOf(z66Var.f473286d)) && n51.f.a(java.lang.Integer.valueOf(this.f473287e), java.lang.Integer.valueOf(z66Var.f473287e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473286d);
            fVar.e(2, this.f473287e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f473286d) + 0 + b36.f.e(2, this.f473287e);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.z66 z66Var = (r45.z66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z66Var.f473286d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        z66Var.f473287e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f473286d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "checkCount", valueOf, false);
            eVar.d(jSONObject, "isFinalCheck", java.lang.Integer.valueOf(this.f473287e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
