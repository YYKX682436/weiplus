package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class pq extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570569b40;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.d4 item = (so2.d4) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        int i19 = I1 != null ? I1.f68721x6e5f342 : 0;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jue);
        if (i19 > 0) {
            textView.setVisibility(0);
            textView.setText(i19 > 999 ? "999+" : java.lang.String.valueOf(i19));
        } else {
            textView.setVisibility(8);
        }
        holder.f3639x46306858.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oq(textView));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
