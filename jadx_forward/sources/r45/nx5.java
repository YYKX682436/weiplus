package r45;

/* loaded from: classes9.dex */
public class nx5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463257d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463258e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463259f;

    /* renamed from: g, reason: collision with root package name */
    public int f463260g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463261h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463262i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463263m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f463264n;

    /* renamed from: o, reason: collision with root package name */
    public int f463265o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f463266p;

    /* renamed from: q, reason: collision with root package name */
    public r45.p34 f463267q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f463268r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f463269s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nx5)) {
            return false;
        }
        r45.nx5 nx5Var = (r45.nx5) fVar;
        return n51.f.a(this.f76492x92037252, nx5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463257d), java.lang.Integer.valueOf(nx5Var.f463257d)) && n51.f.a(this.f463258e, nx5Var.f463258e) && n51.f.a(this.f463259f, nx5Var.f463259f) && n51.f.a(java.lang.Integer.valueOf(this.f463260g), java.lang.Integer.valueOf(nx5Var.f463260g)) && n51.f.a(this.f463261h, nx5Var.f463261h) && n51.f.a(this.f463262i, nx5Var.f463262i) && n51.f.a(this.f463263m, nx5Var.f463263m) && n51.f.a(this.f463264n, nx5Var.f463264n) && n51.f.a(java.lang.Integer.valueOf(this.f463265o), java.lang.Integer.valueOf(nx5Var.f463265o)) && n51.f.a(java.lang.Boolean.valueOf(this.f463266p), java.lang.Boolean.valueOf(nx5Var.f463266p)) && n51.f.a(this.f463267q, nx5Var.f463267q) && n51.f.a(this.f463268r, nx5Var.f463268r) && n51.f.a(java.lang.Boolean.valueOf(this.f463269s), java.lang.Boolean.valueOf(nx5Var.f463269s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463257d);
            java.lang.String str = this.f463258e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f463259f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f463260g);
            java.lang.String str3 = this.f463261h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463262i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f463263m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f463264n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f463265o);
            fVar.a(12, this.f463266p);
            r45.p34 p34Var = this.f463267q;
            if (p34Var != null) {
                fVar.i(13, p34Var.mo75928xcd1e8d8());
                this.f463267q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.f463268r;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.a(15, this.f463269s);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f463257d);
            java.lang.String str8 = this.f463258e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f463259f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            int e17 = i18 + b36.f.e(5, this.f463260g);
            java.lang.String str10 = this.f463261h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f463262i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f463263m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f463264n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            int e18 = e17 + b36.f.e(10, this.f463265o) + b36.f.a(12, this.f463266p);
            r45.p34 p34Var2 = this.f463267q;
            if (p34Var2 != null) {
                e18 += b36.f.i(13, p34Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f463268r;
            if (str14 != null) {
                e18 += b36.f.j(14, str14);
            }
            return e18 + b36.f.a(15, this.f463269s);
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
        r45.nx5 nx5Var = (r45.nx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    nx5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                nx5Var.f463257d = aVar2.g(intValue);
                return 0;
            case 3:
                nx5Var.f463258e = aVar2.k(intValue);
                return 0;
            case 4:
                nx5Var.f463259f = aVar2.k(intValue);
                return 0;
            case 5:
                nx5Var.f463260g = aVar2.g(intValue);
                return 0;
            case 6:
                nx5Var.f463261h = aVar2.k(intValue);
                return 0;
            case 7:
                nx5Var.f463262i = aVar2.k(intValue);
                return 0;
            case 8:
                nx5Var.f463263m = aVar2.k(intValue);
                return 0;
            case 9:
                nx5Var.f463264n = aVar2.k(intValue);
                return 0;
            case 10:
                nx5Var.f463265o = aVar2.g(intValue);
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                nx5Var.f463266p = aVar2.c(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.p34 p34Var3 = new r45.p34();
                    if (bArr2 != null && bArr2.length > 0) {
                        p34Var3.mo11468x92b714fd(bArr2);
                    }
                    nx5Var.f463267q = p34Var3;
                }
                return 0;
            case 14:
                nx5Var.f463268r = aVar2.k(intValue);
                return 0;
            case 15:
                nx5Var.f463269s = aVar2.c(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "JumpType", java.lang.Integer.valueOf(this.f463257d), false);
            eVar.d(jSONObject, "UserName", this.f463258e, false);
            eVar.d(jSONObject, "WeappUrl", this.f463259f, false);
            eVar.d(jSONObject, "VersionType", java.lang.Integer.valueOf(this.f463260g), false);
            eVar.d(jSONObject, "Appid", this.f463261h, false);
            eVar.d(jSONObject, "NickName", this.f463262i, false);
            eVar.d(jSONObject, "JumpUrl", this.f463263m, false);
            eVar.d(jSONObject, "WebviewJson", this.f463264n, false);
            eVar.d(jSONObject, "Version", java.lang.Integer.valueOf(this.f463265o), false);
            eVar.d(jSONObject, "DisablePopups", java.lang.Boolean.valueOf(this.f463266p), false);
            eVar.d(jSONObject, "LiteAppInfo", this.f463267q, false);
            eVar.d(jSONObject, "JumpQuery", this.f463268r, false);
            eVar.d(jSONObject, "IsNewWebSearchStyle", java.lang.Boolean.valueOf(this.f463269s), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
