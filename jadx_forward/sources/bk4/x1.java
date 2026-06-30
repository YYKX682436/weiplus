package bk4;

/* loaded from: classes11.dex */
public final class x1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103147i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f103148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103149n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103150o;

    public x1(android.widget.TextView textView, yz5.l lVar, bk4.c2 c2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, yz5.q qVar, java.lang.CharSequence charSequence3, yz5.l lVar2) {
        this.f103142d = textView;
        this.f103143e = lVar;
        this.f103144f = c2Var;
        this.f103145g = charSequence;
        this.f103146h = charSequence2;
        this.f103147i = i17;
        this.f103148m = qVar;
        this.f103149n = charSequence3;
        this.f103150o = lVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.widget.TextView textView = this.f103142d;
        textView.removeOnLayoutChangeListener(this);
        if (textView.getLayout() != null) {
            android.widget.TextView textView2 = this.f103142d;
            textView2.post(new bk4.w1(this.f103144f, this.f103145g, this.f103146h, this.f103147i, this.f103148m, this.f103143e, this.f103149n, textView2, this.f103150o));
        } else {
            java.lang.CharSequence text = textView.getText();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
            this.f103143e.mo146xb9724478(text);
        }
    }
}
