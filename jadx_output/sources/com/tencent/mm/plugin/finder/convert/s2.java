package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes15.dex */
public class s2 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.age;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, so2.m0 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.omi);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.omh);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.q1i);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.sak);
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hob);
        bw5.ra raVar = item.f410478d;
        textView.setText(raVar.f32458f);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(raVar.E)};
        android.content.Context context = holder.f293121e;
        textView2.setText(context.getString(com.tencent.mm.R.string.def, objArr));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        long j17 = raVar.S.f390162d;
        ((b92.d1) zbVar).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        textView4.setText(context.getString(com.tencent.mm.R.string.dee, zl2.r4.S(r4Var, j17, 0, 2, null)));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        long j18 = raVar.S.f390163e;
        ((b92.d1) zbVar2).getClass();
        textView5.setText(context.getString(com.tencent.mm.R.string.dee, zl2.r4.S(r4Var, j18, 0, 2, null)));
        if (textView3 != null) {
            int i19 = raVar.f32460h;
            if ((i19 & 4) == 4 || (i19 & 8) == 8) {
                textView3.setText(com.tencent.mm.R.string.f490004i6);
                return;
            }
            if (!((raVar.f32461i & 512) == 512)) {
                textView3.setText("");
                return;
            }
            android.content.Context context2 = textView3.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.String format = java.lang.String.format("[wecoin]%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(raVar.f32470u)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(format.concat(""));
            int L = r26.n0.L(spannableString, "[wecoin]", 0, false, 6, null);
            int intrinsicWidth = context2.getResources().getDrawable(com.tencent.mm.R.raw.wecoin_balance_icons).getIntrinsicWidth();
            int h17 = i65.a.h(context2, com.tencent.mm.R.dimen.f479688cn);
            android.graphics.drawable.Drawable e17 = m95.a.e(context2.getResources(), com.tencent.mm.R.raw.wecoin_balance_icons, (h17 * 1.0f) / intrinsicWidth);
            e17.setColorFilter(new android.graphics.PorterDuffColorFilter(context2.getColor(com.tencent.mm.R.color.aaq), android.graphics.PorterDuff.Mode.SRC_ATOP));
            e17.setBounds(0, 0, h17, h17);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.convert.r2(e17), L, L + 8, 17);
            textView3.setText(spannableString);
        }
    }
}
