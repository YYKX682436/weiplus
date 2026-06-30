package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class v0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 f148811b;

    public v0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        this.f148810a = str;
        this.f148811b = c3707xe60c5943;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "view-level liteapp async update fail, appId: %s", str);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148811b;
        c3707xe60c5943.f127539p = true;
        c3707xe60c5943.f127538o = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127537n;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "view-level liteapp async update success, appId: %s", this.f148810a);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148811b;
        c3707xe60c5943.f127539p = true;
        c3707xe60c5943.f127538o = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127537n;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 == null || c3712x3ed8a441 == null) {
            return;
        }
        abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, c3712x3ed8a441.f14362x26947355);
    }
}
