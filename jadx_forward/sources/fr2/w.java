package fr2;

/* loaded from: classes9.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f347294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr2.x f347295e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, fr2.x xVar) {
        super(1);
        this.f347294d = k0Var;
        this.f347295e = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f347294d.u();
        fr2.x xVar = this.f347295e;
        r45.zz2 zz2Var = xVar.f347304o;
        if (zz2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "addQuickShare: share info is null");
        } else {
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.app.Activity m80379x76847179 = xVar.m80379x76847179();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(xVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za));
            java.lang.String str = zz2Var.f474013d;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            java.lang.String m158362x2fec8307 = xVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
            fr2.v vVar = new fr2.v(xVar, zz2Var, username);
            ((r35.k1) q1Var).getClass();
            r35.i1 i1Var = new r35.i1(m80379x76847179);
            i1Var.l(username);
            i1Var.i(sb7);
            i1Var.g(java.lang.Boolean.TRUE);
            i1Var.f450670d = m158362x2fec8307;
            i1Var.a(vVar);
            i1Var.f450669c.show();
        }
        return jz5.f0.f384359a;
    }
}
