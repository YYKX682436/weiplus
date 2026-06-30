package bk4;

/* loaded from: classes11.dex */
public final class v1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103127f;

    public v1(bk4.c2 c2Var, android.widget.TextView textView, java.lang.CharSequence charSequence) {
        this.f103125d = c2Var;
        this.f103126e = textView;
        this.f103127f = charSequence;
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 transition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        bk4.c2 c2Var = this.f103125d;
        c2Var.f(this);
        android.widget.TextView textView = this.f103126e;
        textView.getLayoutParams().height = -2;
        textView.setLayoutParams(textView.getLayoutParams());
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), c2Var.f102945c);
        textView.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f103127f));
        c2Var.getClass();
    }
}
