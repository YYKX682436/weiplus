package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes11.dex */
public final class m extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.u f254775e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.u onItemClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        this.f254775e = onItemClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cz8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.d item = (lj4.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.onk)).setText(item.f400514d);
        bk4.f.V(bk4.i.a(), (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hap), item.f400515e, null, null, null, false, false, 124, null);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.l(item, this));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
