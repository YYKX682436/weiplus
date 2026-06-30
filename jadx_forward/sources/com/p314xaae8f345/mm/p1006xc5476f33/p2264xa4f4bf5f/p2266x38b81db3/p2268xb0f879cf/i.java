package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes11.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.s f254767e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.t f254768f;

    /* renamed from: g, reason: collision with root package name */
    public final long f254769g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f254770h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f254771i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f254772m;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.s onCustomStatusConfirm, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.t onCustomStatusItemClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCustomStatusConfirm, "onCustomStatusConfirm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCustomStatusItemClickListener, "onCustomStatusItemClickListener");
        this.f254767e = onCustomStatusConfirm;
        this.f254768f = onCustomStatusItemClickListener;
        this.f254769g = 300L;
        this.f254770h = new android.view.animation.AccelerateInterpolator();
        this.f254772m = "userdefine";
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571095cz4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.a item = (lj4.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f254771i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) holder.p(com.p314xaae8f345.mm.R.id.dhq);
        ((android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.cpc)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.e(this, holder));
        holder.p(com.p314xaae8f345.mm.R.id.ool).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.f(this));
        holder.p(com.p314xaae8f345.mm.R.id.ole).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.g(this));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.r7) this.f254768f).a("ACTION_ENTER");
    }
}
