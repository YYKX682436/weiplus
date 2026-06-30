package st2;

/* loaded from: classes3.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f494035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f494036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f494037f;

    public y0(cm2.m0 m0Var, int i17, st2.h1 h1Var) {
        this.f494035d = m0Var;
        this.f494036e = i17;
        this.f494037f = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("locate product ");
        cm2.m0 m0Var = this.f494035d;
        sb6.append(m0Var.f124903x);
        sb6.append(" at position ");
        sb6.append(this.f494036e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        this.f494037f.P.U(-1, m0Var.f124901v, 7);
    }
}
