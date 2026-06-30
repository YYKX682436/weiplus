package hv4;

/* loaded from: classes8.dex */
public final class f implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f366824d;

    public f(hv4.l lVar) {
        this.f366824d = lVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        hv4.l lVar = this.f366824d;
        hv4.n nVar = lVar.f366846n;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f366854g, "dismiss dialog");
            nVar.f366852e.f453160i = nVar.f366855h.m80970x134c2d56();
            nVar.f366853f.mo75475xb349b3ab();
            nVar.f366857m.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = nVar.f366858n;
            c19226x5a0e667d.mo120173x7af55728("tagWebSearchJSApi");
            c19226x5a0e667d.mo52095x5cd39ffa();
        }
        hv4.o oVar = lVar.f366847o;
        if (oVar != null) {
            oVar.f366864i.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d2 = oVar.f366865m;
            c19226x5a0e667d2.mo120173x7af55728("tagWebSearchJSApi");
            c19226x5a0e667d2.mo52095x5cd39ffa();
        }
    }
}
