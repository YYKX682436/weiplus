package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ss extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.edt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.a item = (zb2.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ujm);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ujo);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ujk);
        r45.qj2 qj2Var = item.f552788d;
        mn2.q3 q3Var = new mn2.q3(qj2Var.m75945x2fec8307(6), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.B));
        textView.setText(qj2Var.m75945x2fec8307(1));
        textView2.setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgw, java.lang.String.valueOf(qj2Var.m75939xb282bd08(3))));
        java.util.Map k17 = kz5.c1.k(new jz5.l("native_drama_id", pm0.v.u(qj2Var.m75942xfb822ef2(0))), new jz5.l("profile_tabid", 1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rs rsVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rs(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        hc2.v0.e(itemView, "native_drama_card", 0, 0, false, false, k17, rsVar, 30, null);
    }
}
