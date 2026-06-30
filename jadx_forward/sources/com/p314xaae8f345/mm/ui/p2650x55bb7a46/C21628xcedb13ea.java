package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment */
/* loaded from: classes9.dex */
public class C21628xcedb13ea extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b {
    public static java.lang.String M;
    public android.view.View A;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 B;
    public boolean C;
    public boolean D;
    public long E;
    public ke5.f0 F;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 G;
    public final android.view.View.OnLayoutChangeListener H;
    public n30.v I;

    /* renamed from: J, reason: collision with root package name */
    public final n52.d f279800J;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d K;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d L;

    /* renamed from: s, reason: collision with root package name */
    public sb5.z f279801s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 f279802t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f279803u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f279804v;

    /* renamed from: w, reason: collision with root package name */
    public int f279805w;

    /* renamed from: x, reason: collision with root package name */
    public int f279806x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f279807y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f279808z;

    public C21628xcedb13ea() {
        this.f279803u = null;
        this.f279806x = 0;
        this.f279807y = null;
        this.A = null;
        this.C = true;
        this.D = true;
        this.E = -1L;
        this.G = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w8(this);
        this.H = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.x8(this);
        this.f279800J = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z8(this);
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.K = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.19
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                if (c5722xb16ab0f4.f136045g.f88569b != 4) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "musicPlayerListener error");
                java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.this.getClass();
                il4.l lVar = il4.l.f373675a;
                return false;
            }
        };
        this.L = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.20
            {
                this.f39173x3fe91575 = -1443570203;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 c5721xb5961bd5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "musicCheckErrorListener check error");
                if (c5721xb5961bd5.f136044g.f88489a == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIFragment", "musicCheckErrorListener, must has error.");
                    return false;
                }
                java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.this.getClass();
                il4.l lVar = il4.l.f373675a;
                return false;
            }
        };
    }

    public static int X0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea) {
        c21628xcedb13ea.getClass();
        try {
            c21628xcedb13ea.f279805w = java.lang.Integer.parseInt(j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20032xb50b08b8()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUIFragment", e17, "", new java.lang.Object[0]);
            c21628xcedb13ea.f279805w = 0;
        }
        return c21628xcedb13ea.f279805w;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public com.p314xaae8f345.mm.ui.zb A0() {
        yb5.d dVar = this.f279685f;
        if (dVar.f542241c.a(sb5.z0.class) == null) {
            return null;
        }
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).f281224o;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public ke5.f0 B0() {
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 C0() {
        return this.f279802t;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public boolean F0() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_wait_until_layout, 1) == 1) || (c21897x17252689 = this.B) == null) {
            return true;
        }
        return c21897x17252689.K1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void L0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onEnterBegin", "()V", this);
        super.L0();
        U0();
        java.lang.String m78394x7e63ed49 = m78394x7e63ed49("Chat_User");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(m78394x7e63ed49, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(m78394x7e63ed49("Chat_User"), true);
        yb5.d dVar = this.f279685f;
        int e76 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.e7(n18, dVar);
        if (e76 == 6) {
            cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Single);
            aVar.Rj(this, iy1.a.SingleChat);
            aVar.dk(this, "ChattingUI_Single");
        } else if (e76 == 7) {
            cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Group);
            aVar2.Rj(this, iy1.a.GroupChat);
            aVar2.dk(this, "ChattingUI_Group");
        } else if (e76 == 9) {
            cy1.a aVar3 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseSingle);
            aVar3.Rj(this, iy1.a.EnterpriseSingle);
            aVar3.dk(this, "ChattingUI_EnterpriseSingle");
        } else if (e76 == 10) {
            cy1.a aVar4 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseGroup);
            aVar4.Rj(this, iy1.a.EnterpriseGroup);
            aVar4.dk(this, "ChattingUI_EnterpriseGroup");
        } else if (e76 == 4 || e76 == 5) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(dVar.x())) {
                cy1.a aVar5 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_WeRun);
                aVar5.Rj(this, iy1.a.WeRun);
                aVar5.dk(this, "ChattingUI_Service");
            } else {
                cy1.a aVar6 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Service);
                aVar6.Rj(this, iy1.a.ServiceChat);
                aVar6.dk(this, "ChattingUI_Service");
            }
        } else if (e76 == 0) {
            cy1.a aVar7 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_NotifyMessages);
            aVar7.Rj(this, iy1.a.ServiceNotification);
            aVar7.dk(this, "ChattingUI_NotifyMessages");
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ly1.a() { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment$$a
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                java.lang.String str2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.this;
                c21628xcedb13ea.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("unread_count", java.lang.Integer.valueOf(c21628xcedb13ea.f279806x));
                return hashMap;
            }
        });
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("wx_username", m78394x7e63ed49);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ly1.a() { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment$$b
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                java.lang.String str2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.this;
                c21628xcedb13ea.getClass();
                android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(c21628xcedb13ea.m78394x7e63ed49("Chat_User"), true);
                yb5.d dVar2 = c21628xcedb13ea.f279685f;
                int e77 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.e7(n19, dVar2);
                arrayMap.put("page_type", java.lang.Integer.valueOf(e77));
                arrayMap.put("is_mute", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.f7(e77, dVar2)));
                if (n19 != null) {
                    arrayMap.put("is_in_msg_box", java.lang.Integer.valueOf(n19.v2() ? 1 : 0));
                    arrayMap.put("is_top", java.lang.Integer.valueOf(n19.w2() ? 1 : 0));
                }
                return arrayMap;
            }
        });
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int A0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).A0();
        if (n17 != null && n17.m2()) {
            java.lang.String username = n17.d1();
            r01.r1.f449749j = currentTimeMillis;
            r01.r1.f449750k = A0;
            if (eq1.d0.a() != null) {
                r01.r1.f449751l = eq1.d0.a().o(username, 9);
            }
            long j17 = r01.r1.f449749j;
            int i17 = r01.r1.f449750k;
            int i18 = r01.r1.f449751l;
            r01.j jVar = r01.j.f449652a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            r01.j.b(r01.j.f449652a, 3, username, null, null, null, j17, i17, null, i18, null, 512, null);
        }
        if (n17 != null && (n17.m2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.F4(m78394x7e63ed49))) {
            cy1.a aVar8 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar8.mk(this, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.f9(this, currentTimeMillis, A0, n17));
            aVar8.Tj(this, 16, 12, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onEnterBegin", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void N0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitBegin", "()V", this);
        super.N0();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f279801s).P = -1L;
        this.F.mo142539x3d6f0539();
        U0();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5244x6e685763 c5244x6e685763 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5244x6e685763();
        c5244x6e685763.f135576g.f88340a = M;
        c5244x6e685763.e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5243x3e3c0a2a().e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5832xc2fc331e c5832xc2fc331e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5832xc2fc331e();
        c5832xc2fc331e.f136139g.f90127a = true;
        c5832xc2fc331e.e();
        com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291232b.clear();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitBegin", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void P0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitEnd", "()V", this);
        super.P0();
        a1();
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class));
        v4Var.getClass();
        pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z1(v4Var, 2));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitEnd", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void Q0(android.content.Context context) {
        if (this.A == null) {
            this.A = com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(context), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569952ss, null, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void R0() {
        ke5.a fVar;
        if (this.B == null || this.f279801s == null) {
            return;
        }
        java.util.List list = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f279801s).M;
        yb5.d dVar = this.f279685f;
        hd5.j jVar = new hd5.j(dVar, list);
        hd5.l lVar = new hd5.l(dVar, this.B);
        hd5.v vVar = new hd5.v(lVar, jVar, dVar);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) dVar.f542241c.a(sb5.p.class))).f281806m) {
            fVar = new ke5.a0(dVar, vVar);
            lVar.f362152c = fVar;
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f280286r) {
                fVar = new ke5.j(dVar, vVar);
                lVar.f362152c = fVar;
            } else {
                sb5.t0 t0Var = (sb5.t0) cVar.a(sb5.t0.class);
                dVar.x();
                t0Var.getClass();
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f280829g || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f280830h || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f280828f || ((((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f280831i && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) cVar.a(sb5.g0.class))).t0()) || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) cVar.a(sb5.p1.class))).n0())) {
                    if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).o0()) {
                        fVar = new ke5.i(dVar, vVar);
                        lVar.f362152c = fVar;
                    } else {
                        fVar = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20095x98db9225()) == 1 ? new sd5.f(dVar, vVar) : new ke5.u(dVar, vVar);
                        lVar.f362152c = fVar;
                    }
                } else if (((sb5.s) cVar.a(sb5.s.class)).u() || ((sb5.h0) cVar.a(sb5.h0.class)).G() || ((sb5.x) cVar.a(sb5.x.class)).t() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).G0() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).H0() || ((sb5.j0) cVar.a(sb5.j0.class)).s()) {
                    fVar = new ke5.m(dVar, vVar);
                    lVar.f362152c = fVar;
                } else if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) cVar.a(sb5.g0.class))).t0()) {
                    fVar = new ke5.y(dVar, vVar);
                    lVar.f362152c = fVar;
                } else if (dVar.E()) {
                    fVar = new ke5.p(dVar, vVar);
                    lVar.f362152c = fVar;
                } else if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) cVar.a(sb5.g0.class))).u0()) {
                    fVar = new ke5.x(dVar, vVar);
                    lVar.f362152c = fVar;
                } else if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) cVar.a(sb5.k0.class))).s0()) {
                    fVar = new ke5.d0(dVar, vVar);
                    lVar.f362152c = fVar;
                } else if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) cVar.a(sb5.g.class))).n0()) {
                    fVar = new ke5.l(dVar, vVar);
                    lVar.f362152c = fVar;
                } else if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).o0()) {
                    fVar = new ke5.i(dVar, vVar);
                    lVar.f362152c = fVar;
                } else {
                    fVar = new sd5.d(dVar, vVar);
                    lVar.f362152c = fVar;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingDataPresenterFactory", "[ChattingDataPresenterFactory] executor:%s", fVar.m142540x9616526c());
        this.F = fVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f279801s).Z = fVar;
        this.B.m79880x5d86695b(fVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void U0() {
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f279685f.f542241c.a(sb5.z0.class))).f281228s) {
            return;
        }
        java.lang.String x17 = this.f279685f.x();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17 = this.f279685f.u();
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.y8(this, x17, u17), "MicroMsg.ChattingUIFragment");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public boolean W0() {
        if (!m78667x564fc359()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUIFragment", "Actionbar customView onclick screen not enable");
            return true;
        }
        mo78661x36654fab();
        if (G0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "Still entering, ignore this go back");
            return true;
        }
        if (H0() && android.os.SystemClock.elapsedRealtime() - this.E <= 500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "Already exiting, ignore this go back");
            return true;
        }
        this.E = android.os.SystemClock.elapsedRealtime();
        if (mo7430x19263085() != null) {
            android.view.View findViewById = mo7430x19263085().findViewById(com.p314xaae8f345.mm.R.id.huh);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "triggerGoBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingUIFragment", "triggerGoBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.h9(this));
            } else {
                c1();
            }
        }
        return true;
    }

    public void a1() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        try {
            android.app.Activity mo7438x76847179 = mo7438x76847179();
            if (mo7438x76847179 == null || mo7438x76847179.isFinishing() || mo7438x76847179.isDestroyed() || (u3Var = this.f279803u) == null) {
                return;
            }
            if (u3Var != null && u3Var.isShowing()) {
                this.f279803u.dismiss();
                this.f279803u = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIFragment", "dismissDialog error", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public void b1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = this.B;
        c21897x17252689.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[forceTopLoadData] sourceArgs:");
        sb6.append(bundle == null ? "" : bundle.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", sb6.toString());
        c21897x17252689.D1 = bundle;
        c21897x17252689.c(true);
    }

    public void c1() {
        sb5.j2 j2Var = (sb5.j2) this.f279685f.f542241c.a(sb5.j2.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.r8 r8Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.r8(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm smVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) j2Var;
        smVar.getClass();
        if (q21.d.a() != null) {
            q21.a a17 = q21.d.a();
            java.lang.String d17 = smVar.f280113d.u().d1();
            if (((va3.z0) a17).b(d17).contains(smVar.f280113d.t())) {
                db5.e1.H(smVar.f280113d.f542250l.mo7438x76847179(), smVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1j), smVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lm(smVar, r8Var), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mm(smVar));
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = smVar.f281484f;
        if (c21532x4955f5be != null && c21532x4955f5be.f279223g.getVisibility() == 0) {
            c21532x4955f5be.e(false);
            c21532x4955f5be.f279223g.setVisibility(8);
        }
        r8Var.run();
    }

    public void d1() {
        if (m78383x21a1233e("MainUI_FromFinderNotification", false).booleanValue()) {
            zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
            if (c9Var != null && (mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c9Var).Bi(mo78409x676b27cd(), 2);
            }
            if (m7436x8619eaa0() != null) {
                m7436x8619eaa0().remove("MainUI_FromFinderNotification");
            }
        }
        yb5.d dVar = this.f279685f;
        sb5.d0 d0Var = (sb5.d0) dVar.f542241c.a(sb5.d0.class);
        sb5.u1 u1Var = (sb5.u1) dVar.f542241c.a(sb5.u1.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5) d0Var;
        if (b5Var.f280229g) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) u1Var;
            if (jkVar.f280839t) {
                jkVar.p0();
                b5Var.q0();
            } else {
                b5Var.o0();
            }
        }
        sb5.f fVar = (sb5.f) dVar.f542241c.a(sb5.f.class);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(dVar.x())) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            j45.l.j(mo7438x76847179(), "tmessage", ".ui.TConversationUI", intent, null);
        } else {
            if (m78386x9c19e6d7("chat_from_scene", 0) == 4) {
                mo78641xb4098c93();
                return;
            }
            if ((m78386x9c19e6d7("chat_from_scene", 0) == 1 || m78386x9c19e6d7("chat_from_scene", 0) == 3) && dVar.u() != null && dVar.u().k2()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
                if (aVar.x0() != null && aVar.x0().G0() && aVar.x0().D0(false) != null && aVar.x0().D0(false).d() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.x0().y0())) {
                    mo78641xb4098c93();
                    return;
                }
            }
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pg) ((sb5.b1) dVar.f542241c.a(sb5.b1.class))).f281243e) {
                mo78641xb4098c93();
            } else if (!m78383x21a1233e("finish_direct", false).booleanValue()) {
                if (!this.f39298x5262fd1e) {
                    mo78641xb4098c93();
                    return;
                }
                android.content.Intent intent2 = new android.content.Intent(mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
                intent2.addFlags(67108864);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "goBackImpl", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo7585xa4df9991((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "goBackImpl", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                m78401x4d12b7e0(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
                mo78641xb4098c93();
                return;
            }
        }
        mo78641xb4098c93();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View view) {
        super.mo26076x2105eeb2(view);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f279685f.f542241c.a(sb5.z0.class));
        if (peVar.f280113d.f542250l.m78668x4e2d2008()) {
            if (peVar.f281223n == null) {
                peVar.f281223n = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324) ((android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.bkr)).inflate();
            }
            peVar.f281224o.A0.f406770i = (android.view.ViewGroup) view;
        }
    }

    public void e1() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17;
        n30.t tVar = (n30.t) i95.n0.c(n30.t.class);
        n52.d dVar = this.f279800J;
        n30.u uVar = n30.u.f416004e;
        ((m30.q) tVar).getClass();
        this.I = new n52.c(dVar, "ChattingUIFragment", uVar);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.bm6);
        this.B = c21897x17252689;
        c21897x17252689.m79087xceaf442d(true);
        this.f279804v = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565219bp3);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 m79872xcc101dd9 = this.B.m79872xcc101dd9();
        this.f279802t = m79872xcc101dd9;
        m79872xcc101dd9.setVisibility(0);
        yb5.d dVar2 = this.f279685f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar2.f542241c.a(sb5.z0.class));
        android.os.Bundle bundle = null;
        if (peVar.f280113d.m() > 0) {
            peVar.f281217e = (android.widget.LinearLayout) peVar.f280113d.p().q(com.p314xaae8f345.mm.R.id.i3f);
        } else {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) peVar.f280113d.g().getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570111xs, (android.view.ViewGroup) null);
            peVar.f281217e = linearLayout;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) peVar.f280113d.f542251m).C0().mo75755x77114253(linearLayout);
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) peVar.f280113d.f542241c.a(sb5.p1.class))).f280510e) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a1) ((sb5.l) peVar.f280113d.f542241c.a(sb5.l.class))).o0();
        }
        peVar.u0();
        if (this.B.m79868x1e705e08() == null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k(dVar2, this.f279802t, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2670x335620.C21847x65a3a76(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t8(this), od5.a.f426185h, dVar2, this));
            this.f279801s = kVar;
            this.B.m79877x6cab2c8d(kVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x172526892 = this.B;
        c21897x172526892.c(false);
        c21897x172526892.c(false);
        R0();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar2.f542241c;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) cVar.a(sb5.p.class))).t0()) {
            bundle = new android.os.Bundle();
            bundle.putBoolean("key_is_need_fold_msg", true);
        }
        this.F.a(hd5.n.ACTION_ENTER, true, bundle);
        this.f279802t.m75905x67cdbb06(2);
        ((sb5.u1) cVar.a(sb5.u1.class)).getClass();
        this.f279802t.m75904xcc7da8b2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.u8(this));
        java.lang.Object m78645x9f88d943 = m78645x9f88d943();
        if (m78645x9f88d943 != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4) m78645x9f88d943).c((ul5.j) cVar.a(sb5.p0.class));
        }
        this.f279802t.i(this.G);
        this.f279802t.m75883xd611a4ce(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.v8(this));
        this.B.addOnLayoutChangeListener(this.H);
        if (this.f279689m) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(2) && (u17 = dVar2.u()) != null && u17.k2()) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(0);
            }
        }
        m7546x417de4a8(this.f279802t.f());
        this.B.m79086xfda753bf(true);
        if ((this.F instanceof ke5.s) && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19991xcfdfae22()) == 1) {
            this.B.B1 = true;
        }
    }

    public void f1(boolean z17, boolean z18, boolean z19) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        if (!z18) {
            g1(z17, z19);
            return;
        }
        yb5.d dVar = this.f279685f;
        (dVar.f542244f ? dVar.f542240b : yb5.d.A).mo50300x3fa464aa(this.f279808z);
        qu5.a aVar = dVar.f542244f ? dVar.f542240b : yb5.d.A;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a9 a9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.a9(this, z17, z19);
        this.f279808z = a9Var;
        aVar.mo50293x3498a0(a9Var);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: finish */
    public void mo78641xb4098c93() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33;
        yb5.d dVar = this.f279685f;
        dVar.f542243e.Z();
        sb5.s0 s0Var = (sb5.s0) dVar.f542241c.a(sb5.s0.class);
        if (s0Var != null && (c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e) != null) {
            c19666xfd6e2f33.w0(true);
        }
        int i17 = !mo78661x36654fab() ? 0 : 100;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s8 s8Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s8(this);
        if (i17 == 0) {
            s8Var.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(s8Var, i17);
        }
    }

    public final void g1(boolean z17, boolean z18) {
        int i17;
        int mo75762xe81a1f0f = this.f279802t.mo75762xe81a1f0f();
        int mo75757x2ce24761 = this.f279802t.mo75757x2ce24761();
        int mo75756x7444f759 = this.f279802t.mo75756x7444f759();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = java.lang.Boolean.valueOf(this.C);
            objArr[1] = java.lang.Integer.valueOf(mo75762xe81a1f0f);
            objArr[2] = java.lang.Integer.valueOf(mo75757x2ce24761);
            objArr[3] = java.lang.Integer.valueOf(mo75756x7444f759);
            objArr[4] = java.lang.Boolean.valueOf(z17);
            objArr[5] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[6] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[scrollToLastImpl] isFirstScroll:%s [%s:%s] count:%s force:%s isMain:%s stack:%s", objArr);
        }
        this.C = false;
        if (!z17 || mo75762xe81a1f0f != mo75757x2ce24761 || mo75762xe81a1f0f < mo75756x7444f759 - 1 || this.f279802t.m75886x3d79f549() <= 0) {
            i17 = 0;
        } else {
            int m75888x1c4fb41d = this.f279802t.m75888x1c4fb41d() - this.f279802t.m75890xc96f6de6();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = this.f279802t;
            i17 = m75888x1c4fb41d - v3Var.m75885x6a486239(v3Var.m75886x3d79f549() - 1).getHeight();
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            this.f279802t.m75893x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.b9(this, z17, mo75756x7444f759, i17, z18));
        } else if (z17 && this.B.A5()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "scrollToLastImpl: isAtBottom");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(this.f279802t, mo75756x7444f759 - 1, i17, z18, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getCustomBounceId */
    public int mo78648xc86d394a() {
        return com.p314xaae8f345.mm.R.id.bm6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b, com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb
    /* renamed from: getFirstVisiblePosition */
    public int mo79389x2ce24761() {
        return this.f279802t.mo75757x2ce24761();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutView */
    public android.view.View mo78651x29ebce5() {
        if (this.A == null) {
            this.A = com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(mo7438x76847179()), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569952ss, null, false);
        }
        return this.A;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: getUserVisibleHint */
    public boolean mo7473x5e448b18() {
        return this.f279685f.f542247i;
    }

    public void h1(boolean z17) {
        this.B.m79082x1e1922a0(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb
    /* renamed from: hideVKB */
    public boolean mo78661x36654fab() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f279685f.f542241c.a(sb5.s0.class))).f280796e;
        return c19666xfd6e2f33 != null ? c19666xfd6e2f33.A0() : super.mo78661x36654fab();
    }

    public void i1(boolean z17) {
        this.B.m79085xcc8bf2ed(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: isSupportCustomActionBar */
    public boolean mo26090x345d1387() {
        return m78668x4e2d2008();
    }

    public void l1(boolean z17) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            m1(z17);
        } else {
            this.f279685f.q().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.c9(this, z17));
        }
    }

    public final void m1(boolean z17) {
        if (z17) {
            android.view.View view = this.f279804v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f279804v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.mo7496x9d4787cb(i17, i18, intent);
        if (i17 != 30763 && i17 != 30762) {
            if (i17 == 3000 && i18 == 1) {
                mo78641xb4098c93();
                return;
            }
            return;
        }
        if ((i17 == 30762 || i17 == 30763) && intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if (i17 == 30763) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.l(mo7430x19263085(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 67);
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.l(mo7430x19263085(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onCancelDrag */
    public void mo78672x37a8620d() {
        if (!m78668x4e2d2008() || this.f279801s == null) {
            return;
        }
        this.D = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33;
        super.onConfigurationChanged(configuration);
        if ((fp.e0.e() || u75.e.a() || fp.e0.f()) && (c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f279685f.f542241c.a(sb5.s0.class))).f280796e) != null) {
            boolean contains = configuration.toString().contains("mWindowingMode=100");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", java.lang.Boolean.valueOf(contains));
            c19666xfd6e2f33.m75497xf2e1cdbd(contains);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateOptionsMenu */
    public void mo7502xa71d2e62(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.f279685f.f542247i) {
            super.mo7502xa71d2e62(menu, menuInflater);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onDragBegin */
    public void mo78674xe9fcb8b6() {
        super.mo78674xe9fcb8b6();
        if (!m78668x4e2d2008() || this.f279801s == null) {
            return;
        }
        this.D = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onKeyboardStateChanged */
    public void mo78677x62d1e2e9() {
        if (m78670x8200b8ea() == 1) {
            this.f279802t.m75893x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.g9(this));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onMultiWindowModeChanged */
    public void mo7509xd5c30607(boolean z17) {
        super.mo7509xd5c30607(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "onMultiWindowModeChanged: %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f279685f.f542241c.a(sb5.s0.class))).f280796e;
        if (c19666xfd6e2f33 != null) {
            c19666xfd6e2f33.m75497xf2e1cdbd(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onSwipeBack */
    public void mo25467x59cfc822() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUIFragment", "onSwipeBack");
        d1();
        if (va3.j0.Ri().c()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52 c5385x2a29ba52 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52();
            c5385x2a29ba52.f135720g.f89709a = ((va3.v0) q21.d.b()).f515897v;
            c5385x2a29ba52.e();
        }
        if (m78668x4e2d2008()) {
            m78658x28280f95().m81450x8e764904(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void r0(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(context);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doAttach", "(Landroid/content/Context;)V", this, array);
        super.r0(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[doAttach]:%s#0x%x hc:%d", mo78409x676b27cd().getClass().getSimpleName(), java.lang.Integer.valueOf(mo78409x676b27cd().hashCode()), java.lang.Integer.valueOf(m7479x8cdac1b()));
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar != null) {
            gaVar.f290176f0 = 3;
            gaVar.f290180h0 = true;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doAttach", "(Landroid/content/Context;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s0() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.s0():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: setBackBtn */
    public void mo78682x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f279685f.f542241c.a(sb5.z0.class))).x0(onMenuItemClickListener);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: setMMSubTitle */
    public void mo78690x3f86539a(int i17) {
        mo78691x3f86539a(m78653x34347727(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: setMMTitle */
    public void mo78694xbf7c1df6(int i17) {
        mo78695xbf7c1df6(m78653x34347727(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void t0() {
        super.t0();
        java.lang.String username = m78394x7e63ed49("Chat_User");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(username, true);
        if (n17 == null || !n17.m2()) {
            return;
        }
        long j17 = r01.r1.f449749j;
        int i17 = r01.r1.f449750k;
        int i18 = r01.r1.f449751l;
        r01.j jVar = r01.j.f449652a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r01.j.b(r01.j.f449652a, 4, username, null, null, null, j17, i17, null, i18, null, 512, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void u0() {
        super.u0();
        this.f279685f.x();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void w0() {
        db5.d5 d5Var;
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V", this);
        super.w0();
        if ((mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) || (mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a)) {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(mo78409x676b27cd(), this.f279807y);
        }
        this.f279807y = null;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.r5.b()) {
            try {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5 q5Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.r5.f284174b;
                if (q5Var != null && (d5Var = q5Var.f284132d) != null) {
                    d5Var.dismiss();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAvatarOnHoverHelper", "exception in dismiss, %s", e17.getMessage());
            }
        }
        yb5.d dVar = this.f279685f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "on chatting ui pause  rawuser:%s", dVar.x());
        dVar.x();
        this.K.mo48814x2efc64();
        this.L.mo48814x2efc64();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f279801s;
        kVar.f279959x1 = false;
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(kVar.P1);
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(kVar.L1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "adapter pause");
        kVar.O1.d();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = kVar.Q1;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        kVar.M1.mo48814x2efc64();
        kVar.z0();
        mo78661x36654fab();
        sb5.z zVar = this.f279801s;
        if (zVar != null) {
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.view.ViewGroup f17 = this.f279802t.f();
            p52.g gVar = p52.g.f433543d;
            ((c61.w8) paVar).Vi(f17, zVar, 3, -1, -1, 2L, "temp_6", 3, false);
        }
        synchronized (c01.i2.f118777a) {
            c01.i2.f118778b = "";
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void x0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V", this);
        super.x0();
        if (m78395x3622fee6() != null) {
            m78395x3622fee6().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a3a);
        }
        yb5.d dVar = this.f279685f;
        sb5.e1 e1Var = (sb5.e1) dVar.f542241c.a(sb5.e1.class);
        if (e1Var != null) {
            this.f279806x = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah) e1Var).f280157f;
        }
        if (!dVar.f542247i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "onResume fragment not foreground, return,  chatting contentview is show %b, viewShow %b listviewShow:%b", java.lang.Boolean.valueOf(m78646xc2a54588() != null && m78646xc2a54588().isShown()), java.lang.Boolean.valueOf(m7474xfb86a31b() != null && m7474xfb86a31b().isShown()), java.lang.Boolean.valueOf(this.f279802t.m75892x61f71b08() == 0));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUIFragment", "account not ready, mabey not call onDestroy!!!");
            mo78641xb4098c93();
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
            return;
        }
        this.K.mo48813x58998cd();
        this.L.mo48813x58998cd();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f279801s;
        kVar.f279959x1 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "adapter resume");
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n0(kVar.P1, android.os.Looper.getMainLooper());
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(kVar.L1);
        kVar.O1.c(300000L, 300000L);
        if (kVar.Z != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("SCENE", 3);
            ke5.f0 f0Var = kVar.Z;
            if (f0Var != null) {
                f0Var.a(hd5.n.ACTION_UPDATE, false, bundle);
            }
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = kVar.Q1;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        kVar.M1.mo48813x58998cd();
        kVar.A0();
        sb5.z zVar = this.f279801s;
        if (zVar != null) {
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.view.ViewGroup f17 = this.f279802t.f();
            p52.g gVar = p52.g.f433543d;
            ((c61.w8) paVar).Vi(f17, zVar, 2, -1, -1, 2L, "temp_6", 2, false);
            com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(mo7438x76847179());
            c17.f291145d = M;
            c17.f291148g = dVar.f542255q;
            c17.f291147f = vh0.l2.a(dVar.k());
        }
        c01.i2 i2Var = c01.i2.f118777a;
        java.lang.String x17 = dVar.x();
        synchronized (i2Var) {
            c01.i2.f118778b = x17;
        }
        if (this.B.m79872xcc101dd9() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            this.G.mo482x8d21972b((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.B.m79872xcc101dd9(), 0, 0);
        }
        this.f279807y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.e9(this);
        if ((mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) || (mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a)) {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(mo78409x676b27cd(), this.f279807y);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public void y0(boolean z17, int i17) {
        this.B.e(z17, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
    public sb5.z z0() {
        return this.f279801s;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: setMMSubTitle */
    public void mo78691x3f86539a(java.lang.String str) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f279685f.f542241c.a(sb5.z0.class))).y0(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: setMMTitle */
    public void mo78695xbf7c1df6(java.lang.String str) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f279685f.f542241c.a(sb5.z0.class))).B0(str);
    }

    public C21628xcedb13ea(boolean z17) {
        super(z17);
        this.f279803u = null;
        this.f279806x = 0;
        this.f279807y = null;
        this.A = null;
        this.C = true;
        this.D = true;
        this.E = -1L;
        this.G = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w8(this);
        this.H = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.x8(this);
        this.f279800J = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z8(this);
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.K = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.19
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                if (c5722xb16ab0f4.f136045g.f88569b != 4) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "musicPlayerListener error");
                java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.this.getClass();
                il4.l lVar = il4.l.f373675a;
                return false;
            }
        };
        this.L = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.20
            {
                this.f39173x3fe91575 = -1443570203;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 c5721xb5961bd5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "musicCheckErrorListener check error");
                if (c5721xb5961bd5.f136044g.f88489a == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIFragment", "musicCheckErrorListener, must has error.");
                    return false;
                }
                java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.this.getClass();
                il4.l lVar = il4.l.f373675a;
                return false;
            }
        };
    }
}
