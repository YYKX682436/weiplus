package r45;

/* loaded from: classes4.dex */
public class gr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457027f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457028g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457029h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457030i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457031m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457032n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f457033o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f457034p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gr0)) {
            return false;
        }
        r45.gr0 gr0Var = (r45.gr0) fVar;
        return n51.f.a(this.f457025d, gr0Var.f457025d) && n51.f.a(this.f457026e, gr0Var.f457026e) && n51.f.a(this.f457027f, gr0Var.f457027f) && n51.f.a(this.f457028g, gr0Var.f457028g) && n51.f.a(this.f457029h, gr0Var.f457029h) && n51.f.a(this.f457030i, gr0Var.f457030i) && n51.f.a(this.f457031m, gr0Var.f457031m) && n51.f.a(this.f457032n, gr0Var.f457032n) && n51.f.a(this.f457033o, gr0Var.f457033o) && n51.f.a(this.f457034p, gr0Var.f457034p);
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
                        case 116079:
                            if (next.equals("url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1111518510:
                            if (next.equals("expand_inside_title_en")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 1111518984:
                            if (next.equals("expand_inside_title_tw")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1111519155:
                            if (next.equals("expand_inside_title_zh")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1471668303:
                            if (next.equals("expand_outside_title_en")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1471668777:
                            if (next.equals("expand_outside_title_tw")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1471668948:
                            if (next.equals("expand_outside_title_zh")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 2104495536:
                            if (next.equals("wording_en")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2104496010:
                            if (next.equals("wording_tw")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 2104496181:
                            if (next.equals("wording_zh")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f457025d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f457026e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f457027f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f457028g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f457029h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f457030i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f457031m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f457032n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f457033o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            this.f457034p = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f457025d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457026e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457027f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f457028g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f457029h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f457030i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f457031m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f457032n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f457033o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f457034p;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f457025d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f457026e;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f457027f;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f457028g;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f457029h;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f457030i;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f457031m;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f457032n;
            if (str18 != null) {
                j17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f457033o;
            if (str19 != null) {
                j17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f457034p;
            return str20 != null ? j17 + b36.f.j(11, str20) : j17;
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
        r45.gr0 gr0Var = (r45.gr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gr0Var.f457025d = aVar2.k(intValue);
                return 0;
            case 2:
            default:
                return -1;
            case 3:
                gr0Var.f457026e = aVar2.k(intValue);
                return 0;
            case 4:
                gr0Var.f457027f = aVar2.k(intValue);
                return 0;
            case 5:
                gr0Var.f457028g = aVar2.k(intValue);
                return 0;
            case 6:
                gr0Var.f457029h = aVar2.k(intValue);
                return 0;
            case 7:
                gr0Var.f457030i = aVar2.k(intValue);
                return 0;
            case 8:
                gr0Var.f457031m = aVar2.k(intValue);
                return 0;
            case 9:
                gr0Var.f457032n = aVar2.k(intValue);
                return 0;
            case 10:
                gr0Var.f457033o = aVar2.k(intValue);
                return 0;
            case 11:
                gr0Var.f457034p = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f457025d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "url", str, false);
            eVar.d(jSONObject, "wording_zh", this.f457026e, false);
            eVar.d(jSONObject, "wording_tw", this.f457027f, false);
            eVar.d(jSONObject, "wording_en", this.f457028g, false);
            eVar.d(jSONObject, "expand_outside_title_zh", this.f457029h, false);
            eVar.d(jSONObject, "expand_outside_title_tw", this.f457030i, false);
            eVar.d(jSONObject, "expand_outside_title_en", this.f457031m, false);
            eVar.d(jSONObject, "expand_inside_title_zh", this.f457032n, false);
            eVar.d(jSONObject, "expand_inside_title_tw", this.f457033o, false);
            eVar.d(jSONObject, "expand_inside_title_en", this.f457034p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
