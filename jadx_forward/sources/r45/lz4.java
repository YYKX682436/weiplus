package r45;

/* loaded from: classes4.dex */
public class lz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461532e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461534g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461535h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461536i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461537m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f461538n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f461539o;

    /* renamed from: p, reason: collision with root package name */
    public int f461540p;

    /* renamed from: q, reason: collision with root package name */
    public int f461541q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lz4)) {
            return false;
        }
        r45.lz4 lz4Var = (r45.lz4) fVar;
        return n51.f.a(this.f461531d, lz4Var.f461531d) && n51.f.a(this.f461532e, lz4Var.f461532e) && n51.f.a(this.f461533f, lz4Var.f461533f) && n51.f.a(this.f461534g, lz4Var.f461534g) && n51.f.a(this.f461535h, lz4Var.f461535h) && n51.f.a(this.f461536i, lz4Var.f461536i) && n51.f.a(this.f461537m, lz4Var.f461537m) && n51.f.a(this.f461538n, lz4Var.f461538n) && n51.f.a(java.lang.Integer.valueOf(this.f461539o), java.lang.Integer.valueOf(lz4Var.f461539o)) && n51.f.a(java.lang.Integer.valueOf(this.f461540p), java.lang.Integer.valueOf(lz4Var.f461540p)) && n51.f.a(java.lang.Integer.valueOf(this.f461541q), java.lang.Integer.valueOf(lz4Var.f461541q));
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
                        case -678315036:
                            if (next.equals("button_wider_style")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 77933481:
                            if (next.equals("expand_click_area")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 109780401:
                            if (next.equals("style")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 110367737:
                            if (next.equals("tips1")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 110367738:
                            if (next.equals("tips2")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 921718240:
                            if (next.equals("app_image_list")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 936955573:
                            if (next.equals("btn_title")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1091086503:
                            if (next.equals("forbid_tap_bg_to_close")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1167354351:
                            if (next.equals("app_desc")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1167501271:
                            if (next.equals("app_icon")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1167648233:
                            if (next.equals("app_name")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f461531d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f461532e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f461533f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f461534g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f461535h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f461536i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f461537m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    this.f461538n.add((java.lang.String) jSONArray.get(i17));
                                }
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            this.f461539o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f461540p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f461541q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
        java.util.LinkedList linkedList = this.f461538n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461531d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461532e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461533f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f461534g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f461535h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f461536i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f461537m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.g(8, 1, linkedList);
            fVar.e(9, this.f461539o);
            fVar.e(10, this.f461540p);
            fVar.e(11, this.f461541q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f461531d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f461532e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f461533f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f461534g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f461535h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f461536i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f461537m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.g(8, 1, linkedList) + b36.f.e(9, this.f461539o) + b36.f.e(10, this.f461540p) + b36.f.e(11, this.f461541q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.lz4 lz4Var = (r45.lz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lz4Var.f461531d = aVar2.k(intValue);
                return 0;
            case 2:
                lz4Var.f461532e = aVar2.k(intValue);
                return 0;
            case 3:
                lz4Var.f461533f = aVar2.k(intValue);
                return 0;
            case 4:
                lz4Var.f461534g = aVar2.k(intValue);
                return 0;
            case 5:
                lz4Var.f461535h = aVar2.k(intValue);
                return 0;
            case 6:
                lz4Var.f461536i = aVar2.k(intValue);
                return 0;
            case 7:
                lz4Var.f461537m = aVar2.k(intValue);
                return 0;
            case 8:
                lz4Var.f461538n.add(aVar2.k(intValue));
                return 0;
            case 9:
                lz4Var.f461539o = aVar2.g(intValue);
                return 0;
            case 10:
                lz4Var.f461540p = aVar2.g(intValue);
                return 0;
            case 11:
                lz4Var.f461541q = aVar2.g(intValue);
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
            java.lang.String str = this.f461531d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "app_icon", str, false);
            eVar.d(jSONObject, "app_name", this.f461532e, false);
            eVar.d(jSONObject, "btn_title", this.f461533f, false);
            eVar.d(jSONObject, "tips1", this.f461534g, false);
            eVar.d(jSONObject, "tips2", this.f461535h, false);
            eVar.d(jSONObject, "style", this.f461536i, false);
            eVar.d(jSONObject, "app_desc", this.f461537m, false);
            eVar.d(jSONObject, "app_image_list", this.f461538n, false);
            eVar.d(jSONObject, "expand_click_area", java.lang.Integer.valueOf(this.f461539o), false);
            eVar.d(jSONObject, "button_wider_style", java.lang.Integer.valueOf(this.f461540p), false);
            eVar.d(jSONObject, "forbid_tap_bg_to_close", java.lang.Integer.valueOf(this.f461541q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
