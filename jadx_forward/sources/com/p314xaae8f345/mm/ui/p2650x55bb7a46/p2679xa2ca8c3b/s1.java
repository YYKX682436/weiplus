package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class s1 {
    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        boolean z17 = true;
        java.lang.String D2 = m11.b1.Di().D2(f9Var, str, true);
        if (!com.p314xaae8f345.mm.vfs.w6.j(D2)) {
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(D2, options);
        int i17 = options.outWidth;
        if (options.outHeight * i17 > 1048576) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMessageUtil", "Bitmap to big:%d/%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(options.outHeight));
        } else {
            z17 = false;
        }
        if (J2 != null) {
            J2.recycle();
        }
        return z17;
    }

    public static void b(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        c(dVar, f9Var, str, -1, null);
    }

    public static void c(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, int i17, j45.g gVar) {
        java.lang.String l17 = c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0());
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("scene_from", 17);
        if (l17 != null) {
            intent.putExtra("Retr_Msg_content_bytes", l17.getBytes());
        }
        intent.putExtra("Retr_MsgFromScene", 2);
        ot0.q v17 = ot0.q.v(l17);
        if (v17 == null) {
            return;
        }
        int i18 = v17.f430199i;
        if (19 == i18) {
            intent.putExtra("Retr_Msg_Type", 10);
        } else if (24 == i18) {
            intent.putExtra("Retr_Msg_Type", 10);
            intent.putExtra("content_type_forward_to_wework", 13);
        } else if (16 == i18) {
            intent.putExtra("Retr_Msg_Type", 14);
        } else {
            if (33 == i18 || 36 == i18) {
                com.p314xaae8f345.mm.p873x38eb0007.C10913x8647d6c c10913x8647d6c = new com.p314xaae8f345.mm.p873x38eb0007.C10913x8647d6c();
                c10913x8647d6c.f150518g = v17;
                c10913x8647d6c.e();
            } else if (76 == i18) {
                intent.putExtra("content_type_forward_to_wework", 11);
            }
            intent.putExtra("Retr_Msg_Type", 2);
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            intent.putExtra("reportSessionId", a17);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", str);
            c17.i("preChatName", Q0);
            if (v17.y(ot0.a.class) != null) {
                c17.i("appservicetype", java.lang.Integer.valueOf(((ot0.a) v17.y(ot0.a.class)).f429881d));
                intent.putExtra("Retr_MsgAppBrandServiceType", ((ot0.a) v17.y(ot0.a.class)).f429881d);
            }
            if (33 == v17.f430199i) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionAppbrand.k(dVar.g(), null)) {
                    return;
                }
                if (dVar.D()) {
                    c17.i("fromScene", 2);
                    intent.putExtra("Retr_MsgAppBrandFromScene", 2);
                } else {
                    c17.i("fromScene", 1);
                    intent.putExtra("Retr_MsgAppBrandFromScene", 1);
                }
                intent.putExtra("Retr_MsgFromUserName", str);
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            }
            c17.i("sendAppMsgScene", 1);
            ((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).wi("adExtStr", c17, f9Var);
        }
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("Retr_Security_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_Security_Msg_Talker", f9Var.Q0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            intent.putExtra("weAppSourceUserName", d17);
        }
        if (!ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
            dVar.f542242d.a(intent, i17, gVar);
            return;
        }
        ec5.a aVar = new ec5.a();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        int i19 = aVar.f125235d;
        aVar.set(i19 + 0, java.lang.Long.valueOf(m124847x74d37ac6));
        aVar.set(i19 + 1, f9Var.Q0());
        n13.r rVar = new n13.r();
        rVar.f415650a = true;
        rVar.f415653d.f415672a = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.b(f9Var.Q0());
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(dVar.g(), aVar, rVar);
    }
}
