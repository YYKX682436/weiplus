package com.p314xaae8f345.p3133xd0ce8b26.aff.ovc;

/* renamed from: com.tencent.wechat.aff.ovc.ZIDL_cLTOG6nzbB */
/* loaded from: classes11.dex */
class C27479x45c69707 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.p {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.q f298986a;

    /* renamed from: ZIDL_BX */
    private native void m116559x1964d19e(long j17, long j18);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.p
    public void Z(long j17) {
        m116559x1964d19e(this.f60633xf042a733, j17);
    }

    /* renamed from: ZIDL_BV */
    public void m116560x1964d19c(long j17, java.lang.String str) {
        h41.a1 a1Var = (h41.a1) this.f298986a;
        a1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformUI", "showOKToastAsync called: taskId=" + j17 + ", text=" + str);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h41.z0(a1Var, j17, str, null), 3, null);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.q qVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.q) obj;
        this.f298986a = qVar;
        ((h41.a1) qVar).f360291a = this;
    }
}
