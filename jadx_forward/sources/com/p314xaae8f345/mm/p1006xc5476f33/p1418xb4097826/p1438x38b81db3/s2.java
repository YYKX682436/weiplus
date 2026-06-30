package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes15.dex */
public class s2 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.age;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, so2.m0 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.omi);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.omh);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.q1i);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.sak);
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hob);
        bw5.ra raVar = item.f492011d;
        textView.setText(raVar.f113991f);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(raVar.E)};
        android.content.Context context = holder.f374654e;
        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.def, objArr));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        long j17 = raVar.S.f471695d;
        ((b92.d1) zbVar).getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        textView4.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dee, zl2.r4.S(r4Var, j17, 0, 2, null)));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        long j18 = raVar.S.f471696e;
        ((b92.d1) zbVar2).getClass();
        textView5.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dee, zl2.r4.S(r4Var, j18, 0, 2, null)));
        if (textView3 != null) {
            int i19 = raVar.f113993h;
            if ((i19 & 4) == 4 || (i19 & 8) == 8) {
                textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571537i6);
                return;
            }
            if (!((raVar.f113994i & 512) == 512)) {
                textView3.setText("");
                return;
            }
            android.content.Context context2 = textView3.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            java.lang.String format = java.lang.String.format("[wecoin]%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(raVar.f114003u)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(format.concat(""));
            int L = r26.n0.L(spannableString, "[wecoin]", 0, false, 6, null);
            int intrinsicWidth = context2.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81416xc219f617).getIntrinsicWidth();
            int h17 = i65.a.h(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            android.graphics.drawable.Drawable e17 = m95.a.e(context2.getResources(), com.p314xaae8f345.mm.R.raw.f81416xc219f617, (h17 * 1.0f) / intrinsicWidth);
            e17.setColorFilter(new android.graphics.PorterDuffColorFilter(context2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq), android.graphics.PorterDuff.Mode.SRC_ATOP));
            e17.setBounds(0, 0, h17, h17);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r2(e17), L, L + 8, 17);
            textView3.setText(spannableString);
        }
    }
}
