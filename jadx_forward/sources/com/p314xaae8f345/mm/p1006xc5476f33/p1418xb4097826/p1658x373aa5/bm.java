package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class bm extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dm f213261g;

    public bm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dm dmVar) {
        this.f213261g = dmVar;
    }

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_4, parent, false);
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
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lih);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.agk);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(holder.f374654e.getResources().getDisplayMetrics().widthPixels, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dm dmVar = this.f213261g;
        imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, dmVar.f213437p.getHeight() < 0 ? -1 : dmVar.f213437p.getHeight()));
        imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zl(mb4Var, imageView));
        imageView2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.am(mb4Var, imageView2));
    }
}
