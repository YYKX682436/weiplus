package tg1;

/* loaded from: classes7.dex */
public abstract class d {
    public void a(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, android.os.Bundle bundle, android.os.Bundle bundle2) {
        c12559xbdae8559.f169323f = i17;
        c12559xbdae8559.f169324g = fp.s0.a(str);
        if (bundle != null) {
            c12559xbdae8559.f169324g += ":" + bundle.getString("stat_send_msg_user");
            c12559xbdae8559.f169336v = bundle.getInt("stat_geta8key_msg_scene");
            c12559xbdae8559.f169334t = bundle.getString("stat_send_msg_user");
            c12559xbdae8559.f169335u = bundle.getString("stat_chat_talker_username");
            c12559xbdae8559.f169333s = bundle.getString("stat_msg_id", "").replace("msg_", "").replace("sns_", "");
        }
        c12559xbdae8559.f169321d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.a(i17, bundle);
        c12559xbdae8559.f169322e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.b(i17, bundle);
        if (bundle2 != null) {
            c12559xbdae8559.f169330p = bundle2.getBundle("stat_get_a8_key_cgi_speed");
        }
        if (i17 == 1037 || i17 == 1018) {
            c12559xbdae8559.f169326i = 0;
        } else {
            c12559xbdae8559.f169326i = i17;
        }
        c12559xbdae8559.f169332r = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y.a(i17, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x02e0 A[Catch: JSONException -> 0x02fb, TryCatch #0 {JSONException -> 0x02fb, blocks: (B:95:0x02d5, B:97:0x02e0, B:99:0x02f3), top: B:94:0x02d5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tg1.c b(android.content.Context r29, java.lang.String r30, int r31, android.os.Bundle r32, android.os.Bundle r33, l81.e1 r34) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tg1.d.b(android.content.Context, java.lang.String, int, android.os.Bundle, android.os.Bundle, l81.e1):tg1.c");
    }

    public abstract void c(java.lang.String str, android.net.Uri uri, int i17, android.os.Bundle bundle, tg1.c cVar);

    public final void d(android.content.Context context, java.lang.String str, android.net.Uri uri, int i17, android.os.Bundle bundle, java.lang.String str2, android.os.Bundle bundle2, l81.e1 e1Var) {
        java.lang.String queryParameter = uri.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = queryParameter == null ? "" : queryParameter;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(uri.getQueryParameter("version"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(uri.getQueryParameter("type"), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        a(str, i17, c12559xbdae8559, bundle, bundle2);
        if (bundle != null && bundle2 != null) {
            java.lang.String string = bundle.getString("stat_chat_talker_username", "");
            java.lang.String string2 = bundle.getString("stat_send_msg_user", "");
            int i18 = bundle.getInt("pay_qrcode_session_type", 0);
            java.lang.String string3 = bundle.getString("stat_msg_id", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3) && string3.startsWith("msg_")) {
                string3 = string3.substring(4);
            }
            java.lang.String str4 = string3;
            java.lang.String string4 = bundle.getString("pay_init_raw_url", "");
            long j17 = bundle.getLong("pay_init_timestamp", 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0.f262500g;
            if (i18 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262472e.b(string2), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262513e.a(string2), q0Var, string2, bundle.getString("pay_qrcode_timeline_objid"), "", string2, string4, j17));
            } else if (i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(string, string2, i18, bundle.getString("pay_qrcode_session_name"), str4, string4, j17));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(string, string2, 0, "", str4, string4, j17));
            }
        }
        if (e1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(context, str2, null, str3, P2, P, c12559xbdae8559, null, null);
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = str2;
        b1Var.f398555f = str3;
        b1Var.f398549c = P2;
        b1Var.f398551d = P;
        b1Var.a(c12559xbdae8559);
        b1Var.L = e1Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }
}
