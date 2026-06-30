package r45;

/* loaded from: classes4.dex */
public class wm4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470810d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470811e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470812f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f470813g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470814h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470815i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470816m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470817n;

    /* renamed from: o, reason: collision with root package name */
    public int f470818o;

    /* renamed from: p, reason: collision with root package name */
    public int f470819p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470820q;

    /* renamed from: r, reason: collision with root package name */
    public r45.bo f470821r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f470822s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm4)) {
            return false;
        }
        r45.wm4 wm4Var = (r45.wm4) fVar;
        return n51.f.a(this.f470810d, wm4Var.f470810d) && n51.f.a(this.f470811e, wm4Var.f470811e) && n51.f.a(this.f470812f, wm4Var.f470812f) && n51.f.a(this.f470813g, wm4Var.f470813g) && n51.f.a(this.f470814h, wm4Var.f470814h) && n51.f.a(this.f470815i, wm4Var.f470815i) && n51.f.a(this.f470816m, wm4Var.f470816m) && n51.f.a(this.f470817n, wm4Var.f470817n) && n51.f.a(java.lang.Integer.valueOf(this.f470818o), java.lang.Integer.valueOf(wm4Var.f470818o)) && n51.f.a(java.lang.Integer.valueOf(this.f470819p), java.lang.Integer.valueOf(wm4Var.f470819p)) && n51.f.a(this.f470820q, wm4Var.f470820q) && n51.f.a(this.f470821r, wm4Var.f470821r) && n51.f.a(this.f470822s, wm4Var.f470822s);
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
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -1215594452:
                            if (next.equals("marketing_tag_info")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1210296322:
                            if (next.equals("is_price_begin_show")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -873413996:
                            if (next.equals("brand_icon_url_dark")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -671925663:
                            if (next.equals("brand_icon_url")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -154756992:
                            if (next.equals("guarantee_icon_url")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 255822726:
                            if (next.equals("market_price")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 317131841:
                            if (next.equals("is_market_price_show")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 435378657:
                            if (next.equals("guarantee_wording")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 537860823:
                            if (next.equals("platform_name")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 645073231:
                            if (next.equals("brand_icon_size")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1386652424:
                            if (next.equals("product_title")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1862430963:
                            if (next.equals("selling_price_wording")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1901725594:
                            if (next.equals("selling_price")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f470810d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f470811e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f470812f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                while (i17 < jSONArray.length()) {
                                    this.f470813g.add((java.lang.String) jSONArray.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 4:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                                while (i17 < jSONArray2.length()) {
                                    this.f470814h.add((java.lang.String) jSONArray2.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 5:
                            this.f470815i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f470816m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f470817n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f470818o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f470819p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f470820q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.bo boVar = new r45.bo();
                                boVar.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                this.f470821r = boVar;
                                break;
                            }
                        case '\f':
                            this.f470822s = (java.lang.String) jSONObject.opt(next);
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
        java.util.LinkedList linkedList = this.f470814h;
        java.util.LinkedList linkedList2 = this.f470813g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470810d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470811e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470812f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 1, linkedList);
            java.lang.String str4 = this.f470815i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f470816m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f470817n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f470818o);
            fVar.e(10, this.f470819p);
            java.lang.String str7 = this.f470820q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            r45.bo boVar = this.f470821r;
            if (boVar != null) {
                fVar.i(12, boVar.mo75928xcd1e8d8());
                this.f470821r.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str8 = this.f470822s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f470810d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f470811e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f470812f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int g17 = j17 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 1, linkedList);
            java.lang.String str12 = this.f470815i;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f470816m;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f470817n;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            int e17 = g17 + b36.f.e(9, this.f470818o) + b36.f.e(10, this.f470819p);
            java.lang.String str15 = this.f470820q;
            if (str15 != null) {
                e17 += b36.f.j(11, str15);
            }
            r45.bo boVar2 = this.f470821r;
            if (boVar2 != null) {
                e17 += b36.f.i(12, boVar2.mo75928xcd1e8d8());
            }
            java.lang.String str16 = this.f470822s;
            return str16 != null ? e17 + b36.f.j(13, str16) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.wm4 wm4Var = (r45.wm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wm4Var.f470810d = aVar2.k(intValue);
                return 0;
            case 2:
                wm4Var.f470811e = aVar2.k(intValue);
                return 0;
            case 3:
                wm4Var.f470812f = aVar2.k(intValue);
                return 0;
            case 4:
                wm4Var.f470813g.add(aVar2.k(intValue));
                return 0;
            case 5:
                wm4Var.f470814h.add(aVar2.k(intValue));
                return 0;
            case 6:
                wm4Var.f470815i = aVar2.k(intValue);
                return 0;
            case 7:
                wm4Var.f470816m = aVar2.k(intValue);
                return 0;
            case 8:
                wm4Var.f470817n = aVar2.k(intValue);
                return 0;
            case 9:
                wm4Var.f470818o = aVar2.g(intValue);
                return 0;
            case 10:
                wm4Var.f470819p = aVar2.g(intValue);
                return 0;
            case 11:
                wm4Var.f470820q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.bo boVar3 = new r45.bo();
                    if (bArr2 != null && bArr2.length > 0) {
                        boVar3.mo11468x92b714fd(bArr2);
                    }
                    wm4Var.f470821r = boVar3;
                }
                return 0;
            case 13:
                wm4Var.f470822s = aVar2.k(intValue);
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
            java.lang.String str = this.f470810d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "product_title", str, false);
            eVar.d(jSONObject, "selling_price", this.f470811e, false);
            eVar.d(jSONObject, "market_price", this.f470812f, false);
            eVar.d(jSONObject, "marketing_tag_info", this.f470813g, false);
            eVar.d(jSONObject, "guarantee_wording", this.f470814h, false);
            eVar.d(jSONObject, "platform_name", this.f470815i, false);
            eVar.d(jSONObject, "guarantee_icon_url", this.f470816m, false);
            eVar.d(jSONObject, "brand_icon_url", this.f470817n, false);
            eVar.d(jSONObject, "is_market_price_show", java.lang.Integer.valueOf(this.f470818o), false);
            eVar.d(jSONObject, "is_price_begin_show", java.lang.Integer.valueOf(this.f470819p), false);
            eVar.d(jSONObject, "selling_price_wording", this.f470820q, false);
            eVar.d(jSONObject, "brand_icon_size", this.f470821r, false);
            eVar.d(jSONObject, "brand_icon_url_dark", this.f470822s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
