package on2;

/* loaded from: classes.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qp1 f428489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f428491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(r45.qp1 qp1Var, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f428489d = qp1Var;
        this.f428490e = str;
        this.f428491f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        r45.qp1 qp1Var = this.f428489d;
        int m75939xb282bd08 = qp1Var.m75939xb282bd08(0);
        java.lang.String str2 = this.f428490e;
        if (m75939xb282bd08 == 1) {
            java.lang.String m75945x2fec8307 = qp1Var.m75945x2fec8307(1);
            str = (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ^ true ? m75945x2fec8307 : null;
            if (str != null) {
                str2 = str;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
            u1Var.g(str2);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
            u1Var.a(true);
            u1Var.l(hz2.b.f367843a);
            u1Var.q(false);
        } else if (m75939xb282bd08 == 2) {
            yz5.l lVar = this.f428491f;
            if (lVar != null) {
                lVar.mo146xb9724478(qp1Var);
            }
        } else if (m75939xb282bd08 == 3) {
            java.lang.String m75945x2fec83072 = qp1Var.m75945x2fec8307(1);
            str = (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) ^ true ? m75945x2fec83072 : null;
            if (str != null) {
                str2 = str;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2);
        }
        return jz5.f0.f384359a;
    }
}
