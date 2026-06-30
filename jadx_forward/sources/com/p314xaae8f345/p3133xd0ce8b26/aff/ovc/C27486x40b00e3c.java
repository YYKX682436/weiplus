package com.p314xaae8f345.p3133xd0ce8b26.aff.ovc;

/* renamed from: com.tencent.wechat.aff.ovc.ZIDL_fglmYCPBB */
/* loaded from: classes16.dex */
class C27486x40b00e3c extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.s f298998b;

    /* renamed from: ZIDL_BX */
    private native void m116606x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m116607x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DI */
    private native void m116608x1964d1cd(long j17);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r
    public void H() {
        m116608x1964d1cd(this.f60633xf042a733);
    }

    /* renamed from: ZIDL_BV */
    public void m116609x1964d19c(long j17) {
        s.i iVar = (s.i) this.f298998b;
        if (iVar.f483371h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "show: already released");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r rVar = iVar.f483365b;
            if (rVar != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27486x40b00e3c) rVar).c(j17);
                return;
            }
            return;
        }
        if (iVar.f483366c != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "show: already shown");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r rVar2 = iVar.f483365b;
            if (rVar2 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27486x40b00e3c) rVar2).c(j17);
                return;
            }
            return;
        }
        iVar.f483368e = j17;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = iVar.f483370g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        iVar.f483370g = p3325xe03a0797.p3326xc267989b.l.d(iVar.f483364a, null, null, new s.h(iVar, null), 3, null);
    }

    /* renamed from: ZIDL_CV */
    public void m116610x1964d1bb(long j17) {
        s.i iVar = (s.i) this.f298998b;
        p3325xe03a0797.p3326xc267989b.l.d(iVar.f483364a, null, null, new s.g(iVar, j17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.s) obj;
        this.f298998b = sVar;
        ((s.i) sVar).f483365b = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r
    public void b(long j17) {
        m116607x1964d1bd(this.f60633xf042a733, j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r
    public void c(long j17) {
        m116606x1964d19e(this.f60633xf042a733, j17);
    }
}
