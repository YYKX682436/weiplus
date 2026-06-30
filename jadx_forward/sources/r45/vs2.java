package r45;

/* loaded from: classes8.dex */
public class vs2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.s30 A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public long C;

    /* renamed from: d, reason: collision with root package name */
    public int f470019d;

    /* renamed from: e, reason: collision with root package name */
    public int f470020e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470021f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f470022g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470023h;

    /* renamed from: i, reason: collision with root package name */
    public int f470024i;

    /* renamed from: m, reason: collision with root package name */
    public int f470025m;

    /* renamed from: n, reason: collision with root package name */
    public int f470026n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f470027o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f470028p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470029q;

    /* renamed from: r, reason: collision with root package name */
    public int f470030r;

    /* renamed from: s, reason: collision with root package name */
    public int f470031s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f470032t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f470033u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470034v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470035w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f470036x;

    /* renamed from: y, reason: collision with root package name */
    public int f470037y;

    /* renamed from: z, reason: collision with root package name */
    public int f470038z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vs2)) {
            return false;
        }
        r45.vs2 vs2Var = (r45.vs2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470019d), java.lang.Integer.valueOf(vs2Var.f470019d)) && n51.f.a(java.lang.Integer.valueOf(this.f470020e), java.lang.Integer.valueOf(vs2Var.f470020e)) && n51.f.a(this.f470021f, vs2Var.f470021f) && n51.f.a(this.f470022g, vs2Var.f470022g) && n51.f.a(this.f470023h, vs2Var.f470023h) && n51.f.a(java.lang.Integer.valueOf(this.f470024i), java.lang.Integer.valueOf(vs2Var.f470024i)) && n51.f.a(java.lang.Integer.valueOf(this.f470025m), java.lang.Integer.valueOf(vs2Var.f470025m)) && n51.f.a(java.lang.Integer.valueOf(this.f470026n), java.lang.Integer.valueOf(vs2Var.f470026n)) && n51.f.a(java.lang.Boolean.valueOf(this.f470027o), java.lang.Boolean.valueOf(vs2Var.f470027o)) && n51.f.a(this.f470028p, vs2Var.f470028p) && n51.f.a(this.f470029q, vs2Var.f470029q) && n51.f.a(java.lang.Integer.valueOf(this.f470030r), java.lang.Integer.valueOf(vs2Var.f470030r)) && n51.f.a(java.lang.Integer.valueOf(this.f470031s), java.lang.Integer.valueOf(vs2Var.f470031s)) && n51.f.a(this.f470032t, vs2Var.f470032t) && n51.f.a(this.f470033u, vs2Var.f470033u) && n51.f.a(this.f470034v, vs2Var.f470034v) && n51.f.a(this.f470035w, vs2Var.f470035w) && n51.f.a(this.f470036x, vs2Var.f470036x) && n51.f.a(java.lang.Integer.valueOf(this.f470037y), java.lang.Integer.valueOf(vs2Var.f470037y)) && n51.f.a(java.lang.Integer.valueOf(this.f470038z), java.lang.Integer.valueOf(vs2Var.f470038z)) && n51.f.a(this.A, vs2Var.A) && n51.f.a(this.B, vs2Var.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(vs2Var.C));
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
                        case -2057382891:
                            if (next.equals("save_Strategy")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -1573145462:
                            if (next.equals("start_time")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1310739582:
                            if (next.equals("tips_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1306498449:
                            if (next.equals("extInfo")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1278410919:
                            if (next.equals("feedId")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -1194943390:
                            if (next.equals("tips_uuid")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -1165461084:
                            if (next.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1160326153:
                            if (next.equals("internal_feedback_url")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1159291097:
                            if (next.equals("clear_prev_reddot_feed_strategy")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case -521457284:
                            if (next.equals("session_bypass_info")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -96179731:
                            if (next.equals("expire_time")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 3575610:
                            if (next.equals("type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 32264720:
                            if (next.equals("finder_sub_recall_type")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 243982663:
                            if (next.equals("reddot_expose_buff")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case 452971343:
                            if (next.equals("ignore_valid")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 506361563:
                            if (next.equals(ya.b.f77478x4cd4defb)) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case 630087769:
                            if (next.equals("business_type")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case 823546702:
                            if (next.equals("ignore_display_tab_type")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1116372419:
                            if (next.equals("show_infos")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1662551223:
                            if (next.equals("report_ctrl_info")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case 1675237852:
                            if (next.equals("self_finder_username")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1731475127:
                            if (next.equals("report_ext_info")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1745305302:
                            if (next.equals("live_sub_recall_type")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f470019d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f470020e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof java.lang.String) {
                                this.f470021f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt2;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f470022g;
                                        r45.f03 f03Var = new r45.f03();
                                        f03Var.mo75930xb5cb93b2(((org.json.JSONObject) obj).toString());
                                        linkedList.add(f03Var);
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            this.f470023h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f470024i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f470025m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f470026n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f470027o = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case '\t':
                            this.f470028p = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\n':
                            this.f470029q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f470030r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f470031s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\r':
                            this.f470032t = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 14:
                            this.f470033u = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 15:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof java.lang.String) {
                                this.f470034v = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (opt4 instanceof java.lang.String) {
                                this.f470035w = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt4, 0));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            this.f470036x = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 18:
                            this.f470037y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f470038z = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 20:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (opt5 instanceof org.json.JSONObject) {
                                r45.s30 s30Var = new r45.s30();
                                s30Var.mo75930xb5cb93b2(((org.json.JSONObject) opt5).toString());
                                this.A = s30Var;
                                break;
                            } else {
                                break;
                            }
                        case 21:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (opt6 instanceof java.lang.String) {
                                this.B = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt6, 0));
                                break;
                            } else {
                                break;
                            }
                        case 22:
                            this.C = jSONObject.optLong(next);
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
            fVar.e(1, this.f470019d);
            fVar.e(2, this.f470020e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470021f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, this.f470022g);
            java.lang.String str = this.f470023h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f470024i);
            fVar.e(7, this.f470025m);
            fVar.e(8, this.f470026n);
            fVar.a(9, this.f470027o);
            java.lang.String str2 = this.f470028p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f470029q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            fVar.e(12, this.f470030r);
            fVar.e(13, this.f470031s);
            java.lang.String str4 = this.f470032t;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f470033u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470034v;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f470035w;
            if (gVar3 != null) {
                fVar.b(18, gVar3);
            }
            java.lang.String str6 = this.f470036x;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            fVar.e(20, this.f470037y);
            fVar.e(21, this.f470038z);
            r45.s30 s30Var = this.A;
            if (s30Var != null) {
                fVar.i(22, s30Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.B;
            if (gVar4 != null) {
                fVar.b(23, gVar4);
            }
            fVar.h(100, this.C);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470019d) + 0 + b36.f.e(2, this.f470020e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f470021f;
            if (gVar5 != null) {
                e17 += b36.f.b(3, gVar5);
            }
            int g17 = e17 + b36.f.g(4, 8, this.f470022g);
            java.lang.String str7 = this.f470023h;
            if (str7 != null) {
                g17 += b36.f.j(5, str7);
            }
            int e18 = g17 + b36.f.e(6, this.f470024i) + b36.f.e(7, this.f470025m) + b36.f.e(8, this.f470026n) + b36.f.a(9, this.f470027o);
            java.lang.String str8 = this.f470028p;
            if (str8 != null) {
                e18 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.f470029q;
            if (str9 != null) {
                e18 += b36.f.j(11, str9);
            }
            int e19 = e18 + b36.f.e(12, this.f470030r) + b36.f.e(13, this.f470031s);
            java.lang.String str10 = this.f470032t;
            if (str10 != null) {
                e19 += b36.f.j(14, str10);
            }
            java.lang.String str11 = this.f470033u;
            if (str11 != null) {
                e19 += b36.f.j(15, str11);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f470034v;
            if (gVar6 != null) {
                e19 += b36.f.b(16, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f470035w;
            if (gVar7 != null) {
                e19 += b36.f.b(18, gVar7);
            }
            java.lang.String str12 = this.f470036x;
            if (str12 != null) {
                e19 += b36.f.j(19, str12);
            }
            int e27 = e19 + b36.f.e(20, this.f470037y) + b36.f.e(21, this.f470038z);
            r45.s30 s30Var2 = this.A;
            if (s30Var2 != null) {
                e27 += b36.f.i(22, s30Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.B;
            if (gVar8 != null) {
                e27 += b36.f.b(23, gVar8);
            }
            return e27 + b36.f.h(100, this.C);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470022g.clear();
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
        r45.vs2 vs2Var = (r45.vs2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            vs2Var.C = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                vs2Var.f470019d = aVar2.g(intValue);
                return 0;
            case 2:
                vs2Var.f470020e = aVar2.g(intValue);
                return 0;
            case 3:
                vs2Var.f470021f = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.f03 f03Var = new r45.f03();
                    if (bArr2 != null && bArr2.length > 0) {
                        f03Var.mo11468x92b714fd(bArr2);
                    }
                    vs2Var.f470022g.add(f03Var);
                }
                return 0;
            case 5:
                vs2Var.f470023h = aVar2.k(intValue);
                return 0;
            case 6:
                vs2Var.f470024i = aVar2.g(intValue);
                return 0;
            case 7:
                vs2Var.f470025m = aVar2.g(intValue);
                return 0;
            case 8:
                vs2Var.f470026n = aVar2.g(intValue);
                return 0;
            case 9:
                vs2Var.f470027o = aVar2.c(intValue);
                return 0;
            case 10:
                vs2Var.f470028p = aVar2.k(intValue);
                return 0;
            case 11:
                vs2Var.f470029q = aVar2.k(intValue);
                return 0;
            case 12:
                vs2Var.f470030r = aVar2.g(intValue);
                return 0;
            case 13:
                vs2Var.f470031s = aVar2.g(intValue);
                return 0;
            case 14:
                vs2Var.f470032t = aVar2.k(intValue);
                return 0;
            case 15:
                vs2Var.f470033u = aVar2.k(intValue);
                return 0;
            case 16:
                vs2Var.f470034v = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 18:
                        vs2Var.f470035w = aVar2.d(intValue);
                        return 0;
                    case 19:
                        vs2Var.f470036x = aVar2.k(intValue);
                        return 0;
                    case 20:
                        vs2Var.f470037y = aVar2.g(intValue);
                        return 0;
                    case 21:
                        vs2Var.f470038z = aVar2.g(intValue);
                        return 0;
                    case 22:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr3 = (byte[]) j18.get(i19);
                            r45.s30 s30Var3 = new r45.s30();
                            if (bArr3 != null && bArr3.length > 0) {
                                s30Var3.mo11468x92b714fd(bArr3);
                            }
                            vs2Var.A = s30Var3;
                        }
                        return 0;
                    case 23:
                        vs2Var.B = aVar2.d(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f470019d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4, valueOf, true);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f470020e), true);
            eVar.d(jSONObject, "extInfo", this.f470021f, true);
            eVar.d(jSONObject, "show_infos", this.f470022g, true);
            eVar.d(jSONObject, "tips_id", this.f470023h, true);
            eVar.d(jSONObject, "expire_time", java.lang.Integer.valueOf(this.f470024i), true);
            eVar.d(jSONObject, "start_time", java.lang.Integer.valueOf(this.f470025m), true);
            eVar.d(jSONObject, "ignore_display_tab_type", java.lang.Integer.valueOf(this.f470026n), true);
            eVar.d(jSONObject, "ignore_valid", java.lang.Boolean.valueOf(this.f470027o), true);
            eVar.d(jSONObject, "internal_feedback_url", this.f470028p, true);
            eVar.d(jSONObject, "self_finder_username", this.f470029q, true);
            eVar.d(jSONObject, "finder_sub_recall_type", java.lang.Integer.valueOf(this.f470030r), true);
            eVar.d(jSONObject, "live_sub_recall_type", java.lang.Integer.valueOf(this.f470031s), true);
            eVar.d(jSONObject, "report_ext_info", this.f470032t, true);
            eVar.d(jSONObject, ya.b.f77478x4cd4defb, this.f470033u, true);
            eVar.d(jSONObject, "report_ctrl_info", this.f470034v, true);
            eVar.d(jSONObject, "session_bypass_info", this.f470035w, true);
            eVar.d(jSONObject, "tips_uuid", this.f470036x, true);
            eVar.d(jSONObject, "save_Strategy", java.lang.Integer.valueOf(this.f470037y), true);
            eVar.d(jSONObject, "business_type", java.lang.Integer.valueOf(this.f470038z), true);
            eVar.d(jSONObject, "clear_prev_reddot_feed_strategy", this.A, true);
            eVar.d(jSONObject, "reddot_expose_buff", this.B, true);
            eVar.d(jSONObject, "feedId", java.lang.Long.valueOf(this.C), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
