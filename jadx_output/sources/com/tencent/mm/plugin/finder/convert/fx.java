package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class fx extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.eep;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.o6 item = (so2.o6) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tvq);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tvr);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        so2.n6 n6Var = item.f410534d;
        textView.setText(n6Var.f410501a);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        int i19 = n6Var.f410508h;
        int i27 = 0;
        while (i19 > 0) {
            i19 /= 10;
            i27++;
        }
        java.lang.String str = n6Var.f410502b;
        if (i27 > 0 && str.length() >= i27) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int color = b3.l.getColor(context, com.tencent.mm.R.color.f478502m);
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), 0, i27, 33);
            str = spannableString;
        }
        textView2.setText(str);
    }
}
