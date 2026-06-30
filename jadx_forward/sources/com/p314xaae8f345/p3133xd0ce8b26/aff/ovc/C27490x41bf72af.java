package com.p314xaae8f345.p3133xd0ce8b26.aff.ovc;

/* renamed from: com.tencent.wechat.aff.ovc.ZIDL_fglmkk0yB */
/* loaded from: classes11.dex */
class C27490x41bf72af extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.k f299003a;

    /* renamed from: ZIDL_CX */
    private native void m116638x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m116639x1964d1dc(long j17, long j18);

    /* renamed from: ZIDL_EI */
    private native void m116640x1964d1ec(long j17);

    /* renamed from: ZIDL_FI */
    private native void m116641x1964d20b(long j17);

    /* renamed from: ZIDL_B */
    public boolean m116642x9db8edfa() {
        ((h41.t0) this.f299003a).getClass();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        boolean z17 = intValue == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.OVCXLabEnable", "voiceAssistantPermissionGranted: switchValue=" + intValue + ", granted=" + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPermissionGranted: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", sb6.toString());
        return z17;
    }

    /* renamed from: ZIDL_CV */
    public void m116643x1964d1bb(long j17) {
        h41.t0 t0Var = (h41.t0) this.f299003a;
        if (t0Var.f360401j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "show: already released");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j jVar = t0Var.f360394a;
            if (jVar != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27490x41bf72af) jVar).c(j17);
                return;
            }
            return;
        }
        if (t0Var.f360395b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "show: already shown");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j jVar2 = t0Var.f360394a;
            if (jVar2 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.C27490x41bf72af) jVar2).c(j17);
                return;
            }
            return;
        }
        t0Var.f360396c = j17;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = t0Var.f360400i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        t0Var.f360400i = p3325xe03a0797.p3326xc267989b.l.d(t0Var.f360398g, null, null, new h41.s0(t0Var, null), 3, null);
    }

    /* renamed from: ZIDL_DV */
    public void m116644x1964d1da(long j17) {
        h41.t0 t0Var = (h41.t0) this.f299003a;
        p3325xe03a0797.p3326xc267989b.l.d(t0Var.f360398g, null, null, new h41.r0(t0Var, j17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.k) obj;
        this.f299003a = kVar;
        ((h41.t0) kVar).f360394a = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j
    public void b(long j17) {
        m116639x1964d1dc(this.f60633xf042a733, j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j
    public void c(long j17) {
        m116638x1964d1bd(this.f60633xf042a733, j17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j
    public void o0() {
        m116640x1964d1ec(this.f60633xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j
    public void v1() {
        m116641x1964d20b(this.f60633xf042a733);
    }
}
