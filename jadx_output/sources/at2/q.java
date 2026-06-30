package at2;

/* loaded from: classes3.dex */
public final class q extends com.tencent.mm.plugin.finder.live.plugin.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f13734p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.se f13735q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f13736r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13734p = "ReplayExceptionLazyPlugin";
    }

    @Override // qo0.a
    public boolean B0() {
        android.view.ViewGroup viewGroup = this.f13736r;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            return false;
        }
        R0().finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public boolean H0() {
        android.view.ViewGroup viewGroup = this.f13736r;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            return false;
        }
        R0().finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str) {
        if (this.f13735q == null) {
            android.view.ViewGroup viewGroup = this.f365323d;
            viewGroup.removeAllViews();
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488885aq5, viewGroup, true);
            inflate.setOnClickListener(at2.l.f13700d);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.fg8);
            if (viewGroup2 != null) {
                this.f13736r = viewGroup2;
                viewGroup2.setBackgroundColor(viewGroup2.getContext().getResources().getColor(com.tencent.mm.R.color.f478514w, null));
                this.f13735q = new com.tencent.mm.plugin.finder.live.widget.se(viewGroup2, str, ((mm2.c1) S0().a(mm2.c1.class)).t7(), null, 8, null);
            }
        }
    }
}
