package ys2;

/* loaded from: classes3.dex */
public final class h extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f546692m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f546693n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f546694o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f546695p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.AnimatorSet f546696q;

    /* renamed from: r, reason: collision with root package name */
    public final ys2.f f546697r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f546698s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f546692m = "ReplayLongPressSpeedPlugin";
        this.f546697r = new ys2.f(new java.lang.ref.WeakReference(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.ipu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        this.f546693n = new if2.d0(viewGroup, this);
        this.f546694o = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.kwo);
        this.f546695p = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.kwp);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.class);
        if (x80Var != null) {
            x80Var.x1(this.f546697r);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        if2.d0 d0Var = this.f546693n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f546694o = null;
        this.f546695p = null;
        this.f546698s = false;
    }
}
