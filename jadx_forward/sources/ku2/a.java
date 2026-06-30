package ku2;

/* loaded from: classes2.dex */
public final class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f393691d;

    public a(java.lang.ref.WeakReference delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f393691d = delegate;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5.Companion.m88569x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23912x5124eb7c(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5
    /* renamed from: onClickClose */
    public void mo88565x9740bc8f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var;
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V6;
        ku2.b bVar = (ku2.b) this.f393691d.get();
        if (bVar == null || (weakReference = (e90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90) bVar).f215766f) == null || (s0Var = (in5.s0) weakReference.get()) == null || (abstractC14490x69736cb5 = e90Var.f215765e) == null || (V6 = e90Var.V6(abstractC14490x69736cb5)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickClose, feedId = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = V6.f217756a;
        sb6.append(e90Var.P6(abstractC14490x69736cb52.mo2128x1ed62e84()));
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
        e90Var.R6(s0Var, V6, true);
        e90Var.U6(abstractC14490x69736cb52, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217643f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, itemView, "listen_page_thumbnail", "view_clk", true, e90Var.Q6(abstractC14490x69736cb52), null, 32, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5
    /* renamed from: onClickJump */
    public void mo88566x890566b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var;
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V6;
        ku2.b bVar = (ku2.b) this.f393691d.get();
        if (bVar == null || (weakReference = (e90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90) bVar).f215766f) == null || (s0Var = (in5.s0) weakReference.get()) == null || (abstractC14490x69736cb5 = e90Var.f215765e) == null || (V6 = e90Var.V6(abstractC14490x69736cb5)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickJump, feedId = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = V6.f217756a;
        sb6.append(e90Var.P6(abstractC14490x69736cb52.mo2128x1ed62e84()));
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
        e90Var.S6(abstractC14490x69736cb52);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, itemView, "finder_enter_sleep", "view_clk", true, e90Var.Q6(abstractC14490x69736cb52), null, 32, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5
    /* renamed from: onClickRemindJump */
    public void mo88567x2a87e69c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var;
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V6;
        ku2.b bVar = (ku2.b) this.f393691d.get();
        if (bVar == null || (weakReference = (e90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90) bVar).f215766f) == null || (s0Var = (in5.s0) weakReference.get()) == null || (abstractC14490x69736cb5 = e90Var.f215765e) == null || (V6 = e90Var.V6(abstractC14490x69736cb5)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = V6.f217756a;
        e90Var.f215772o = abstractC14490x69736cb52.mo2128x1ed62e84();
        e90Var.f215764d = e90Var.O6();
        android.app.Activity m80379x76847179 = e90Var.m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.o2u);
        e4Var.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", "onClickRemind, feedId = " + e90Var.P6(abstractC14490x69736cb52.mo2128x1ed62e84()) + '}');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, itemView, "finder_exit_remind", "view_clk", true, e90Var.Q6(abstractC14490x69736cb52), null, 32, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23914x8baddba5.Companion.m88569x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
