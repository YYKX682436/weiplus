package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ss extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.edt;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.a item = (zb2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ujm);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ujo);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ujk);
        r45.qj2 qj2Var = item.f471255d;
        mn2.q3 q3Var = new mn2.q3(qj2Var.getString(6), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.B));
        textView.setText(qj2Var.getString(1));
        textView2.setText(holder.f293121e.getString(com.tencent.mm.R.string.mgw, java.lang.String.valueOf(qj2Var.getInteger(3))));
        java.util.Map k17 = kz5.c1.k(new jz5.l("native_drama_id", pm0.v.u(qj2Var.getLong(0))), new jz5.l("profile_tabid", 1));
        com.tencent.mm.plugin.finder.convert.rs rsVar = new com.tencent.mm.plugin.finder.convert.rs(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        hc2.v0.e(itemView, "native_drama_card", 0, 0, false, false, k17, rsVar, 30, null);
    }
}
