package pg2;

/* loaded from: classes3.dex */
public final class u implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewGroup f435719a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f435720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f435722d;

    public u(android.view.View view, long j17) {
        this.f435721c = view;
        this.f435722d = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.view.View view2 = this.f435721c;
        if (view2 != null) {
            view2.setTag(com.p314xaae8f345.mm.R.id.tin, java.lang.Boolean.FALSE);
        }
        android.view.ViewGroup viewGroup = this.f435719a;
        if (viewGroup != null) {
            viewGroup.removeView(this.f435720b);
        }
        android.view.ViewParent parent2 = view2.getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view2);
        }
        android.view.ViewGroup viewGroup3 = this.f435719a;
        if (viewGroup3 != null) {
            viewGroup3.addView(view2);
        }
        ig2.m mVar = ig2.m.f372926a;
        long j17 = this.f435722d;
        ig2.r f17 = mVar.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachPerformView feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(f17);
        sb6.append(" isDetach: ");
        sb6.append(f17 != null ? java.lang.Boolean.valueOf(f17.i()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        boolean z17 = false;
        if (f17 != null && !f17.i()) {
            z17 = true;
        }
        if (z17) {
            f17.h();
        }
        super.a(context, view, parent, performer);
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.view.View view = this.f435721c;
        android.view.ViewParent parent2 = view.getParent();
        android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup != null) {
            if (view != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.tin, java.lang.Boolean.TRUE);
            }
            this.f435719a = viewGroup;
            viewGroup.removeView(view);
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(ug5.x.b(view));
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            this.f435720b = imageView;
            viewGroup.addView(imageView, -1, -1);
            viewGroup.setVisibility(0);
        }
        return view;
    }
}
