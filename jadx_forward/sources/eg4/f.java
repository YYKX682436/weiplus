package eg4;

/* loaded from: classes11.dex */
public final class f implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.r f334230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f334231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334232f;

    public f(y35.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, android.content.Context context) {
        this.f334230d = rVar;
        this.f334231e = z3Var;
        this.f334232f = context;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        y35.r rVar = this.f334230d;
        if (!z17) {
            if (z18) {
                r21.w.wi().k1(rVar.f540765a, 2);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "canAddContact fail, username = " + rVar.f540765a);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(rVar.f540765a, true);
        boolean z19 = false;
        if (n17 != null && ((int) n17.E2) == 0) {
            z19 = true;
        }
        if (z19) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f334231e;
            if (!K0) {
                z3Var.X1(str);
            }
            if (!((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).h0(z3Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddFriendVerifyRecord.FMessageItemConvert", "canAddContact fail, insert fail");
                return;
            }
            n17 = z3Var;
        }
        c01.e2.m0(n17);
        r21.w.wi().k1(rVar.f540765a, 1);
        android.content.Context context = this.f334232f;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571539i8));
    }
}
