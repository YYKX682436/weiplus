package ze5;

/* loaded from: classes9.dex */
public final class o3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553659e;

    public o3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        this.f553658d = f9Var;
        this.f553659e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553658d;
        if (f9Var.k2()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            this.f553659e.L(true);
        }
    }
}
