package cd0;

/* loaded from: classes5.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f122142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f122145g;

    public z(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f122142d = dVar;
        this.f122143e = f9Var;
        this.f122144f = str;
        this.f122145g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah) ((sb5.e1) this.f122142d.f542241c.a(sb5.e1.class))).m0(this.f122143e, this.f122144f);
        cd0.c0.b(1, this.f122143e, 1);
        this.f122145g.dismiss();
        ((ku5.t0) ku5.t0.f394148d).B(new cd0.y(this.f122142d));
    }
}
