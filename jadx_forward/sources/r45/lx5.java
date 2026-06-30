package r45;

/* loaded from: classes8.dex */
public class lx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461484e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461485f;

    /* renamed from: g, reason: collision with root package name */
    public int f461486g;

    /* renamed from: h, reason: collision with root package name */
    public int f461487h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461488i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461489m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx5)) {
            return false;
        }
        r45.lx5 lx5Var = (r45.lx5) fVar;
        return n51.f.a(this.f461483d, lx5Var.f461483d) && n51.f.a(this.f461484e, lx5Var.f461484e) && n51.f.a(this.f461485f, lx5Var.f461485f) && n51.f.a(java.lang.Integer.valueOf(this.f461486g), java.lang.Integer.valueOf(lx5Var.f461486g)) && n51.f.a(java.lang.Integer.valueOf(this.f461487h), java.lang.Integer.valueOf(lx5Var.f461487h)) && n51.f.a(this.f461488i, lx5Var.f461488i) && n51.f.a(this.f461489m, lx5Var.f461489m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461483d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461484e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461485f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f461486g);
            fVar.e(5, this.f461487h);
            java.lang.String str4 = this.f461488i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461489m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f461483d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f461484e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f461485f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f461486g) + b36.f.e(5, this.f461487h);
            java.lang.String str8 = this.f461488i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461489m;
            return gVar2 != null ? e17 + b36.f.b(7, gVar2) : e17;
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
        r45.lx5 lx5Var = (r45.lx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lx5Var.f461483d = aVar2.k(intValue);
                return 0;
            case 2:
                lx5Var.f461484e = aVar2.k(intValue);
                return 0;
            case 3:
                lx5Var.f461485f = aVar2.k(intValue);
                return 0;
            case 4:
                lx5Var.f461486g = aVar2.g(intValue);
                return 0;
            case 5:
                lx5Var.f461487h = aVar2.g(intValue);
                return 0;
            case 6:
                lx5Var.f461488i = aVar2.k(intValue);
                return 0;
            case 7:
                lx5Var.f461489m = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f461483d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "SessionId", str, false);
            eVar.d(jSONObject, "SearchId", this.f461484e, false);
            eVar.d(jSONObject, "RequestId", this.f461485f, false);
            eVar.d(jSONObject, "BusinessType", java.lang.Integer.valueOf(this.f461486g), false);
            eVar.d(jSONObject, "SubType", java.lang.Integer.valueOf(this.f461487h), false);
            eVar.d(jSONObject, "DocID", this.f461488i, false);
            eVar.d(jSONObject, "ExtendInfo", this.f461489m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
