package bk4;

/* loaded from: classes11.dex */
public final class v1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21594f;

    public v1(bk4.c2 c2Var, android.widget.TextView textView, java.lang.CharSequence charSequence) {
        this.f21592d = c2Var;
        this.f21593e = textView;
        this.f21594f = charSequence;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        bk4.c2 c2Var = this.f21592d;
        c2Var.f(this);
        android.widget.TextView textView = this.f21593e;
        textView.getLayoutParams().height = -2;
        textView.setLayoutParams(textView.getLayoutParams());
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), c2Var.f21412c);
        textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f21594f));
        c2Var.getClass();
    }
}
