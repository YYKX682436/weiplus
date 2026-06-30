package sg0;

/* loaded from: classes15.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f489233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489234f;

    public d3(java.lang.String str, su4.h2 h2Var, android.content.Context context) {
        this.f489232d = str;
        this.f489233e = h2Var;
        this.f489234f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q80.e0 e0Var = new q80.e0();
        e0Var.f442208a = this.f489232d;
        e0Var.f442209b = this.f489233e.f494440b;
        e0Var.f442211d = false;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Rj(this.f489234f, e0Var);
    }
}
