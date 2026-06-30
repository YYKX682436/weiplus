package r45;

/* loaded from: classes4.dex */
public class vb6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469610d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469611e;

    /* renamed from: f, reason: collision with root package name */
    public int f469612f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469613g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469614h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469615i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469616m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469617n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb6)) {
            return false;
        }
        r45.vb6 vb6Var = (r45.vb6) fVar;
        return n51.f.a(this.f469610d, vb6Var.f469610d) && n51.f.a(this.f469611e, vb6Var.f469611e) && n51.f.a(java.lang.Integer.valueOf(this.f469612f), java.lang.Integer.valueOf(vb6Var.f469612f)) && n51.f.a(this.f469613g, vb6Var.f469613g) && n51.f.a(this.f469614h, vb6Var.f469614h) && n51.f.a(this.f469615i, vb6Var.f469615i) && n51.f.a(this.f469616m, vb6Var.f469616m) && n51.f.a(this.f469617n, vb6Var.f469617n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469610d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469611e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f469612f);
            java.lang.String str3 = this.f469613g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f469614h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f469615i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f469616m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f469617n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f469610d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f469611e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f469612f);
            java.lang.String str10 = this.f469613g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f469614h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f469615i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f469616m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f469617n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        r45.vb6 vb6Var = (r45.vb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vb6Var.f469610d = aVar2.k(intValue);
                return 0;
            case 2:
                vb6Var.f469611e = aVar2.k(intValue);
                return 0;
            case 3:
                vb6Var.f469612f = aVar2.g(intValue);
                return 0;
            case 4:
                vb6Var.f469613g = aVar2.k(intValue);
                return 0;
            case 5:
                vb6Var.f469614h = aVar2.k(intValue);
                return 0;
            case 6:
                vb6Var.f469615i = aVar2.k(intValue);
                return 0;
            case 7:
                vb6Var.f469616m = aVar2.k(intValue);
                return 0;
            case 8:
                vb6Var.f469617n = aVar2.k(intValue);
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
            java.lang.String str = this.f469610d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Signature", str, false);
            eVar.d(jSONObject, "BGurl", this.f469611e, false);
            eVar.d(jSONObject, "BGsize", java.lang.Integer.valueOf(this.f469612f), false);
            eVar.d(jSONObject, "BGmd5sum", this.f469613g, false);
            eVar.d(jSONObject, "BGaeskey", this.f469614h, false);
            eVar.d(jSONObject, "BGauthkey", this.f469615i, false);
            eVar.d(jSONObject, "BGid", this.f469616m, false);
            eVar.d(jSONObject, "BGfileid", this.f469617n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
