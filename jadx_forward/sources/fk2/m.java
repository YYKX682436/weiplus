package fk2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.n f344962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mh1 f344963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fk2.n nVar, r45.mh1 mh1Var, android.content.Context context) {
        super(1);
        this.f344962d = nVar;
        this.f344963e = mh1Var;
        this.f344964f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.view.View) obj, "<anonymous parameter 0>");
        fk2.n nVar = this.f344962d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17 = nVar.f344969m.p();
        r45.mh1 mh1Var = this.f344963e;
        r45.y23 y23Var = (r45.y23) mh1Var.m75936x14adae67(0);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (p17 == null || y23Var == null) {
            f0Var = null;
        } else {
            dk2.q4.f315471a.n(this.f344964f, p17.m57654xd7793f26(), st2.c2.f493782a.c(y23Var, 1205, null, "", null, true), p17);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(nVar.f344970n, "product click failed, curlayout = " + nVar.f344969m.p() + ", productInfo = " + mh1Var);
        }
        return f0Var2;
    }
}
