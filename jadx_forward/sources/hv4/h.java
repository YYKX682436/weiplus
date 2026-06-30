package hv4;

/* loaded from: classes8.dex */
public final class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f366829d;

    public h(hv4.l lVar) {
        this.f366829d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gv4.e eVar;
        su4.m1 m1Var;
        gv4.e eVar2;
        su4.m1 m1Var2;
        hv4.l lVar = this.f366829d;
        hv4.n nVar = lVar.f366846n;
        if (nVar != null && (eVar2 = nVar.f366857m) != null && (m1Var2 = eVar2.f357654m) != null) {
            gm0.j1.d().d(m1Var2);
            eVar2.f357654m = null;
        }
        hv4.o oVar = lVar.f366847o;
        if (oVar == null || (eVar = oVar.f366864i) == null || (m1Var = eVar.f357654m) == null) {
            return;
        }
        gm0.j1.d().d(m1Var);
        eVar.f357654m = null;
    }
}
