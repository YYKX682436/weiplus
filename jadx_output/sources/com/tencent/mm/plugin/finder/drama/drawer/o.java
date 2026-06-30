package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ecu;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.d item = (zb2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484129t52);
        textView.setText(item.f471262f);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
    }
}
