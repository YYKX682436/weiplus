package hg2;

/* loaded from: classes3.dex */
public final class h extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f362885m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f362886n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f362887o;

    /* renamed from: p, reason: collision with root package name */
    public int f362888p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f362889q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f362890r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f362891s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f362885m = "FlashSaleBubbleController";
        this.f362889q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("FlashSaleBubble::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new hg2.g(this), true);
    }

    public final void Z6() {
        dk2.vf vfVar = ((mm2.f6) m56788xbba4bfc0(mm2.f6.class)).X;
        if (vfVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new hg2.c(this, vfVar, null), 3, null);
        }
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
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.exy);
        android.view.ViewGroup viewGroup = S6 instanceof android.view.ViewGroup ? (android.view.ViewGroup) S6 : null;
        this.f362886n = viewGroup;
        this.f362887o = viewGroup != null ? (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566545g85) : null;
        android.view.ViewGroup viewGroup2 = this.f362886n;
        this.f362891s = viewGroup2 != null ? viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f566543g83) : null;
        android.view.ViewGroup viewGroup3 = this.f362886n;
        this.f362890r = viewGroup3 != null ? (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.cjn) : null;
        android.view.View view = this.f362891s;
        if (view != null) {
            view.setOnClickListener(new hg2.a(this));
        }
        android.view.ViewGroup viewGroup4 = this.f362886n;
        boolean z17 = false;
        if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        Z6();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f362889q.d();
        this.f362886n = null;
        this.f362887o = null;
        this.f362891s = null;
        this.f362890r = null;
    }
}
