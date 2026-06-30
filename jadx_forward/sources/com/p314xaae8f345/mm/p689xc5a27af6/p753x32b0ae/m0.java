package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class m0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f148746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 f148747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f148749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData f148750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f148751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148753h;

    public m0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, android.content.Context context, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, q80.f0 f0Var, java.lang.String str) {
        this.f148753h = iVar;
        this.f148746a = u3Var;
        this.f148747b = c3707xe60c5943;
        this.f148748c = context;
        this.f148749d = bundle;
        this.f148750e = openExtraData;
        this.f148751f = f0Var;
        this.f148752g = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f148746a;
        if (u3Var != null) {
            u3Var.cancel();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", "fail");
        hashMap.put("errCode", java.lang.String.valueOf(i17));
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148747b;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.ck(c3707xe60c5943, "Android.Feature.checkUpdate.sync", false, hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + str);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            long j17 = i17;
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE_FAILED, j17);
            c3707xe60c5943.I.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_PACKAGE_INFO_FINAL_FAILED, j17);
        }
        c3707xe60c5943.f127539p = false;
        c3707xe60c5943.f127538o = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127537n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().N(str, false, false, i17 == 8 ? 24 : i17 == 9 ? 20 : i17 == 10 ? 25 : 23, c3707xe60c5943.f127538o);
        q80.f0 f0Var = this.f148751f;
        if (f0Var != null) {
            if (i17 != 9) {
                f0Var.mo555x2fd71e();
            } else {
                f0Var.mo25802xae7a2e7a();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f148746a;
        if (u3Var != null) {
            u3Var.cancel();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", "ok");
        hashMap.put("errCode", java.lang.String.valueOf(i17));
        hashMap.put("hasInfo", java.lang.String.valueOf(c3712x3ed8a441 != null));
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148747b;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.ck(c3707xe60c5943, "Android.Feature.checkUpdate.sync", false, hashMap);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null && c3712x3ed8a441 != null) {
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE_SUCCESS, c3712x3ed8a441.f14362x26947355);
            c3707xe60c5943.I.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_FROM_CACHE, 0L);
        }
        c3707xe60c5943.f127539p = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.f148747b;
        c3707xe60c5943.f127538o = currentTimeMillis - c3707xe60c59432.f127537n;
        this.f148753h.Nj(this.f148748c, this.f148749d, c3707xe60c59432, c3712x3ed8a441, this.f148750e, this.f148751f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().N(this.f148752g, false, true, i17 == 1 ? 2 : i17 == 8 ? 4 : i17 == 10 ? 5 : 3, c3707xe60c5943.f127538o);
        q80.f0 f0Var = this.f148751f;
        if (f0Var != null) {
            if (i17 != 9) {
                f0Var.mo556x90b54003();
            } else {
                f0Var.mo25802xae7a2e7a();
            }
        }
    }
}
