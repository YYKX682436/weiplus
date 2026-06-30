package pk2;

/* loaded from: classes3.dex */
public final class u8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437823d;

    public u8(pk2.d9 d9Var, android.app.Activity activity) {
        this.f437823d = d9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        pk2.o9 o9Var;
        pk2.d9 d9Var = this.f437823d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = d9Var.f437193c;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        java.util.Iterator it = ((java.util.ArrayList) d9Var.f437205o).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            o9Var = d9Var.f437213w;
            if (!hasNext) {
                break;
            }
            qk2.h hVar = (qk2.h) it.next();
            hVar.w(g4Var);
            if (hVar.y() == o9Var.f437633o) {
                g4Var.g(o9Var.f437629m, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        zl2.q4 q4Var = zl2.q4.f555466a;
        if (q4Var.E() && ((java.lang.Number) ae2.in.f85221a.T().r()).intValue() == 1) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573219dx5, "Mb2.0:是");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            g4Var.g(o9Var.f437655z, pk2.o9.b(o9Var, string, "Mb2.0:是", 0, 4, null), com.p314xaae8f345.mm.R.raw.f80324xde515f42);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o9Var.f437611d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && ((java.lang.Number) ae2.in.f85221a.T().r()).intValue() == 1) {
            g4Var.g(o9Var.f437648v0, "推荐信息", com.p314xaae8f345.mm.R.raw.f79186x5ee95fb8);
        }
        r45.qw1 qw1Var = ((mm2.c1) o9Var.c(mm2.c1.class)).Q5;
        java.lang.String m75945x2fec8307 = qw1Var != null ? qw1Var.m75945x2fec8307(0) : null;
        boolean z17 = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "canShowInnerData:" + z17);
        if (z17) {
            g4Var.g(o9Var.f437652x0, "统计(内部)", com.p314xaae8f345.mm.R.raw.f80194x8f1a8525);
        }
        if (q4Var.E() && ((java.lang.Number) ae2.in.f85221a.T().r()).intValue() == 1) {
            g4Var.g(o9Var.f437650w0, "Debug(内部)", com.p314xaae8f345.mm.R.raw.f80324xde515f42);
            g4Var.g(o9Var.f437646u0, "礼物用例(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.f437644t0, "单礼物动画(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.f437640r0, "耗时(内部)", com.p314xaae8f345.mm.R.raw.f80329xebdaa825);
            g4Var.g(o9Var.f437642s0, "直播统计(内部)", com.p314xaae8f345.mm.R.raw.f80335x78a2a143);
            g4Var.g(o9Var.E0, "PK用例(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.H0, "播放异常(模拟)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.f437654y0, "评论热词(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.A0, "热评特效", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.C0, "礼物墙通知(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.D0, "礼物众筹", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.F0, "背包礼物气泡", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.G0, "礼物外露", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.K0, "层级输出", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.L0, "KWS唤醒(模拟)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.M0, "FlipCamera", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.N0, "Echo", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.O0, "福袋(自定义)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.P0, "福袋(自定义话术)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.Q0, "福袋(背包Same)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            g4Var.g(o9Var.R0, "福袋(背包Random)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
        }
    }
}
