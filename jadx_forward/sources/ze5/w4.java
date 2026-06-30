package ze5;

/* loaded from: classes9.dex */
public final class w4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553814e;

    public w4(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        this.f553813d = f9Var;
        this.f553814e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        l15.c cVar = new l15.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553813d;
        java.lang.String U1 = f9Var != null ? f9Var.U1() : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126731xdc93280d(U1, true);
        dk5.m2.f316264a.a(f9Var != null ? f9Var.Q0() : null, f9Var, true);
        this.f553814e.L(true);
    }
}
