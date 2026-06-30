package eg4;

/* loaded from: classes11.dex */
public class o1 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.r f334303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f334304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f334305f;

    public o1(eg4.t1 t1Var, y35.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f334305f = t1Var;
        this.f334303d = rVar;
        this.f334304e = z3Var;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        eg4.t1 t1Var = this.f334305f;
        y35.r rVar = this.f334303d;
        if (z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationUI", "addContact respUsername is empty");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 21);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(rVar.f540765a, true);
            if (((int) n17.E2) == 0) {
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f334304e;
                if (!K0) {
                    z3Var.X1(str);
                }
                if (!((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h0(z3Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageConversationUI", "canAddContact fail, insert fail");
                    return;
                }
                n17 = z3Var;
            }
            c01.e2.m0(n17);
            r21.w.wi().k1(rVar.f540765a, 1);
            android.content.Context context = t1Var.f334344o;
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571539i8));
            java.lang.String str3 = rVar.f540765a;
            if (t1Var.f334344o instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new eg4.r1(t1Var, str3), 200L);
            }
        } else {
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageConversationUI", "canAddContact fail, username = " + rVar.f540765a);
                return;
            }
            r21.w.wi().k1(rVar.f540765a, 2);
        }
        t1Var.notifyDataSetChanged();
    }
}
