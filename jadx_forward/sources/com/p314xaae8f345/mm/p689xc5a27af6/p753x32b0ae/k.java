package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f148736a;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        this.f148736a = abstractC3700xe41a2874;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        this.f148736a.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        if (c3712x3ed8a441 != null) {
            this.f148736a.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, c3712x3ed8a441.f14362x26947355);
        }
    }
}
