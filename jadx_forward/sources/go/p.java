package go;

/* loaded from: classes.dex */
public final class p implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map values, java.lang.String head, android.os.Bundle params, java.lang.ref.WeakReference ui6, java.lang.ref.WeakReference holdTextView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(head, "head");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holdTextView, "holdTextView");
        java.lang.String str = (java.lang.String) values.get(head.concat(".title"));
        java.lang.String str2 = (java.lang.String) values.get(head.concat(".talker"));
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (!(str == null || r26.n0.N(str))) {
            go.o oVar = new go.o(ui6, str2);
            oVar.m75740x3ab833d4(true);
            spannableString.setSpan(oVar, 0, str.length(), 17);
        }
        return spannableString;
    }
}
