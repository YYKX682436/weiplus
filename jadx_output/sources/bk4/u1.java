package bk4;

/* loaded from: classes11.dex */
public final class u1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21588e;

    public u1(bk4.c2 c2Var, android.widget.TextView textView) {
        this.f21587d = c2Var;
        this.f21588e = textView;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        bk4.c2 c2Var = this.f21587d;
        c2Var.f(this);
        android.widget.TextView textView = this.f21588e;
        textView.getLayoutParams().height = -2;
        textView.setLayoutParams(textView.getLayoutParams());
        textView.setMaxLines(c2Var.f21425p);
        c2Var.f21410a.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), c2Var.f21412c);
        textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, c2Var.f21415f));
        c2Var.getClass();
    }
}
