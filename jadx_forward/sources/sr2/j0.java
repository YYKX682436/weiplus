package sr2;

/* loaded from: classes10.dex */
public final class j0 implements wl5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f493126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wl5.x f493127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f493128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f493129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.p6 f493130e;

    public j0(sr2.w0 w0Var, wl5.x xVar, android.widget.TextView textView, int i17, so2.p6 p6Var) {
        this.f493126a = w0Var;
        this.f493127b = xVar;
        this.f493128c = textView;
        this.f493129d = i17;
        this.f493130e = p6Var;
    }

    @Override // wl5.t
    public final void a(java.lang.CharSequence charSequence) {
        java.lang.String obj = charSequence.toString();
        sr2.w0 w0Var = this.f493126a;
        w0Var.F = obj;
        wl5.x xVar = this.f493127b;
        java.lang.Object first = xVar.e().first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        w0Var.G = ((java.lang.Number) first).intValue();
        java.lang.Object second = xVar.e().second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        w0Var.H = ((java.lang.Number) second).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m0 S6 = w0Var.S6(w0Var.G, w0Var.H);
        if (S6 != null) {
            int i17 = w0Var.G;
            int i18 = S6.f183909b;
            int i19 = S6.f183908a;
            if (i19 != i17 || i18 != w0Var.H) {
                xVar.l(i19, i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostEditUIC", "[onTextSelected] select at");
                return;
            }
        }
        int[] iArr = new int[2];
        android.widget.TextView textView = this.f493128c;
        textView.getLocationInWindow(iArr);
        w0Var.K = wl5.y.c(textView, wl5.y.d(textView, w0Var.G)) + iArr[1] + this.f493129d;
        w0Var.R6(this.f493130e == so2.p6.f492075e ? w0Var.M : w0Var.L);
        charSequence.toString();
        int i27 = w0Var.G;
        int i28 = w0Var.H;
        int i29 = w0Var.K;
    }
}
