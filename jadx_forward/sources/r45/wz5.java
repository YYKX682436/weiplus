package r45;

/* loaded from: classes8.dex */
public class wz5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471136d;

    /* renamed from: e, reason: collision with root package name */
    public int f471137e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471138f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471139g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wz5)) {
            return false;
        }
        r45.wz5 wz5Var = (r45.wz5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471136d), java.lang.Integer.valueOf(wz5Var.f471136d)) && n51.f.a(java.lang.Integer.valueOf(this.f471137e), java.lang.Integer.valueOf(wz5Var.f471137e)) && n51.f.a(this.f471138f, wz5Var.f471138f) && n51.f.a(this.f471139g, wz5Var.f471139g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471136d);
            fVar.e(2, this.f471137e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471138f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471139g;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471136d) + 0 + b36.f.e(2, this.f471137e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f471138f;
            if (gVar3 != null) {
                e17 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f471139g;
            return gVar4 != null ? e17 + b36.f.b(4, gVar4) : e17;
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
        r45.wz5 wz5Var = (r45.wz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wz5Var.f471136d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wz5Var.f471137e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wz5Var.f471138f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        wz5Var.f471139g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f471136d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, valueOf, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f471137e), false);
            eVar.d(jSONObject, "receiver", this.f471138f, false);
            eVar.d(jSONObject, "ticket", this.f471139g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
