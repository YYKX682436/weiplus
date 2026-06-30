package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* renamed from: com.tencent.wechat.mm.finder_box.ZIDL_ql26v1FcB */
/* loaded from: classes11.dex */
class C27662x4e931623 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f f300794a;

    /* renamed from: ZIDL_AX */
    private native void m119112x1964d17f(long j17, int i17);

    /* renamed from: ZIDL_BX */
    private native void m119113x1964d19e(long j17, int i17);

    /* renamed from: ZIDL_CX */
    private native void m119114x1964d1bd(long j17, int i17);

    /* renamed from: ZIDL_AV */
    public void m119115x1964d17d(int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f fVar = this.f300794a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.e0 e0Var = (a50.e0) fVar;
        e0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxAffBizDynamicCardMrgEventImpl", "onAdServerInfoEvent adinfo=".concat(str));
        if (yw.x0.f548033a.b()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).qj(1, str);
        }
        ((ku5.t0) ku5.t0.f394148d).q(new a50.b0(e0Var, i17));
    }

    /* renamed from: ZIDL_BV */
    public void m119116x1964d19c(int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f fVar = this.f300794a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.e0 e0Var = (a50.e0) fVar;
        e0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxAffBizDynamicCardMrgEventImpl", "onRecFeedsAdServerInfoEvent adinfo=".concat(str));
        if (yw.x0.f548033a.c()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).qj(2, str);
        }
        ((ku5.t0) ku5.t0.f394148d).q(new a50.d0(e0Var, i17));
    }

    /* renamed from: ZIDL_CV */
    public void m119117x1964d1bb(int i17, int i18, long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f fVar = this.f300794a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        a50.e0 e0Var = (a50.e0) fVar;
        e0Var.getClass();
        if (i18 == 1 && yw.x0.f548033a.b()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).hj(j17, str, str2);
        }
        if (i18 == 2 && yw.x0.f548033a.d()) {
            ((cx.t1) ((bx.v) i95.n0.c(bx.v.class))).hj(j17, str, str2);
        }
        ((ku5.t0) ku5.t0.f394148d).q(new a50.c0(e0Var, i17));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f) obj;
        this.f300794a = fVar;
        ((a50.e0) fVar).f83003a = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e
    public void f(int i17) {
        m119114x1964d1bd(this.f60633xf042a733, i17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e
    public void h(int i17) {
        m119113x1964d19e(this.f60633xf042a733, i17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e
    public void q(int i17) {
        m119112x1964d17f(this.f60633xf042a733, i17);
    }
}
