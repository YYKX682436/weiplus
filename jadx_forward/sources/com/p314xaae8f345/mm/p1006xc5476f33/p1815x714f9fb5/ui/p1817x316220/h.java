package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes10.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 f226355e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2) {
        this.f226355e = c16293xe2a3baf2;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a3f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.i indoorLevelItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.i) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indoorLevelItem, "indoorLevelItem");
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) view;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1 c4403x18de38d1 = indoorLevelItem.f226361d;
        button.setText(c4403x18de38d1.m37182xfb82e301());
        com.p314xaae8f345.mm.ui.bk.r0(button.getPaint(), 0.8f);
        if (c4403x18de38d1.m37182xfb82e301().equals(this.f226355e.f226231o2)) {
            button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562870qu);
            button.setTextColor(button.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
        } else {
            button.setBackground(null);
            button.setTextColor(button.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
