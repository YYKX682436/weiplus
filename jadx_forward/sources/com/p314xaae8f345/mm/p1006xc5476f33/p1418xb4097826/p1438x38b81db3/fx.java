package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class fx extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eep;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.o6 item = (so2.o6) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tvq);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tvr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        so2.n6 n6Var = item.f492067d;
        textView.setText(n6Var.f492034a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        int i19 = n6Var.f492041h;
        int i27 = 0;
        while (i19 > 0) {
            i19 /= 10;
            i27++;
        }
        java.lang.String str = n6Var.f492035b;
        if (i27 > 0 && str.length() >= i27) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int m9702x7444d5ad = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(m9702x7444d5ad), 0, i27, 33);
            str = spannableString;
        }
        textView2.setText(str);
    }
}
