package com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2;

/* renamed from: com.tencent.wechat.aff.mm_foundation.ZIDL_JhX8INZsB */
/* loaded from: classes5.dex */
class C27362xf3cb507e extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.b f298927a;

    /* renamed from: ZIDL_AX */
    private native void m113659x1964d17f(long j17, long j18, long j19, long j27, byte[] bArr);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.a
    public void A0(long j17, long j18, long j19, byte[] bArr) {
        m113659x1964d17f(this.f60633xf042a733, j17, j18, j19, bArr);
    }

    /* renamed from: ZIDL_AV */
    public void m113660x1964d17d(long j17, long j18, byte[] bArr, byte[] bArr2, boolean z17, long j19, long j27) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.b bVar = this.f298927a;
        e50.v vVar = (e50.v) bVar;
        p3325xe03a0797.p3326xc267989b.l.d(vVar.f331078a, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new e50.u(j17, j18, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), bArr2, z17, j19, vVar, null), 2, null);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.b) obj;
        this.f298927a = bVar;
        e50.v vVar = (e50.v) bVar;
        vVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "setCallback: " + this);
        vVar.f331079b = this;
    }
}
