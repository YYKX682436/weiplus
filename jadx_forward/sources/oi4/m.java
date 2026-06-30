package oi4;

/* loaded from: classes8.dex */
public final class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f427176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oi4.n f427177e;

    public m(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, oi4.n nVar) {
        this.f427176d = m1Var;
        this.f427177e = nVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f427176d);
        gm0.j1.d().q(4245, this.f427177e);
    }
}
