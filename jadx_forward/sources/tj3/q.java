package tj3;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f501327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8 f501328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tj3.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8 c16589x63693fe8) {
        super(0);
        this.f501327d = pVar;
        this.f501328e = c16589x63693fe8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        uj3.b0 b0Var;
        tj3.p pVar = this.f501327d;
        boolean a17 = pVar.f501321g.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8 c16589x63693fe8 = this.f501328e;
        if (a17) {
            tj3.x layoutAdapter = c16589x63693fe8.getLayoutAdapter();
            if (layoutAdapter != null) {
                java.lang.String username = pVar.f501321g.f231830b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "openScreenCastBig: ".concat(username));
                layoutAdapter.a(kz5.o1.c(username), username);
                sj3.g3 g3Var = layoutAdapter.f501335a;
                g3Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "openScreenCastBig: ".concat(username));
                android.view.View j17 = g3Var.j();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "openScreenCastBigVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "openScreenCastBigVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g3Var.i().c(username);
                g3Var.i().setVisibility(0);
                g3Var.i().setOnClickListener(new sj3.v2(g3Var));
                g3Var.d().setVisibility(8);
                g3Var.r(true);
                g3Var.e().h(false, true);
                g3Var.f().setOnClickListener(new sj3.w2(g3Var));
                wj3.a aVar = g3Var.f490072t;
                if (aVar != null && (b0Var = aVar.f528279e) != null) {
                    b0Var.g();
                }
                wj3.a aVar2 = g3Var.f490072t;
                jz5.g gVar = g3Var.f490067o;
                if (aVar2 != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) gVar).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "<get-screenCasePluginLayout>(...)");
                    aVar2.g(relativeLayout);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
                wj3.a aVar3 = new wj3.a(serviceConnectionC16581x3d1d6bd2);
                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ((jz5.n) gVar).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "<get-screenCasePluginLayout>(...)");
                relativeLayout2.removeAllViews();
                uj3.b0 b0Var2 = aVar3.f528279e;
                if (b0Var2 != null) {
                    b0Var2.e(relativeLayout2);
                }
                g3Var.f490072t = aVar3;
                g3Var.l().f231798p.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, (p012xc85e97e9.p093xedfae76a.k0) ((jz5.n) g3Var.f490075w).mo141623x754a37bb());
                zj3.j jVar = zj3.j.f554870a;
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.lang.String f27 = (Bi == null || (n17 = Bi.n(username, true)) == null) ? null : n17.f2();
                if (f27 != null) {
                    username = f27;
                }
                g3Var.f490070r = jVar.f(serviceConnectionC16581x3d1d6bd2, username);
                ((android.widget.TextView) ((jz5.n) g3Var.f490068p).mo141623x754a37bb()).setText(g3Var.f490070r);
            }
        } else {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8.f231895q;
            c16589x63693fe8.b(pVar);
            if (c16589x63693fe8.f231900h == -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(10);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(9);
            }
        }
        return jz5.f0.f384359a;
    }
}
