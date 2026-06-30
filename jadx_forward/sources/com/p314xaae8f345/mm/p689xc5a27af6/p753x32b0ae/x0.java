package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class x0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 f148818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f148819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 f148820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData f148821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q80.s f148822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148823f;

    public x0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, android.os.Bundle bundle, com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData, q80.s sVar) {
        this.f148823f = iVar;
        this.f148818a = c3707xe60c5943;
        this.f148819b = bundle;
        this.f148820c = c3717xac6c2329;
        this.f148821d = openExtraData;
        this.f148822e = sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148818a;
        c3707xe60c5943.f127539p = false;
        c3707xe60c5943.f127538o = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127537n;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            long j17 = i17;
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE_FAILED, j17);
            c3707xe60c5943.I.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_PACKAGE_INFO_FINAL_FAILED, j17);
        }
        q80.s sVar = this.f148822e;
        if (sVar != null) {
            sVar.mo9542x2fd71e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148818a;
        c3707xe60c5943.f127539p = true;
        c3707xe60c5943.f127538o = java.lang.System.currentTimeMillis() - c3707xe60c5943.f127537n;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null && c3712x3ed8a441 != null) {
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_CHECK_PACKAGE_UPDATE_SUCCESS, c3712x3ed8a441.f14362x26947355);
            c3707xe60c5943.I.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.START_FROM_CACHE, 0L);
        }
        this.f148823f.Oj(this.f148819b, this.f148818a, c3712x3ed8a441, this.f148820c, this.f148821d, this.f148822e);
    }
}
