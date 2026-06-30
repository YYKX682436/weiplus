package bk4;

/* loaded from: classes9.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(bk4.c2 c2Var) {
        super(3);
        this.f21404d = c2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String text = (java.lang.String) obj;
        java.lang.CharSequence suffix = (java.lang.CharSequence) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(text);
        bk4.c2 c2Var = this.f21404d;
        for (bk4.n1 n1Var : (java.util.List) ((jz5.n) c2Var.f21433x).getValue()) {
            int i17 = n1Var.f21516a + intValue;
            int i18 = n1Var.f21517b + intValue;
            android.view.View.OnClickListener onClickListener = n1Var.f21519d;
            if (onClickListener != null) {
                spannableStringBuilder.setSpan(new bk4.z1(n1Var, c2Var, onClickListener), i17, i18, 33);
                c2Var.f21410a.setMovementMethod(c2Var.f21430u);
            }
        }
        return spannableStringBuilder;
    }
}
