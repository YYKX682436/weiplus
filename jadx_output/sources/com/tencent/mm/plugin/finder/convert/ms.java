package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ms extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b6a;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        js2.a item = (js2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e_9);
        if (textView != null) {
            textView.setText(item.f301505e);
        }
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ks(item));
        }
        kotlin.jvm.internal.o.d(textView);
        dy1.a.i(textView, "profile_more");
        dy1.a.a(textView, new com.tencent.mm.plugin.finder.convert.ls(holder, item));
        dy1.a.l(textView, 40, 25496);
    }
}
