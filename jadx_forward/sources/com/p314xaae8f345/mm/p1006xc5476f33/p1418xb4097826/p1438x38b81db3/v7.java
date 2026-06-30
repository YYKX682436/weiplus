package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class v7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f186304e;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f186304e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        so2.b1 item = (so2.b1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tcm);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tcl);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tcj);
        r45.ns2 ns2Var = item.F;
        int i19 = 0;
        java.lang.String m75945x2fec8307 = ns2Var.m75945x2fec8307(0);
        java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        if (str2.length() > 16) {
            str = str2.substring(0, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        } else {
            str = str2;
        }
        textView.setText(str);
        java.lang.String m75945x2fec83072 = ns2Var.m75945x2fec8307(1);
        textView2.setText(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        android.content.Context context = holder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = item.E;
        long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
        int m76758x8ed22866 = c14994x9b99c079.getFeedObject().m76758x8ed22866();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n;
        }
        int i27 = i19;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dy1.a.i(itemView, "comment_area_start_live_banner");
        android.view.View itemView2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        dy1.a.e(itemView2, 32, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t7(m59251x5db1b11, m76758x8ed22866, i27));
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u7(str2, m59251x5db1b11, m76758x8ed22866, i27));
    }
}
