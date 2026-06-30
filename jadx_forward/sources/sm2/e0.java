package sm2;

/* loaded from: classes3.dex */
public final class e0 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f490967b;

    public e0(sm2.o4 o4Var, r45.hc1 hc1Var) {
        this.f490966a = o4Var;
        this.f490967b = hc1Var;
    }

    @Override // hn0.i
    /* renamed from: callback */
    public void mo57125xf5bc2045(int i17, android.os.Bundle bundle) {
        java.lang.Class<mm2.e1> cls;
        r45.w22 w22Var;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        qf2.v0 v0Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Class<mm2.o4> cls2;
        java.lang.String str;
        int i18;
        java.lang.Class<mm2.e1> cls3;
        r45.wz1 wz1Var;
        int i19;
        java.lang.String str2;
        char c17;
        int i27;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        r45.xn1 xn1Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        r45.im1 im1Var;
        fm2.a aVar;
        km2.m m57663xfb7e58202;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e2;
        qf2.c3 c3Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa8;
        in0.q qVar;
        kn0.p pVar;
        sm2.o4 o4Var = this.f490966a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "on enterRoom finish, liveData.business(LiveCommonSlice::class.java).enableAudioMode():" + ((mm2.c1) o4Var.c(mm2.c1.class)).l7() + " audioModeHolderBm:" + ((mm2.c1) o4Var.c(mm2.c1.class)).I4);
        int i28 = 2;
        int i29 = 1;
        if (i17 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184113z.f184073b, null, false, true, 6, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o4Var.f491143f, "enter room fail");
            db5.t7.m123883x26a183b(o4Var.f101127b, "enter room fail", 0).show();
            fm2.a aVar2 = o4Var.f101128c;
            if (aVar2 != null) {
                qo0.c.a(aVar2, qo0.b.f446896i, null, 2, null);
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("live_user_exit_reason", i17);
            fm2.a aVar3 = o4Var.f101128c;
            if (aVar3 != null) {
                aVar3.mo46557x60d69242(qo0.b.D1, bundle2);
            }
            dk2.xf g17 = o4Var.g();
            if (g17 != null) {
                dk2.xf.f(g17, 0, new sm2.d0(o4Var), 1, null);
                return;
            }
            return;
        }
        in0.q qVar2 = o4Var.f101130e;
        if (((qVar2 == null || (pVar = qVar2.D) == null || !pVar.e()) ? false : true) && (qVar = o4Var.f101130e) != null) {
            android.graphics.drawable.Drawable drawable = o4Var.f101127b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ajc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
            qVar.I0(pm0.v.n(drawable));
        }
        r45.hc1 hc1Var = this.f490967b;
        r45.wz1 wz1Var2 = (r45.wz1) hc1Var.m75936x14adae67(4);
        java.lang.Class<mm2.e1> cls4 = mm2.e1.class;
        boolean g76 = ((mm2.e1) o4Var.c(cls4)).g7();
        int i37 = 3;
        java.lang.String str3 = o4Var.f491143f;
        java.lang.Class<mm2.o4> cls5 = mm2.o4.class;
        if (g76) {
            java.util.LinkedList<r45.uz1> m75941xfb8219143 = wz1Var2 != null ? wz1Var2.m75941xfb821914(6) : null;
            if (m75941xfb8219143 == null) {
                m75941xfb8219143 = new java.util.LinkedList();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "keepLinkWhenJoinLive micUserList.size:" + m75941xfb8219143.size());
            for (r45.uz1 uz1Var : m75941xfb8219143) {
                if (uz1Var != null) {
                    java.lang.String m75945x2fec8307 = uz1Var.m75945x2fec8307(3);
                    if (((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? i29 : 0) == 0) {
                        java.lang.String m75945x2fec83072 = uz1Var.m75945x2fec8307(2);
                        r45.xn1 xn1Var3 = (r45.xn1) uz1Var.m75936x14adae67(0);
                        java.lang.String m76175x6d346f39 = (xn1Var3 == null || (c19782x23db1cfa8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa8.m76175x6d346f39();
                        r45.xn1 xn1Var4 = (r45.xn1) uz1Var.m75936x14adae67(0);
                        java.lang.String m76197x6c03c64c = (xn1Var4 == null || (c19782x23db1cfa7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var4.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa7.m76197x6c03c64c();
                        r45.xn1 xn1Var5 = (r45.xn1) uz1Var.m75936x14adae67(0);
                        java.lang.String m76184x8010e5e4 = (xn1Var5 == null || (c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var5.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa6.m76184x8010e5e4();
                        int m75939xb282bd08 = uz1Var.m75939xb282bd08(i29);
                        java.lang.String m75945x2fec83073 = uz1Var.m75945x2fec8307(3);
                        int l86 = ((mm2.c1) o4Var.c(mm2.c1.class)).l8();
                        int i38 = uz1Var.m75939xb282bd08(i29) == 2 ? 4 : 3;
                        r45.xn1 xn1Var6 = (r45.xn1) uz1Var.m75936x14adae67(0);
                        km2.q qVar3 = new km2.q(m75945x2fec83072, m76175x6d346f39, m76197x6c03c64c, m76184x8010e5e4, m75939xb282bd08, m75945x2fec83073, null, false, l86, null, null, i38, xn1Var6 != null ? xn1Var6.m75939xb282bd08(4) : 0, false, null, false, 0L, (r45.xn1) uz1Var.m75936x14adae67(0), false, null, null, 0, uz1Var.m75939xb282bd08(7), uz1Var.m75942xfb822ef2(8), null, null, 0L, null, 0, 0L, null, null, null, -12720448, 1, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "keepLinkWhenJoinLive curLinkUser:" + qVar3);
                        ((mm2.c1) o4Var.c(mm2.c1.class)).k8(qVar3);
                        ((mm2.o4) o4Var.c(cls5)).O7(qVar3);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.addAll(((mm2.o4) o4Var.c(cls5)).f410860v);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "startCloseLinkCheck checkList: " + linkedList.size());
                        fm2.a aVar4 = o4Var.f101128c;
                        if (aVar4 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.f(aVar4, null, null, new sm2.j4(linkedList, o4Var, null), 3, null);
                        }
                    }
                }
                i29 = 1;
            }
            if (wz1Var2 != null && (im1Var = (r45.im1) wz1Var2.m75936x14adae67(8)) != null && (aVar = o4Var.f101128c) != null && (m57663xfb7e58202 = aVar.m57663xfb7e5820()) != null && (c14197x319b1b9e2 = m57663xfb7e58202.f390664f) != null && (c3Var = (qf2.c3) c14197x319b1b9e2.m56798x25fe639c(qf2.c3.class)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorCancelAbortVisitorBattle status: " + im1Var.m75939xb282bd08(2) + ", battleId: " + im1Var.m75945x2fec8307(0));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(c3Var, null, null, new qf2.d2(c3Var, im1Var, null), 3, null);
            }
            cls = cls4;
        } else {
            java.util.LinkedList m75941xfb8219144 = wz1Var2 != null ? wz1Var2.m75941xfb821914(6) : null;
            if (m75941xfb8219144 == null) {
                m75941xfb8219144 = new java.util.LinkedList();
            }
            java.util.LinkedList<r45.uz1> linkedList2 = m75941xfb8219144;
            r45.yz1 yz1Var = wz1Var2 != null ? (r45.yz1) wz1Var2.m75936x14adae67(7) : null;
            for (r45.uz1 uz1Var2 : linkedList2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkLinkMicStateWhenJoin micUserList.size:");
                sb6.append(linkedList2.size());
                sb6.append(" micInfo:[sessionId:");
                sb6.append(uz1Var2 != null ? uz1Var2.m75945x2fec8307(i37) : null);
                sb6.append(", micSeq:");
                sb6.append(uz1Var2 != null ? java.lang.Long.valueOf(uz1Var2.m75942xfb822ef2(4)) : null);
                sb6.append(", micNickname:");
                sb6.append((uz1Var2 == null || (xn1Var2 = (r45.xn1) uz1Var2.m75936x14adae67(0)) == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa5.m76184x8010e5e4());
                sb6.append("], micPkInfo:[sessionId:");
                sb6.append(yz1Var != null ? yz1Var.m75945x2fec8307(0) : null);
                sb6.append(", micPkseq:");
                sb6.append(yz1Var != null ? java.lang.Long.valueOf(yz1Var.m75942xfb822ef2(1)) : null);
                sb6.append(", micPkNickname:");
                sb6.append((yz1Var == null || (xn1Var = (r45.xn1) yz1Var.m75936x14adae67(i37)) == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa4.m76184x8010e5e4());
                sb6.append(']');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
                if (uz1Var2 != null) {
                    java.lang.String m75945x2fec83074 = uz1Var2.m75945x2fec8307(i37);
                    if (!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0)) {
                        java.lang.String m75945x2fec83075 = uz1Var2.m75945x2fec8307(i28);
                        r45.xn1 xn1Var7 = (r45.xn1) uz1Var2.m75936x14adae67(0);
                        java.lang.String m76175x6d346f392 = (xn1Var7 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var7.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76175x6d346f39();
                        r45.xn1 xn1Var8 = (r45.xn1) uz1Var2.m75936x14adae67(0);
                        java.lang.String m76197x6c03c64c2 = (xn1Var8 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var8.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
                        r45.xn1 xn1Var9 = (r45.xn1) uz1Var2.m75936x14adae67(0);
                        if (xn1Var9 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var9.m75936x14adae67(0)) == null) {
                            i19 = 1;
                            str2 = null;
                        } else {
                            str2 = c19782x23db1cfa.m76184x8010e5e4();
                            i19 = 1;
                        }
                        int m75939xb282bd082 = uz1Var2.m75939xb282bd08(i19);
                        java.lang.String m75945x2fec83076 = uz1Var2.m75945x2fec8307(i37);
                        int i39 = uz1Var2.m75939xb282bd08(i19) == i28 ? 4 : 3;
                        r45.xn1 xn1Var10 = (r45.xn1) uz1Var2.m75936x14adae67(0);
                        if (xn1Var10 != null) {
                            c17 = 4;
                            i27 = xn1Var10.m75939xb282bd08(4);
                        } else {
                            c17 = 4;
                            i27 = 0;
                        }
                        km2.q qVar4 = new km2.q(m75945x2fec83075, m76175x6d346f392, m76197x6c03c64c2, str2, m75939xb282bd082, m75945x2fec83076, null, false, 0, null, null, i39, i27, false, null, false, 0L, (r45.xn1) uz1Var2.m75936x14adae67(0), false, null, null, 0, 0, uz1Var2.m75942xfb822ef2(8), null, null, 0L, null, 0, 0L, null, null, null, -8525888, 1, null);
                        ((mm2.c1) o4Var.c(mm2.c1.class)).k8(qVar4);
                        ((mm2.o4) o4Var.c(cls5)).O7(qVar4);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "checkLinkMicStateWhenJoin has unfinished mic, will close. curLinkUser:" + qVar4);
                        cls2 = cls5;
                        i18 = 3;
                        str = str3;
                        cls3 = cls4;
                        wz1Var = wz1Var2;
                        sm2.o4.H(o4Var, qVar4, 1, false, true, null, 20, null);
                        cls5 = cls2;
                        i37 = i18;
                        str3 = str;
                        cls4 = cls3;
                        wz1Var2 = wz1Var;
                        i28 = 2;
                    }
                }
                cls2 = cls5;
                str = str3;
                i18 = i37;
                cls3 = cls4;
                wz1Var = wz1Var2;
                cls5 = cls2;
                i37 = i18;
                str3 = str;
                cls4 = cls3;
                wz1Var2 = wz1Var;
                i28 = 2;
            }
            java.lang.Class<mm2.o4> cls6 = cls5;
            java.lang.String str4 = str3;
            cls = cls4;
            r45.wz1 wz1Var3 = wz1Var2;
            sm2.q qVar5 = new sm2.q(o4Var);
            if (yz1Var != null) {
                java.lang.String m75945x2fec83077 = yz1Var.m75945x2fec8307(0);
                if (!(m75945x2fec83077 == null || m75945x2fec83077.length() == 0)) {
                    qVar5.mo146xb9724478(yz1Var);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkLinkMicStateWhenJoin pkAnchorSize: ");
            sb7.append((wz1Var3 == null || (m75941xfb8219142 = wz1Var3.m75941xfb821914(12)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb7.toString());
            if (((wz1Var3 == null || (m75941xfb821914 = wz1Var3.m75941xfb821914(12)) == null) ? 0 : m75941xfb821914.size()) > 0 && wz1Var3 != null && (w22Var = (r45.w22) wz1Var3.m75936x14adae67(13)) != null) {
                mm2.o4 o4Var2 = (mm2.o4) o4Var.c(cls6);
                java.lang.String m75945x2fec83078 = w22Var.m75945x2fec8307(0);
                if (m75945x2fec83078 == null) {
                    m75945x2fec83078 = "";
                }
                java.lang.String m75945x2fec83079 = w22Var.m75945x2fec8307(1);
                o4Var2.W = new km2.c(m75945x2fec83078, m75945x2fec83079 != null ? m75945x2fec83079 : "", w22Var.m75942xfb822ef2(2));
                fm2.a aVar5 = o4Var.f101128c;
                if (aVar5 != null && (m57663xfb7e5820 = aVar5.m57663xfb7e5820()) != null && (c14197x319b1b9e = m57663xfb7e5820.f390664f) != null && (v0Var = (qf2.v0) c14197x319b1b9e.m56798x25fe639c(qf2.v0.class)) != null) {
                    qf2.v0.e7(v0Var, "", true, false, null, 12, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184136e = c01.id.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.A.f184073b, null, false, false, 14, null);
        dk2.xf g18 = o4Var.g();
        if (g18 != null) {
            java.lang.Class<mm2.e1> cls7 = cls;
            ((dk2.r4) g18).o0(((mm2.e1) o4Var.c(cls7)).f410521r.m75942xfb822ef2(0), ((mm2.e1) o4Var.c(cls7)).f410516m, ((mm2.c1) o4Var.c(mm2.c1.class)).f410399q, 1, true, new sm2.c0(o4Var, hc1Var));
        }
    }
}
