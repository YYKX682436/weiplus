package pr3;

/* loaded from: classes.dex */
public final class i extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3j;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        pr3.a item = (pr3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.u6d);
        linearLayout.setVisibility(8);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(item.f439484e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.cd6)).setVisibility(8);
        linearLayout.setVisibility(0);
    }
}
