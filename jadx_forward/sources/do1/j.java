package do1;

/* loaded from: classes12.dex */
public final class j implements do1.b {
    @Override // do1.b
    public boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        i95.m c17 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, msg, bm5.f0.f104104s, msg.z0(), false, 8, null);
        if (com.p314xaae8f345.mm.vfs.w6.l(e86) >= j17) {
            co1.i.b("MicroMsg.RoamBackupItemVideo", msg, "video", e86);
            return true;
        }
        t21.v2 c18 = tn1.e.c(msg.z0());
        boolean z17 = msg.mo78013xfb85f7b0() == 62;
        java.lang.String h17 = h(msg, c18);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
            i95.m c19 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            java.lang.String e87 = tg3.u0.e8((tg3.u0) c19, msg, bm5.f0.f104103r, h17, false, 8, null);
            if (!z17 && com.p314xaae8f345.mm.vfs.w6.l(e87) >= j17) {
                co1.i.b("MicroMsg.RoamBackupItemVideo", msg, "originVideo", e87);
                return true;
            }
        }
        return false;
    }

    @Override // do1.b
    public boolean b(bw5.u0 msgItem, bw5.t0 t0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        bw5.t0 mediaInfo = t0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String z07 = msgInfo.z0();
        java.util.LinkedList linkedList = mediaInfo.f114737f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getMediaType(...)");
        boolean z17 = false;
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            boolean z18 = (num != null && num.intValue() == 13) || (num != null && num.intValue() == 11);
            java.util.LinkedList linkedList2 = mediaInfo.f114738g;
            if (z18) {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(msgInfo, z07, false);
                if (com.p314xaae8f345.mm.vfs.w6.k(tj6) == 0) {
                    java.lang.Object obj2 = linkedList2.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    c((java.lang.String) obj2, tj6, "MicroMsg.RoamBackupItemVideo", java.lang.Integer.valueOf(msgInfo.mo78013xfb85f7b0()));
                    z17 = true;
                    mediaInfo = t0Var;
                    i17 = i18;
                } else {
                    mediaInfo = t0Var;
                    i17 = i18;
                }
            } else if ((num != null && num.intValue() == 12) || (num != null && num.intValue() == 10)) {
                t21.v2 c17 = tn1.e.c(msgInfo.z0());
                if (c17 != null) {
                    java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(msgInfo, bm5.f0.f104104s, z07, false);
                    if (com.p314xaae8f345.mm.vfs.w6.k(rj6) == 0) {
                        java.lang.Object obj3 = linkedList2.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                        if (c((java.lang.String) obj3, rj6, "MicroMsg.RoamBackupItemVideo", java.lang.Integer.valueOf(msgInfo.mo78013xfb85f7b0()))) {
                            if (com.p314xaae8f345.mm.vfs.w6.k(rj6) >= c17.f496541f) {
                                c17.f496544i = 199;
                            } else {
                                c17.f496544i = 111;
                            }
                            t21.w2 h17 = tn1.f.f().e().h();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getVideoInfoStg(...)");
                            h17.C(c17);
                        }
                        z17 = true;
                    }
                }
                mediaInfo = t0Var;
                i17 = i18;
            } else {
                if (num != null && num.intValue() == 17) {
                    java.lang.String str = z07 + ya.b.f77495x8b74a326;
                    t21.v2 c18 = tn1.e.c(str);
                    if (c18 != null) {
                        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(msgInfo, bm5.f0.f104103r, str, false);
                        if (com.p314xaae8f345.mm.vfs.w6.k(rj7) == 0) {
                            java.lang.Object obj4 = linkedList2.get(i17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                            if (c((java.lang.String) obj4, rj7, "MicroMsg.RoamBackupItemVideo", java.lang.Integer.valueOf(msgInfo.mo78013xfb85f7b0()))) {
                                if (com.p314xaae8f345.mm.vfs.w6.k(rj7) >= c18.f496541f) {
                                    c18.f496544i = 199;
                                } else {
                                    c18.f496544i = 113;
                                }
                                t21.w2 h18 = tn1.f.f().e().h();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getVideoInfoStg(...)");
                                h18.C(c18);
                            }
                            z17 = true;
                        }
                    }
                }
                mediaInfo = t0Var;
                i17 = i18;
            }
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r10.intValue() == 13) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0232  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r26, bw5.u0 r27, bw5.t0 r28, co1.c r29) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.j.d(com.tencent.mm.storage.f9, bw5.u0, bw5.t0, co1.c):boolean");
    }

    @Override // do1.b
    public co1.h e(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, do1.a backupExtraInfo) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
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
        java.lang.String str3 = msg.G;
        if (str3 == null) {
            str3 = "";
        }
        u0Var.f115209i = str3;
        u0Var.f115210m = msg.I0();
        u0Var.f115211n = msg.F0();
        bw5.t0 t0Var = new bw5.t0();
        t0Var.f114735d = msg.I0();
        i95.m c17 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, msg, bm5.f0.f104104s, msg.z0(), false, 8, null);
        t21.v2 c18 = tn1.e.c(msg.z0());
        if (c18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackupItemVideo", "Get (%s, %s, %s) video info return null.", msg.Q0(), java.lang.Long.valueOf(msg.I0()), msg.z0());
        }
        java.lang.String h17 = h(msg, c18);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
            str = "";
        } else {
            i95.m c19 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            java.lang.String e87 = tg3.u0.e8((tg3.u0) c19, msg, bm5.f0.f104103r, msg.z0(), false, 8, null);
            t21.v2 c27 = tn1.e.c(h17);
            if (c27 != null) {
                int i17 = c27.f496544i;
            }
            str = e87;
        }
        i95.m c28 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
        java.lang.String L4 = tg3.u0.L4((tg3.u0) c28, msg, msg.z0(), false, 4, null);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(L4);
        int C = r6Var.m() ? (int) r6Var.C() : 0;
        boolean z18 = msg.mo78013xfb85f7b0() == 62;
        jz5.o oVar = z18 ? new jz5.o(13, 12, -1) : new jz5.o(11, 10, 17);
        co1.d dVar = co1.d.f125295a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q1 q1Var = co1.d.f125296b;
        java.lang.String g17 = q1Var.g(msg.I0());
        java.lang.Object obj = oVar.f384374d;
        if (C != 0) {
            co1.i.a(t0Var, g17, ((java.lang.Number) obj).intValue(), L4, u0Var);
        } else {
            co1.i.a(t0Var, g17, ((java.lang.Number) obj).intValue(), "", u0Var);
        }
        java.lang.String f17 = q1Var.f(msg.I0());
        boolean z19 = backupExtraInfo.f323603b;
        java.lang.Object obj2 = oVar.f384375e;
        if (z19 || com.p314xaae8f345.mm.vfs.w6.k(e86) <= 0) {
            co1.i.a(t0Var, f17, ((java.lang.Number) obj2).intValue(), "", u0Var);
        } else {
            co1.i.a(t0Var, f17, ((java.lang.Number) obj2).intValue(), e86, u0Var);
        }
        t21.v2 c29 = tn1.e.c(msg.z0());
        if (c29 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(msg.j())) {
            str2 = null;
        } else {
            java.lang.String e17 = tn1.e.h(msg.Q0()) ? c29.e() : msg.y0();
            try {
                y15.b bVar = new y15.b();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c29.g())) {
                    java.lang.String g18 = c29.g();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getRecvXml(...)");
                    bVar.m126728xdc93280d(g18);
                }
                y15.a j19 = bVar.j();
                j19.set(j19.f540455d + 10, java.lang.Integer.valueOf(c29.f496548m));
                y15.a j27 = bVar.j();
                j27.set(j27.f540455d + 8, java.lang.Integer.valueOf(c29.f496541f));
                bVar.j().j(msg.mo78013xfb85f7b0());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                    y15.a j28 = bVar.j();
                    j28.set(j28.f540455d + 17, e17);
                }
                y15.a j29 = bVar.j();
                j29.set(j29.f540455d + 18, c29.A);
                str2 = bVar.m126747x696739c();
            } catch (java.lang.Exception e18) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamBackupItemVideo", e18, "packet video xml error", new java.lang.Object[0]);
                str2 = null;
            }
        }
        z17 = false;
        if (str2 == null) {
            fo1.m mVar = fo1.m.f346415a;
            java.lang.String Q0 = msg.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            mVar.g("Backup", j17, Q0, fo1.e.f346393e, mVar.e(msg));
            return null;
        }
        u0Var.f115207g = str2;
        t21.j3 d17 = t21.j3.f496333h.d(str2);
        if (d17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.f496339d)) {
            z17 = true;
        }
        if (z17 && !z18) {
            co1.d dVar2 = co1.d.f125295a;
            java.lang.String e19 = co1.d.f125296b.e(msg.I0());
            java.lang.Object obj3 = oVar.f384376f;
            if (z19 || com.p314xaae8f345.mm.vfs.w6.k(str) <= 0) {
                co1.i.a(t0Var, e19, ((java.lang.Number) obj3).intValue(), "", u0Var);
            } else {
                co1.i.a(t0Var, e19, ((java.lang.Number) obj3).intValue(), str, u0Var);
            }
        }
        return new co1.h(u0Var, t0Var);
    }

    @Override // do1.b
    public long g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String mediaId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (i17 == 17) {
            if (msg.mo78013xfb85f7b0() == 62) {
                return 0L;
            }
            i95.m c17 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            return com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c17, msg, bm5.f0.f104104s, msg.z0(), false, 8, null));
        }
        switch (i17) {
            case 10:
            case 12:
                i95.m c18 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                return com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c18, msg, bm5.f0.f104104s, msg.z0(), false, 8, null));
            case 11:
            case 13:
                i95.m c19 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                return com.p314xaae8f345.mm.vfs.w6.k(tg3.u0.L4((tg3.u0) c19, msg, msg.z0(), false, 4, null));
            default:
                return 0L;
        }
    }

    public final java.lang.String h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, t21.v2 v2Var) {
        if (v2Var != null) {
            java.lang.String str = v2Var.S;
            return str == null ? "" : str;
        }
        return f9Var.z0() + ya.b.f77495x8b74a326;
    }
}
