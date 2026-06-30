package r45;

/* loaded from: classes9.dex */
public class ez4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455378d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455379e;

    /* renamed from: f, reason: collision with root package name */
    public int f455380f;

    /* renamed from: g, reason: collision with root package name */
    public int f455381g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455382h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez4)) {
            return false;
        }
        r45.ez4 ez4Var = (r45.ez4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455378d), java.lang.Integer.valueOf(ez4Var.f455378d)) && n51.f.a(this.f455379e, ez4Var.f455379e) && n51.f.a(java.lang.Integer.valueOf(this.f455380f), java.lang.Integer.valueOf(ez4Var.f455380f)) && n51.f.a(java.lang.Integer.valueOf(this.f455381g), java.lang.Integer.valueOf(ez4Var.f455381g)) && n51.f.a(this.f455382h, ez4Var.f455382h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455378d);
            java.lang.String str = this.f455379e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f455380f);
            fVar.e(5, this.f455381g);
            java.lang.String str2 = this.f455382h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455378d) + 0;
            java.lang.String str3 = this.f455379e;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            int e18 = e17 + b36.f.e(4, this.f455380f) + b36.f.e(5, this.f455381g);
            java.lang.String str4 = this.f455382h;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.ez4 ez4Var = (r45.ez4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ez4Var.f455378d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ez4Var.f455379e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ez4Var.f455380f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            ez4Var.f455381g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        ez4Var.f455382h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f455378d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Seq", valueOf, false);
            eVar.d(jSONObject, "FileList", this.f455379e, false);
            eVar.d(jSONObject, "IsRoot", java.lang.Integer.valueOf(this.f455380f), false);
            eVar.d(jSONObject, "NetType", java.lang.Integer.valueOf(this.f455381g), false);
            eVar.d(jSONObject, "CheckSum", this.f455382h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
