package r45;

/* loaded from: classes4.dex */
public class tz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468416e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468417f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468418g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468419h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468420i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468421m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f468422n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tz4)) {
            return false;
        }
        r45.tz4 tz4Var = (r45.tz4) fVar;
        return n51.f.a(this.f468415d, tz4Var.f468415d) && n51.f.a(this.f468416e, tz4Var.f468416e) && n51.f.a(this.f468417f, tz4Var.f468417f) && n51.f.a(this.f468418g, tz4Var.f468418g) && n51.f.a(this.f468419h, tz4Var.f468419h) && n51.f.a(this.f468420i, tz4Var.f468420i) && n51.f.a(this.f468421m, tz4Var.f468421m) && n51.f.a(java.lang.Boolean.valueOf(this.f468422n), java.lang.Boolean.valueOf(tz4Var.f468422n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468415d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468416e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f468417f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f468418g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f468419h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f468420i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f468421m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.a(8, this.f468422n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f468415d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f468416e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f468417f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f468418g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f468419h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f468420i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f468421m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.a(8, this.f468422n);
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
        r45.tz4 tz4Var = (r45.tz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tz4Var.f468415d = aVar2.k(intValue);
                return 0;
            case 2:
                tz4Var.f468416e = aVar2.k(intValue);
                return 0;
            case 3:
                tz4Var.f468417f = aVar2.k(intValue);
                return 0;
            case 4:
                tz4Var.f468418g = aVar2.k(intValue);
                return 0;
            case 5:
                tz4Var.f468419h = aVar2.k(intValue);
                return 0;
            case 6:
                tz4Var.f468420i = aVar2.k(intValue);
                return 0;
            case 7:
                tz4Var.f468421m = aVar2.k(intValue);
                return 0;
            case 8:
                tz4Var.f468422n = aVar2.c(intValue);
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
            java.lang.String str = this.f468415d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str, false);
            eVar.d(jSONObject, "heading", this.f468416e, false);
            eVar.d(jSONObject, "desp", this.f468417f, false);
            eVar.d(jSONObject, "approve_button_wording", this.f468418g, false);
            eVar.d(jSONObject, "reject_button_wording", this.f468419h, false);
            eVar.d(jSONObject, "privacy_agreement_wording", this.f468420i, false);
            eVar.d(jSONObject, "privacy_agreement_url", this.f468421m, false);
            eVar.d(jSONObject, "is_force_archived", java.lang.Boolean.valueOf(this.f468422n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
