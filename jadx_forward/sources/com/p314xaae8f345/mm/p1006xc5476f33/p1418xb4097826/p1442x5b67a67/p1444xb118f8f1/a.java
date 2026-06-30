package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c f186730e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c cVar) {
        this.f186730e = cVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e6o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.b item = (zb2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t8d);
        r45.oj2 oj2Var = item.f552791d;
        r45.bn2 bn2Var = (r45.bn2) oj2Var.m75936x14adae67(1);
        java.lang.Integer valueOf = bn2Var != null ? java.lang.Integer.valueOf(bn2Var.m75939xb282bd08(2)) : null;
        if (textView != null) {
            r45.bn2 bn2Var2 = (r45.bn2) oj2Var.m75936x14adae67(1);
            textView.setText(bn2Var2 != null ? java.lang.Integer.valueOf(bn2Var2.m75939xb282bd08(2)).toString() : null);
        }
        boolean z18 = valueOf != null && valueOf.intValue() == this.f186730e.f186736f;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        android.content.Context context = holder.f374654e;
        if (z18) {
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563445d62);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560077ae));
        } else {
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563399cp3);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        }
    }
}
