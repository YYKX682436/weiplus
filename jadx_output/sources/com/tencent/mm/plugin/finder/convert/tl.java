package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class tl extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ap6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        so2.w2 item = (so2.w2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.eue);
        r45.a82 a82Var = item.f410691f;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            r45.xn1 xn1Var = (r45.xn1) a82Var.getCustom(0);
            java.lang.String nickname = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(holder.f293121e, nickname, textSize));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.eud);
        if (textView2 == null) {
            return;
        }
        r45.xn1 xn1Var2 = (r45.xn1) a82Var.getCustom(0);
        textView2.setText(java.lang.String.valueOf(xn1Var2 != null ? java.lang.Integer.valueOf(xn1Var2.getInteger(3)) : null));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
