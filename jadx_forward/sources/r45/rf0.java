package r45;

/* loaded from: classes4.dex */
public class rf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466321e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466322f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466323g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466324h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466325i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466326m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466327n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f466328o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f466329p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f466330q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f466331r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf0)) {
            return false;
        }
        r45.rf0 rf0Var = (r45.rf0) fVar;
        return n51.f.a(this.f466320d, rf0Var.f466320d) && n51.f.a(this.f466321e, rf0Var.f466321e) && n51.f.a(this.f466322f, rf0Var.f466322f) && n51.f.a(this.f466323g, rf0Var.f466323g) && n51.f.a(this.f466324h, rf0Var.f466324h) && n51.f.a(this.f466325i, rf0Var.f466325i) && n51.f.a(this.f466326m, rf0Var.f466326m) && n51.f.a(this.f466327n, rf0Var.f466327n) && n51.f.a(this.f466328o, rf0Var.f466328o) && n51.f.a(this.f466329p, rf0Var.f466329p) && n51.f.a(this.f466330q, rf0Var.f466330q) && n51.f.a(this.f466331r, rf0Var.f466331r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -2115358278:
                            if (next.equals("agreement_url")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1535794573:
                            if (next.equals("authority_url")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1108336905:
                            if (next.equals("record_number")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -901870406:
                            if (next.equals("app_version")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -80681014:
                            if (next.equals("developer")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 107902:
                            if (next.equals("md5")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 712986815:
                            if (next.equals("author_name")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 814534431:
                            if (next.equals("app_desc_url")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1022406311:
                            if (next.equals("suitable_age")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1109408056:
                            if (next.equals("download_url")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1167501271:
                            if (next.equals("app_icon")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1167648233:
                            if (next.equals("app_name")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f466320d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f466321e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f466322f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f466323g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f466324h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f466325i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f466326m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f466327n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f466328o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            this.f466329p = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\n':
                            this.f466330q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f466331r = (java.lang.String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466320d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466321e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466322f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466323g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f466324h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f466325i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f466326m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f466327n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f466328o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f466329p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f466330q;
            if (str11 != null) {
                fVar.j(11, str11);
            }
            java.lang.String str12 = this.f466331r;
            if (str12 != null) {
                fVar.j(12, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f466320d;
            int j17 = str13 != null ? 0 + b36.f.j(1, str13) : 0;
            java.lang.String str14 = this.f466321e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f466322f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f466323g;
            if (str16 != null) {
                j17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f466324h;
            if (str17 != null) {
                j17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f466325i;
            if (str18 != null) {
                j17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f466326m;
            if (str19 != null) {
                j17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f466327n;
            if (str20 != null) {
                j17 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f466328o;
            if (str21 != null) {
                j17 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f466329p;
            if (str22 != null) {
                j17 += b36.f.j(10, str22);
            }
            java.lang.String str23 = this.f466330q;
            if (str23 != null) {
                j17 += b36.f.j(11, str23);
            }
            java.lang.String str24 = this.f466331r;
            return str24 != null ? j17 + b36.f.j(12, str24) : j17;
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
        r45.rf0 rf0Var = (r45.rf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rf0Var.f466320d = aVar2.k(intValue);
                return 0;
            case 2:
                rf0Var.f466321e = aVar2.k(intValue);
                return 0;
            case 3:
                rf0Var.f466322f = aVar2.k(intValue);
                return 0;
            case 4:
                rf0Var.f466323g = aVar2.k(intValue);
                return 0;
            case 5:
                rf0Var.f466324h = aVar2.k(intValue);
                return 0;
            case 6:
                rf0Var.f466325i = aVar2.k(intValue);
                return 0;
            case 7:
                rf0Var.f466326m = aVar2.k(intValue);
                return 0;
            case 8:
                rf0Var.f466327n = aVar2.k(intValue);
                return 0;
            case 9:
                rf0Var.f466328o = aVar2.k(intValue);
                return 0;
            case 10:
                rf0Var.f466329p = aVar2.k(intValue);
                return 0;
            case 11:
                rf0Var.f466330q = aVar2.k(intValue);
                return 0;
            case 12:
                rf0Var.f466331r = aVar2.k(intValue);
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
            java.lang.String str = this.f466320d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "app_name", str, false);
            eVar.d(jSONObject, "app_icon", this.f466321e, false);
            eVar.d(jSONObject, "md5", this.f466322f, false);
            eVar.d(jSONObject, "download_url", this.f466323g, false);
            eVar.d(jSONObject, "app_version", this.f466324h, false);
            eVar.d(jSONObject, "developer", this.f466325i, false);
            eVar.d(jSONObject, "authority_url", this.f466326m, false);
            eVar.d(jSONObject, "agreement_url", this.f466327n, false);
            eVar.d(jSONObject, "app_desc_url", this.f466328o, false);
            eVar.d(jSONObject, "record_number", this.f466329p, false);
            eVar.d(jSONObject, "suitable_age", this.f466330q, false);
            eVar.d(jSONObject, "author_name", this.f466331r, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
