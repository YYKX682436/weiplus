package uf5;

/* loaded from: classes3.dex */
public final class u1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f508838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f508839e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f508840f;

    public u1(java.util.List selectedForBatch, int i17, yz5.p onLongClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedForBatch, "selectedForBatch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onLongClick, "onLongClick");
        this.f508838d = selectedForBatch;
        this.f508839e = i17;
        this.f508840f = onLongClick;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return java.lang.Math.min(this.f508838d.size(), this.f508839e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        uf5.s1 holder = (uf5.s1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f508838d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(holder.f508830d, (java.lang.String) list.get(java.lang.Math.max(0, list.size() - this.f508839e) + i17), null);
        holder.f3639x46306858.setOnLongClickListener(new uf5.t1(this, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        int dimensionPixelSize = parent.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        int dimensionPixelSize2 = parent.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMarginStart(dimensionPixelSize2);
        imageView.setLayoutParams(layoutParams);
        return new uf5.s1(imageView);
    }
}
