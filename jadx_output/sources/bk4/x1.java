package bk4;

/* loaded from: classes11.dex */
public final class x1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21613h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21614i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f21615m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21616n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21617o;

    public x1(android.widget.TextView textView, yz5.l lVar, bk4.c2 c2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, yz5.q qVar, java.lang.CharSequence charSequence3, yz5.l lVar2) {
        this.f21609d = textView;
        this.f21610e = lVar;
        this.f21611f = c2Var;
        this.f21612g = charSequence;
        this.f21613h = charSequence2;
        this.f21614i = i17;
        this.f21615m = qVar;
        this.f21616n = charSequence3;
        this.f21617o = lVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.widget.TextView textView = this.f21609d;
        textView.removeOnLayoutChangeListener(this);
        if (textView.getLayout() != null) {
            android.widget.TextView textView2 = this.f21609d;
            textView2.post(new bk4.w1(this.f21611f, this.f21612g, this.f21613h, this.f21614i, this.f21615m, this.f21610e, this.f21616n, textView2, this.f21617o));
        } else {
            java.lang.CharSequence text = textView.getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            this.f21610e.invoke(text);
        }
    }
}
