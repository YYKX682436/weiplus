package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes12.dex */
public class b0 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z4 f147702d;

    /* renamed from: e, reason: collision with root package name */
    public y12.h f147703e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.r f147704f;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6142xbdaed962 f147708m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5 f147709n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f147705g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f147706h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f147707i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final bm5.p1 f147710o = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c0(this);

    /* renamed from: p, reason: collision with root package name */
    public final bm5.p1 f147711p = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d0(this);

    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b Ai() {
        gm0.j1.b().c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b) this.f147711p.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = bVar.f179149a;
        boolean[] zArr = kVar.f179174l;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!kVar.f179174l[0]) {
                    kVar.f179176n.mo48813x58998cd();
                    kVar.f179177o.mo48813x58998cd();
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.j(kVar);
                    kVar.f179172j = jVar;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(jVar, intentFilter);
                    kVar.f179174l[0] = true;
                }
            }
        }
        return bVar;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z4 Bi() {
        if (this.f147702d == null) {
            this.f147702d = com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j;
        }
        return this.f147702d;
    }

    public n11.a Di() {
        gm0.j1.b().c();
        return (n11.a) this.f147710o.b();
    }

    public y12.h Ni() {
        gm0.j1.b().c();
        if (this.f147703e == null) {
            this.f147703e = new y12.h();
        }
        return this.f147703e;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.r Ri() {
        gm0.j1.b().c();
        if (this.f147704f == null) {
            this.f147704f = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.r();
        }
        return this.f147704f;
    }

    public void Ui(int i17, int i18) {
        int i19;
        java.util.List list = this.f147707i;
        if (((java.util.LinkedList) list).size() < 1) {
            this.f147706h = false;
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g0 g0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g0) ((java.util.LinkedList) list).remove(0);
        if (i17 == 0 && i18 == 0) {
            i19 = 2;
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 35L, 1L, true);
            i19 = 5;
        }
        java.lang.String str = g0Var.f147805b;
        long j17 = g0Var.f147804a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() > 0) {
            Li.r1(i19);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        }
        if (((java.util.LinkedList) list).size() > 0) {
            g0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g0) ((java.util.LinkedList) list).get(0);
            if (pt0.f0.Li(g0Var.f147805b, g0Var.f147804a).m124847x74d37ac6() > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = g0Var.f147806c;
                gm0.j1.n().f354821b.g(new z12.y(g0Var.f147807d, g0Var.f147805b, g0Var.f147806c, g0Var.f147804a, 0, c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.K2.ordinal() : 0));
            } else {
                Ui(-1, -1);
            }
        } else {
            this.f147706h = false;
        }
        if (this.f147708m == null) {
            this.f147708m = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6142xbdaed962();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6142xbdaed962 c6142xbdaed962 = this.f147708m;
        c6142xbdaed962.f136406g.f88149a = g0Var.f147806c.f68663x861009b5;
        c6142xbdaed962.e();
    }

    public void Vi(int i17) {
        z85.b bVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.e5 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(i17);
        if (a17.a()) {
            java.util.Iterator it = a17.f275391b.iterator();
            while (it.hasNext()) {
                ((z85.a) it.next()).f68245x8a0c25ad = 0;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f17.f276696a) {
                bVar = f17.f276710o;
            }
            bVar.y0(a17);
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
        }
    }

    public boolean Zi(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p2621x8fb0427b.g5 g5Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb;
        if (c21053xdbf1e5f4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiInfo failed. emojiinfo is null.");
            g5Var = null;
        } else {
            g5Var = new com.p314xaae8f345.mm.p2621x8fb0427b.g5();
            g5Var.f275487d = c21053xdbf1e5f4.f68671x4b6e68b9;
            g5Var.f275488e = c21053xdbf1e5f4.f68689x2262335f;
            g5Var.f275489f = c21053xdbf1e5f4.f68679x22618426;
            g5Var.f275490g = c21053xdbf1e5f4.f68663x861009b5;
            g5Var.f275495l = c21053xdbf1e5f4.f68657xb76d85ab;
            g5Var.f275496m = c21053xdbf1e5f4.f68686x7b284d5e;
            g5Var.f275497n = c21053xdbf1e5f4.f68659x5efe714f;
            g5Var.f275498o = c21053xdbf1e5f4.f68642xf11e6e15;
            g5Var.f275505v = c21053xdbf1e5f4.f68690x2a070e41;
            g5Var.f275506w = c21053xdbf1e5f4.f68664xfd0bc00c;
            g5Var.f275494k = c21053xdbf1e5f4.f68654xf47770e7;
            g5Var.f275499p = c21053xdbf1e5f4.f68661x765114aa;
            g5Var.f275500q = c21053xdbf1e5f4.f68660x7650f4b9;
            g5Var.f275509z = c21053xdbf1e5f4.f68641x3342accf;
            g5Var.f275507x = c21053xdbf1e5f4.f68688x29e035ee;
            g5Var.f275508y = c21053xdbf1e5f4.f68687x159b18b6;
            g5Var.B = c21053xdbf1e5f4.f68646xa8f07416;
            g5Var.C = c21053xdbf1e5f4.f68669x3e1919e;
            g5Var.D = c21053xdbf1e5f4.f68644xbc38602c;
            g5Var.A = c21053xdbf1e5f4.f68670x419d19a;
            g5Var.F = c21053xdbf1e5f4.f68683x1d5dc4d;
        }
        if (g5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "prepareEmoji failed. emoji msg info is null.");
            return true;
        }
        g5Var.f275484a = c21053xdbf1e5f4 == null ? "" : c21053xdbf1e5f4.D2;
        g5Var.f275501r = false;
        wi(g5Var, null, true);
        return true;
    }

    public final void aj(com.p314xaae8f345.mm.p2621x8fb0427b.g5 g5Var) {
        if (g5Var == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(g5Var.f275484a, "update", null, 0));
    }

    public void bj(int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6420xff1a39df c6420xff1a39df = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6420xff1a39df();
        c6420xff1a39df.f137617d = i18;
        c6420xff1a39df.f137619f = i17;
        c6420xff1a39df.f137620g = i19;
        c6420xff1a39df.f137628o = c6420xff1a39df.b("FinderUserName", str, true);
        c6420xff1a39df.k();
    }

    public void cj(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "setEmojiDownloadCallback %s", q5Var);
        this.f147709n = q5Var;
    }

    public void fj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (pt0.f0.f439742b1.e() || f9Var == null) {
            return;
        }
        f9Var.i1(str);
    }

    public void hj(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(str) == null) {
            if (interfaceC4987x84e327cb == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, interfaceC4987x84e327cb.mo42933xb5885648())) {
                return;
            }
            java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), interfaceC4987x84e327cb.mo42930x4f4a97c4(), interfaceC4987x84e327cb.mo42933xb5885648());
            if (!com.p314xaae8f345.mm.vfs.w6.j(p17)) {
                return;
            }
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p17) ? 2 : 1;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4(interfaceC4987x84e327cb);
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            c21053xdbf1e5f4.f68689x2262335f = i17;
            c21053xdbf1e5f4.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p17);
            c21053xdbf1e5f4.f68685x2261e7f9 = 1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f4);
        }
        lb5.a aVar = new lb5.a();
        aVar.n(str);
        if (interfaceC4987x84e327cb != null && interfaceC4987x84e327cb.c0() != qk.z6.SEND_FROM_SCENE_DEFAULT) {
            aVar.p(interfaceC4987x84e327cb.c0().ordinal());
        }
        n13.r rVar = new n13.r();
        rVar.f415650a = true;
        rVar.f415653d.f415672a = 5;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
    }

    public void ij(android.content.Context context, r45.ri0 ri0Var, java.lang.String str, int i17, java.lang.String sdkRequestID) {
        j22.a.e(ri0Var, 0, i17, 0L, i17);
        n22.f fVar = n22.f.f415823a;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 i18 = n22.m.i(ri0Var);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10592x57b5d15 c10592x57b5d15 = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10592x57b5d15();
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10592x57b5d15 c10592x57b5d152 = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10592x57b5d15();
        long j17 = ri0Var.f466435w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        n22.f.d(fVar, context, i18, false, c10592x57b5d15, c10592x57b5d152, "", i17, 0L, i17, 0, j17, str, null, sdkRequestID, null, 16384, null);
    }

    public void mj(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, r15.b bVar, int i17) {
        long j17;
        long j18;
        java.lang.String e17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || c21053xdbf1e5f4 == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f9Var == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var2.m124850x7650bebc(47);
            f9Var2.u1(str);
            f9Var2.j1(1);
            if (bVar != null) {
                e17 = com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(c01.z1.r(), currentTimeMillis, (c21053xdbf1e5f4.k() || c21053xdbf1e5f4.B1()) ? false : true, c21053xdbf1e5f4.mo42933xb5885648(), false, bVar.m126749x696739c(false, "msg"));
            } else {
                e17 = com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(c01.z1.r(), currentTimeMillis, (c21053xdbf1e5f4.k() || c21053xdbf1e5f4.B1()) ? false : true, c21053xdbf1e5f4.mo42933xb5885648(), false, "");
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bVar == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "insert emoji msg, extCommonInfo null? :%b", objArr);
            f9Var2.d1(e17);
            fj(f9Var2, c21053xdbf1e5f4.mo42933xb5885648());
            f9Var2.e1(c01.w9.o(f9Var2.Q0()));
            if (c16564xb55e1d5.f231013d > 0) {
                f9Var2.f275467n2 = dh3.c.f314022a.g(c16564xb55e1d5, str);
            }
            j18 = currentTimeMillis;
            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        } else {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            long j19 = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j()).f277887b;
            if (j19 == 0) {
                return;
            }
            j17 = m124847x74d37ac6;
            j18 = j19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "NetSceneUploadEmoji: msgId = %s, md5 %s, len %s", java.lang.Long.valueOf(j17), c21053xdbf1e5f4.mo42933xb5885648(), java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426));
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f147707i;
        linkedList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g0(this, j17, str, c21053xdbf1e5f4, "" + j18));
        if (c16564xb55e1d5.f231013d > 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
            long longValue = valueOf.longValue();
            am.xz xzVar = c6194x6522023a.f136451g;
            xzVar.f89942a = longValue;
            xzVar.f89943b = 0;
            xzVar.f89944c = str;
            c6194x6522023a.e();
        }
        if (!this.f147706h || linkedList.size() == 1) {
            this.f147706h = true;
            gm0.j1.n().f354821b.g(new z12.y(j18 + "", str, c21053xdbf1e5f4, j17, 0, i17));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "[onAccountInitialized]");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ai()) {
            com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a.d(false);
        }
        i95.n0.c(e70.q.class);
        new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.x.f298215b = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10593x57b5d16();
        new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q2();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.c.f298168a = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10594x57b5d17();
        new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.x.f298214a = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10595x57b5d18();
        new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s2();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.c.f298169b = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10596x57b5d19();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "onAccountRelease: ");
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            gr.t tVar = f17.f276713r;
            java.util.ArrayList arrayList = tVar.f356221g;
            if (arrayList != null) {
                arrayList.clear();
            }
            java.util.ArrayList arrayList2 = tVar.f356222h;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            tVar.f356224j.d(-1);
            f17.c().mo49775xc84af884(f17.f276715t);
            f17.a().mo49775xc84af884(f17.f276714s);
            f17.f276696a[0] = false;
        }
        Bi().b();
        ((java.util.LinkedList) this.f147707i).clear();
        this.f147705g.clear();
        if (this.f147711p.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k kVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.b) this.f147711p.b()).f179149a;
            boolean[] zArr = kVar.f179174l;
            if (zArr[0]) {
                synchronized (zArr) {
                    if (kVar.f179174l[0]) {
                        kVar.e();
                        kVar.f179176n.mo48814x2efc64();
                        kVar.f179177o.mo48814x2efc64();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.j jVar = kVar.f179172j;
                        if (jVar != null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(jVar);
                            kVar.f179172j = null;
                        }
                        kVar.f179174l[0] = false;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b0.f179073a.clear();
        this.f147709n = null;
        if (this.f147710o.c()) {
            ((n11.a) this.f147710o.b()).c();
        }
        pr.z zVar = pr.k0.f439256q;
        zVar.b(true).mo158865x5cd39ffa();
        zVar.a(true).mo158865x5cd39ffa();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ai()) {
            com.p314xaae8f345.mm.p2614xca6eae71.c0.f274758a.e(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10592x57b5d15());
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
    }

    public void wi(com.p314xaae8f345.mm.p2621x8fb0427b.g5 g5Var, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        r45.j4 j4Var;
        if (g5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiFeatureService", "downloadEmoji msginfo is null.");
            return;
        }
        if (p0Var != null && (j4Var = p0Var.f152259a) != null && j4Var.f459101r == g5Var.f275491h) {
            g5Var.f275502s = c01.w9.q(p0Var);
            g5Var.f275503t = p0Var.f152259a.f459102s;
            g5Var.f275504u = r4.f459098o;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(g5Var.f275487d);
        if (u17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s", u17.f68671x4b6e68b9, g5Var.f275487d, java.lang.Long.valueOf(g5Var.f275491h));
            n22.m.b(g5Var, u17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "downloadEmoji: create emoji info %s", g5Var.f275487d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "createEmojiInfo: %s", g5Var.f275487d);
            u17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            n22.m.b(g5Var, u17);
            u17.f68685x2261e7f9 = 1;
            u17.f68682x29d3a50c = 8;
            u17.f68653x95b20dd4 = 65;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(u17);
        }
        if (g5Var.f275501r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "insertEmojiMsg: %s, %s msgSvrId: %s", g5Var.f275487d, u17.f68671x4b6e68b9, java.lang.Long.valueOf(g5Var.f275491h));
            if (g5Var.f275491h == 0 || (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g5Var.f275484a, g5Var.f275491h)) == null || o27.I0() != g5Var.f275491h) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g5Var.f275484a, true);
                if (n17 == null || ((int) n17.E2) == 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(g5Var.f275484a);
                    z3Var.mo43621x7650bebc(2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.m124850x7650bebc(47);
                f9Var.u1(g5Var.f275484a);
                f9Var.j1(c01.z1.J(g5Var.f275485b) ? 1 : 0);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).fj(f9Var, u17.mo42933xb5885648());
                f9Var.o1(g5Var.f275491h);
                f9Var.d1(com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(g5Var.f275485b, 0L, (u17.k() || u17.B1()) ? false : true, u17.mo42933xb5885648(), false, g5Var.f275492i));
                f9Var.e1(c01.w9.m(f9Var.Q0(), g5Var.f275504u));
                f9Var.r1(3);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g5Var.f275493j)) {
                    f9Var.u3(g5Var.f275493j);
                }
                if (p0Var == null) {
                    int i17 = g5Var.f275502s;
                    if (i17 != 0) {
                        f9Var.f1(i17);
                        if (f9Var.m124847x74d37ac6() == 0 && f9Var.A0() == 0 && (i17 & 2) != 0) {
                            f9Var.e1(g5Var.f275504u);
                        }
                    }
                    int i18 = g5Var.f275503t;
                    if (i18 != 0) {
                        f9Var.n1(i18);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "summerbadcr insertEmojiMsg addMsgInfo is null but flag[%d], msgSeq[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g5Var.f275503t));
                } else {
                    c01.w9.n(f9Var, p0Var);
                }
                java.util.HashMap hashMap = this.f147705g;
                if (hashMap != null && hashMap.containsKey(java.lang.Long.valueOf(f9Var.I0()))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "this msg had been revoke.");
                    f9Var.d1((java.lang.String) this.f147705g.get(java.lang.Long.valueOf(f9Var.I0())));
                    f9Var.m124850x7650bebc(10000);
                    this.f147705g.remove(java.lang.Long.valueOf(f9Var.I0()));
                }
                long x17 = c01.w9.x(f9Var);
                boolean a17 = p0Var != null ? c01.g.a(p0Var.f152259a) : false;
                if (!c01.z1.J(g5Var.f275485b) && !a17) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), x17);
                    ((c01.v8) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).a(Li);
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e0(this, Li));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "start download emoji %s, fileExist %b, download %b", u17.mo42933xb5885648(), java.lang.Boolean.valueOf(u17.E0()), java.lang.Boolean.valueOf(z17));
        if (u17.E0()) {
            return;
        }
        if (z17) {
            zq.h.f556505a.f(u17, true, new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f0(this, g5Var, u17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "cdnurl and cncrypt url is null. autodownload %b", java.lang.Boolean.valueOf(z17));
            aj(g5Var);
        }
    }
}
