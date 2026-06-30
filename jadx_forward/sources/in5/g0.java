package in5;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f374582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f374585g;

    public g0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18) {
        this.f374582d = j0Var;
        this.f374583e = i17;
        this.f374584f = n0Var;
        this.f374585g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f374582d;
        int i17 = this.f374583e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f374584f;
        if (h17) {
            n0Var.m8153xd399a4d9(this.f374585g, i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", "[onItemRangeInserted] preItemCount=" + i17 + " but now itemCount is " + n0Var.mo1894x7e414b06());
    }
}
