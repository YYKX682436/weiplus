package m71;

/* loaded from: classes5.dex */
public final class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.v0 f406017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m71.g f406018e;

    public b(com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var, m71.g gVar) {
        this.f406017d = v0Var;
        this.f406018e = gVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f406017d);
        m71.g gVar = this.f406018e;
        gVar.getClass();
        gm0.j1.d().q(701, gVar);
        gm0.j1.d().q(252, gVar);
    }
}
