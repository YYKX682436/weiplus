package sr2;

/* loaded from: classes5.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f493122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493123e;

    public i4(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493122d = view;
        this.f493123e = c14609xb4d6eef6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("after add view  widgetView:");
        android.view.View view = this.f493122d;
        sb6.append(view.getWidth());
        sb6.append(" height:");
        sb6.append(view.getHeight());
        sb6.append("  mediaViewContainer:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493123e;
        android.view.ViewGroup viewGroup = c14609xb4d6eef6.f204047f;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
            throw null;
        }
        sb6.append(viewGroup.getWidth());
        sb6.append(" height:");
        android.view.ViewGroup viewGroup2 = c14609xb4d6eef6.f204047f;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
            throw null;
        }
        sb6.append(viewGroup2.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", sb6.toString());
        android.view.ViewGroup viewGroup3 = c14609xb4d6eef6.f204047f;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.view.ViewGroup viewGroup4 = c14609xb4d6eef6.f204047f;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
                throw null;
            }
            float dimension = viewGroup4.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", "topMargin:" + dimension + " originMargin:" + layoutParams2.topMargin);
            if (java.lang.Math.abs(layoutParams2.topMargin - dimension) <= 5.0f || ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
                return;
            }
            layoutParams2.topMargin = (int) dimension;
            android.view.ViewGroup viewGroup5 = c14609xb4d6eef6.f204047f;
            if (viewGroup5 != null) {
                viewGroup5.setLayoutParams(layoutParams2);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
                throw null;
            }
        }
    }
}
