package pj4;

/* loaded from: classes9.dex */
public class x1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436863d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436864e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436865f;

    /* renamed from: g, reason: collision with root package name */
    public int f436866g;

    /* renamed from: h, reason: collision with root package name */
    public int f436867h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436868i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f436869m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.x1)) {
            return false;
        }
        pj4.x1 x1Var = (pj4.x1) fVar;
        return n51.f.a(this.f436863d, x1Var.f436863d) && n51.f.a(this.f436864e, x1Var.f436864e) && n51.f.a(this.f436865f, x1Var.f436865f) && n51.f.a(java.lang.Integer.valueOf(this.f436866g), java.lang.Integer.valueOf(x1Var.f436866g)) && n51.f.a(java.lang.Integer.valueOf(this.f436867h), java.lang.Integer.valueOf(x1Var.f436867h)) && n51.f.a(this.f436868i, x1Var.f436868i) && n51.f.a(this.f436869m, x1Var.f436869m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436863d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436864e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f436865f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f436866g);
            fVar.e(5, this.f436867h);
            java.lang.String str4 = this.f436868i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f436869m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f436863d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f436864e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f436865f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f436866g) + b36.f.e(5, this.f436867h);
            java.lang.String str9 = this.f436868i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f436869m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        pj4.x1 x1Var = (pj4.x1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x1Var.f436863d = aVar2.k(intValue);
                return 0;
            case 2:
                x1Var.f436864e = aVar2.k(intValue);
                return 0;
            case 3:
                x1Var.f436865f = aVar2.k(intValue);
                return 0;
            case 4:
                x1Var.f436866g = aVar2.g(intValue);
                return 0;
            case 5:
                x1Var.f436867h = aVar2.g(intValue);
                return 0;
            case 6:
                x1Var.f436868i = aVar2.k(intValue);
                return 0;
            case 7:
                x1Var.f436869m = aVar2.k(intValue);
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
            java.lang.String str = this.f436863d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str, false);
            eVar.d(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f436864e, false);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f436865f, false);
            eVar.d(jSONObject, "version_type", java.lang.Integer.valueOf(this.f436866g), false);
            eVar.d(jSONObject, "version_num", java.lang.Integer.valueOf(this.f436867h), false);
            eVar.d(jSONObject, "icon_url", this.f436868i, false);
            eVar.d(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648, this.f436869m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
