package r45;

/* loaded from: classes4.dex */
public class nb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462751d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462752e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462753f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462754g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462755h;

    /* renamed from: i, reason: collision with root package name */
    public r45.lz4 f462756i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462757m;

    /* renamed from: n, reason: collision with root package name */
    public int f462758n;

    /* renamed from: o, reason: collision with root package name */
    public int f462759o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nb0)) {
            return false;
        }
        r45.nb0 nb0Var = (r45.nb0) fVar;
        return n51.f.a(this.f462751d, nb0Var.f462751d) && n51.f.a(this.f462752e, nb0Var.f462752e) && n51.f.a(this.f462753f, nb0Var.f462753f) && n51.f.a(this.f462754g, nb0Var.f462754g) && n51.f.a(this.f462755h, nb0Var.f462755h) && n51.f.a(this.f462756i, nb0Var.f462756i) && n51.f.a(this.f462757m, nb0Var.f462757m) && n51.f.a(java.lang.Integer.valueOf(this.f462758n), java.lang.Integer.valueOf(nb0Var.f462758n)) && n51.f.a(java.lang.Integer.valueOf(this.f462759o), java.lang.Integer.valueOf(nb0Var.f462759o));
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
                        case -1722607999:
                            if (next.equals("open_sdk_app_id_ios")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1721287849:
                            if (next.equals("b_internal_jump_app_store")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -660267064:
                            if (next.equals("open_app_half_screen_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -103254963:
                            if (next.equals("app_page_url_android")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 126245340:
                            if (next.equals("ulink_allow_no_prompt")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 175756063:
                            if (next.equals("ulink_url")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 793212139:
                            if (next.equals("app_page_url_ios")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1265457891:
                            if (next.equals("open_sdk_app_id_android")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 2001845878:
                            if (next.equals("deep_link_package_name")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f462751d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f462752e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f462753f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f462754g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f462755h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.lz4 lz4Var = new r45.lz4();
                                lz4Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                this.f462756i = lz4Var;
                                break;
                            }
                        case 6:
                            this.f462757m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f462758n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f462759o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            java.lang.String str = this.f462751d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462752e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462753f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f462754g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f462755h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            r45.lz4 lz4Var = this.f462756i;
            if (lz4Var != null) {
                fVar.i(6, lz4Var.mo75928xcd1e8d8());
                this.f462756i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f462757m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f462758n);
            fVar.e(9, this.f462759o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f462751d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f462752e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f462753f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f462754g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f462755h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            r45.lz4 lz4Var2 = this.f462756i;
            if (lz4Var2 != null) {
                j17 += b36.f.i(6, lz4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f462757m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            return j17 + b36.f.e(8, this.f462758n) + b36.f.e(9, this.f462759o);
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
        r45.nb0 nb0Var = (r45.nb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nb0Var.f462751d = aVar2.k(intValue);
                return 0;
            case 2:
                nb0Var.f462752e = aVar2.k(intValue);
                return 0;
            case 3:
                nb0Var.f462753f = aVar2.k(intValue);
                return 0;
            case 4:
                nb0Var.f462754g = aVar2.k(intValue);
                return 0;
            case 5:
                nb0Var.f462755h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.lz4 lz4Var3 = new r45.lz4();
                    if (bArr != null && bArr.length > 0) {
                        lz4Var3.mo11468x92b714fd(bArr);
                    }
                    nb0Var.f462756i = lz4Var3;
                }
                return 0;
            case 7:
                nb0Var.f462757m = aVar2.k(intValue);
                return 0;
            case 8:
                nb0Var.f462758n = aVar2.g(intValue);
                return 0;
            case 9:
                nb0Var.f462759o = aVar2.g(intValue);
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
            java.lang.String str = this.f462751d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "app_page_url_ios", str, false);
            eVar.d(jSONObject, "app_page_url_android", this.f462752e, false);
            eVar.d(jSONObject, "deep_link_package_name", this.f462753f, false);
            eVar.d(jSONObject, "open_sdk_app_id_ios", this.f462754g, false);
            eVar.d(jSONObject, "open_sdk_app_id_android", this.f462755h, false);
            eVar.d(jSONObject, "open_app_half_screen_info", this.f462756i, false);
            eVar.d(jSONObject, "ulink_url", this.f462757m, false);
            eVar.d(jSONObject, "ulink_allow_no_prompt", java.lang.Integer.valueOf(this.f462758n), false);
            eVar.d(jSONObject, "b_internal_jump_app_store", java.lang.Integer.valueOf(this.f462759o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
