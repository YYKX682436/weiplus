package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class cm extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 f210535e;

    public cm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f210535e = fragment;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        lb2.j item = (lb2.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.List k17 = item.k();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hq9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setText(item.f399282d);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.owk);
        if (item instanceof nb2.a) {
            int i19 = item.f399283e;
            str = i19 == 1 ? "TRUE" : i19 == 0 ? "FALSE" : item.p();
        } else {
            if (!(item instanceof lb2.k)) {
                int i27 = item.f399283e;
                if (i27 < 0) {
                    str = item.p();
                } else if (i27 >= 0) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) k17;
                    if (i27 < linkedList.size()) {
                        str = (java.lang.String) linkedList.get(item.f399283e);
                    }
                }
            }
            str = "";
        }
        textView2.setText(str);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wl(holder, this));
        holder.f3639x46306858.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.yl(holder, this));
    }
}
