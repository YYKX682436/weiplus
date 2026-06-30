package zi4;

/* loaded from: classes5.dex */
public final class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f554796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.u0 f554797e;

    public t0(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, zi4.u0 u0Var) {
        this.f554796d = m1Var;
        this.f554797e = u0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f554796d);
        gm0.j1.d().q(4245, this.f554797e);
    }
}
