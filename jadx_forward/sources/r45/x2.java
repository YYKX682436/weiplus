package r45;

/* loaded from: classes4.dex */
public class x2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public long B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public int f471203d;

    /* renamed from: e, reason: collision with root package name */
    public int f471204e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471205f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471206g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471207h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471208i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471209m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471210n;

    /* renamed from: o, reason: collision with root package name */
    public int f471211o;

    /* renamed from: p, reason: collision with root package name */
    public int f471212p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471213q;

    /* renamed from: r, reason: collision with root package name */
    public long f471214r;

    /* renamed from: s, reason: collision with root package name */
    public int f471215s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f471216t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f471217u;

    /* renamed from: v, reason: collision with root package name */
    public int f471218v;

    /* renamed from: w, reason: collision with root package name */
    public int f471219w;

    /* renamed from: x, reason: collision with root package name */
    public int f471220x;

    /* renamed from: y, reason: collision with root package name */
    public int f471221y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f471222z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x2)) {
            return false;
        }
        r45.x2 x2Var = (r45.x2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471203d), java.lang.Integer.valueOf(x2Var.f471203d)) && n51.f.a(java.lang.Integer.valueOf(this.f471204e), java.lang.Integer.valueOf(x2Var.f471204e)) && n51.f.a(this.f471205f, x2Var.f471205f) && n51.f.a(this.f471206g, x2Var.f471206g) && n51.f.a(this.f471207h, x2Var.f471207h) && n51.f.a(this.f471208i, x2Var.f471208i) && n51.f.a(this.f471209m, x2Var.f471209m) && n51.f.a(this.f471210n, x2Var.f471210n) && n51.f.a(java.lang.Integer.valueOf(this.f471211o), java.lang.Integer.valueOf(x2Var.f471211o)) && n51.f.a(java.lang.Integer.valueOf(this.f471212p), java.lang.Integer.valueOf(x2Var.f471212p)) && n51.f.a(this.f471213q, x2Var.f471213q) && n51.f.a(java.lang.Long.valueOf(this.f471214r), java.lang.Long.valueOf(x2Var.f471214r)) && n51.f.a(java.lang.Integer.valueOf(this.f471215s), java.lang.Integer.valueOf(x2Var.f471215s)) && n51.f.a(this.f471216t, x2Var.f471216t) && n51.f.a(this.f471217u, x2Var.f471217u) && n51.f.a(java.lang.Integer.valueOf(this.f471218v), java.lang.Integer.valueOf(x2Var.f471218v)) && n51.f.a(java.lang.Integer.valueOf(this.f471219w), java.lang.Integer.valueOf(x2Var.f471219w)) && n51.f.a(java.lang.Integer.valueOf(this.f471220x), java.lang.Integer.valueOf(x2Var.f471220x)) && n51.f.a(java.lang.Integer.valueOf(this.f471221y), java.lang.Integer.valueOf(x2Var.f471221y)) && n51.f.a(this.f471222z, x2Var.f471222z) && n51.f.a(this.A, x2Var.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(x2Var.B)) && n51.f.a(this.C, x2Var.C) && n51.f.a(this.D, x2Var.D) && n51.f.a(this.E, x2Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(x2Var.F));
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
                        case -2094810920:
                            if (next.equals("outer_duration")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case -1964727523:
                            if (next.equals("click_pos")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1938110428:
                            if (next.equals("ipv4_md5")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -1936263386:
                            if (next.equals("ipv6_md5")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case -1904089573:
                            if (next.equals("client_ip")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1788292820:
                            if (next.equals("video_total_time")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -1506231196:
                            if (next.equals("client_version")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1291903789:
                            if (next.equals("play_total_time")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -982470938:
                            if (next.equals("pos_id")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -934828512:
                            if (next.equals("reffer")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -814188436:
                            if (next.equals("play_sequence")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -353328790:
                            if (next.equals("report_ts")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case -246795227:
                            if (next.equals("report_link")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -246541467:
                            if (next.equals("report_type")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -174007845:
                            if (next.equals("client_ipv6")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -97276114:
                            if (next.equals("biz_uin")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 96572:
                            if (next.equals("aid")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 433444722:
                            if (next.equals("exposure_type")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 550295380:
                            if (next.equals("exposure_scene")) {
                                c17 = 25;
                                break;
                            }
                            break;
                        case 782144144:
                            if (next.equals("devicetype")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1234998884:
                            if (next.equals("report_extra_data")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 1270300245:
                            if (next.equals("trace_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1660143334:
                            if (next.equals("advert_group_id")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1688668397:
                            if (next.equals("minishop_uuid")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case 1911031876:
                            if (next.equals("play_count")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case 1917799825:
                            if (next.equals("user_agent")) {
                                c17 = 5;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f471203d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f471204e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471205f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                                break;
                            }
                        case 3:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471206g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            }
                        case 4:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471207h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                                break;
                            }
                        case 5:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471208i = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt4, 0));
                                break;
                            }
                        case 6:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471209m = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt5, 0));
                                break;
                            }
                        case 7:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471210n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt6, 0));
                                break;
                            }
                        case '\b':
                            this.f471211o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f471212p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f471213q = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt7, 0));
                                break;
                            }
                        case 11:
                            this.f471214r = jSONObject.optLong(next);
                            break;
                        case '\f':
                            this.f471215s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f471216t = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 14:
                            this.f471217u = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 15:
                            this.f471218v = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            this.f471219w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            this.f471220x = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            this.f471221y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f471222z = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.A = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 21:
                            this.B = jSONObject.optLong(next);
                            break;
                        case 22:
                            this.C = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 23:
                            this.D = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 24:
                            this.E = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 25:
                            this.F = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            fVar.e(1, this.f471203d);
            fVar.e(2, this.f471204e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471205f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471206g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f471207h;
            if (gVar3 != null) {
                fVar.b(6, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f471208i;
            if (gVar4 != null) {
                fVar.b(11, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f471209m;
            if (gVar5 != null) {
                fVar.b(12, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f471210n;
            if (gVar6 != null) {
                fVar.b(13, gVar6);
            }
            fVar.e(16, this.f471211o);
            fVar.e(19, this.f471212p);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f471213q;
            if (gVar7 != null) {
                fVar.b(20, gVar7);
            }
            fVar.h(27, this.f471214r);
            fVar.e(40, this.f471215s);
            java.lang.String str = this.f471216t;
            if (str != null) {
                fVar.j(45, str);
            }
            java.lang.String str2 = this.f471217u;
            if (str2 != null) {
                fVar.j(56, str2);
            }
            fVar.e(63, this.f471218v);
            fVar.e(64, this.f471219w);
            fVar.e(65, this.f471220x);
            fVar.e(66, this.f471221y);
            java.lang.String str3 = this.f471222z;
            if (str3 != null) {
                fVar.j(67, str3);
            }
            java.lang.String str4 = this.A;
            if (str4 != null) {
                fVar.j(68, str4);
            }
            fVar.h(71, this.B);
            java.lang.String str5 = this.C;
            if (str5 != null) {
                fVar.j(75, str5);
            }
            java.lang.String str6 = this.D;
            if (str6 != null) {
                fVar.j(76, str6);
            }
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(92, str7);
            }
            fVar.e(103, this.F);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471203d) + 0 + b36.f.e(2, this.f471204e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f471205f;
            if (gVar8 != null) {
                e17 += b36.f.b(4, gVar8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar9 = this.f471206g;
            if (gVar9 != null) {
                e17 += b36.f.b(5, gVar9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar10 = this.f471207h;
            if (gVar10 != null) {
                e17 += b36.f.b(6, gVar10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar11 = this.f471208i;
            if (gVar11 != null) {
                e17 += b36.f.b(11, gVar11);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar12 = this.f471209m;
            if (gVar12 != null) {
                e17 += b36.f.b(12, gVar12);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar13 = this.f471210n;
            if (gVar13 != null) {
                e17 += b36.f.b(13, gVar13);
            }
            int e18 = e17 + b36.f.e(16, this.f471211o) + b36.f.e(19, this.f471212p);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar14 = this.f471213q;
            if (gVar14 != null) {
                e18 += b36.f.b(20, gVar14);
            }
            int h17 = e18 + b36.f.h(27, this.f471214r) + b36.f.e(40, this.f471215s);
            java.lang.String str8 = this.f471216t;
            if (str8 != null) {
                h17 += b36.f.j(45, str8);
            }
            java.lang.String str9 = this.f471217u;
            if (str9 != null) {
                h17 += b36.f.j(56, str9);
            }
            int e19 = h17 + b36.f.e(63, this.f471218v) + b36.f.e(64, this.f471219w) + b36.f.e(65, this.f471220x) + b36.f.e(66, this.f471221y);
            java.lang.String str10 = this.f471222z;
            if (str10 != null) {
                e19 += b36.f.j(67, str10);
            }
            java.lang.String str11 = this.A;
            if (str11 != null) {
                e19 += b36.f.j(68, str11);
            }
            int h18 = e19 + b36.f.h(71, this.B);
            java.lang.String str12 = this.C;
            if (str12 != null) {
                h18 += b36.f.j(75, str12);
            }
            java.lang.String str13 = this.D;
            if (str13 != null) {
                h18 += b36.f.j(76, str13);
            }
            java.lang.String str14 = this.E;
            if (str14 != null) {
                h18 += b36.f.j(92, str14);
            }
            return h18 + b36.f.e(103, this.F);
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
        r45.x2 x2Var = (r45.x2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x2Var.f471203d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            x2Var.f471204e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            x2Var.f471205f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 5) {
            x2Var.f471206g = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 6) {
            x2Var.f471207h = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 16) {
            x2Var.f471211o = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 27) {
            x2Var.f471214r = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 40) {
            x2Var.f471215s = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 45) {
            x2Var.f471216t = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 56) {
            x2Var.f471217u = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 71) {
            x2Var.B = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 92) {
            x2Var.E = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 103) {
            x2Var.F = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 19) {
            x2Var.f471212p = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 20) {
            x2Var.f471213q = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 75) {
            x2Var.C = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 76) {
            x2Var.D = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 11:
                x2Var.f471208i = aVar2.d(intValue);
                return 0;
            case 12:
                x2Var.f471209m = aVar2.d(intValue);
                return 0;
            case 13:
                x2Var.f471210n = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 63:
                        x2Var.f471218v = aVar2.g(intValue);
                        return 0;
                    case 64:
                        x2Var.f471219w = aVar2.g(intValue);
                        return 0;
                    case 65:
                        x2Var.f471220x = aVar2.g(intValue);
                        return 0;
                    case 66:
                        x2Var.f471221y = aVar2.g(intValue);
                        return 0;
                    case 67:
                        x2Var.f471222z = aVar2.k(intValue);
                        return 0;
                    case 68:
                        x2Var.A = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f471203d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "report_type", valueOf, false);
            eVar.d(jSONObject, "biz_uin", java.lang.Integer.valueOf(this.f471204e), false);
            eVar.d(jSONObject, "advert_group_id", this.f471205f, false);
            eVar.d(jSONObject, "trace_id", this.f471206g, false);
            eVar.d(jSONObject, "report_link", this.f471207h, false);
            eVar.d(jSONObject, "user_agent", this.f471208i, false);
            eVar.d(jSONObject, "client_ip", this.f471209m, false);
            eVar.d(jSONObject, "reffer", this.f471210n, false);
            eVar.d(jSONObject, "click_pos", java.lang.Integer.valueOf(this.f471211o), false);
            eVar.d(jSONObject, "client_version", java.lang.Integer.valueOf(this.f471212p), false);
            eVar.d(jSONObject, "devicetype", this.f471213q, false);
            eVar.d(jSONObject, "aid", java.lang.Long.valueOf(this.f471214r), false);
            eVar.d(jSONObject, "exposure_type", java.lang.Integer.valueOf(this.f471215s), false);
            eVar.d(jSONObject, "client_ipv6", this.f471216t, false);
            eVar.d(jSONObject, "pos_id", this.f471217u, false);
            eVar.d(jSONObject, "outer_duration", java.lang.Integer.valueOf(this.f471218v), false);
            eVar.d(jSONObject, "play_count", java.lang.Integer.valueOf(this.f471219w), false);
            eVar.d(jSONObject, "play_total_time", java.lang.Integer.valueOf(this.f471220x), false);
            eVar.d(jSONObject, "video_total_time", java.lang.Integer.valueOf(this.f471221y), false);
            eVar.d(jSONObject, "play_sequence", this.f471222z, false);
            eVar.d(jSONObject, "report_extra_data", this.A, false);
            eVar.d(jSONObject, "report_ts", java.lang.Long.valueOf(this.B), false);
            eVar.d(jSONObject, "ipv4_md5", this.C, false);
            eVar.d(jSONObject, "ipv6_md5", this.D, false);
            eVar.d(jSONObject, "minishop_uuid", this.E, false);
            eVar.d(jSONObject, "exposure_scene", java.lang.Integer.valueOf(this.F), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
