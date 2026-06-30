package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes11.dex */
public final class p6 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70 f273370a;

    public p6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70 activityC19736xc88c6c70) {
        this.f273370a = activityC19736xc88c6c70;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFileToFriend, send broadcast, filePath: ");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70 activityC19736xc88c6c70 = this.f273370a;
            int i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70.f272952m;
            sb6.append(activityC19736xc88c6c70.T6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBFileShareProxyUI", sb6.toString());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70 activityC19736xc88c6c702 = this.f273370a;
                java.lang.String str2 = (java.lang.String) ((jz5.n) activityC19736xc88c6c702.f272953d).mo141623x754a37bb();
                ut.s0 s0Var = new ut.s0(str2, activityC19736xc88c6c702.T6());
                if (pt0.f0.f439742b1.a((java.lang.String) ((jz5.n) activityC19736xc88c6c702.f272958i).mo141623x754a37bb(), activityC19736xc88c6c702.U6())) {
                    c01.h7 h7Var = new c01.h7();
                    h7Var.f118760b = activityC19736xc88c6c702.U6();
                    h7Var.f118762d = (java.lang.String) ((jz5.n) activityC19736xc88c6c702.f272958i).mo141623x754a37bb();
                    s0Var.f512256g = h7Var;
                    s0Var.f512254e = "forward_qb_file_msg";
                } else {
                    s0Var.f512254e = "forward_qb_file_path";
                }
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                boolean z18 = true;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l6(tj6, null), 1, null);
                }
                if (str != null && !r26.n0.N(str)) {
                    z18 = false;
                }
                if (!z18) {
                    ((dk5.s5) tg3.t1.a()).fj(str2, str, c01.e2.C(str2), 0);
                }
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("MINIQB_OPEN_RET");
                intent.putExtra("op_type", "SEND_TO_FRIENDS");
                intent.putExtra("file_path", this.f273370a.T6());
                intent.putExtra("file_name", (java.lang.String) ((jz5.n) this.f273370a.f272954e).mo141623x754a37bb());
                intent.putExtra("file_ext", (java.lang.String) ((jz5.n) this.f273370a.f272956g).mo141623x754a37bb());
                intent.putExtra("forward_msgid", this.f273370a.U6());
                intent.putExtra("to_user", (java.lang.String) ((jz5.n) this.f273370a.f272953d).mo141623x754a37bb());
                intent.putExtra("send_text", str);
                intent.putExtra("forward_msg_talker", (java.lang.String) ((jz5.n) this.f273370a.f272958i).mo141623x754a37bb());
                intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                this.f273370a.mo55332x76847179().sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
            }
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o6(this.f273370a));
        }
    }
}
