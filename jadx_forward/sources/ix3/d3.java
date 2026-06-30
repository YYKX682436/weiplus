package ix3;

/* loaded from: classes.dex */
public final class d3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q55.e f376919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex3.e f376920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.j3 f376921f;

    public d3(q55.e eVar, ex3.e eVar2, ix3.j3 j3Var) {
        this.f376919d = eVar;
        this.f376920e = eVar2;
        this.f376921f = j3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        q55.e eVar = this.f376919d;
        if (i17 == 0) {
            bm5.o1.f104252a.q(eVar, 0);
        } else {
            bm5.o1.f104252a.q(eVar, 1);
        }
        ex3.e eVar2 = (ex3.e) this.f376920e.y0();
        if (i17 == 0) {
            eVar2.f338743g = "以X实验为主";
        } else {
            eVar2.f338743g = "以维修厂为主";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f376921f.f376999d;
        if (c16718x7059cefe != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, eVar2, false, 2, null);
        }
    }
}
