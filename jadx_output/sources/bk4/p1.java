package bk4;

/* loaded from: classes11.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.Transition f21531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f21536i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.transition.Transition transition, yz5.l lVar, android.widget.TextView textView, java.lang.CharSequence charSequence, bk4.c2 c2Var, android.view.ViewGroup viewGroup) {
        super(1);
        this.f21531d = transition;
        this.f21532e = lVar;
        this.f21533f = textView;
        this.f21534g = charSequence;
        this.f21535h = c2Var;
        this.f21536i = viewGroup;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.CharSequence result = (java.lang.CharSequence) obj;
        kotlin.jvm.internal.o.g(result, "result");
        androidx.transition.Transition transition = this.f21531d;
        if (transition == null) {
            yz5.l lVar = this.f21532e;
            if (lVar != null) {
                lVar.invoke(result);
            }
        } else {
            android.widget.TextView textView = this.f21533f;
            java.lang.CharSequence text = textView.getText();
            int height = textView.getLayout().getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f21534g));
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            bk4.o1 o1Var = new bk4.o1(this.f21535h, this.f21533f, text, this.f21532e, result);
            transition.a(o1Var);
            ((java.util.LinkedList) this.f21535h.f21411b).add(o1Var);
            u4.g1.a(this.f21536i, transition);
        }
        return jz5.f0.f302826a;
    }
}
