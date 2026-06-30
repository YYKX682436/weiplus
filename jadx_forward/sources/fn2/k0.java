package fn2;

/* loaded from: classes10.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f345829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.i1 f345831f;

    public k0(fn2.m0 m0Var, int i17, fn2.i1 i1Var) {
        this.f345829d = m0Var;
        this.f345830e = i17;
        this.f345831f = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        fn2.t0 t0Var = this.f345829d.f345853n;
        fn2.h1 h1Var = t0Var != null ? (fn2.h1) t0Var.f345935g.get(this.f345830e) : null;
        fn2.i1 i1Var = this.f345831f;
        if (h1Var != null && (i17 = i1Var.f345819c) >= 0) {
            h1Var.f345801e.post(new fn2.g1(h1Var, i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabRequested", "Scroll to target position and highlight: " + i1Var.f345819c);
    }
}
