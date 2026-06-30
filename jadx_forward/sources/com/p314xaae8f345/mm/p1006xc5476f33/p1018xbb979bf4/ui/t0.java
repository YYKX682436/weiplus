package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public final class t0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156159e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var) {
        this.f156159e = l1Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cji;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.u0 addressItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.u0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addressItem, "addressItem");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f564262m9)).setText(addressItem.f156162d.f155904d);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.nh8)).setVisibility(this.f156159e.D.contains(addressItem.f156162d) ? 0 : 4);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
