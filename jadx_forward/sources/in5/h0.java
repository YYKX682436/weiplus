package in5;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f374590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f374593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f374594h;

    public h0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18, int i19) {
        this.f374590d = j0Var;
        this.f374591e = i17;
        this.f374592f = n0Var;
        this.f374593g = i18;
        this.f374594h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f374590d;
        int i17 = this.f374591e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f374592f;
        if (h17) {
            n0Var.m8150x87567217(this.f374593g, this.f374594h);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", "[onItemRangeMoved] preItemCount=" + i17 + " but now itemCount is " + n0Var.mo1894x7e414b06());
    }
}
