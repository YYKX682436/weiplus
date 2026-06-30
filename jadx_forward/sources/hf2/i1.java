package hf2;

/* loaded from: classes10.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f362617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f362618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(hf2.p1 p1Var, v65.n nVar) {
        super(1);
        this.f362617d = p1Var;
        this.f362618e = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ei0 restoreData = (r45.ei0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreData, "restoreData");
        hf2.p1 p1Var = this.f362617d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(p1Var.f362670b, "dropBitmap operation cancel");
        qc0.g1 g1Var = p1Var.f362672d;
        if (g1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) g1Var).d();
        }
        p1Var.f362672d = null;
        this.f362618e.a(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
