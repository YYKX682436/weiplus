package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ms extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b6a;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        js2.a item = (js2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e_9);
        if (textView != null) {
            textView.setText(item.f383038e);
        }
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ks(item));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        dy1.a.i(textView, "profile_more");
        dy1.a.a(textView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ls(holder, item));
        dy1.a.l(textView, 40, 25496);
    }
}
