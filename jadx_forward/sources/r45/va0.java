package r45;

/* loaded from: classes8.dex */
public class va0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469554d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469555e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469556f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469557g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va0)) {
            return false;
        }
        r45.va0 va0Var = (r45.va0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469554d), java.lang.Integer.valueOf(va0Var.f469554d)) && n51.f.a(this.f469555e, va0Var.f469555e) && n51.f.a(this.f469556f, va0Var.f469556f) && n51.f.a(this.f469557g, va0Var.f469557g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469554d);
            java.lang.String str = this.f469555e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f469556f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f469557g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469554d) + 0;
            java.lang.String str4 = this.f469555e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f469556f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f469557g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.va0 va0Var = (r45.va0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            va0Var.f469554d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            va0Var.f469555e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            va0Var.f469556f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        va0Var.f469557g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f469554d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BrandFlag", valueOf, false);
            eVar.d(jSONObject, "ExternalInfo", this.f469555e, false);
            eVar.d(jSONObject, "BrandInfo", this.f469556f, false);
            eVar.d(jSONObject, "BrandIconURL", this.f469557g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
