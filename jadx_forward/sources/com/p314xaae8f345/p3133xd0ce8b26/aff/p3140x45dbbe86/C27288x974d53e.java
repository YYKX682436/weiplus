package com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86;

/* renamed from: com.tencent.wechat.aff.emoticon.ZIDL__QyxtZkpB */
/* loaded from: classes15.dex */
class C27288x974d53e extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.m f298167a;

    /* renamed from: ZIDL_A */
    public void m112589x9db8edf9(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.m mVar = this.f298167a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s2) mVar).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.k kVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l.f298184c;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i iVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i) kVar.a().f298186a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (iVar != null) {
            java.util.ArrayList arrayList = iVar.f298179c;
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = iVar.f298180d;
            arrayList2.clear();
            arrayList2.addAll(kz5.n0.R(kVar.a().a(iVar.f298177a), size));
            arrayList.clear();
            arrayList.addAll(kVar.a().a(iVar.f298177a));
            yz5.l lVar = iVar.f298181e;
            if (lVar != null) {
                lVar.mo146xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.g.f298173d);
            }
            iVar.f298181e = null;
        }
    }

    /* renamed from: ZIDL_B */
    public void m112590x9db8edfa(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.m mVar = this.f298167a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s2) mVar).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i iVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i) com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.l.f298184c.a().f298186a.get(java.lang.Integer.valueOf(r26.q0.a(str)));
        if (iVar != null) {
            yz5.l lVar = iVar.f298181e;
            if (lVar != null) {
                lVar.mo146xb9724478(com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.g.f298174e);
            }
            iVar.f298181e = null;
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f298167a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.m) obj;
    }
}
