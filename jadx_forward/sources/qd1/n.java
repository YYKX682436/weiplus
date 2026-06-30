package qd1;

/* loaded from: classes7.dex */
public class n implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 f443196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 f443197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd1.o f443198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.j f443199g;

    public n(qd1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var, qd1.o oVar) {
        this.f443199g = jVar;
        this.f443196d = k0Var;
        this.f443197e = l2Var;
        this.f443198f = oVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        qd1.j jVar = this.f443199g;
        nf.o.a(jVar.f443174e.getF229340d());
        this.f443196d.f173281b.remove(jVar.f443180n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = this.f443197e;
        if (l2Var != null) {
            l2Var.g(this.f443198f);
        }
    }
}
