package bk4;

/* loaded from: classes11.dex */
public final class o1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103059h;

    public o1(bk4.c2 c2Var, android.widget.TextView textView, java.lang.CharSequence charSequence, yz5.l lVar, java.lang.CharSequence charSequence2) {
        this.f103055d = c2Var;
        this.f103056e = textView;
        this.f103057f = charSequence;
        this.f103058g = lVar;
        this.f103059h = charSequence2;
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 transition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        bk4.c2 c2Var = this.f103055d;
        c2Var.f(this);
        android.widget.TextView textView = this.f103056e;
        textView.getLayoutParams().height = -2;
        textView.setLayoutParams(textView.getLayoutParams());
        textView.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f103057f));
        yz5.l lVar = this.f103058g;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f103059h);
        }
        c2Var.getClass();
    }
}
