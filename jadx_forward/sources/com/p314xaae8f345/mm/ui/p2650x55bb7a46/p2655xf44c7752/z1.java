package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class z1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f283128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f283130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 f283131g;

    public z1(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 e2Var) {
        this.f283128d = context;
        this.f283129e = f9Var;
        this.f283130f = z17;
        this.f283131g = e2Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 e2Var;
        boolean j17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(this.f283128d, this.f283129e, this.f283130f);
        if (j17 && (e2Var = this.f283131g) != null) {
            e2Var.a();
        }
        return j17 ? "Success" : "Fail";
    }
}
