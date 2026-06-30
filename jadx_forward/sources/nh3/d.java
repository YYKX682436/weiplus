package nh3;

/* loaded from: classes8.dex */
public final class d extends nh3.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f418652a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f418653b = new java.util.concurrent.ConcurrentLinkedQueue();

    public static final void p(zy2.fa faVar, r45.vs2 vs2Var, java.lang.String str, java.lang.String str2) {
        r45.f03 f03Var;
        java.lang.Object obj;
        java.util.LinkedList linkedList = vs2Var.f470022g;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj).f455425i, str)) {
                        break;
                    }
                }
            }
            f03Var = (r45.f03) obj;
        } else {
            f03Var = null;
        }
        if (f03Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = faVar.L0(str);
            r45.f03 I0 = L0 != null ? L0.I0(str) : null;
            if (I0 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vs2Var.f470036x, L0.f65882x5364c75d)) {
                return;
            }
            c00.b4 b4Var = (c00.b4) i95.n0.c(c00.b4.class);
            c00.a4 a4Var = c00.a4.f118484f;
            r45.vs2 field_ctrInfo = L0.f65874xb5f7102a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
            ((b00.q2) b4Var).Ai(a4Var, str2, field_ctrInfo, I0, L0.f65879x2261f6f2);
        }
    }

    public static final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, java.lang.String str, java.lang.String str2) {
        r45.f03 I0 = jbVar.I0(str);
        if (I0 != null) {
            c00.b4 b4Var = (c00.b4) i95.n0.c(c00.b4.class);
            c00.a4 a4Var = c00.a4.f118483e;
            r45.vs2 field_ctrInfo = jbVar.f65874xb5f7102a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
            ((b00.q2) b4Var).Ai(a4Var, str2, field_ctrInfo, I0, jbVar.f65879x2261f6f2);
        }
    }

    @Override // f70.f
    public boolean e(int i17) {
        return i17 == 11;
    }

    @Override // f70.f
    public boolean f(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Card.Entrance.Left") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "Card.Entrance.Right") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "MyTab");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    @Override // f70.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] h(int r7) {
        /*
            r6 = this;
            zy2.t r7 = zy2.t.CardPackage
            java.lang.Class<c00.x3> r0 = c00.x3.class
            i95.m r0 = i95.n0.c(r0)
            c00.x3 r0 = (c00.x3) r0
            g20.g r0 = (g20.g) r0
            f10.c r1 = r0.Ai()
            r2 = 1
            r3 = 0
            int r4 = r1.f340078a
            if (r4 == 0) goto L25
            r5 = 2
            if (r4 != r5) goto L1b
            r4 = r2
            goto L1c
        L1b:
            r4 = r3
        L1c:
            if (r4 == 0) goto L25
            int r1 = r1.f340081d
            java.lang.String r0 = r0.Di(r1)
            goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            int r1 = r0.length()
            if (r1 <= 0) goto L2e
            goto L2f
        L2e:
            r2 = r3
        L2f:
            if (r2 == 0) goto L33
            r7.f559113d = r0
        L33:
            java.lang.Class<zy2.ca> r0 = zy2.ca.class
            i95.m r0 = i95.n0.c(r0)
            zy2.ca r0 = (zy2.ca) r0
            if (r0 == 0) goto L62
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            com.tencent.mm.plugin.finder.assist.h4 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183754a
            int r7 = r1.b(r7, r0)
            com.tencent.wechat.aff.newlife.FinderSyncClientInfo r0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27423x3e8dddfa.m115216x3136c9db()
            int r1 = r7 * 2
            r0.m115227x504fbd1b(r1)
            r0.m115226x49576703(r7)
            com.tencent.wechat.aff.newlife.FinderSyncClientInfo r7 = r0.m115217x59bc66e()
            byte[] r7 = r7.mo14344x5f01b1f6()
            return r7
        L62:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nh3.d.h(int):byte[]");
    }

    @Override // f70.f
    public boolean j(int i17, bw5.e4 e4Var) {
        if (i17 != 11) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[canSendSyncRequest] bizScene=");
        sb6.append(e4Var != null ? java.lang.Integer.valueOf(e4Var.f108253e) : null);
        sb6.append(" isAfterMMEcInit=");
        sb6.append(this.f418652a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", sb6.toString());
        if (!this.f418652a) {
            return false;
        }
        int i18 = e4Var != null ? e4Var.f108253e : 0;
        return i18 == 5000 || i18 == 5001 || i18 == 5002;
    }

    @Override // nh3.a
    public void l(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 cmdItem, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", "[doCmdItem] scene=" + i17 + " cmdId=" + cmdItem.f59838x5a623f5);
        int i18 = cmdItem.f59838x5a623f5;
        if (i18 == 50000) {
            try {
                r45.dz2 dz2Var = new r45.dz2();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = cmdItem.f59837xaf1e42d9;
                if (gVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMEcRedDotHandler", "processTabTips cmdBuf null");
                    return;
                }
                dz2Var.mo11468x92b714fd(gVar.g());
                m(dz2Var);
                o(dz2Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).e1(dz2Var, "mmec_processTabTips");
                c00.x3 x3Var = (c00.x3) i95.n0.c(c00.x3.class);
                bw5.n9 n9Var = bw5.n9.RECEIVE_REDDOT;
                android.os.Bundle bundle = new android.os.Bundle();
                java.util.LinkedList m75941xfb821914 = dz2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTab_tips_info(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    r45.vs2 vs2Var = (r45.vs2) ((r45.gz2) it.next()).m75936x14adae67(0);
                    java.lang.String str2 = vs2Var != null ? vs2Var.f470036x : null;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                bundle.putStringArray("reddot_id_list", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
                ((g20.g) x3Var).Zi(n9Var, bundle);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMEcRedDotHandler", e17, "processTabTips exception", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 == 50001) {
            try {
                r45.vt2 vt2Var = new r45.vt2();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = cmdItem.f59837xaf1e42d9;
                if (gVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMEcRedDotHandler", "processRevokeTabTips cmdBuf null");
                    return;
                }
                vt2Var.mo11468x92b714fd(gVar2.g());
                q(vt2Var);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().o(vt2Var);
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.LinkedList m75941xfb8219142 = vt2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRevoke_tab_tips_info(...)");
                java.util.Iterator it6 = m75941xfb8219142.iterator();
                while (it6.hasNext()) {
                    java.util.LinkedList m75941xfb8219143 = ((r45.wt2) it6.next()).m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getTab_tips_info(...)");
                    java.util.Iterator it7 = m75941xfb8219143.iterator();
                    while (it7.hasNext()) {
                        r45.vs2 vs2Var2 = (r45.vs2) ((r45.gz2) it7.next()).m75936x14adae67(0);
                        if (vs2Var2 != null && (str = vs2Var2.f470036x) != null) {
                            hashSet.add(str);
                        }
                    }
                }
                c00.x3 x3Var2 = (c00.x3) i95.n0.c(c00.x3.class);
                bw5.n9 n9Var2 = bw5.n9.REVOKE_REDDOT;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putStringArray("reddot_id_list", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
                ((g20.g) x3Var2).Zi(n9Var2, bundle2);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMEcRedDotHandler", e18, "processRevokeTabTips exception", new java.lang.Object[0]);
            }
        }
    }

    public final void m(r45.dz2 dz2Var) {
        boolean z17 = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ai().f340078a != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", "[processTabTips] isUseNewCardEntrance=" + z17);
        if (z17) {
            return;
        }
        java.util.LinkedList m75941xfb821914 = dz2Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTab_tips_info(...)");
        pm0.v.d0(m75941xfb821914, nh3.c.f418651d);
    }

    public final void n(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onMMEcInitCgiBackSuccessfully] source=");
        sb6.append(source);
        sb6.append(" pendingSyncList=");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f418653b;
        sb6.append(concurrentLinkedQueue.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", sb6.toString());
        this.f418652a = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", "[syncScene] syncScene=6");
        w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
        if (wi6 != null) {
            p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170141x21b98e08(((w71.n1) wi6).m105978x2737f10(), 11, 6);
        }
        if (true ^ concurrentLinkedQueue.isEmpty()) {
            w71.m1 wi7 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                nh3.b bVar = (nh3.b) it.next();
                if (wi7 != null) {
                    byte[] recvData = bVar.f418650a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recvData, "recvData");
                    p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170136x21b36361(((w71.n1) wi7).m105978x2737f10(), 11L, 5L, recvData);
                }
            }
            concurrentLinkedQueue.clear();
        }
    }

    public final void o(r45.dz2 dz2Var) {
        r45.vs2 vs2Var;
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        if (((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
            java.util.LinkedList m75941xfb821914 = dz2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTab_tips_info(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext() && (vs2Var = (r45.vs2) ((r45.gz2) it.next()).m75936x14adae67(0)) != null) {
                p(nk6, vs2Var, "Card.Entrance.Left", "order_card_reddot");
                p(nk6, vs2Var, "Card.Entrance.Right", "order_card_reddot");
                p(nk6, vs2Var, "MyTab", "me_reddot");
            }
        }
    }

    public final void q(r45.vt2 vt2Var) {
        if (((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            java.util.LinkedList m75941xfb821914 = vt2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRevoke_tab_tips_info(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c17 = nk6.c(((r45.wt2) it.next()).m75945x2fec8307(0));
                if (c17 != null) {
                    r(c17, "Card.Entrance.Left", "order_card_reddot");
                    r(c17, "Card.Entrance.Right", "order_card_reddot");
                    r(c17, "MyTab", "me_reddot");
                }
            }
        }
    }
}
