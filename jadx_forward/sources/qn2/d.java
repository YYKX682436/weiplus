package qn2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qn2.n nVar) {
        super(1);
        this.f446584d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 it = (r45.cz1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        qn2.n nVar = this.f446584d;
        km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
        java.lang.String str = null;
        java.lang.Integer valueOf = zVar != null ? java.lang.Integer.valueOf(zVar.f390762a) : null;
        java.lang.String m75945x2fec8307 = it.m75945x2fec8307(0);
        km2.z zVar2 = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
        java.lang.String m75945x2fec83072 = (zVar2 == null || (cz1Var3 = zVar2.f390765d) == null) ? null : cz1Var3.m75945x2fec8307(0);
        r45.ht1 ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
        if (ht1Var != null && (cz1Var2 = (r45.cz1) ht1Var.m75936x14adae67(1)) != null) {
            str = cz1Var2.m75945x2fec8307(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.B, "computingAnimCallback,localStatus:" + valueOf + ", callbakcId:" + m75945x2fec8307 + ",recordId:" + str + ",localId id:" + m75945x2fec83072);
        if (valueOf != null && valueOf.intValue() == 2) {
            km2.z zVar3 = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
            if (zVar3 != null && (cz1Var = zVar3.f390765d) != null) {
                it = cz1Var;
            }
            qn2.n.z1(nVar, it);
        }
        nVar.u1(new qn2.c(nVar));
        return jz5.f0.f384359a;
    }
}
