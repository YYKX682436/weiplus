package bk4;

/* loaded from: classes11.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f103133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103134i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103136n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103137o;

    public w1(bk4.c2 c2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, yz5.q qVar, yz5.l lVar, java.lang.CharSequence charSequence3, android.widget.TextView textView, yz5.l lVar2) {
        this.f103129d = c2Var;
        this.f103130e = charSequence;
        this.f103131f = charSequence2;
        this.f103132g = i17;
        this.f103133h = qVar;
        this.f103134i = lVar;
        this.f103135m = charSequence3;
        this.f103136n = textView;
        this.f103137o = lVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yz5.l lVar = this.f103134i;
        java.lang.CharSequence charSequence = this.f103135m;
        android.widget.TextView textView = this.f103136n;
        java.lang.CharSequence charSequence2 = this.f103130e;
        java.lang.CharSequence charSequence3 = this.f103131f;
        yz5.q qVar = this.f103133h;
        yz5.l lVar2 = this.f103137o;
        bk4.c2 c2Var = this.f103129d;
        bk4.c2.h(lVar, charSequence, textView, charSequence2, charSequence3, qVar, lVar2, c2Var.a(c2Var.f102943a, charSequence2, charSequence3, this.f103132g, qVar));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(">>>>>performance: ");
        sb6.append(currentTimeMillis2 - currentTimeMillis);
        sb6.append("ms");
    }
}
