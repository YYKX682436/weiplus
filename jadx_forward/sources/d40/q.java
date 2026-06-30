package d40;

@j95.b
/* loaded from: classes12.dex */
public final class q extends jm0.o implements e40.w {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(f40.b.class);
        set.add(f40.i.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zi(h40.f r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.q.Zi(h40.f):void");
    }

    public void aj(h40.f params) {
        h40.a aVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        f40.i a17 = f40.i.f340963i.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadFileMsg: ");
        java.lang.String str4 = params.f360273a;
        sb6.append(str4);
        sb6.append(", ");
        long j17 = params.f360274b;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelperFSC", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) a17.f340964f).mo141623x754a37bb();
        h40.a aVar2 = params.f360277e;
        boolean z17 = false;
        if (aVar2 != null && (str3 = aVar2.f360252a) != null) {
            if (str3.length() > 0) {
                z17 = true;
            }
        }
        r45.ul5 ul5Var = null;
        if (!z17) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, null, null, new f40.f(a17, params, null), 3, null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = pt0.f0.f439742b1.l(str4, j17);
        if (l17 == null || (aVar = params.f360277e) == null || (str = aVar.f360252a) == null) {
            return;
        }
        java.lang.String fj6 = ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).fj(params);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f340966h;
        g40.l lVar = (g40.l) concurrentHashMap.get(fj6);
        if (lVar == null) {
            lVar = new g40.l(params.f360278f, str);
        }
        if (concurrentHashMap.contains(lVar)) {
            g40.l lVar2 = (g40.l) concurrentHashMap.get(fj6);
            if (lVar2 != null) {
                h40.b bVar = params.f360278f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<set-?>");
                lVar2.f350226a = bVar;
            }
        } else {
            concurrentHashMap.put(fj6, lVar);
        }
        lVar.a(params.f360275c);
        if (lVar.f350230e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "downloadFile: isDownloading");
            return;
        }
        ot0.q v17 = ot0.q.v(l17.U1());
        if (v17 != null && (str2 = v17.f430196h0) != null) {
            ul5Var = bt3.g2.A(str2);
        }
        if (ul5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileRecordMsgDownloadHelper", "downloadFile: msgData is null");
            return;
        }
        java.util.LinkedList items = ul5Var.f468998f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
        r45.gp0 b17 = lVar.b(items, str);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileRecordMsgDownloadHelper", "downloadFile: real is null");
            return;
        }
        lVar.f350230e = true;
        lVar.f350231f = true;
        lVar.f350232g = fj6;
        lVar.f350233h = b17.K;
        lVar.f350234i = l17;
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).wi(lVar.f350228c);
        bt3.g2.O(b17, l17.Q0(), l17.m124847x74d37ac6(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h40.g bj(h40.f r20) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.q.bj(h40.f):h40.g");
    }

    public java.lang.String cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return "";
        }
        if (!(str == null || str.length() == 0)) {
            java.lang.String y17 = bt3.g2.y(str, f9Var.Q0(), f9Var.m124847x74d37ac6(), true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y17);
            return y17;
        }
        v05.b bVar = new v05.b();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        bVar.m126728xdc93280d(j17);
        v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
        if (aVar == null) {
            return "";
        }
        int i17 = aVar.f449897d;
        java.lang.String m75945x2fec8307 = aVar.m75945x2fec8307(i17 + 1);
        if (!(!r26.n0.N(m75945x2fec8307))) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 == null) {
            java.lang.String m75945x2fec83072 = aVar.m75945x2fec8307(i17 + 2);
            java.lang.String str2 = true ^ r26.n0.N(m75945x2fec83072) ? m75945x2fec83072 : null;
            m75945x2fec8307 = str2 == null ? aVar.C() : str2;
        }
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public java.lang.String fj(h40.f params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = pt0.f0.f439742b1.l(params.f360273a, params.f360274b);
        h40.a aVar = params.f360277e;
        return cj(l17, aVar != null ? aVar.f360252a : null);
    }

    public void hj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        jz5.f0 f0Var = null;
        if (f9Var != null) {
            v05.b bVar = new v05.b();
            java.lang.String j17 = f9Var.j();
            if (j17 == null) {
                j17 = "";
            }
            bVar.m126728xdc93280d(j17);
            int i17 = bVar.f513848e + 8;
            v05.a aVar = (v05.a) bVar.m75936x14adae67(i17);
            if (aVar != null && aVar.t() == f9Var.I0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgFeatureService", "overwriteNewMsgId is same ignore");
                return;
            }
            v05.a aVar2 = (v05.a) bVar.m75936x14adae67(i17);
            if (aVar2 != null) {
                long t17 = aVar2.t();
                if (t17 != 0) {
                    java.lang.String b17 = bm5.z.b(bm5.y.f104289i.c(f9Var.Q0(), f9Var.m124847x74d37ac6(), t17, f9Var.mo78012x3fdd41df(), f9Var.z0(), bm5.v.f104278h, bm5.f0.f104097i), false, true, 1, null);
                    if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                        java.lang.String Q0 = f9Var.Q0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
                        byte[] bytes = Q0.getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                        java.lang.String g17 = kk.k.g(bytes);
                        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(b17, false);
                        if (s17 != null) {
                            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                                java.lang.String name = x1Var.f294765b;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                                if (r26.i0.y(name, "temp_" + g17 + '_' + f9Var.m124847x74d37ac6() + '_', false)) {
                                    java.lang.String name2 = x1Var.f294765b;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                                    java.lang.String w17 = r26.i0.w(r26.n0.W(name2, "temp_"), "_" + f9Var.m124847x74d37ac6() + '_', "_" + f9Var.I0() + '_', false);
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w17, name2)) {
                                        java.lang.String b18 = bm5.z.b(bm5.y.f104289i.a(f9Var, bm5.f0.f104108w), true, false, 2, null);
                                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, b18)) {
                                            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(b17, name2);
                                            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(b18, w17);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgFeatureService", "move c2c temp dir, src[" + r6Var.o() + "] -> dst[" + r6Var2 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.m124847x74d37ac6() + ", svrId: " + f9Var.I0() + ", ret: " + com.p314xaae8f345.mm.vfs.w6.x(r6Var.o(), r6Var2.o(), true));
                                            if (z17) {
                                                java.lang.String o17 = r6Var2.o();
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                                                ((ku5.t0) ku5.t0.f394148d).g(new d40.p(o17, f9Var));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgFeatureService", "moveInner c2cTempDir is not exists " + b17);
                    }
                }
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgFeatureService", "msgInfo is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ij(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.q.ij(com.tencent.mm.storage.f9, boolean):java.lang.String");
    }

    public void mj(h40.f params) {
        g40.l lVar;
        g40.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        f40.i a17 = f40.i.f340963i.a();
        java.lang.String fj6 = ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).fj(params);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a17.f340965g;
        if (concurrentHashMap.containsKey(fj6) && (gVar = (g40.g) concurrentHashMap.get(fj6)) != null) {
            gVar.f350218k.removeIf(new g40.e(params.f360275c));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a17.f340966h;
        if (!concurrentHashMap2.containsKey(fj6) || (lVar = (g40.l) concurrentHashMap2.get(fj6)) == null) {
            return;
        }
        lVar.f350229d.removeIf(new g40.j(params.f360275c));
    }
}
