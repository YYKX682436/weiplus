package do1;

/* loaded from: classes12.dex */
public final class k implements do1.b {
    @Override // do1.b
    public boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return false;
    }

    @Override // do1.b
    public boolean b(bw5.u0 msgItem, bw5.t0 mediaInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (msgInfo.mo78013xfb85f7b0() == 34) {
            java.lang.String d17 = tn1.e.d(msgInfo, msgInfo.z0(), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemVoice", "complementMediaFile, existFullPath = " + d17 + ", len = " + com.p314xaae8f345.mm.vfs.w6.k(d17));
            if (com.p314xaae8f345.mm.vfs.w6.k(d17) == 0) {
                java.util.LinkedList linkedList = mediaInfo.f114738g;
                if (linkedList.size() == 1) {
                    com.p314xaae8f345.mm.vfs.w6.w((java.lang.String) linkedList.get(0), d17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackupItemVoice", "mediaCount error, count:" + linkedList.size());
                }
                return true;
            }
        }
        return false;
    }

    @Override // do1.b
    public boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, bw5.u0 msgItem, bw5.t0 mediaInfo, co1.c cVar) {
        int b17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.lang.String element = msgItem.f115207g;
        if (tn1.e.h(msg.Q0()) && (b17 = tn1.e.b(element)) != -1 && (i17 = b17 + 2) < element.length()) {
            element = element.substring(i17);
        }
        try {
            z15.a aVar = new z15.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
            aVar.m126728xdc93280d(element);
            msg.d1(w21.u0.c(aVar.m178309xc0914d16(), aVar.k(), aVar.l() == 1));
            if (cVar != null) {
                cVar.f125290f = aVar.j();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackupItemVoice", "parsing voice msg xml failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamBackupItemVoice", e17, "", new java.lang.Object[0]);
            fo1.m mVar = fo1.m.f346415a;
            java.lang.String Q0 = msg.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            mVar.g("Restore", 0L, Q0, fo1.e.f346405t, mVar.e(msg));
        }
        java.lang.String s07 = w21.g1.s0(msg.I0());
        if (!pt0.f0.f439742b1.j()) {
            msg.i1(s07);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemVoice", "insert voice msg, svrId:" + msg.I0());
        java.util.LinkedList linkedList = mediaInfo.f114738g;
        if (linkedList.size() == 1) {
            java.lang.String d17 = tn1.e.d(msg, s07, true);
            com.p314xaae8f345.mm.vfs.w6.w((java.lang.String) linkedList.get(0), d17);
            co1.g.f125301a.j(msg.I0(), d17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackupItemVoice", "mediaCount error, count:" + linkedList.size());
        }
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, do1.a backupExtraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupExtraInfo, "backupExtraInfo");
        bw5.u0 u0Var = new bw5.u0();
        u0Var.f115204d = msg.mo78013xfb85f7b0();
        u0Var.f115205e = msg.y0();
        u0Var.f115206f = msg.T0();
        java.lang.String j18 = msg.j();
        if (j18 == null) {
            j18 = "";
        }
        u0Var.f115207g = j18;
        u0Var.f115208h = msg.mo78012x3fdd41df();
        java.lang.String str = msg.G;
        u0Var.f115209i = str != null ? str : "";
        u0Var.f115210m = msg.I0();
        u0Var.f115211n = msg.F0();
        bw5.t0 t0Var = new bw5.t0();
        t0Var.f114735d = msg.I0();
        java.lang.String d17 = tn1.e.d(msg, msg.z0(), false);
        java.lang.String str2 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            fo1.m mVar = fo1.m.f346415a;
            java.lang.String Q0 = msg.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            mVar.g("Backup", j17, Q0, fo1.e.f346393e, mVar.e(msg));
            return null;
        }
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(d17);
        if (k17 <= 0) {
            fo1.m mVar2 = fo1.m.f346415a;
            java.lang.String Q02 = msg.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
            mVar2.g("Backup", j17, Q02, fo1.e.f346392d, mVar2.e(msg));
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(msg.j())) {
            w21.w0 D0 = w21.p0.Di().D0(msg.I0());
            w21.u0 u0Var2 = new w21.u0(msg.j());
            z15.a aVar = new z15.a();
            aVar.t(D0 != null ? D0.f524032p : w21.v0.g(bm5.y.a(msg, bm5.f0.f104106u), d17, 0, true) ? "0" : "4");
            aVar.r((int) k17);
            aVar.o(1);
            aVar.n(0);
            aVar.u(u0Var2.f524013b);
            java.lang.String str3 = u0Var2.f524012a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getHuman(...)");
                aVar.q(str3);
            }
            aVar.s(u0Var2.f524014c ? 1 : 0);
            aVar.p(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ai(msg.Q0(), msg.m124847x74d37ac6()));
            str2 = aVar.m126747x696739c();
            if (tn1.e.h(msg.Q0())) {
                str2 = r26.b0.b("\n            " + str3 + ":\n            " + str2 + "\n            ");
            }
        }
        u0Var.f115207g = str2;
        co1.i.a(t0Var, co1.d.f125296b.f(msg.I0()), 9, d17, u0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemVoice", "content : " + u0Var.f115207g);
        return new co1.h(u0Var, t0Var);
    }

    @Override // do1.b
    public long g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String mediaId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.String d17 = tn1.e.d(msg, msg.z0(), false);
        if (i17 == 9) {
            return com.p314xaae8f345.mm.vfs.w6.k(d17);
        }
        return 0L;
    }
}
