package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.d0.class)
/* loaded from: classes9.dex */
public class b5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements ot0.f3, sb5.d0 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f280226t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(5, "MicroMsg.ChattingMoreBtnBarHelper", 1);

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d f280227e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f280228f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f280230h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f280231i;

    /* renamed from: n, reason: collision with root package name */
    public android.view.animation.Animation f280233n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280229g = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f280232m = true;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f280234o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f280235p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final tb5.g0 f280236q = new tb5.g0();

    /* renamed from: r, reason: collision with root package name */
    public boolean f280237r = false;

    /* renamed from: s, reason: collision with root package name */
    public final ub5.k f280238s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d6(this);

    public static void m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var, java.util.List list) {
        b5Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            ot0.q v17 = ot0.q.v(f9Var.j());
            int i17 = v17 == null ? 0 : v17.f430199i;
            sb6.append(f9Var.I0());
            sb7.append(f9Var.mo78013xfb85f7b0());
            sb8.append(i17);
            sb6.append("|");
            sb7.append("|");
            sb8.append("|");
        }
        int k17 = b5Var.f280113d.k();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", sb6.toString());
        hashMap.put("msgtype", sb7.toString());
        hashMap.put("submsgtype", sb8.toString());
        hashMap.put("chat_name", b5Var.f280113d.x());
        hashMap.put("enter_sessionid", b5Var.f280113d.f542255q);
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
        hashMap.put("view_id", "yuanbao_msg_share");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        if (this.f280229g) {
            o0();
        }
    }

    @Override // ot0.f3
    public boolean I6() {
        return this.f280232m;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
        o0();
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        this.f280113d.b0();
        o0();
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
    }

    public final void n0(final android.content.Context context, java.util.List msgItems) {
        gm0.b bVar;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f280230h;
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.chatting.component.b5$$f
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5.this;
                b5Var.getClass();
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                android.content.Context context2 = context;
                if (booleanValue) {
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                    e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ohy);
                    e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                    e4Var.c();
                    tb5.i0 i0Var = tb5.i0.f498588a;
                    java.util.List p07 = b5Var.p0();
                    tb5.g0 state = b5Var.f280236q;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
                    i0Var.b("multi_select_msg_copy_succ", p07, state);
                    b5Var.o0();
                } else {
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                    e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.ohx);
                    e4Var2.c();
                }
                b5Var.f280235p.set(false);
                return jz5.f0.f384359a;
            }
        };
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.b5$$g
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5.this.f280235p.set(false);
                return jz5.f0.f384359a;
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItems, "msgItems");
        gm0.m b17 = gm0.j1.b();
        if (b17 == null || (bVar = b17.f354778h) == null || (c20976x6ba6452a = bVar.f354678e) == null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f(0L, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        fVar.b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pag), true, 0, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k9(c0Var, v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m9(context, msgItems, z3Var, fVar, c0Var, lVar, null), 1, null), aVar));
    }

    public void o0() {
        this.f280113d.e().j(false, this.f280228f);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d c21615x5b594e4d = this.f280227e;
        if (c21615x5b594e4d != null) {
            c21615x5b594e4d.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class));
        kVar.T = false;
        kVar.h(null);
        kVar.B1 = kVar.C1;
        kVar.D1 = kVar.E1;
        kVar.F1 = kVar.G1;
        kVar.H1 = kVar.I1;
        kVar.J1 = kVar.K1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class));
        aVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.d(aVar), 500L, "getBizChatMsgSource");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) this.f280113d.f542241c.a(sb5.u1.class))).p0();
        this.f280229g = false;
        this.f280113d.f542243e.X();
        r0();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9) ((sb5.l0) this.f280113d.f542241c.a(sb5.l0.class))).o0();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).F0();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).m0();
        this.f280113d.y();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.a();
    }

    public java.util.List p0() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).W.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
            linkedList.add(pt0.f0.Li(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d));
        }
        java.util.Collections.sort(linkedList, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e6(this));
        return linkedList;
    }

    public void q0() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f280228f;
        if (c9Var != null) {
            c9Var.b();
            this.f280228f.f291857i = null;
        }
    }

    public final void r0() {
        if (this.f280229g) {
            this.f280113d.Y(false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).E0();
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f280113d.f542241c.a(sb5.q2.class))).y0();
    }

    @Override // ot0.f3
    public boolean u1() {
        return true;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
