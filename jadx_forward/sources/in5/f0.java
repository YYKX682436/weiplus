package in5;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f374572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f374575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f374576h;

    public f0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18, java.lang.Object obj) {
        this.f374572d = j0Var;
        this.f374573e = i17;
        this.f374574f = n0Var;
        this.f374575g = i18;
        this.f374576h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f374572d;
        int i17 = this.f374573e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f374574f;
        if (h17) {
            n0Var.m8152xc67946d3(this.f374575g, i17, this.f374576h);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", "[onItemRangeChanged] preItemCount=" + i17 + " but now itemCount is " + n0Var.mo1894x7e414b06());
    }
}
