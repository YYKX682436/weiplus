package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class u1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f283000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 f283001g;

    public u1(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 e2Var) {
        this.f282998d = context;
        this.f282999e = f9Var;
        this.f283000f = z17;
        this.f283001g = e2Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e2 e2Var;
        boolean l17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.l(this.f282998d, this.f282999e, this.f283000f);
        if (l17 && (e2Var = this.f283001g) != null) {
            e2Var.a();
        }
        return l17 ? "Success" : "Fail";
    }
}
