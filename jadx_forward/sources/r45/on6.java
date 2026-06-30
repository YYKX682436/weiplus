package r45;

/* loaded from: classes15.dex */
public class on6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463915d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463916e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463917f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463918g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463919h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463920i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463921m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.on6)) {
            return false;
        }
        r45.on6 on6Var = (r45.on6) fVar;
        return n51.f.a(this.f463915d, on6Var.f463915d) && n51.f.a(this.f463916e, on6Var.f463916e) && n51.f.a(this.f463917f, on6Var.f463917f) && n51.f.a(this.f463918g, on6Var.f463918g) && n51.f.a(this.f463919h, on6Var.f463919h) && n51.f.a(this.f463920i, on6Var.f463920i) && n51.f.a(this.f463921m, on6Var.f463921m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463915d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463916e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f463917f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f463918g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f463919h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f463920i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f463921m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f463915d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f463916e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f463917f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f463918g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f463919h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f463920i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f463921m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.on6 on6Var = (r45.on6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                on6Var.f463915d = aVar2.k(intValue);
                return 0;
            case 2:
                on6Var.f463916e = aVar2.k(intValue);
                return 0;
            case 3:
                on6Var.f463917f = aVar2.k(intValue);
                return 0;
            case 4:
                on6Var.f463918g = aVar2.k(intValue);
                return 0;
            case 5:
                on6Var.f463919h = aVar2.k(intValue);
                return 0;
            case 6:
                on6Var.f463920i = aVar2.k(intValue);
                return 0;
            case 7:
                on6Var.f463921m = aVar2.k(intValue);
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
            java.lang.String str = this.f463915d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str, false);
            eVar.d(jSONObject, "desc", this.f463916e, false);
            eVar.d(jSONObject, "relativeURL", this.f463917f, false);
            eVar.d(jSONObject, "originalId", this.f463918g, false);
            eVar.d(jSONObject, "weAppName", this.f463919h, false);
            eVar.d(jSONObject, "appId", this.f463920i, false);
            eVar.d(jSONObject, "avatar", this.f463921m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
