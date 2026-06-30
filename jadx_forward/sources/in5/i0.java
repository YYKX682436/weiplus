package in5;

/* loaded from: classes10.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f374597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f374600g;

    public i0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18) {
        this.f374597d = j0Var;
        this.f374598e = i17;
        this.f374599f = n0Var;
        this.f374600g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f374597d;
        int i17 = this.f374598e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f374599f;
        if (h17) {
            n0Var.m8154xdb81fc7f(this.f374600g, i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", "[notifyItemRangeRemoved] preItemCount=" + i17 + " but now itemCount is " + n0Var.mo1894x7e414b06());
    }
}
