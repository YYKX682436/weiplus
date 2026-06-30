package bk4;

/* loaded from: classes9.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f102937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(bk4.c2 c2Var) {
        super(3);
        this.f102937d = c2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String text = (java.lang.String) obj;
        java.lang.CharSequence suffix = (java.lang.CharSequence) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(text);
        bk4.c2 c2Var = this.f102937d;
        for (bk4.n1 n1Var : (java.util.List) ((jz5.n) c2Var.f102966x).mo141623x754a37bb()) {
            int i17 = n1Var.f103049a + intValue;
            int i18 = n1Var.f103050b + intValue;
            android.view.View.OnClickListener onClickListener = n1Var.f103052d;
            if (onClickListener != null) {
                spannableStringBuilder.setSpan(new bk4.z1(n1Var, c2Var, onClickListener), i17, i18, 33);
                c2Var.f102943a.setMovementMethod(c2Var.f102963u);
            }
        }
        return spannableStringBuilder;
    }
}
