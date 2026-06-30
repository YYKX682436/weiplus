package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public final class z implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f262540a;

    public z(yz5.p pVar) {
        this.f262540a = pVar;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int mo27544xb58848b9 = data.mo27544xb58848b9("compliance_half_page_action");
        long mo27548xfb822ef2 = data.mo27548xfb822ef2("usecase_platform_session");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPayComplianceHalfPage", "closed with action: " + mo27544xb58848b9);
        yz5.p pVar = this.f262540a;
        if (pVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262532e.getClass();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y yVar : com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.m73987xcee59d22()) {
                if (yVar.f262536d == mo27544xb58848b9) {
                    pVar.mo149xb9724478(yVar, java.lang.Long.valueOf(mo27548xfb822ef2));
                    return;
                }
            }
            throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
