package qn2;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.i0 f446589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(qn2.i0 i0Var) {
        super(1);
        this.f446589d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 it = (r45.cz1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        qn2.i0 i0Var = this.f446589d;
        km2.z zVar = ((on2.z2) i0Var.P0(on2.z2.class)).f428625m;
        java.lang.String str = null;
        r45.cz1 cz1Var2 = zVar != null ? zVar.f390765d : null;
        km2.z zVar2 = ((on2.z2) i0Var.P0(on2.z2.class)).f428625m;
        java.lang.Integer valueOf = zVar2 != null ? java.lang.Integer.valueOf(zVar2.f390762a) : null;
        java.lang.String m75945x2fec8307 = it.m75945x2fec8307(0);
        java.lang.String m75945x2fec83072 = cz1Var2 != null ? cz1Var2.m75945x2fec8307(0) : null;
        r45.ht1 ht1Var = ((on2.z2) i0Var.P0(on2.z2.class)).f428627o;
        if (ht1Var != null && (cz1Var = (r45.cz1) ht1Var.m75936x14adae67(1)) != null) {
            str = cz1Var.m75945x2fec8307(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryVisitorCardPlugin", "computingAnimCallback,localStatus:" + valueOf + ", callbakcId:" + m75945x2fec8307 + ",localId:" + m75945x2fec83072 + ",recordId:" + str);
        if (valueOf != null && valueOf.intValue() == 2) {
            i0Var.y1(0);
            qn2.l1 l1Var = i0Var.D;
            if (l1Var != null) {
                if (cz1Var2 != null) {
                    it = cz1Var2;
                }
                l1Var.g(it);
            }
        }
        i0Var.u1(new qn2.d0(i0Var));
        return jz5.f0.f384359a;
    }
}
