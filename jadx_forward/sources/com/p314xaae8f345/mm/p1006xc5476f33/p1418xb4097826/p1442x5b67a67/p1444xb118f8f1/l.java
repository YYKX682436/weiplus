package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class l extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186790e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var) {
        this.f186790e = e0Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570612ee0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.c item = (zb2.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uwg);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.pj2 pj2Var = item.f552792d;
        r45.ft4 ft4Var = (r45.ft4) pj2Var.m75936x14adae67(0);
        sb6.append(ft4Var != null ? ft4Var.m75939xb282bd08(0) : 0);
        sb6.append('-');
        r45.ft4 ft4Var2 = (r45.ft4) pj2Var.m75936x14adae67(0);
        sb6.append(ft4Var2 != null ? ft4Var2.m75939xb282bd08(1) : 0);
        textView.setText(sb6.toString());
        if (this.f186790e.f186767x == i17) {
            textView.setAlpha(1.0f);
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        } else {
            textView.setAlpha(0.55f);
            com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
        }
    }
}
