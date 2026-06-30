package bk4;

/* loaded from: classes11.dex */
public final class o1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21526h;

    public o1(bk4.c2 c2Var, android.widget.TextView textView, java.lang.CharSequence charSequence, yz5.l lVar, java.lang.CharSequence charSequence2) {
        this.f21522d = c2Var;
        this.f21523e = textView;
        this.f21524f = charSequence;
        this.f21525g = lVar;
        this.f21526h = charSequence2;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        bk4.c2 c2Var = this.f21522d;
        c2Var.f(this);
        android.widget.TextView textView = this.f21523e;
        textView.getLayoutParams().height = -2;
        textView.setLayoutParams(textView.getLayoutParams());
        textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f21524f));
        yz5.l lVar = this.f21525g;
        if (lVar != null) {
            lVar.invoke(this.f21526h);
        }
        c2Var.getClass();
    }
}
