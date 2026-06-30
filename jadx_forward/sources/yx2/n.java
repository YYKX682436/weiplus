package yx2;

/* loaded from: classes2.dex */
public final class n extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 f549400g;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15433xbefc23a9 c15433xbefc23a9) {
        this.f549400g = c15433xbefc23a9;
    }

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cr8, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // eb5.d, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        eb5.e holder = (eb5.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo864xe5e2e48d(holder, i17);
        r45.mb4 mb4Var = (r45.mb4) x(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lii);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.agl);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(holder.f374654e.getResources().getDisplayMetrics().widthPixels, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        imageView.post(new yx2.l(mb4Var, imageView));
        imageView2.post(new yx2.m(mb4Var, imageView2, this.f549400g));
    }
}
