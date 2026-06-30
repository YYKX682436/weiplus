package at2;

/* loaded from: classes3.dex */
public final class k extends com.tencent.mm.plugin.finder.live.plugin.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        root.setOnClickListener(new at2.j(this, root));
        zl2.r4 r4Var = zl2.r4.f473950a;
        r4Var.e(this, false);
        r4Var.d(this);
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
