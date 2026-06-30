package th;

/* loaded from: classes12.dex */
public class j implements sh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ th.k f500785a;

    public j(th.k kVar) {
        this.f500785a = kVar;
    }

    @Override // sh.b
    public boolean a(rh.c1 c1Var, long j17) {
        th.k kVar = this.f500785a;
        th.o oVar = kVar.f500788c;
        oVar.f500797b.post(new th.n(oVar, c1Var));
        th.o oVar2 = kVar.f500788c;
        return oVar2.f500800e == null || !oVar2.f500798c.get(kVar.f500787b, false);
    }
}
