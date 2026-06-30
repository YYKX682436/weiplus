package pj4;

/* loaded from: classes8.dex */
public class n1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436733e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436734f;

    /* renamed from: g, reason: collision with root package name */
    public int f436735g;

    /* renamed from: h, reason: collision with root package name */
    public int f436736h;

    /* renamed from: i, reason: collision with root package name */
    public int f436737i;

    /* renamed from: m, reason: collision with root package name */
    public long f436738m;

    /* renamed from: n, reason: collision with root package name */
    public int f436739n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f436740o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.n1)) {
            return false;
        }
        pj4.n1 n1Var = (pj4.n1) fVar;
        return n51.f.a(this.f436732d, n1Var.f436732d) && n51.f.a(this.f436733e, n1Var.f436733e) && n51.f.a(this.f436734f, n1Var.f436734f) && n51.f.a(java.lang.Integer.valueOf(this.f436735g), java.lang.Integer.valueOf(n1Var.f436735g)) && n51.f.a(java.lang.Integer.valueOf(this.f436736h), java.lang.Integer.valueOf(n1Var.f436736h)) && n51.f.a(java.lang.Integer.valueOf(this.f436737i), java.lang.Integer.valueOf(n1Var.f436737i)) && n51.f.a(java.lang.Long.valueOf(this.f436738m), java.lang.Long.valueOf(n1Var.f436738m)) && n51.f.a(java.lang.Integer.valueOf(this.f436739n), java.lang.Integer.valueOf(n1Var.f436739n)) && n51.f.a(this.f436740o, n1Var.f436740o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436732d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436733e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436734f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f436735g);
            fVar.e(5, this.f436736h);
            fVar.e(6, this.f436737i);
            fVar.h(7, this.f436738m);
            fVar.e(8, this.f436739n);
            java.lang.String str4 = this.f436740o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f436732d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f436733e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f436734f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f436735g) + b36.f.e(5, this.f436736h) + b36.f.e(6, this.f436737i) + b36.f.h(7, this.f436738m) + b36.f.e(8, this.f436739n);
            java.lang.String str8 = this.f436740o;
            return str8 != null ? e17 + b36.f.j(9, str8) : e17;
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
        pj4.n1 n1Var = (pj4.n1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n1Var.f436732d = aVar2.k(intValue);
                return 0;
            case 2:
                n1Var.f436733e = aVar2.k(intValue);
                return 0;
            case 3:
                n1Var.f436734f = aVar2.k(intValue);
                return 0;
            case 4:
                n1Var.f436735g = aVar2.g(intValue);
                return 0;
            case 5:
                n1Var.f436736h = aVar2.g(intValue);
                return 0;
            case 6:
                n1Var.f436737i = aVar2.g(intValue);
                return 0;
            case 7:
                n1Var.f436738m = aVar2.i(intValue);
                return 0;
            case 8:
                n1Var.f436739n = aVar2.g(intValue);
                return 0;
            case 9:
                n1Var.f436740o = aVar2.k(intValue);
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
            java.lang.String str = this.f436732d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "text_status_id", str, false);
            eVar.d(jSONObject, "topic_id", this.f436733e, false);
            eVar.d(jSONObject, "ext_info", this.f436734f, false);
            eVar.d(jSONObject, "liked_count", java.lang.Integer.valueOf(this.f436735g), false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f436736h), false);
            eVar.d(jSONObject, "referenced_count", java.lang.Integer.valueOf(this.f436737i), false);
            eVar.d(jSONObject, "key", java.lang.Long.valueOf(this.f436738m), false);
            eVar.d(jSONObject, "comment_count", java.lang.Integer.valueOf(this.f436739n), false);
            eVar.d(jSONObject, "private_info", this.f436740o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
