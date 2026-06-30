package vt4;

/* loaded from: classes9.dex */
public abstract class c {
    public static void a(android.content.Context context, android.widget.TextView textView) {
        iz5.a.g(null, (context == null || textView == null) ? false : true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(context);
        b4Var.f261679d = new vt4.a(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(context);
        b4Var2.f261679d = new vt4.b(context);
        java.lang.String charSequence = context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.kwe).toString();
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        spannableString.setSpan(b4Var, 94, 115, 33);
        spannableString.setSpan(b4Var2, charSequence.length() - 3, charSequence.length(), 33);
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
