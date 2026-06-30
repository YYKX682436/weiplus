package pk2;

/* loaded from: classes3.dex */
public final class u9 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437824h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437825i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437824h = helper.f437650w0;
        this.f437825i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
    }

    public final boolean D() {
        return zl2.q4.f555466a.E() && ((java.lang.Number) ae2.in.f85221a.T().r()).intValue() == 1;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437825i;
    }

    @Override // qk2.f
    public boolean o() {
        return D();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (D()) {
            s(menu, o9Var.f437650w0, "Debug(内部)", com.p314xaae8f345.mm.R.raw.f80324xde515f42);
            s(menu, o9Var.f437646u0, "礼物用例(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.f437644t0, "单礼物动画(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.f437640r0, "耗时(内部)", com.p314xaae8f345.mm.R.raw.f80329xebdaa825);
            s(menu, o9Var.f437642s0, "直播统计(内部)", com.p314xaae8f345.mm.R.raw.f80335x78a2a143);
            s(menu, o9Var.E0, "PK用例(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.H0, "播放异常(模拟)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.f437654y0, "评论热词(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.A0, "热评特效", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.C0, "礼物墙通知(内部)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.D0, "礼物众筹", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.F0, "背包礼物气泡", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.G0, "礼物外露", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.K0, "Hierarchy", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.L0, "KWS唤醒(模拟)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.M0, "Mock FlipCamera", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.N0, "Mock Echo", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.O0, "福袋(自定义)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.P0, "福袋(自定义话术)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.Q0, "福袋(背包Same)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
            s(menu, o9Var.R0, "福袋(背包Random)", com.p314xaae8f345.mm.R.raw.f80338xfee9d9da);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437824h;
    }
}
