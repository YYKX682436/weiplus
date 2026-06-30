package at2;

/* loaded from: classes3.dex */
public final class v extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f13764p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f13765q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f13766r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13764p = jz5.h.b(new at2.s(root));
        this.f13765q = jz5.h.b(new at2.r(root));
        this.f13766r = jz5.h.b(new at2.t(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1(java.lang.String anchorUsername) {
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        ya2.b2 b17 = ya2.h.f460484a.b(anchorUsername);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f13764p).getValue();
        android.content.res.Resources resources = this.f365323d.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = b17 != null ? b17.z0() : "";
        textView.setText(resources.getString(com.tencent.mm.R.string.ekv, objArr));
    }
}
