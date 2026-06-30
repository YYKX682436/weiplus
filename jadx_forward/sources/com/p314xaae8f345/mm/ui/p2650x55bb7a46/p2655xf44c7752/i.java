package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class i implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282545f;

    public i(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17) {
        this.f282543d = str;
        this.f282544e = f9Var;
        this.f282545f = j17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        boolean z17 = false;
        if (t21.d3.h(this.f282543d) != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.Long l17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282699d;
            if (l17 != null && l17.longValue() == this.f282545f) {
                z17 = true;
            }
            z17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.l(context, this.f282544e, z17);
        }
        return z17 ? "Success" : "Fail";
    }
}
