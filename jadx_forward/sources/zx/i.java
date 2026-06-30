package zx;

/* loaded from: classes14.dex */
public abstract class i {
    public static final void a(zx.u uVar, boolean z17, boolean z18, android.view.View view) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.vcj);
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10504xc4c0d607 c10504xc4c0d607 = (com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10504xc4c0d607) view.findViewById(com.p314xaae8f345.mm.R.id.usm);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.uvw);
        if (z17) {
            textView.setVisibility(0);
            ly.g.d(view, 16, android.graphics.Color.parseColor(com.p314xaae8f345.mm.ui.bk.C() ? "#172A20" : "#E6F9EF"));
        } else if (z18) {
            textView.setVisibility(8);
            ly.g.d(view, 16, android.graphics.Color.parseColor(com.p314xaae8f345.mm.ui.bk.C() ? "#10FFFFFF" : "#10000000"));
        } else {
            textView.setVisibility(8);
            view.setBackgroundColor(e1.a0.h(e1.y.f327852j));
        }
        boolean z19 = uVar.f558502a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar = uVar.f558505d;
        if (z19) {
            textView2.setVisibility(8);
            c10504xc4c0d607.setVisibility(0);
            java.lang.String str = lVar.f297882o[4] ? lVar.f297877g : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getQuery(...)");
            java.lang.String leadingText = uVar.f558503b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leadingText, "leadingText");
            c10504xc4c0d607.f146856h = str;
            android.view.View view2 = c10504xc4c0d607.f146852d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) view2).setText(leadingText);
            c10504xc4c0d607.requestLayout();
            c10504xc4c0d607.m44124x97feeeb3(6.0f);
            c10504xc4c0d607.m44123x5304fac0(4.0f);
            return;
        }
        c10504xc4c0d607.setVisibility(8);
        textView2.setVisibility(0);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) (lVar.f297882o[2] ? lVar.f297875e : ""));
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        boolean[] zArr = lVar.f297882o;
        append.setSpan(foregroundColorSpan, 0, (zArr[2] ? lVar.f297875e : "").length(), 33);
        if (lVar.f297879i) {
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            spannableStringBuilder.append((java.lang.CharSequence) string).setSpan(new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            android.content.Context context2 = textView2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) android.util.TypedValue.applyDimension(2, 12.0f, context2.getResources().getDisplayMetrics())), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("：");
        sb6.append(zArr[4] ? lVar.f297877g : "");
        spannableStringBuilder.append((java.lang.CharSequence) sb6.toString());
        textView2.setText(spannableStringBuilder);
    }
}
