package r45;

/* loaded from: classes4.dex */
public class x30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.mz4 A;

    /* renamed from: d, reason: collision with root package name */
    public int f471261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471262e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471263f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471265h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471266i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471267m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471268n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471269o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qf0 f471270p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471271q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f471272r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f471273s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f471274t;

    /* renamed from: u, reason: collision with root package name */
    public r45.tm4 f471275u;

    /* renamed from: v, reason: collision with root package name */
    public r45.nb0 f471276v;

    /* renamed from: w, reason: collision with root package name */
    public r45.x30 f471277w;

    /* renamed from: x, reason: collision with root package name */
    public r45.sa0 f471278x;

    /* renamed from: y, reason: collision with root package name */
    public r45.gg5 f471279y;

    /* renamed from: z, reason: collision with root package name */
    public r45.rf0 f471280z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x30)) {
            return false;
        }
        r45.x30 x30Var = (r45.x30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471261d), java.lang.Integer.valueOf(x30Var.f471261d)) && n51.f.a(this.f471262e, x30Var.f471262e) && n51.f.a(this.f471263f, x30Var.f471263f) && n51.f.a(this.f471264g, x30Var.f471264g) && n51.f.a(this.f471265h, x30Var.f471265h) && n51.f.a(this.f471266i, x30Var.f471266i) && n51.f.a(this.f471267m, x30Var.f471267m) && n51.f.a(this.f471268n, x30Var.f471268n) && n51.f.a(this.f471269o, x30Var.f471269o) && n51.f.a(this.f471270p, x30Var.f471270p) && n51.f.a(this.f471271q, x30Var.f471271q) && n51.f.a(this.f471272r, x30Var.f471272r) && n51.f.a(this.f471273s, x30Var.f471273s) && n51.f.a(this.f471274t, x30Var.f471274t) && n51.f.a(this.f471275u, x30Var.f471275u) && n51.f.a(this.f471276v, x30Var.f471276v) && n51.f.a(this.f471277w, x30Var.f471277w) && n51.f.a(this.f471278x, x30Var.f471278x) && n51.f.a(this.f471279y, x30Var.f471279y) && n51.f.a(this.f471280z, x30Var.f471280z) && n51.f.a(this.A, x30Var.A);
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
                        case -1993962897:
                            if (next.equals("mini_shop_info")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -1877165340:
                            if (next.equals("package_name")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1367393694:
                            if (next.equals("default_click_action_info")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -1125297262:
                            if (next.equals("finder_live_feed_nonce_id")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -941352384:
                            if (next.equals("deep_link_info")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case -831754187:
                            if (next.equals("canvas_dynamic_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -800652737:
                            if (next.equals("finder_live_feed_export_id")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -689282375:
                            if (next.equals("customer_service_info")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -336926979:
                            if (next.equals("mini_program_type")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 31549957:
                            if (next.equals("download_info")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case 100723110:
                            if (next.equals("finder_user_name")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 604044092:
                            if (next.equals("qr_code_scan_info")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case 1017044322:
                            if (next.equals("canvas_id")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1220911669:
                            if (next.equals("finder_live_id")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1265457891:
                            if (next.equals("open_sdk_app_id_android")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1388130385:
                            if (next.equals("weapp_path")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1890833317:
                            if (next.equals("open_app_market_half_screen_info")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 1893262700:
                            if (next.equals("download_half_screen_info")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 2031121452:
                            if (next.equals("click_action_link")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 2031375212:
                            if (next.equals("click_action_type")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 2120605139:
                            if (next.equals("weapp_user_name")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f471261d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f471262e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f471263f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f471264g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f471265h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f471266i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f471267m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f471268n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f471269o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.qf0 qf0Var = new r45.qf0();
                                qf0Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                this.f471270p = qf0Var;
                                break;
                            }
                        case '\n':
                            this.f471271q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f471272r = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\f':
                            this.f471273s = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\r':
                            this.f471274t = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 14:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.tm4 tm4Var = new r45.tm4();
                                tm4Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                this.f471275u = tm4Var;
                                break;
                            }
                        case 15:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.nb0 nb0Var = new r45.nb0();
                                nb0Var.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                this.f471276v = nb0Var;
                                break;
                            }
                        case 16:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.x30 x30Var = new r45.x30();
                                x30Var.mo75930xb5cb93b2(((org.json.JSONObject) opt4).toString());
                                this.f471277w = x30Var;
                                break;
                            }
                        case 17:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.sa0 sa0Var = new r45.sa0();
                                sa0Var.mo75930xb5cb93b2(((org.json.JSONObject) opt5).toString());
                                this.f471278x = sa0Var;
                                break;
                            }
                        case 18:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.gg5 gg5Var = new r45.gg5();
                                gg5Var.mo75930xb5cb93b2(((org.json.JSONObject) opt6).toString());
                                this.f471279y = gg5Var;
                                break;
                            }
                        case 19:
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.rf0 rf0Var = new r45.rf0();
                                rf0Var.mo75930xb5cb93b2(((org.json.JSONObject) opt7).toString());
                                this.f471280z = rf0Var;
                                break;
                            }
                        case 20:
                            java.lang.Object opt8 = jSONObject.opt(next);
                            if (!(opt8 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.mz4 mz4Var = new r45.mz4();
                                mz4Var.mo75930xb5cb93b2(((org.json.JSONObject) opt8).toString());
                                this.A = mz4Var;
                                break;
                            }
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
            fVar.e(1, this.f471261d);
            java.lang.String str = this.f471262e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f471263f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f471264g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f471265h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f471266i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f471267m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f471268n;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f471269o;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            r45.qf0 qf0Var = this.f471270p;
            if (qf0Var != null) {
                fVar.i(13, qf0Var.mo75928xcd1e8d8());
                this.f471270p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.f471271q;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f471272r;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f471273s;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.f471274t;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            r45.tm4 tm4Var = this.f471275u;
            if (tm4Var != null) {
                fVar.i(18, tm4Var.mo75928xcd1e8d8());
                this.f471275u.mo75956x3d5d1f78(fVar);
            }
            r45.nb0 nb0Var = this.f471276v;
            if (nb0Var != null) {
                fVar.i(20, nb0Var.mo75928xcd1e8d8());
                this.f471276v.mo75956x3d5d1f78(fVar);
            }
            r45.x30 x30Var = this.f471277w;
            if (x30Var != null) {
                fVar.i(21, x30Var.mo75928xcd1e8d8());
                this.f471277w.mo75956x3d5d1f78(fVar);
            }
            r45.sa0 sa0Var = this.f471278x;
            if (sa0Var != null) {
                fVar.i(22, sa0Var.mo75928xcd1e8d8());
                this.f471278x.mo75956x3d5d1f78(fVar);
            }
            r45.gg5 gg5Var = this.f471279y;
            if (gg5Var != null) {
                fVar.i(23, gg5Var.mo75928xcd1e8d8());
                this.f471279y.mo75956x3d5d1f78(fVar);
            }
            r45.rf0 rf0Var = this.f471280z;
            if (rf0Var != null) {
                fVar.i(24, rf0Var.mo75928xcd1e8d8());
                this.f471280z.mo75956x3d5d1f78(fVar);
            }
            r45.mz4 mz4Var = this.A;
            if (mz4Var != null) {
                fVar.i(25, mz4Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471261d) + 0;
            java.lang.String str13 = this.f471262e;
            if (str13 != null) {
                e17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f471263f;
            if (str14 != null) {
                e17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f471264g;
            if (str15 != null) {
                e17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f471265h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f471266i;
            if (str17 != null) {
                e17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f471267m;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f471268n;
            if (str19 != null) {
                e17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f471269o;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            r45.qf0 qf0Var2 = this.f471270p;
            if (qf0Var2 != null) {
                e17 += b36.f.i(13, qf0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str21 = this.f471271q;
            if (str21 != null) {
                e17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f471272r;
            if (str22 != null) {
                e17 += b36.f.j(15, str22);
            }
            java.lang.String str23 = this.f471273s;
            if (str23 != null) {
                e17 += b36.f.j(16, str23);
            }
            java.lang.String str24 = this.f471274t;
            if (str24 != null) {
                e17 += b36.f.j(17, str24);
            }
            r45.tm4 tm4Var2 = this.f471275u;
            if (tm4Var2 != null) {
                e17 += b36.f.i(18, tm4Var2.mo75928xcd1e8d8());
            }
            r45.nb0 nb0Var2 = this.f471276v;
            if (nb0Var2 != null) {
                e17 += b36.f.i(20, nb0Var2.mo75928xcd1e8d8());
            }
            r45.x30 x30Var2 = this.f471277w;
            if (x30Var2 != null) {
                e17 += b36.f.i(21, x30Var2.mo75928xcd1e8d8());
            }
            r45.sa0 sa0Var2 = this.f471278x;
            if (sa0Var2 != null) {
                e17 += b36.f.i(22, sa0Var2.mo75928xcd1e8d8());
            }
            r45.gg5 gg5Var2 = this.f471279y;
            if (gg5Var2 != null) {
                e17 += b36.f.i(23, gg5Var2.mo75928xcd1e8d8());
            }
            r45.rf0 rf0Var2 = this.f471280z;
            if (rf0Var2 != null) {
                e17 += b36.f.i(24, rf0Var2.mo75928xcd1e8d8());
            }
            r45.mz4 mz4Var2 = this.A;
            return mz4Var2 != null ? e17 + b36.f.i(25, mz4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.x30 x30Var3 = (r45.x30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x30Var3.f471261d = aVar2.g(intValue);
                return 0;
            case 2:
                x30Var3.f471262e = aVar2.k(intValue);
                return 0;
            case 3:
                x30Var3.f471263f = aVar2.k(intValue);
                return 0;
            case 4:
                x30Var3.f471264g = aVar2.k(intValue);
                return 0;
            case 5:
                x30Var3.f471265h = aVar2.k(intValue);
                return 0;
            case 6:
                x30Var3.f471266i = aVar2.k(intValue);
                return 0;
            case 7:
                x30Var3.f471267m = aVar2.k(intValue);
                return 0;
            case 8:
            case 9:
            case 12:
            case 19:
            default:
                return -1;
            case 10:
                x30Var3.f471268n = aVar2.k(intValue);
                return 0;
            case 11:
                x30Var3.f471269o = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qf0 qf0Var3 = new r45.qf0();
                    if (bArr != null && bArr.length > 0) {
                        qf0Var3.mo11468x92b714fd(bArr);
                    }
                    x30Var3.f471270p = qf0Var3;
                }
                return 0;
            case 14:
                x30Var3.f471271q = aVar2.k(intValue);
                return 0;
            case 15:
                x30Var3.f471272r = aVar2.k(intValue);
                return 0;
            case 16:
                x30Var3.f471273s = aVar2.k(intValue);
                return 0;
            case 17:
                x30Var3.f471274t = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.tm4 tm4Var3 = new r45.tm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tm4Var3.mo11468x92b714fd(bArr2);
                    }
                    x30Var3.f471275u = tm4Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.nb0 nb0Var3 = new r45.nb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        nb0Var3.mo11468x92b714fd(bArr3);
                    }
                    x30Var3.f471276v = nb0Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.x30 x30Var4 = new r45.x30();
                    if (bArr4 != null && bArr4.length > 0) {
                        x30Var4.mo11468x92b714fd(bArr4);
                    }
                    x30Var3.f471277w = x30Var4;
                }
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.sa0 sa0Var3 = new r45.sa0();
                    if (bArr5 != null && bArr5.length > 0) {
                        sa0Var3.mo11468x92b714fd(bArr5);
                    }
                    x30Var3.f471278x = sa0Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.gg5 gg5Var3 = new r45.gg5();
                    if (bArr6 != null && bArr6.length > 0) {
                        gg5Var3.mo11468x92b714fd(bArr6);
                    }
                    x30Var3.f471279y = gg5Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    r45.rf0 rf0Var3 = new r45.rf0();
                    if (bArr7 != null && bArr7.length > 0) {
                        rf0Var3.mo11468x92b714fd(bArr7);
                    }
                    x30Var3.f471280z = rf0Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    r45.mz4 mz4Var3 = new r45.mz4();
                    if (bArr8 != null && bArr8.length > 0) {
                        mz4Var3.mo11468x92b714fd(bArr8);
                    }
                    x30Var3.A = mz4Var3;
                }
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f471261d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "click_action_type", valueOf, false);
            eVar.d(jSONObject, "click_action_link", this.f471262e, false);
            eVar.d(jSONObject, "weapp_user_name", this.f471263f, false);
            eVar.d(jSONObject, "weapp_path", this.f471264g, false);
            eVar.d(jSONObject, "mini_program_type", this.f471265h, false);
            eVar.d(jSONObject, "canvas_dynamic_info", this.f471266i, false);
            eVar.d(jSONObject, "canvas_id", this.f471267m, false);
            eVar.d(jSONObject, "package_name", this.f471268n, false);
            eVar.d(jSONObject, "open_sdk_app_id_android", this.f471269o, false);
            eVar.d(jSONObject, "download_half_screen_info", this.f471270p, false);
            eVar.d(jSONObject, "finder_user_name", this.f471271q, false);
            eVar.d(jSONObject, "finder_live_id", this.f471272r, false);
            eVar.d(jSONObject, "finder_live_feed_export_id", this.f471273s, false);
            eVar.d(jSONObject, "finder_live_feed_nonce_id", this.f471274t, false);
            eVar.d(jSONObject, "mini_shop_info", this.f471275u, false);
            eVar.d(jSONObject, "deep_link_info", this.f471276v, false);
            eVar.d(jSONObject, "default_click_action_info", this.f471277w, false);
            eVar.d(jSONObject, "customer_service_info", this.f471278x, false);
            eVar.d(jSONObject, "qr_code_scan_info", this.f471279y, false);
            eVar.d(jSONObject, "download_info", this.f471280z, false);
            eVar.d(jSONObject, "open_app_market_half_screen_info", this.A, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
