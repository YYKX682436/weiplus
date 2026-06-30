package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.n.class)
/* loaded from: classes11.dex */
public class q2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.n, com.p314xaae8f345.mm.p944x882e457a.u0, l75.z0 {

    /* renamed from: t, reason: collision with root package name */
    public static int f281268t = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f281269e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f281270f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f281271g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f281272h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281273i;

    /* renamed from: m, reason: collision with root package name */
    public final l75.q0 f281274m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281275n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f281276o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f281277p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a f281278q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j f281279r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f281280s;

    public q2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281273i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5241xb34b656>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.ChatroomComponent$1
            {
                this.f39173x3fe91575 = 1070867558;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5241xb34b656 c5241xb34b656) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5241xb34b656 c5241xb34b6562 = c5241xb34b656;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2.this;
                q2Var.f280113d.b0();
                if (!(c5241xb34b6562 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5241xb34b656)) {
                    return false;
                }
                q2Var.f280113d.x();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5241xb34b6562.f135574g.f88162a) || !c5241xb34b6562.f135574g.f88162a.equals(q2Var.f280113d.x())) {
                    return false;
                }
                q2Var.r0();
                return false;
            }
        };
        this.f281274m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h2(this);
        this.f281275n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6174x4c30696e>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.ChatroomComponent$3
            {
                this.f39173x3fe91575 = -1360452258;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6174x4c30696e c6174x4c30696e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6174x4c30696e c6174x4c30696e2 = c6174x4c30696e;
                boolean z17 = c6174x4c30696e2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6174x4c30696e;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2.this;
                if ((z17 && !q2Var.f280113d.x().equals(c6174x4c30696e2.f136434g.f88333a)) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(q2Var.f280113d.x())) {
                    return false;
                }
                db5.e1.s(q2Var.f280113d.g(), q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1l), null);
                return false;
            }
        };
        this.f281276o = false;
        this.f281277p = 0;
        this.f281278q = null;
        this.f281280s = false;
    }

    public static com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18, boolean z17) {
        q2Var.getClass();
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(q2Var.f280113d.x()).b(q2Var.f280113d.x(), linkedList2, i17);
        b17.f273779b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r1(q2Var, z17, i18, f9Var, linkedList, linkedList2);
        b17.f273780c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u1(q2Var, z17, i18, f9Var, linkedList, linkedList2);
        if (z17) {
            b17.b();
        } else {
            b17.c(q2Var.f280113d.g(), q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), q2Var.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4_), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v1(q2Var, b17));
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        c01.d9.e().a(610, this);
        c01.d9.e().a(551, this);
        ((l75.a1) c01.d9.b().q()).a(this);
        c01.d9.b().l().add(this.f281274m);
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j jVar = this.f281279r;
        if (jVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomWatchCallbackFactory", "dead");
            gm0.j1.i();
            gm0.j1.n().f354821b.q(jVar.f273802a, jVar.f273805d);
        }
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j jVar2 = (com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j) ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.f280113d.x()).e(700);
        jVar2.f273803b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b2(this);
        jVar2.f273804c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a2(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomWatchCallbackFactory", "alive");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(jVar2.f273802a, jVar2.f273805d);
        this.f281279r = jVar2;
        this.f281273i.mo48813x58998cd();
        this.f281275n.mo48813x58998cd();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x()) && c01.v1.z(this.f280113d.x())) {
            this.f280113d.x();
            c01.n8.a().c(this.f280113d.x(), 30);
        }
        if (q21.d.b() != null && !this.f280113d.x().equals(((va3.v0) q21.d.b()).f515897v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "chatting oncreate end track %s", ((va3.v0) q21.d.b()).f515897v);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52 c5385x2a29ba52 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52();
            c5385x2a29ba52.f135720g.f89709a = this.f280113d.x();
            c5385x2a29ba52.e();
        }
        r0();
        if (this.f280113d.u() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomInfoDetail() talker == null");
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x())) {
            java.lang.String x17 = this.f280113d.x();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f281276o);
            if (f281268t == -1) {
                f281268t = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomInfoDetail() username:%s, isInChatRoom:%s, sw:%s", x17, valueOf, java.lang.Integer.valueOf(f281268t));
            java.lang.String x18 = this.f280113d.x();
            if (this.f281276o) {
                if (f281268t == -1) {
                    f281268t = 1;
                }
                if (f281268t == 1) {
                    ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e2(this, x18), 1000L);
                }
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f280113d.x())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f280113d.x());
            if (z07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail member is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail %s status:%s", this.f280113d.x(), java.lang.Integer.valueOf(z07.f69084x8729abea));
            if (!((((long) z07.f69084x8729abea) & 2097152) == 2097152 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f69081x1856cb8d))) {
                if (z07.f69102x22419ccf == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate migration %s", this.f280113d.x());
                    ((nn.j) i95.n0.c(nn.j.class)).Ni().b(this.f280113d.x(), z07.f69081x1856cb8d);
                    java.lang.String x19 = this.f280113d.x();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration %s", x19);
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g2(this, x19));
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate getRoomInfo %s", this.f280113d.x());
            ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.f280113d.x()).m(this.f280113d.x()).b();
            java.lang.String x27 = this.f280113d.x();
            boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OPEN_IM_MIGRATE_CHECK_ALL_CONVERSATION_BOOLEAN_SYNC, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "ifCheckAllConversation %s, excludeUsername %s", java.lang.Boolean.valueOf(o17), x27);
            if (o17) {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f2(this, x27));
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f280113d.x())) {
            jn.j Ni = ((nn.j) i95.n0.c(nn.j.class)).Ni();
            java.lang.String x28 = this.f280113d.x();
            Ni.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "setCurChatName:%s", x28);
            Ni.f382005d = x28;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f280113d.x());
            if (z08 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail member is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail %s status:%s", this.f280113d.x(), java.lang.Integer.valueOf(z08.f69084x8729abea));
            int i17 = z08.f69102x22419ccf;
            if (!(i17 == 3)) {
                if (i17 == 2) {
                    jn.j Ni2 = ((nn.j) i95.n0.c(nn.j.class)).Ni();
                    java.lang.String str = z08.f69081x1856cb8d;
                    java.lang.String str2 = (java.lang.String) Ni2.f382004c.get(str);
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = str == null ? "" : str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[1] = str2;
                    java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = Ni2.f382003b;
                    objArr[2] = java.lang.Boolean.valueOf(concurrentLinkedDeque.contains(str));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "removeMigrateTask %s %s, %s", objArr);
                    if (concurrentLinkedDeque.contains(str)) {
                        concurrentLinkedDeque.remove(str);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail remove from cur room");
                    return;
                }
                return;
            }
            java.lang.String string = this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b09);
            java.lang.String string2 = this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0a);
            java.lang.String string3 = this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0_);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append("<_wc_custom_link_ href=\"weixin://jump/chatroom/");
            stringBuffer.append(z08.f69081x1856cb8d);
            stringBuffer.append("\">");
            stringBuffer.append(string2);
            stringBuffer.append("</_wc_custom_link_>");
            stringBuffer.append(string3);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.j1(0);
            f9Var.u1(this.f280113d.x());
            f9Var.r1(3);
            f9Var.d1(stringBuffer.toString());
            f9Var.e1(c01.w9.m(this.f280113d.x(), java.lang.System.currentTimeMillis() / 1000));
            f9Var.m124850x7650bebc(10000);
            f9Var.f1(f9Var.w0());
            f9Var.X = 1;
            f9Var.f317711r = true;
            c01.w9.x(f9Var);
            z08.f69102x22419ccf = 4;
            boolean mo11260x413cb2b4 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(z08);
            jn.j.d(z08.f69081x1856cb8d, this.f280113d.x(), 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "insert migration finish system msg.(result:%s)", java.lang.Boolean.valueOf(mo11260x413cb2b4));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        x0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        jn.j Ni = ((nn.j) i95.n0.c(nn.j.class)).Ni();
        Ni.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "setCurChatName:%s", "");
        Ni.f382005d = "";
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f280113d.x())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f280113d.x());
            if (z07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate member is null");
                return;
            }
            if (z07.f69102x22419ccf == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate start migrate");
                ((nn.j) i95.n0.c(nn.j.class)).Ni().b(z07.f69081x1856cb8d, this.f280113d.x());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        x0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        if (this.f280113d.C()) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String x17 = this.f280113d.x();
            ((py.a) iVar).getClass();
            this.f281276o = c01.v1.x(x17, true);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        yb5.d dVar = this.f280113d;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "[onNotifyChange] mChattingContext is null!");
            return;
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280287s) {
            this.f281276o = s01.r.p(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280277f);
            return;
        }
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String x17 = this.f280113d.x();
        ((py.a) iVar).getClass();
        this.f281276o = c01.v1.x(x17, false);
    }

    public void n0(long j17, java.util.LinkedList linkedList, int i17, int i18) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f280113d.x());
        if (z07 == null) {
            db5.e1.y(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4r), null, this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.i2(this));
            return;
        }
        this.f280113d.x();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.List A0 = z07.A0();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (A0 != null && A0.contains(str)) {
                linkedList2.add(str);
            }
        }
        if (linkedList2.size() == 0) {
            if (linkedList.size() == 1) {
                db5.e1.y(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4k), null, this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j2(this));
            } else {
                db5.e1.y(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4g), null, this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4l), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k2(this));
            }
            if (i18 == 1) {
                w0(pt0.f0.Li(this.f280113d.x(), j17), 5, linkedList, 0, 0, 1, "");
                return;
            }
            return;
        }
        if (i18 == 1) {
            this.f281277p = 1;
        }
        if (j17 != -1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f280113d.x(), j17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.Y1())) {
                if (!((Li.F & 4096) > 0)) {
                    if (c01.id.a() - Li.mo78012x3fdd41df() <= u04.d.f505010c) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f280113d.g(), 1, false);
                        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l2(this);
                        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o2(this, Li, linkedList, linkedList2, i17, i18);
                        k0Var.f293387d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2(this, Li, linkedList, linkedList2);
                        k0Var.v();
                        return;
                    }
                    this.f281277p = 6;
                    f9Var = Li;
                }
            }
            f9Var = Li;
        } else {
            f9Var = null;
        }
        o0(f9Var, linkedList, linkedList2, i17, i18, false);
    }

    public final void o0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18, boolean z17) {
        if (linkedList.size() == 1) {
            db5.e1.C(this.f280113d.g(), z17 ? this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4f, q0((java.lang.String) linkedList.get(0))) : this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4e, q0((java.lang.String) linkedList.get(0))), null, z17 ? this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4n) : this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4m), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o1(this, z17, f9Var, linkedList, i18, linkedList2, i17), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p1(this, i18, f9Var, linkedList));
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.class);
        intent.putExtra("members", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList2, ","));
        intent.putExtra("origin_members", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ","));
        intent.putExtra("select_record_report_opt", this.f281277p);
        intent.putExtra("RoomInfo_Id", this.f280113d.x());
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        intent.putExtra("local_scene", i18);
        intent.putExtra("revoke_record", z17);
        if (f9Var != null) {
            intent.putExtra("msg_id", f9Var.m124847x74d37ac6());
        }
        yb5.d dVar = this.f280113d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChatroomComponent", "dealDelChatroomMemberImp", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/util/LinkedList;Ljava/util/LinkedList;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/ChatroomComponent", "dealDelChatroomMemberImp", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/util/LinkedList;Ljava/util/LinkedList;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " sceneType:" + m1Var.mo808xfb85f7b0());
        this.f280113d.b();
        yb5.d dVar = this.f280113d;
        if (!dVar.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd fragment not foreground, return");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(dVar.g()) && !v0(this.f280113d.g(), i17, i18, str)) {
            this.f280113d.b0();
            if (i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 551) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "cpan[refresh top btn]");
                qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
                java.lang.String x17 = this.f280113d.x();
                ((py.a) iVar).getClass();
                this.f281276o = c01.v1.x(x17, false);
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).E0();
            }
        }
    }

    public final void p0() {
        sb5.f fVar = (sb5.f) this.f280113d.f542241c.a(sb5.f.class);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x());
        java.util.Map map = this.f281270f;
        boolean z17 = false;
        if (!R4) {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar).f280287s) {
                this.f281269e = true;
                return;
            } else {
                this.f281269e = false;
                ((java.util.HashMap) map).clear();
                return;
            }
        }
        java.lang.String x17 = this.f280113d.x();
        java.util.Map map2 = c01.v1.f119052a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(x17);
        if (z07 != null) {
            z17 = z07.f69096x75b86ab7 > 0;
        }
        this.f281269e = z17;
        if (z17) {
            c01.v1.a(this.f280113d.x(), map);
        } else {
            ((java.util.HashMap) map).clear();
        }
    }

    public final java.lang.String q0(java.lang.String str) {
        java.lang.String str2 = null;
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280287s && !this.f280113d.C()) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            return str;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f280113d.x());
            if (z07 != null) {
                str2 = z07.z0(n17.d1());
            }
        } else {
            str2 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = n17.w0();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? n17.f2() : str2;
    }

    public final void r0() {
        if (this.f280113d.u() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomMemberDetail() talker == null");
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x())) {
            this.f280113d.q().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d2(this), 1000L);
        }
    }

    public java.lang.CharSequence s0(java.lang.String str) {
        sb5.f fVar = (sb5.f) this.f280113d.f542241c.a(sb5.f.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(str);
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar).f280286r && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return t41.c.a(n17, a17);
        }
        java.util.Map map = this.f281270f;
        if (((java.util.HashMap) map).containsKey(str)) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) map).get(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? t41.c.a(n17, str2) : str2;
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
        if (aVar.f280286r) {
            return aVar.f280277f.v0(str);
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return t41.c.a(n17, c01.a2.e(str));
    }

    public boolean t0() {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f280113d.x()) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f280113d.x())) != null && (((long) z07.f69084x8729abea) & 131072) == 131072;
    }

    public boolean u0() {
        return this.f281276o || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).P;
    }

    public boolean v0(android.app.Activity activity, int i17, int i18, java.lang.String str) {
        return com.p314xaae8f345.mm.ui.pc.a(activity, i17, i18, str, 7) || com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d.a(activity, i17, i18, new android.content.Intent().setClass(activity, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str);
    }

    public final void w0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.util.LinkedList linkedList, int i18, int i19, int i27, java.lang.String str) {
        a14.h.a(this.f280113d.x(), linkedList != null ? linkedList.size() : 0, i18, i17, i19, i27, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(f9Var != null ? f9Var.Y1() : ""), str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (!this.f281280s) {
            p0();
        }
        this.f281280s = false;
    }

    public final void x0() {
        c01.d9.e().q(610, this);
        ((l75.a1) c01.d9.b().q()).e(this);
        c01.d9.e().q(551, this);
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.j jVar = this.f281279r;
        if (jVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomWatchCallbackFactory", "dead");
            gm0.j1.i();
            gm0.j1.n().f354821b.q(jVar.f273802a, jVar.f273805d);
        }
        if (gm0.j1.a()) {
            c01.d9.b().l().mo49775xc84af884(this.f281274m);
            this.f281273i.mo48814x2efc64();
            this.f281275n.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f281280s = true;
        p0();
    }
}
