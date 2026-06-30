package l02;

@j95.b
/* loaded from: classes8.dex */
public class k extends i95.w implements m02.r {
    public void wi(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnCancelListener onCancelListener, long j17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.gow);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gou);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        if (j17 > 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a49, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czx)).setText(string);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czw);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bqg));
            int length = sb6.length();
            float f17 = (float) j17;
            float f18 = f17 / 1.0737418E9f;
            java.lang.String format = f18 >= 1.0f ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(f18)) : java.lang.String.format("%.1fMB", java.lang.Float.valueOf(f17 / 1048576.0f));
            sb6.append(format);
            android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su)), length, format.length() + length, 18);
            textView.setText(spannableString);
            aVar.L = inflate;
        } else {
            aVar.f293262s = string;
        }
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.gox);
        aVar.E = new l02.a(this, onClickListener, c19762x487075a, str);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571889so);
        aVar.F = new l02.c(this, onClickListener2, c19762x487075a, str);
        aVar.A = true;
        aVar.G = new l02.d(this, onCancelListener);
        i0Var.h();
        o02.a.b(15, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de, 1, 1, str, "", "");
    }
}
