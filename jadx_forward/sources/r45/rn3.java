package r45;

/* loaded from: classes8.dex */
public class rn3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466558g;

    /* renamed from: h, reason: collision with root package name */
    public int f466559h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466560i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466561m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rn3)) {
            return false;
        }
        r45.rn3 rn3Var = (r45.rn3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466555d), java.lang.Integer.valueOf(rn3Var.f466555d)) && n51.f.a(this.f466556e, rn3Var.f466556e) && n51.f.a(this.f466557f, rn3Var.f466557f) && n51.f.a(this.f466558g, rn3Var.f466558g) && n51.f.a(java.lang.Integer.valueOf(this.f466559h), java.lang.Integer.valueOf(rn3Var.f466559h)) && n51.f.a(this.f466560i, rn3Var.f466560i) && n51.f.a(this.f466561m, rn3Var.f466561m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466555d);
            java.lang.String str = this.f466556e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466557f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f466558g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f466559h);
            java.lang.String str4 = this.f466560i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f466561m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466555d) + 0;
            java.lang.String str6 = this.f466556e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f466557f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f466558g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int e18 = e17 + b36.f.e(5, this.f466559h);
            java.lang.String str9 = this.f466560i;
            if (str9 != null) {
                e18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f466561m;
            return str10 != null ? e18 + b36.f.j(7, str10) : e18;
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
        r45.rn3 rn3Var = (r45.rn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rn3Var.f466555d = aVar2.g(intValue);
                return 0;
            case 2:
                rn3Var.f466556e = aVar2.k(intValue);
                return 0;
            case 3:
                rn3Var.f466557f = aVar2.k(intValue);
                return 0;
            case 4:
                rn3Var.f466558g = aVar2.k(intValue);
                return 0;
            case 5:
                rn3Var.f466559h = aVar2.g(intValue);
                return 0;
            case 6:
                rn3Var.f466560i = aVar2.k(intValue);
                return 0;
            case 7:
                rn3Var.f466561m = aVar2.k(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f466555d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "SessionId", this.f466556e, false);
            eVar.d(jSONObject, "RequestId", this.f466557f, false);
            eVar.d(jSONObject, "SearchId", this.f466558g, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f466559h), false);
            eVar.d(jSONObject, "Query", this.f466560i, false);
            eVar.d(jSONObject, "Content", this.f466561m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
