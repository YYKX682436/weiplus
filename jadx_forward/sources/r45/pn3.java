package r45;

/* loaded from: classes2.dex */
public class pn3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464758d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464759e;

    /* renamed from: f, reason: collision with root package name */
    public int f464760f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn3)) {
            return false;
        }
        r45.pn3 pn3Var = (r45.pn3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464758d), java.lang.Integer.valueOf(pn3Var.f464758d)) && n51.f.a(this.f464759e, pn3Var.f464759e) && n51.f.a(java.lang.Integer.valueOf(this.f464760f), java.lang.Integer.valueOf(pn3Var.f464760f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464758d);
            java.lang.String str = this.f464759e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f464760f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464758d) + 0;
            java.lang.String str2 = this.f464759e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f464760f);
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
        r45.pn3 pn3Var = (r45.pn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pn3Var.f464758d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pn3Var.f464759e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        pn3Var.f464760f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f464758d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "RequestKey", this.f464759e, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f464760f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
