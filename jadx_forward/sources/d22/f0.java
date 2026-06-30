package d22;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f307371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f307372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f307374g;

    public f0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, boolean z17, android.content.Context context, d22.k0 k0Var) {
        this.f307371d = f4Var;
        this.f307372e = z17;
        this.f307373f = context;
        this.f307374g = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f307371d.dismiss();
        if (this.f307372e) {
            d22.k0 k0Var = this.f307374g;
            o22.i.c(this.f307373f, 6, k0Var.f307385i.mo42933xb5885648(), k0Var.f445760e);
        }
    }
}
