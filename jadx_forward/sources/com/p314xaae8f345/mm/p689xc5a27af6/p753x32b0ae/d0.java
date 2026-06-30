package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class d0 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3[] f148666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f148667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 f148668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f148671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData f148672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148673h;

    public d0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3[] u3VarArr, q80.f0 f0Var, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, java.lang.String str, android.content.Context context, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData) {
        this.f148673h = iVar;
        this.f148666a = u3VarArr;
        this.f148667b = f0Var;
        this.f148668c = c3707xe60c5943;
        this.f148669d = str;
        this.f148670e = context;
        this.f148671f = bundle;
        this.f148672g = openExtraData;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onError: " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f148666a[0];
        if (u3Var != null) {
            u3Var.cancel();
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.wi(this.f148673h, this.f148667b, false);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148668c;
        c3707xe60c5943.f127539p = false;
        c3707xe60c5943.f127538o = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127537n;
        c3707xe60c5943.I.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.EXTERNAL_PACKAGE_LOADING_FAILED);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().N(this.f148669d, false, false, 23, c3707xe60c5943.f127538o);
    }

    @Override // kh0.e
    /* renamed from: onSuccess */
    public void mo45046xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onSuccess: " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f148666a[0];
        if (u3Var != null) {
            u3Var.cancel();
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148668c;
        c3707xe60c5943.f127538o = currentTimeMillis - c3707xe60c5943.f127537n;
        q80.f0 f0Var = this.f148667b;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = this.f148673h;
        if (y17 == null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.wi(iVar, f0Var, false);
            c3707xe60c5943.f127539p = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().N(str, false, false, 23, c3707xe60c5943.f127538o);
        } else {
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.wi(iVar, f0Var, true);
            c3707xe60c5943.f127539p = true;
            c3707xe60c5943.I.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.EXTERNAL_PACKAGE_LOADING_SUCCESS);
            c3707xe60c5943.I.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_FROM_CACHE, 3L);
            this.f148673h.Nj(this.f148670e, this.f148671f, this.f148668c, y17, this.f148672g, this.f148667b);
        }
    }
}
