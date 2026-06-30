package at4;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static at4.i f95403a;

    public static at4.i a() {
        if (f95403a == null) {
            f95403a = new at4.i();
        }
        return f95403a;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c b(r45.qv qvVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardParser", "parseFromBindQueryRecord %s", qvVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
        try {
            c19091x9511676c.f69217xaef0808c = qvVar.f465801f;
            c19091x9511676c.f69224xba2240f6 = qvVar.P;
            c19091x9511676c.f69223x58802fcb = qvVar.f465803h;
            c19091x9511676c.f69225xed6d60f6 = qvVar.f465808o;
            boolean z17 = true;
            if (2 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(qvVar.f465804i, 2)) {
                c19091x9511676c.f69227x1d45800f |= 2;
            }
            if (!"NORMAL".equals(qvVar.D)) {
                c19091x9511676c.f69227x1d45800f |= 4;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qvVar.f465817v)) {
                c19091x9511676c.f69249x61dbf87 = java.net.URLDecoder.decode(qvVar.f465817v.replaceAll("x", "%"), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            }
            c19091x9511676c.f69251x46aaea26 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(qvVar.f465822y, "100", 2, java.math.RoundingMode.HALF_UP);
            c19091x9511676c.f69252xf1ac0f39 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(qvVar.f465818w, "100", 2, java.math.RoundingMode.HALF_UP);
            c19091x9511676c.f69230xdbf8d15 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(qvVar.f465815t, "100", 2, java.math.RoundingMode.HALF_UP);
            c19091x9511676c.f69231x2c28d1ea = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(qvVar.f465813r, "100", 2, java.math.RoundingMode.HALF_UP);
            c19091x9511676c.f69222x587fd4e1 = qvVar.f465809p;
            java.lang.String str = qvVar.B;
            c19091x9511676c.f69239x93565523 = str;
            c19091x9511676c.f69256x6e045ec0 = qvVar.F;
            c19091x9511676c.f69263xe0badd12 = 2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                c19091x9511676c.f69220xb7753620 = 8;
            } else if (1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(qvVar.f465816u, 0)) {
                c19091x9511676c.f69220xb7753620 = 1;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(qvVar.f465800e, 1) == 0) {
                c19091x9511676c.f69220xb7753620 = 2;
            } else {
                c19091x9511676c.f69220xb7753620 = 0;
            }
            c19091x9511676c.f69218x2f3ef78d = qvVar.f465802g;
            c19091x9511676c.f69235x94607f59 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(qvVar.f465798J, 0L) * 1000;
            c19091x9511676c.f69236x5048ceff = qvVar.X;
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(qvVar.f465825z, 1);
            c19091x9511676c.f69221x3ca948e9 = P;
            if (P == 2) {
                c19091x9511676c.f69227x1d45800f |= 1;
            }
            if (qvVar.G != 1) {
                z17 = false;
            }
            c19091x9511676c.f69260x2a326a79 = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + qvVar.G);
            c19091x9511676c.f69215x54da57dd = qvVar.R;
            c19091x9511676c.f69216xb07db88b = qvVar.T;
            int i17 = qvVar.Y;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardParser", "fetch_charge_rate:" + i17);
            c19091x9511676c.f69238xe5669181 = ((double) i17) / 10000.0d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + c19091x9511676c.f69238xe5669181);
            int i18 = qvVar.Z;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + c19091x9511676c.f69242x17f4744b);
            c19091x9511676c.f69242x17f4744b = ((double) i18) / 100.0d;
            c19091x9511676c.f69237xe562a94f = qvVar.f465810p0;
            c19091x9511676c.f69261x2261f75d = qvVar.f465820x0;
            c19091x9511676c.f69240x24ff0512 = qvVar.f465805l1;
            c19091x9511676c.f69241x935a0ea9 = qvVar.f465811p1;
            c19091x9511676c.f69250xdd49e65e = qvVar.S;
            c19091x9511676c.f69228x1e2a40ce = qvVar.B1;
            c19091x9511676c.f69258xc3239c42 = qvVar.E1;
            c19091x9511676c.f69259xa15003d1 = qvVar.F1;
            c19091x9511676c.f69243x5d75d3a7 = qvVar.D1;
            r45.ae5 ae5Var = qvVar.J1;
            if (ae5Var != null) {
                c19091x9511676c.f69255xfd79664d = ae5Var.f451502d;
                c19091x9511676c.f69253xe8447f03 = ae5Var.f451503e;
                c19091x9511676c.f69254xf6f9f8d9 = ae5Var.f451504f;
            }
            f(c19091x9511676c);
            return c19091x9511676c;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankcardParser", e17, "parseFromBindQueryRecord() error:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("minimch_info");
        if (optJSONObject != null) {
            c19091x9511676c.f69246x88df4e36 = optJSONObject.optString("minimch_key");
            c19091x9511676c.f69244xc866caa3 = optJSONObject.optLong("minimch_avail_balance");
            c19091x9511676c.f69248xd39eef66 = optJSONObject.optInt("minimch_user_state");
            c19091x9511676c.f69247x69302c8a = optJSONObject.optInt("minimch_system_state");
            c19091x9511676c.f69245x326e54ba = optJSONObject.optString("minimch_ext_msg");
        }
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("yht_info");
        if (optJSONObject != null) {
            c19091x9511676c.f69266xa624692f = optJSONObject.optString("yht_related_bank");
            c19091x9511676c.f69264x8fb8c40d = optJSONObject.optLong("yht_avail_balance");
            c19091x9511676c.f69267x88645de0 = optJSONObject.optInt("yht_system_state");
            c19091x9511676c.f69268x87bb7e3c = optJSONObject.optInt("yht_user_state");
            c19091x9511676c.f69265x776a25a4 = optJSONObject.optString("yht_ext_msg");
        }
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        if (c19091x9511676c == null) {
            return;
        }
        if (c19091x9511676c.v0()) {
            c19091x9511676c.f69233x225aa2b6 = c19091x9511676c.f69217xaef0808c;
            return;
        }
        if (c19091x9511676c.A0()) {
            c19091x9511676c.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kme, c19091x9511676c.f261102h3, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h(c19091x9511676c.f261099e3, 8));
            return;
        }
        if (c19091x9511676c.w0()) {
            c19091x9511676c.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkj, c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69222x587fd4e1);
            return;
        }
        if (c19091x9511676c.F0()) {
            c19091x9511676c.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l28, c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69222x587fd4e1);
            return;
        }
        if (c19091x9511676c.z0()) {
            c19091x9511676c.f69233x225aa2b6 = c19091x9511676c.f261108n3;
            return;
        }
        if (c19091x9511676c.f69223x58802fcb.equals("YHT")) {
            c19091x9511676c.f69233x225aa2b6 = java.lang.String.format("%s(%s)", c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69265x776a25a4);
        } else if (c19091x9511676c.f69223x58802fcb.equals("MINIMCH")) {
            c19091x9511676c.f69233x225aa2b6 = java.lang.String.format("%s(%s)", c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69245x326e54ba);
        } else {
            c19091x9511676c.f69233x225aa2b6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl9, c19091x9511676c.f69217xaef0808c, c19091x9511676c.f69222x587fd4e1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0111 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014d A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0178 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0206 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0216 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0221 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0310 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0336 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x037c A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0225 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at4.i.c(org.json.JSONObject):com.tencent.mm.plugin.wallet_core.model.Bankcard");
    }
}
