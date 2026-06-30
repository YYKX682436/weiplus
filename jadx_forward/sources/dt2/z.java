package dt2;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.a0 f324747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f324748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f324749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 f324750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f324751h;

    public z(dt2.a0 a0Var, android.view.ViewGroup viewGroup, android.util.Size size, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var, boolean z17) {
        this.f324747d = a0Var;
        this.f324748e = viewGroup;
        this.f324749f = size;
        this.f324750g = e1Var;
        this.f324751h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        dt2.a0 a0Var = this.f324747d;
        a0Var.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
        android.view.ViewGroup viewGroup = this.f324748e;
        android.util.Size size = this.f324749f;
        jz5.l f17 = this.f324750g == e1Var ? zl2.q4.f555466a.f(android.widget.ImageView.ScaleType.FIT_CENTER.ordinal(), viewGroup.getWidth(), viewGroup.getHeight(), size.getWidth(), size.getHeight()) : zl2.q4.f555466a.f(android.widget.ImageView.ScaleType.CENTER_CROP.ordinal(), viewGroup.getWidth(), viewGroup.getHeight(), size.getWidth(), size.getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = a0Var.f324691a;
        if (f17 != null) {
            c14932xfc4acec9.O(((java.lang.Number) f17.f384366d).intValue(), ((java.lang.Number) f17.f384367e).intValue());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null && viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            c14932xfc4acec9.O(viewGroup.getWidth(), viewGroup.getHeight());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetViewSize:container:");
        sb6.append(viewGroup.hashCode());
        sb6.append(" mediaSize width = ");
        sb6.append(size.getWidth());
        sb6.append(", height = ");
        sb6.append(size.getHeight());
        sb6.append(", container width = ");
        sb6.append(viewGroup.getWidth());
        sb6.append(", height = ");
        sb6.append(viewGroup.getHeight());
        sb6.append(", params width = ");
        sb6.append(f17 != null ? (java.lang.Integer) f17.f384366d : null);
        sb6.append(", height = ");
        sb6.append(f17 != null ? (java.lang.Integer) f17.f384367e : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        a0Var.f324691a.mo56716x4121a19(true);
        a0Var.f324691a.mo56709x764d819b(false);
        a0Var.f324691a.setAlpha(1.0f);
        a0Var.f324691a.setVisibility(0);
        if (this.f324751h) {
            a0Var.f324691a.mo58789x348b34();
        }
    }
}
