package r45;

/* loaded from: classes8.dex */
public class k01 extends r45.mr5 {
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public r45.sd7 C;
    public r45.zl6 D;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g F;
    public o0.m F2;
    public int G;
    public r45.ba4 H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f459781J;
    public r45.rn1 K;
    public r45.hf5 L;
    public int M;
    public int N;
    public int P;
    public long Q;
    public r45.q12 R;
    public int S;
    public int T;
    public r45.kf5 U;
    public int V;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g W;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g X;

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f459782d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459783e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 f459784f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459785g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459786h;

    /* renamed from: i, reason: collision with root package name */
    public int f459787i;

    /* renamed from: m, reason: collision with root package name */
    public int f459788m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459789n;

    /* renamed from: p, reason: collision with root package name */
    public r45.fd2 f459791p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f459792p0;

    /* renamed from: q, reason: collision with root package name */
    public int f459793q;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f459798v;

    /* renamed from: w, reason: collision with root package name */
    public int f459799w;

    /* renamed from: x, reason: collision with root package name */
    public int f459800x;

    /* renamed from: x0, reason: collision with root package name */
    public long f459801x0;

    /* renamed from: y, reason: collision with root package name */
    public r45.um1 f459802y;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f459790o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f459794r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f459795s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f459796t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f459797u = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public java.util.LinkedList f459803z = new java.util.LinkedList();
    public java.util.LinkedList A = new java.util.LinkedList();
    public java.util.LinkedList E = new java.util.LinkedList();
    public java.util.LinkedList Y = new java.util.LinkedList();
    public java.util.LinkedList Z = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k01)) {
            return false;
        }
        r45.k01 k01Var = (r45.k01) fVar;
        return n51.f.a(this.f76494x2de60e5e, k01Var.f76494x2de60e5e) && n51.f.a(this.f459782d, k01Var.f459782d) && n51.f.a(this.f459783e, k01Var.f459783e) && n51.f.a(this.f459784f, k01Var.f459784f) && n51.f.a(this.f459785g, k01Var.f459785g) && n51.f.a(this.f459786h, k01Var.f459786h) && n51.f.a(java.lang.Integer.valueOf(this.f459787i), java.lang.Integer.valueOf(k01Var.f459787i)) && n51.f.a(java.lang.Integer.valueOf(this.f459788m), java.lang.Integer.valueOf(k01Var.f459788m)) && n51.f.a(this.f459789n, k01Var.f459789n) && n51.f.a(this.f459790o, k01Var.f459790o) && n51.f.a(this.f459791p, k01Var.f459791p) && n51.f.a(java.lang.Integer.valueOf(this.f459793q), java.lang.Integer.valueOf(k01Var.f459793q)) && n51.f.a(this.f459794r, k01Var.f459794r) && n51.f.a(this.f459795s, k01Var.f459795s) && n51.f.a(this.f459796t, k01Var.f459796t) && n51.f.a(this.f459797u, k01Var.f459797u) && n51.f.a(this.f459798v, k01Var.f459798v) && n51.f.a(java.lang.Integer.valueOf(this.f459799w), java.lang.Integer.valueOf(k01Var.f459799w)) && n51.f.a(java.lang.Integer.valueOf(this.f459800x), java.lang.Integer.valueOf(k01Var.f459800x)) && n51.f.a(this.f459802y, k01Var.f459802y) && n51.f.a(this.f459803z, k01Var.f459803z) && n51.f.a(this.A, k01Var.A) && n51.f.a(this.B, k01Var.B) && n51.f.a(this.C, k01Var.C) && n51.f.a(this.D, k01Var.D) && n51.f.a(this.E, k01Var.E) && n51.f.a(this.F, k01Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(k01Var.G)) && n51.f.a(this.H, k01Var.H) && n51.f.a(this.I, k01Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f459781J), java.lang.Integer.valueOf(k01Var.f459781J)) && n51.f.a(this.K, k01Var.K) && n51.f.a(this.L, k01Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(k01Var.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(k01Var.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(k01Var.P)) && n51.f.a(java.lang.Long.valueOf(this.Q), java.lang.Long.valueOf(k01Var.Q)) && n51.f.a(this.R, k01Var.R) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(k01Var.S)) && n51.f.a(java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(k01Var.T)) && n51.f.a(this.U, k01Var.U) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(k01Var.V)) && n51.f.a(this.W, k01Var.W) && n51.f.a(this.X, k01Var.X) && n51.f.a(this.Y, k01Var.Y) && n51.f.a(this.Z, k01Var.Z) && n51.f.a(this.f459792p0, k01Var.f459792p0) && n51.f.a(java.lang.Long.valueOf(this.f459801x0), java.lang.Long.valueOf(k01Var.f459801x0)) && n51.f.a(this.F2, k01Var.F2);
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
                        case -2114671952:
                            if (next.equals("visibility_mode")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case -2085891459:
                            if (next.equals("screen_orientation")) {
                                c17 = '#';
                                break;
                            }
                            break;
                        case -2044545900:
                            if (next.equals("free_of_charge_friend_label_list")) {
                                c17 = '-';
                                break;
                            }
                            break;
                        case -1931818612:
                            if (next.equals("visibility_file_id_list")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -1775835593:
                            if (next.equals("live_mode_info")) {
                                c17 = '%';
                                break;
                            }
                            break;
                        case -1522671844:
                            if (next.equals("finderUsername")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1481523929:
                            if (next.equals("finderBasereq")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1394730369:
                            if (next.equals("topic_info_list")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1344718425:
                            if (next.equals("bulletin")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -996332462:
                            if (next.equals("live_room_img")) {
                                c17 = 28;
                                break;
                            }
                            break;
                        case -873960692:
                            if (next.equals("ticket")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -872318109:
                            if (next.equals("create_live_page_mode")) {
                                c17 = ')';
                                break;
                            }
                            break;
                        case -764146125:
                            if (next.equals("tag_info")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case -672734438:
                            if (next.equals("businessType")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -633682633:
                            if (next.equals("mic_topic")) {
                                c17 = '.';
                                break;
                            }
                            break;
                        case -536313906:
                            if (next.equals("acknowledge_spam_msg")) {
                                c17 = 27;
                                break;
                            }
                            break;
                        case -526018059:
                            if (next.equals("free_of_charge_file_id_list")) {
                                c17 = 25;
                                break;
                            }
                            break;
                        case -516852464:
                            if (next.equals("live_entrance_type")) {
                                c17 = 30;
                                break;
                            }
                            break;
                        case -500796186:
                            if (next.equals("game_app_id")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -488200893:
                            if (next.equals("purchase_preview_info")) {
                                c17 = ' ';
                                break;
                            }
                            break;
                        case -335081068:
                            if (next.equals("charge_free_flag")) {
                                c17 = '$';
                                break;
                            }
                            break;
                        case -302452941:
                            if (next.equals("charge_unit_price_in_wecoin")) {
                                c17 = 18;
                                break;
                            }
                            break;
                        case -153729989:
                            if (next.equals("spam_check_info")) {
                                c17 = 26;
                                break;
                            }
                            break;
                        case -121363868:
                            if (next.equals("applyUsername")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -18399640:
                            if (next.equals("create_live_prepare_buffer")) {
                                c17 = '+';
                                break;
                            }
                            break;
                        case 109254796:
                            if (next.equals(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 134152886:
                            if (next.equals("mic_topic_info")) {
                                c17 = '0';
                                break;
                            }
                            break;
                        case 144389677:
                            if (next.equals("thirdparty_param")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case 263617196:
                            if (next.equals("free_of_charge_chatroom_id_list")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 310356133:
                            if (next.equals("hardware_info")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case 346015777:
                            if (next.equals("co_live_invitation_id")) {
                                c17 = '/';
                                break;
                            }
                            break;
                        case 457692234:
                            if (next.equals("notificationmsg_trigger_type")) {
                                c17 = '&';
                                break;
                            }
                            break;
                        case 467537434:
                            if (next.equals("purchase_mic_setting")) {
                                c17 = '(';
                                break;
                            }
                            break;
                        case 571608806:
                            if (next.equals("client_status")) {
                                c17 = 31;
                                break;
                            }
                            break;
                        case 649961649:
                            if (next.equals("free_of_charge_username_list")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case 675368083:
                            if (next.equals("wxa_game_live_info")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 821419591:
                            if (next.equals("charge_is_member_free")) {
                                c17 = '\"';
                                break;
                            }
                            break;
                        case 908408390:
                            if (next.equals(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26)) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1008792854:
                            if (next.equals("live_mode")) {
                                c17 = '!';
                                break;
                            }
                            break;
                        case 1021388311:
                            if (next.equals("charge_flag")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case 1066360432:
                            if (next.equals("objectDesc")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1516433011:
                            if (next.equals("game_live_stream_type")) {
                                c17 = '\'';
                                break;
                            }
                            break;
                        case 1753131869:
                            if (next.equals("visibility_friend_label_list")) {
                                c17 = ',';
                                break;
                            }
                            break;
                        case 1775700314:
                            if (next.equals("visible_username_list")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case 1864842683:
                            if (next.equals("redpacket_refer_chatroom_id_list")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1867909475:
                            if (next.equals("create_live_bubble_buffer")) {
                                c17 = '*';
                                break;
                            }
                            break;
                        case 1898728418:
                            if (next.equals("notice_id")) {
                                c17 = 29;
                                break;
                            }
                            break;
                        case 2039539043:
                            if (next.equals("visible_chatroom_id_list")) {
                                c17 = 14;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f76494x2de60e5e = (r45.he) new r45.he().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f459782d = (r45.kv0) new r45.kv0().mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 2:
                            this.f459783e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f459784f = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56().mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                break;
                            }
                        case 4:
                            this.f459785g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f459786h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f459787i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f459788m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f459789n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt4, 0));
                                break;
                            }
                        case '\t':
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt5;
                                while (i17 < jSONArray.length()) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        this.f459790o.add((r45.t03) new r45.t03().mo75930xb5cb93b2(((org.json.JSONObject) obj).toString()));
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case '\n':
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f459791p = (r45.fd2) new r45.fd2().mo75930xb5cb93b2(((org.json.JSONObject) opt6).toString());
                                break;
                            }
                        case 11:
                            this.f459793q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            java.lang.Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt7;
                                while (i17 < jSONArray2.length()) {
                                    this.f459794r.add((java.lang.String) jSONArray2.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case '\r':
                            java.lang.Object opt8 = jSONObject.opt(next);
                            if (!(opt8 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray3 = (org.json.JSONArray) opt8;
                                while (i17 < jSONArray3.length()) {
                                    this.f459795s.add((java.lang.String) jSONArray3.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 14:
                            java.lang.Object opt9 = jSONObject.opt(next);
                            if (!(opt9 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray4 = (org.json.JSONArray) opt9;
                                while (i17 < jSONArray4.length()) {
                                    this.f459796t.add((java.lang.String) jSONArray4.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 15:
                            java.lang.Object opt10 = jSONObject.opt(next);
                            if (!(opt10 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray5 = (org.json.JSONArray) opt10;
                                while (i17 < jSONArray5.length()) {
                                    this.f459797u.add((java.lang.String) jSONArray5.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 16:
                            this.f459798v = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 17:
                            this.f459799w = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 18:
                            this.f459800x = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            java.lang.Object opt11 = jSONObject.opt(next);
                            if (!(opt11 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f459802y = (r45.um1) new r45.um1().mo75930xb5cb93b2(((org.json.JSONObject) opt11).toString());
                                break;
                            }
                        case 20:
                            java.lang.Object opt12 = jSONObject.opt(next);
                            if (!(opt12 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray6 = (org.json.JSONArray) opt12;
                                while (i17 < jSONArray6.length()) {
                                    this.f459803z.add((java.lang.String) jSONArray6.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 21:
                            java.lang.Object opt13 = jSONObject.opt(next);
                            if (!(opt13 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray7 = (org.json.JSONArray) opt13;
                                while (i17 < jSONArray7.length()) {
                                    this.A.add((java.lang.String) jSONArray7.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 22:
                            java.lang.Object opt14 = jSONObject.opt(next);
                            if (!(opt14 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.B = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt14, 0));
                                break;
                            }
                        case 23:
                            java.lang.Object opt15 = jSONObject.opt(next);
                            if (!(opt15 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.C = (r45.sd7) new r45.sd7().mo75930xb5cb93b2(((org.json.JSONObject) opt15).toString());
                                break;
                            }
                        case 24:
                            java.lang.Object opt16 = jSONObject.opt(next);
                            if (!(opt16 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.D = (r45.zl6) new r45.zl6().mo75930xb5cb93b2(((org.json.JSONObject) opt16).toString());
                                break;
                            }
                        case 25:
                            java.lang.Object opt17 = jSONObject.opt(next);
                            if (!(opt17 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray8 = (org.json.JSONArray) opt17;
                                while (i17 < jSONArray8.length()) {
                                    this.E.add((java.lang.String) jSONArray8.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 26:
                            java.lang.Object opt18 = jSONObject.opt(next);
                            if (!(opt18 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.F = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt18, 0));
                                break;
                            }
                        case 27:
                            this.G = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 28:
                            java.lang.Object opt19 = jSONObject.opt(next);
                            if (!(opt19 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.H = (r45.ba4) new r45.ba4().mo75930xb5cb93b2(((org.json.JSONObject) opt19).toString());
                                break;
                            }
                        case 29:
                            this.I = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 30:
                            this.f459781J = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 31:
                            java.lang.Object opt20 = jSONObject.opt(next);
                            if (!(opt20 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.K = (r45.rn1) new r45.rn1().mo75930xb5cb93b2(((org.json.JSONObject) opt20).toString());
                                break;
                            }
                        case ' ':
                            java.lang.Object opt21 = jSONObject.opt(next);
                            if (!(opt21 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.L = (r45.hf5) new r45.hf5().mo75930xb5cb93b2(((org.json.JSONObject) opt21).toString());
                                break;
                            }
                        case '!':
                            this.M = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\"':
                            this.N = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '#':
                            this.P = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '$':
                            this.Q = jSONObject.optLong(next);
                            break;
                        case '%':
                            java.lang.Object opt22 = jSONObject.opt(next);
                            if (!(opt22 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.R = (r45.q12) new r45.q12().mo75930xb5cb93b2(((org.json.JSONObject) opt22).toString());
                                break;
                            }
                        case '&':
                            this.S = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\'':
                            this.T = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '(':
                            java.lang.Object opt23 = jSONObject.opt(next);
                            if (!(opt23 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.U = (r45.kf5) new r45.kf5().mo75930xb5cb93b2(((org.json.JSONObject) opt23).toString());
                                break;
                            }
                        case ')':
                            this.V = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '*':
                            java.lang.Object opt24 = jSONObject.opt(next);
                            if (!(opt24 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.W = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt24, 0));
                                break;
                            }
                        case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                            java.lang.Object opt25 = jSONObject.opt(next);
                            if (!(opt25 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.X = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt25, 0));
                                break;
                            }
                        case ',':
                            java.lang.Object opt26 = jSONObject.opt(next);
                            if (!(opt26 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray9 = (org.json.JSONArray) opt26;
                                while (i17 < jSONArray9.length()) {
                                    this.Y.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray9.get(i17)).intValue()));
                                    i17++;
                                }
                                break;
                            }
                        case '-':
                            java.lang.Object opt27 = jSONObject.opt(next);
                            if (!(opt27 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray10 = (org.json.JSONArray) opt27;
                                while (i17 < jSONArray10.length()) {
                                    this.Z.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray10.get(i17)).intValue()));
                                    i17++;
                                }
                                break;
                            }
                        case '.':
                            this.f459792p0 = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '/':
                            this.f459801x0 = jSONObject.optLong(next);
                            break;
                        case '0':
                            java.lang.Object opt28 = jSONObject.opt(next);
                            if (!(opt28 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                o0.m mVar = new o0.m();
                                mVar.mo75930xb5cb93b2(((org.json.JSONObject) opt28).toString());
                                this.F2 = mVar;
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
        java.util.LinkedList linkedList = this.f459790o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f459782d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f459782d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f459783e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = this.f459784f;
            if (c19793xceab7f56 != null) {
                fVar.i(4, c19793xceab7f56.mo75928xcd1e8d8());
                this.f459784f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f459785g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f459786h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f459787i);
            fVar.e(8, this.f459788m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f459789n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            fVar.g(10, 8, linkedList);
            r45.fd2 fd2Var = this.f459791p;
            if (fd2Var != null) {
                fVar.i(11, fd2Var.mo75928xcd1e8d8());
                this.f459791p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f459793q);
            fVar.g(13, 1, this.f459794r);
            fVar.g(14, 1, this.f459795s);
            fVar.g(15, 1, this.f459796t);
            fVar.g(16, 1, this.f459797u);
            java.lang.String str4 = this.f459798v;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.e(18, this.f459799w);
            fVar.e(19, this.f459800x);
            r45.um1 um1Var = this.f459802y;
            if (um1Var != null) {
                fVar.i(20, um1Var.mo75928xcd1e8d8());
                this.f459802y.mo75956x3d5d1f78(fVar);
            }
            fVar.g(21, 1, this.f459803z);
            fVar.g(22, 1, this.A);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.B;
            if (gVar2 != null) {
                fVar.b(23, gVar2);
            }
            r45.sd7 sd7Var = this.C;
            if (sd7Var != null) {
                fVar.i(24, sd7Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            r45.zl6 zl6Var = this.D;
            if (zl6Var != null) {
                fVar.i(25, zl6Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            fVar.g(26, 1, this.E);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.F;
            if (gVar3 != null) {
                fVar.b(27, gVar3);
            }
            fVar.e(28, this.G);
            r45.ba4 ba4Var = this.H;
            if (ba4Var != null) {
                fVar.i(29, ba4Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.I;
            if (str5 != null) {
                fVar.j(30, str5);
            }
            fVar.e(31, this.f459781J);
            r45.rn1 rn1Var = this.K;
            if (rn1Var != null) {
                fVar.i(32, rn1Var.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            r45.hf5 hf5Var = this.L;
            if (hf5Var != null) {
                fVar.i(33, hf5Var.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            fVar.e(34, this.M);
            fVar.e(37, this.N);
            fVar.e(40, this.P);
            fVar.h(42, this.Q);
            r45.q12 q12Var = this.R;
            if (q12Var != null) {
                fVar.i(43, q12Var.mo75928xcd1e8d8());
                this.R.mo75956x3d5d1f78(fVar);
            }
            fVar.e(44, this.S);
            fVar.e(45, this.T);
            r45.kf5 kf5Var = this.U;
            if (kf5Var != null) {
                fVar.i(46, kf5Var.mo75928xcd1e8d8());
                this.U.mo75956x3d5d1f78(fVar);
            }
            fVar.e(48, this.V);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.W;
            if (gVar4 != null) {
                fVar.b(49, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.X;
            if (gVar5 != null) {
                fVar.b(50, gVar5);
            }
            fVar.g(51, 2, this.Y);
            fVar.g(52, 2, this.Z);
            java.lang.String str6 = this.f459792p0;
            if (str6 != null) {
                fVar.j(53, str6);
            }
            fVar.h(54, this.f459801x0);
            o0.m mVar = this.F2;
            if (mVar != null) {
                fVar.i(55, mVar.mo75928xcd1e8d8());
                this.F2.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f459782d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f459783e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f562 = this.f459784f;
            if (c19793xceab7f562 != null) {
                i18 += b36.f.i(4, c19793xceab7f562.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f459785g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f459786h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            int e17 = i18 + b36.f.e(7, this.f459787i) + b36.f.e(8, this.f459788m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f459789n;
            if (gVar6 != null) {
                e17 += b36.f.b(9, gVar6);
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList);
            r45.fd2 fd2Var2 = this.f459791p;
            if (fd2Var2 != null) {
                g17 += b36.f.i(11, fd2Var2.mo75928xcd1e8d8());
            }
            int e18 = g17 + b36.f.e(12, this.f459793q) + b36.f.g(13, 1, this.f459794r) + b36.f.g(14, 1, this.f459795s) + b36.f.g(15, 1, this.f459796t) + b36.f.g(16, 1, this.f459797u);
            java.lang.String str10 = this.f459798v;
            if (str10 != null) {
                e18 += b36.f.j(17, str10);
            }
            int e19 = e18 + b36.f.e(18, this.f459799w) + b36.f.e(19, this.f459800x);
            r45.um1 um1Var2 = this.f459802y;
            if (um1Var2 != null) {
                e19 += b36.f.i(20, um1Var2.mo75928xcd1e8d8());
            }
            int g18 = e19 + b36.f.g(21, 1, this.f459803z) + b36.f.g(22, 1, this.A);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.B;
            if (gVar7 != null) {
                g18 += b36.f.b(23, gVar7);
            }
            r45.sd7 sd7Var2 = this.C;
            if (sd7Var2 != null) {
                g18 += b36.f.i(24, sd7Var2.mo75928xcd1e8d8());
            }
            r45.zl6 zl6Var2 = this.D;
            if (zl6Var2 != null) {
                g18 += b36.f.i(25, zl6Var2.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(26, 1, this.E);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.F;
            if (gVar8 != null) {
                g19 += b36.f.b(27, gVar8);
            }
            int e27 = g19 + b36.f.e(28, this.G);
            r45.ba4 ba4Var2 = this.H;
            if (ba4Var2 != null) {
                e27 += b36.f.i(29, ba4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.I;
            if (str11 != null) {
                e27 += b36.f.j(30, str11);
            }
            int e28 = e27 + b36.f.e(31, this.f459781J);
            r45.rn1 rn1Var2 = this.K;
            if (rn1Var2 != null) {
                e28 += b36.f.i(32, rn1Var2.mo75928xcd1e8d8());
            }
            r45.hf5 hf5Var2 = this.L;
            if (hf5Var2 != null) {
                e28 += b36.f.i(33, hf5Var2.mo75928xcd1e8d8());
            }
            int e29 = e28 + b36.f.e(34, this.M) + b36.f.e(37, this.N) + b36.f.e(40, this.P) + b36.f.h(42, this.Q);
            r45.q12 q12Var2 = this.R;
            if (q12Var2 != null) {
                e29 += b36.f.i(43, q12Var2.mo75928xcd1e8d8());
            }
            int e37 = e29 + b36.f.e(44, this.S) + b36.f.e(45, this.T);
            r45.kf5 kf5Var2 = this.U;
            if (kf5Var2 != null) {
                e37 += b36.f.i(46, kf5Var2.mo75928xcd1e8d8());
            }
            int e38 = e37 + b36.f.e(48, this.V);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar9 = this.W;
            if (gVar9 != null) {
                e38 += b36.f.b(49, gVar9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar10 = this.X;
            if (gVar10 != null) {
                e38 += b36.f.b(50, gVar10);
            }
            int g27 = e38 + b36.f.g(51, 2, this.Y) + b36.f.g(52, 2, this.Z);
            java.lang.String str12 = this.f459792p0;
            if (str12 != null) {
                g27 += b36.f.j(53, str12);
            }
            int h17 = g27 + b36.f.h(54, this.f459801x0);
            o0.m mVar2 = this.F2;
            return mVar2 != null ? h17 + b36.f.i(55, mVar2.mo75928xcd1e8d8()) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f459794r.clear();
            this.f459795s.clear();
            this.f459796t.clear();
            this.f459797u.clear();
            this.f459803z.clear();
            this.A.clear();
            this.E.clear();
            this.Y.clear();
            this.Z.clear();
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
        r45.k01 k01Var = (r45.k01) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    k01Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr3);
                    }
                    k01Var.f459782d = kv0Var3;
                }
                return 0;
            case 3:
                k01Var.f459783e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f563 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
                    if (bArr4 != null && bArr4.length > 0) {
                        c19793xceab7f563.mo11468x92b714fd(bArr4);
                    }
                    k01Var.f459784f = c19793xceab7f563;
                }
                return 0;
            case 5:
                k01Var.f459785g = aVar2.k(intValue);
                return 0;
            case 6:
                k01Var.f459786h = aVar2.k(intValue);
                return 0;
            case 7:
                k01Var.f459787i = aVar2.g(intValue);
                return 0;
            case 8:
                k01Var.f459788m = aVar2.g(intValue);
                return 0;
            case 9:
                k01Var.f459789n = aVar2.d(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.t03 t03Var = new r45.t03();
                    if (bArr5 != null && bArr5.length > 0) {
                        t03Var.mo11468x92b714fd(bArr5);
                    }
                    k01Var.f459790o.add(t03Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.fd2 fd2Var3 = new r45.fd2();
                    if (bArr6 != null && bArr6.length > 0) {
                        fd2Var3.mo11468x92b714fd(bArr6);
                    }
                    k01Var.f459791p = fd2Var3;
                }
                return 0;
            case 12:
                k01Var.f459793q = aVar2.g(intValue);
                return 0;
            case 13:
                k01Var.f459794r.add(aVar2.k(intValue));
                return 0;
            case 14:
                k01Var.f459795s.add(aVar2.k(intValue));
                return 0;
            case 15:
                k01Var.f459796t.add(aVar2.k(intValue));
                return 0;
            case 16:
                k01Var.f459797u.add(aVar2.k(intValue));
                return 0;
            case 17:
                k01Var.f459798v = aVar2.k(intValue);
                return 0;
            case 18:
                k01Var.f459799w = aVar2.g(intValue);
                return 0;
            case 19:
                k01Var.f459800x = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.um1 um1Var3 = new r45.um1();
                    if (bArr7 != null && bArr7.length > 0) {
                        um1Var3.mo11468x92b714fd(bArr7);
                    }
                    k01Var.f459802y = um1Var3;
                }
                return 0;
            case 21:
                k01Var.f459803z.add(aVar2.k(intValue));
                return 0;
            case 22:
                k01Var.A.add(aVar2.k(intValue));
                return 0;
            case 23:
                k01Var.B = aVar2.d(intValue);
                return 0;
            case 24:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.sd7 sd7Var3 = new r45.sd7();
                    if (bArr8 != null && bArr8.length > 0) {
                        sd7Var3.mo11468x92b714fd(bArr8);
                    }
                    k01Var.C = sd7Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.zl6 zl6Var3 = new r45.zl6();
                    if (bArr9 != null && bArr9.length > 0) {
                        zl6Var3.mo11468x92b714fd(bArr9);
                    }
                    k01Var.D = zl6Var3;
                }
                return 0;
            case 26:
                k01Var.E.add(aVar2.k(intValue));
                return 0;
            case 27:
                k01Var.F = aVar2.d(intValue);
                return 0;
            case 28:
                k01Var.G = aVar2.g(intValue);
                return 0;
            case 29:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.ba4 ba4Var3 = new r45.ba4();
                    if (bArr10 != null && bArr10.length > 0) {
                        ba4Var3.mo11468x92b714fd(bArr10);
                    }
                    k01Var.H = ba4Var3;
                }
                return 0;
            case 30:
                k01Var.I = aVar2.k(intValue);
                return 0;
            case 31:
                k01Var.f459781J = aVar2.g(intValue);
                return 0;
            case 32:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.rn1 rn1Var3 = new r45.rn1();
                    if (bArr11 != null && bArr11.length > 0) {
                        rn1Var3.mo11468x92b714fd(bArr11);
                    }
                    k01Var.K = rn1Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.hf5 hf5Var3 = new r45.hf5();
                    if (bArr12 != null && bArr12.length > 0) {
                        hf5Var3.mo11468x92b714fd(bArr12);
                    }
                    k01Var.L = hf5Var3;
                }
                return 0;
            case 34:
                k01Var.M = aVar2.g(intValue);
                return 0;
            case 35:
            case 36:
            case 38:
            case 39:
            case 41:
            case 47:
            default:
                return -1;
            case 37:
                k01Var.N = aVar2.g(intValue);
                return 0;
            case 40:
                k01Var.P = aVar2.g(intValue);
                return 0;
            case 42:
                k01Var.Q = aVar2.i(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.q12 q12Var3 = new r45.q12();
                    if (bArr13 != null && bArr13.length > 0) {
                        q12Var3.mo11468x92b714fd(bArr13);
                    }
                    k01Var.R = q12Var3;
                }
                return 0;
            case 44:
                k01Var.S = aVar2.g(intValue);
                return 0;
            case 45:
                k01Var.T = aVar2.g(intValue);
                return 0;
            case 46:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.kf5 kf5Var3 = new r45.kf5();
                    if (bArr14 != null && bArr14.length > 0) {
                        kf5Var3.mo11468x92b714fd(bArr14);
                    }
                    k01Var.U = kf5Var3;
                }
                return 0;
            case 48:
                k01Var.V = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                k01Var.W = aVar2.d(intValue);
                return 0;
            case 50:
                k01Var.X = aVar2.d(intValue);
                return 0;
            case 51:
                k01Var.Y.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 52:
                k01Var.Z.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 53:
                k01Var.f459792p0 = aVar2.k(intValue);
                return 0;
            case 54:
                k01Var.f459801x0 = aVar2.i(intValue);
                return 0;
            case 55:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    o0.m mVar3 = new o0.m();
                    if (bArr15 != null && bArr15.length > 0) {
                        mVar3.mo11468x92b714fd(bArr15);
                    }
                    k01Var.F2 = mVar3;
                }
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, true);
            eVar.d(jSONObject, "finderBasereq", this.f459782d, true);
            eVar.d(jSONObject, "finderUsername", this.f459783e, true);
            eVar.d(jSONObject, "objectDesc", this.f459784f, true);
            eVar.d(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26, this.f459785g, true);
            eVar.d(jSONObject, "applyUsername", this.f459786h, true);
            eVar.d(jSONObject, "businessType", java.lang.Integer.valueOf(this.f459787i), true);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f459788m), true);
            eVar.d(jSONObject, "ticket", this.f459789n, true);
            eVar.d(jSONObject, "topic_info_list", this.f459790o, true);
            eVar.d(jSONObject, "tag_info", this.f459791p, true);
            eVar.d(jSONObject, "visibility_mode", java.lang.Integer.valueOf(this.f459793q), true);
            eVar.d(jSONObject, "visibility_file_id_list", this.f459794r, true);
            eVar.d(jSONObject, "redpacket_refer_chatroom_id_list", this.f459795s, true);
            eVar.d(jSONObject, "visible_chatroom_id_list", this.f459796t, true);
            eVar.d(jSONObject, "visible_username_list", this.f459797u, true);
            eVar.d(jSONObject, "game_app_id", this.f459798v, true);
            eVar.d(jSONObject, "charge_flag", java.lang.Integer.valueOf(this.f459799w), true);
            eVar.d(jSONObject, "charge_unit_price_in_wecoin", java.lang.Integer.valueOf(this.f459800x), true);
            eVar.d(jSONObject, "bulletin", this.f459802y, true);
            eVar.d(jSONObject, "free_of_charge_chatroom_id_list", this.f459803z, true);
            eVar.d(jSONObject, "free_of_charge_username_list", this.A, true);
            eVar.d(jSONObject, "hardware_info", this.B, true);
            eVar.d(jSONObject, "wxa_game_live_info", this.C, true);
            eVar.d(jSONObject, "thirdparty_param", this.D, true);
            eVar.d(jSONObject, "free_of_charge_file_id_list", this.E, true);
            eVar.d(jSONObject, "spam_check_info", this.F, true);
            eVar.d(jSONObject, "acknowledge_spam_msg", java.lang.Integer.valueOf(this.G), true);
            eVar.d(jSONObject, "live_room_img", this.H, true);
            eVar.d(jSONObject, "notice_id", this.I, true);
            eVar.d(jSONObject, "live_entrance_type", java.lang.Integer.valueOf(this.f459781J), true);
            eVar.d(jSONObject, "client_status", this.K, true);
            eVar.d(jSONObject, "purchase_preview_info", this.L, true);
            eVar.d(jSONObject, "live_mode", java.lang.Integer.valueOf(this.M), true);
            eVar.d(jSONObject, "charge_is_member_free", java.lang.Integer.valueOf(this.N), true);
            eVar.d(jSONObject, "screen_orientation", java.lang.Integer.valueOf(this.P), true);
            eVar.d(jSONObject, "charge_free_flag", java.lang.Long.valueOf(this.Q), true);
            eVar.d(jSONObject, "live_mode_info", this.R, true);
            eVar.d(jSONObject, "notificationmsg_trigger_type", java.lang.Integer.valueOf(this.S), true);
            eVar.d(jSONObject, "game_live_stream_type", java.lang.Integer.valueOf(this.T), true);
            eVar.d(jSONObject, "purchase_mic_setting", this.U, true);
            eVar.d(jSONObject, "create_live_page_mode", java.lang.Integer.valueOf(this.V), true);
            eVar.d(jSONObject, "create_live_bubble_buffer", this.W, true);
            eVar.d(jSONObject, "create_live_prepare_buffer", this.X, true);
            eVar.d(jSONObject, "visibility_friend_label_list", this.Y, true);
            eVar.d(jSONObject, "free_of_charge_friend_label_list", this.Z, true);
            eVar.d(jSONObject, "mic_topic", this.f459792p0, true);
            eVar.d(jSONObject, "co_live_invitation_id", java.lang.Long.valueOf(this.f459801x0), true);
            eVar.d(jSONObject, "mic_topic_info", this.F2, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
