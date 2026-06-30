package dk5;

/* loaded from: classes9.dex */
public final class v {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L75
            com.tencent.mm.plugin.msg.MsgIdTalker r1 = new com.tencent.mm.plugin.msg.MsgIdTalker
            long r2 = r9.m124847x74d37ac6()
            java.lang.String r4 = r9.Q0()
            r1.<init>(r2, r4)
            java.lang.Class<qi3.y> r2 = qi3.y.class
            i95.m r2 = i95.n0.c(r2)
            qi3.y r2 = (qi3.y) r2
            jm.y r2 = (jm.y) r2
            java.util.HashMap r2 = r2.aj()
            java.lang.String r1 = r1.m66995x9616526c()
            java.lang.Object r1 = r2.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L34
            float r9 = r1.floatValue()
            int r9 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L6f
        L34:
            com.tencent.mm.pluginsdk.model.app.d r1 = new com.tencent.mm.pluginsdk.model.app.d
            r1.<init>()
            com.tencent.mm.pluginsdk.model.app.e r1 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi()
            long r2 = r9.m124847x74d37ac6()
            java.lang.String r9 = r9.Q0()
            com.tencent.mm.pluginsdk.model.app.d r9 = r1.J0(r2, r9)
            r1 = -1
            if (r9 != 0) goto L4e
        L4c:
            r9 = r1
            goto L5e
        L4e:
            long r2 = r9.f68113xeb1a61d6
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L57
            goto L4c
        L57:
            long r4 = r9.f68109x90a9378
            r6 = 100
            long r4 = r4 * r6
            long r4 = r4 / r2
            int r9 = (int) r4
        L5e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r2 = r9.intValue()
            if (r2 == r1) goto L6a
            r1 = 1
            goto L6b
        L6a:
            r1 = r0
        L6b:
            if (r1 == 0) goto L6e
            goto L6f
        L6e:
            r9 = 0
        L6f:
            if (r9 == 0) goto L75
            int r0 = r9.intValue()
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.v.a(com.tencent.mm.storage.f9):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String reportEventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportEventId, "reportEventId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resendFileMsg localId:");
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(" eventId:");
        sb6.append(reportEventId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.FileSendLogic", sb6.toString());
        if (f9Var != null) {
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            ut.s0 s0Var = new ut.s0(Q0, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            s0Var.f512254e = reportEventId;
            p15.e eVar = new p15.e();
            java.lang.String str = f9Var.G;
            if (str == null) {
                str = "";
            }
            eVar.m126728xdc93280d(str);
            s0Var.f512253d = eVar;
            s0Var.f512264o = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
            l15.c cVar = new l15.c();
            java.lang.String U1 = f9Var.U1();
            cVar.m126728xdc93280d(U1 != null ? U1 : "");
            s0Var.f512265p = cVar;
            f15.a n17 = cVar.n();
            s0Var.f512257h = n17 != null ? n17.j() : null;
            s0Var.f512255f = true;
            dk5.w.f316499a.c(s0Var);
        }
    }

    public final void c(ut.s0 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.FileSendLogic", "send file toUser:" + params.f512250a + " path:" + params.f512251b);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(params));
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new dk5.u(tj6, null), 1, null);
        }
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String toUser) {
        v05.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        l15.c cVar = new l15.c();
        java.lang.String U1 = msgInfo.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        ez.v0 v0Var = ez.v0.f339310a;
        if (!(!ez.v0.b(v0Var, msgInfo, cVar.k(), null, 4, null))) {
            c01.h7 h7Var = new c01.h7();
            h7Var.f118760b = msgInfo.m124847x74d37ac6();
            h7Var.f118762d = msgInfo.Q0();
            ut.s0 s0Var = new ut.s0(toUser, "");
            s0Var.f512256g = h7Var;
            s0Var.f512254e = "multi_forward_file_msg";
            c(s0Var);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv));
        sb6.append(' ');
        java.lang.String g17 = v0Var.g(cVar.k());
        sb6.append(g17 != null ? g17 : "");
        ((dk5.s5) ((tg3.a1) i95.n0.c(tg3.a1.class))).fj(toUser, sb6.toString(), c01.e2.C(toUser), 0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("send_forward_msg_create_time", java.lang.Long.valueOf(msgInfo.mo78012x3fdd41df()));
        v05.b k17 = cVar.k();
        linkedHashMap.put("send_forward_msg_file_size", java.lang.Long.valueOf((k17 == null || (aVar = (v05.a) k17.m75936x14adae67(k17.f513848e + 8)) == null) ? 0L : aVar.m75942xfb822ef2(aVar.f449897d + 0)));
        linkedHashMap.put("send_result_type", "Success");
        linkedHashMap.put("inner_version", 36);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("multi_forward_file_text_msg", linkedHashMap, 32784);
    }
}
