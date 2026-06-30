package yu4;

/* loaded from: classes8.dex */
public final class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547406d;

    public g(yu4.k kVar) {
        this.f547406d = kVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        xu4.h hVar;
        su4.m1 m1Var;
        xu4.h hVar2;
        su4.m1 m1Var2;
        yu4.k kVar = this.f547406d;
        yu4.n nVar = kVar.f547419n;
        if (nVar != null && (hVar2 = nVar.f547435n) != null && (m1Var2 = hVar2.f538821i) != null) {
            gm0.j1.d().d(m1Var2);
            hVar2.f538821i = null;
        }
        yu4.o oVar = kVar.f547420o;
        if (oVar != null && (hVar = oVar.f547444i) != null && (m1Var = hVar.f538821i) != null) {
            gm0.j1.d().d(m1Var);
            hVar.f538821i = null;
        }
        kVar.f547422q = 0L;
    }
}
