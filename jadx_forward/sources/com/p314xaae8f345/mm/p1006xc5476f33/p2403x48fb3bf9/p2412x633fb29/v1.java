package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class v1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 f264667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 f264668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f264669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 f264671e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var, boolean z17, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var) {
        this.f264667a = v0Var;
        this.f264668b = u1Var;
        this.f264669c = z17;
        this.f264670d = context;
        this.f264671e = l2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "onSceneEnd doOauthAuthorizeConfirm errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (this.f264667a == null || this.f264668b == null || !this.f264669c) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f152244b.f152233a) == null || !(fVar instanceof r45.jx4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.b(false, str, bundle, this.f264670d, this.f264671e, this.f264668b);
        } else {
            bundle.putString("redirect_url", ((r45.jx4) fVar).f459732d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.b(true, str, bundle, this.f264670d, this.f264671e, this.f264668b);
        }
    }
}
