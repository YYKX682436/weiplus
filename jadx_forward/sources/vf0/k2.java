package vf0;

@j95.b
/* loaded from: classes12.dex */
public final class k2 extends i95.w implements c35.o {
    public boolean Ai(vf0.u2 videoSendElement, java.lang.String recvUser) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSendElement, "videoSendElement");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recvUser, "recvUser");
        vf0.h3 h3Var = new vf0.h3(recvUser, videoSendElement, false, null, 8, null);
        y15.d dVar = new y15.d();
        vf0.r2 r2Var = videoSendElement.f517816e;
        dVar.p(r2Var.f517790a);
        h3Var.f517712f = dVar;
        h3Var.f517710d = new vf0.i3(vf0.j3.f517739h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoMsgSendFeatureService", "forwardVideo, videoSendElement:" + videoSendElement);
        if (r2Var.f517790a != null && (map = h3Var.f517720n) != null) {
            map.put("from_fav_quick_forward", 1);
        }
        qi3.b0 bj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).bj(h3Var);
        int i17 = qi3.y.f445295e1;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j d17 = qi3.x.f445294a.d(bj6);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new vf0.b2(d17, null), 1, null);
        }
        return true;
    }

    public boolean Bi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        t21.v2 v2Var;
        oi3.h hVar;
        java.lang.String g17;
        java.lang.Object obj;
        if (f9Var == null) {
            return false;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        java.util.List h17 = t21.o2.Ui().h(f9Var, f9Var.z0());
        if (h17 != null) {
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((t21.v2) obj).d(), "getFileName(...)");
                if (!r26.i0.n(r6, ya.b.f77495x8b74a326, false)) {
                    break;
                }
            }
            v2Var = (t21.v2) obj;
        } else {
            v2Var = null;
        }
        java.lang.String f17 = v2Var != null ? v2Var.f() : null;
        java.lang.String str = f17 == null ? "" : f17;
        int i17 = v2Var != null ? v2Var.f496548m : 0;
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        java.lang.String z07 = f9Var.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z07);
        vf0.h3 h3Var = new vf0.h3(Q0, new vf0.u2(z07, str, null, z17, i17, null, null, 100, null), true, null, 8, null);
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0() & 65535;
        if (mo78013xfb85f7b0 != 43) {
            hVar = null;
        } else {
            hVar = new oi3.h();
            int i18 = hVar.f427150d;
            hVar.set(i18 + 4, java.lang.Integer.valueOf(mo78013xfb85f7b0));
            java.lang.String V1 = f9Var.V1();
            if (V1 == null) {
                V1 = "";
            }
            hVar.set(i18 + 11, V1);
            java.lang.String Q02 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
            hVar.set(i18 + 3, Q02);
            hVar.set(i18 + 2, java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
            hVar.set(i18 + 0, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            hVar.set(i18 + 1, java.lang.Long.valueOf(f9Var.I0()));
            hVar.set(i18 + 7, java.lang.Integer.valueOf(f9Var.P0()));
            java.lang.String str2 = f9Var.G;
            if (str2 == null) {
                str2 = "";
            }
            hVar.set(i18 + 12, str2);
            java.lang.String S1 = f9Var.S1();
            if (S1 == null) {
                S1 = "";
            }
            hVar.set(i18 + 13, S1);
            hVar.set(i18 + 10, java.lang.Integer.valueOf(f9Var.w0()));
            hVar.set(i18 + 9, java.lang.Integer.valueOf(f9Var.A0()));
            java.lang.String z08 = f9Var.z0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z08, "getImgPath(...)");
            hVar.l(z08);
        }
        h3Var.f517711e = hVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.b(f9Var.S1(), "msg", null)) {
            g17 = f9Var.S1();
        } else {
            g17 = v2Var != null ? v2Var.g() : null;
            if (g17 == null) {
                g17 = "";
            }
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        y15.d dVar = new y15.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        dVar.m126728xdc93280d(g17);
        h3Var.f517712f = dVar;
        p15.e eVar = new p15.e();
        java.lang.String str4 = f9Var.G;
        eVar.m126728xdc93280d(str4 != null ? str4 : "");
        qi3.b0 bj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).bj(h3Var);
        int i19 = qi3.y.f445295e1;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j d17 = qi3.x.f445294a.d(bj6);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null) {
            return true;
        }
        v65.i.b(c20976x6ba6452a, null, new vf0.f2(d17, null), 1, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r19, java.lang.String r20, c01.h7 r21, vf0.r2 r22) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.k2.wi(com.tencent.mm.storage.f9, java.lang.String, c01.h7, vf0.r2):boolean");
    }
}
