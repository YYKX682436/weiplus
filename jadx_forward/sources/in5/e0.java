package in5;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f374561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f374564g;

    public e0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18) {
        this.f374561d = j0Var;
        this.f374562e = i17;
        this.f374563f = n0Var;
        this.f374564g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f374561d;
        int i17 = this.f374562e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f374563f;
        if (h17) {
            n0Var.m8148xed6e4d18(this.f374564g, java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", "[onItemRangeChanged] preItemCount=" + i17 + " but now itemCount is " + n0Var.mo1894x7e414b06());
    }
}
