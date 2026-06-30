package yj5;

/* loaded from: classes9.dex */
public final class s extends yj5.a implements l75.z0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f544263f = "PayPluginTopMsgTipsBarProcessor";

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a1Var, gm0.j1.u().c()) && obj == com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC) {
            o0();
        }
    }

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536419h;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
        java.lang.String str2 = talkerInfo.f542275a;
        r45.j67 wi6 = gVar.wi(str2);
        if (wi6 != null && wi6.f459149e.size() > 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList msg_list = wi6.f459149e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_list, "msg_list");
            java.util.Iterator it = msg_list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.f544263f;
                if (!hasNext) {
                    break;
                }
                r45.i67 i67Var = (r45.i67) it.next();
                long a17 = c01.id.a() - i67Var.f458304f;
                long j17 = i67Var.f458305g;
                if (j17 <= 0) {
                    j17 = 604800000;
                }
                if (a17 <= 0 || a17 >= j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "invalid time gap is %s , ignore show", java.lang.Long.valueOf(a17));
                } else {
                    java.lang.String msg_svrId = i67Var.f458302d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_svrId, "msg_svrId");
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str2, java.lang.Long.parseLong(msg_svrId));
                    if ((o27 == null || o27.m124847x74d37ac6() == 0 || o27.mo78013xfb85f7b0() == 268445456) ? false : true) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o27);
                        linkedList.add(new xj5.h(i67Var, o27));
                    }
                }
            }
            if (linkedList.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27193, 1, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "show %s pay plugin topmsg", java.lang.Integer.valueOf(linkedList.size()));
                return linkedList;
            }
        }
        return null;
    }

    @Override // yj5.a
    public void n0() {
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.u(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        gm0.j1.u().c().a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        gm0.j1.u().c().e(this);
    }
}
