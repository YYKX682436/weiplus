package bk4;

/* loaded from: classes11.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f21600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21601i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21602m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21603n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21604o;

    public w1(bk4.c2 c2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, yz5.q qVar, yz5.l lVar, java.lang.CharSequence charSequence3, android.widget.TextView textView, yz5.l lVar2) {
        this.f21596d = c2Var;
        this.f21597e = charSequence;
        this.f21598f = charSequence2;
        this.f21599g = i17;
        this.f21600h = qVar;
        this.f21601i = lVar;
        this.f21602m = charSequence3;
        this.f21603n = textView;
        this.f21604o = lVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yz5.l lVar = this.f21601i;
        java.lang.CharSequence charSequence = this.f21602m;
        android.widget.TextView textView = this.f21603n;
        java.lang.CharSequence charSequence2 = this.f21597e;
        java.lang.CharSequence charSequence3 = this.f21598f;
        yz5.q qVar = this.f21600h;
        yz5.l lVar2 = this.f21604o;
        bk4.c2 c2Var = this.f21596d;
        bk4.c2.h(lVar, charSequence, textView, charSequence2, charSequence3, qVar, lVar2, c2Var.a(c2Var.f21410a, charSequence2, charSequence3, this.f21599g, qVar));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(">>>>>performance: ");
        sb6.append(currentTimeMillis2 - currentTimeMillis);
        sb6.append("ms");
    }
}
