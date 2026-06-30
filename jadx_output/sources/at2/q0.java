package at2;

/* loaded from: classes3.dex */
public final class q0 extends com.tencent.mm.plugin.finder.live.plugin.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        root.setOnClickListener(new at2.c0(this, root));
        zl2.r4.f473950a.d(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }
}
