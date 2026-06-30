package ze5;

/* loaded from: classes5.dex */
public final class z7 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f553882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.u2 f553883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f553884g;

    public z7(android.view.View view, long j17, sb5.u2 u2Var, af5.d1 d1Var) {
        this.f553881d = view;
        this.f553882e = j17;
        this.f553883f = u2Var;
        this.f553884g = d1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f553881d.removeOnAttachStateChangeListener(this);
        long j17 = this.f553882e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] doOnDetach: unregister callbacks, msgSvrId=%d", java.lang.Long.valueOf(j17));
        sb5.u2 u2Var = this.f553883f;
        if (u2Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp) u2Var).v0(j17);
        }
        if (u2Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp) u2Var).w0(j17);
        }
        this.f553884g.setTag(com.p314xaae8f345.mm.R.id.vp8, null);
    }
}
