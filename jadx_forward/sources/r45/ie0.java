package r45;

/* loaded from: classes8.dex */
public class ie0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458494d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458495e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458496f;

    /* renamed from: g, reason: collision with root package name */
    public int f458497g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ie0)) {
            return false;
        }
        r45.ie0 ie0Var = (r45.ie0) fVar;
        return n51.f.a(this.f458494d, ie0Var.f458494d) && n51.f.a(this.f458495e, ie0Var.f458495e) && n51.f.a(this.f458496f, ie0Var.f458496f) && n51.f.a(java.lang.Integer.valueOf(this.f458497g), java.lang.Integer.valueOf(ie0Var.f458497g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458494d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458495e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458496f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f458497g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458494d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f458495e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f458496f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f458497g);
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
        r45.ie0 ie0Var = (r45.ie0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ie0Var.f458494d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ie0Var.f458495e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ie0Var.f458496f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ie0Var.f458497g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f458494d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "model_id", str, false);
            eVar.d(jSONObject, "sn", this.f458495e, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f458496f, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f458497g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
