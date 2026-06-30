package at2;

/* loaded from: classes3.dex */
public final class b0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f13636p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f13637q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f13638r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13636p = "ReplayMiniViewPlugin";
        root.setOnClickListener(new at2.w(this));
        zl2.r4.f473950a.d(this);
        this.f13637q = jz5.h.b(new at2.z(this));
        this.f13638r = jz5.h.b(new at2.a0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void L0() {
        com.tencent.mars.xlog.Log.i(this.f13636p, "start");
        R0().removeCallbacks((at2.x) ((jz5.n) this.f13638r).getValue());
    }

    @Override // qo0.a
    public void N0() {
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i(this.f13636p, "stop, permission:" + Ui + ", manualMinimum:" + ((ct2.j) S0().a(ct2.j.class)).f222279w);
        if (Ui || !((ct2.j) S0().a(ct2.j.class)).f222279w) {
            return;
        }
        R0().postDelayed((at2.x) ((jz5.n) this.f13638r).getValue(), 20000L);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        dt2.d0 uiClickListener;
        ((ct2.j) S0().a(ct2.j.class)).Y6(true);
        com.tencent.mm.plugin.finder.live.view.k0 R0 = R0();
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) R0 : null;
        if (finderLiveReplayPluginLayout == null || (uiClickListener = finderLiveReplayPluginLayout.getUiClickListener()) == null) {
            return;
        }
        uiClickListener.b();
    }
}
