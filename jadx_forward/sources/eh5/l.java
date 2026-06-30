package eh5;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b f334498e;

    public l(android.view.View view, com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b abstractC22433x7fa3716b) {
        this.f334497d = view;
        this.f334498e = abstractC22433x7fa3716b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f334497d.removeOnAttachStateChangeListener(this);
        com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b abstractC22433x7fa3716b = this.f334498e;
        abstractC22433x7fa3716b.setVisibility(abstractC22433x7fa3716b.mo79669xd98e7f7d());
        abstractC22433x7fa3716b.f290477d = abstractC22433x7fa3716b.a();
        android.view.View view2 = abstractC22433x7fa3716b.f290477d;
        if (view2 != null) {
            abstractC22433x7fa3716b.addView(view2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
