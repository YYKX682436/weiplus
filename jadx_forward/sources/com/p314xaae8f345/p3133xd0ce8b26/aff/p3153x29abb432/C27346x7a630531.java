package com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432;

/* renamed from: com.tencent.wechat.aff.local_connection.ZIDL_sqnlB1hUqB */
/* loaded from: classes13.dex */
class C27346x7a630531 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f f298887a;

    /* renamed from: ZIDL_AX */
    private native void m113219x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m113220x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_EX */
    private native void m113221x1964d1fb(long j17, long j18);

    /* renamed from: ZIDL_FX */
    private native void m113222x1964d21a(long j17, long j18, int i17, byte[] bArr, byte[] bArr2);

    /* renamed from: ZIDL_GX */
    private native void m113223x1964d239(long j17, long j18, int i17);

    /* renamed from: ZIDL_IX */
    private native void m113224x1964d277(long j17, long j18);

    /* renamed from: ZIDL_JX */
    private native void m113225x1964d296(long j17, long j18);

    /* renamed from: ZIDL_OX */
    private native void m113226x1964d331(long j17, long j18, byte[] bArr);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e
    public void H0(long j17, bw5.xf0 xf0Var, java.lang.String str, java.lang.String str2) {
        m113222x1964d21a(this.f60633xf042a733, j17, xf0Var.f116632d, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e
    public void P0(long j17, bw5.xf0 xf0Var) {
        m113223x1964d239(this.f60633xf042a733, j17, xf0Var.f116632d);
    }

    public void Q1(long j17, byte[] bArr) {
        m113226x1964d331(this.f60633xf042a733, j17, bArr);
    }

    /* renamed from: ZIDL_AV */
    public void m113227x1964d17d(long j17) {
        ((kp.n) this.f298887a).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearConnectionProviderImpl", "activateAWDLAsync: " + j17);
    }

    /* renamed from: ZIDL_BV */
    public void m113228x1964d19c(long j17) {
        ((kp.n) this.f298887a).getClass();
        throw new java.lang.UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: ZIDL_C */
    public void m113229x9db8edfb() {
        ((kp.i1) ((kp.n) this.f298887a).a()).hj();
    }

    /* renamed from: ZIDL_D */
    public void m113230x9db8edfc() {
        ((kp.i1) ((kp.n) this.f298887a).a()).pj();
    }

    /* renamed from: ZIDL_EV */
    public void m113231x1964d1f9(long j17) {
        this.f298887a.getClass();
    }

    /* renamed from: ZIDL_FV */
    public void m113232x1964d218(long j17) {
        kp.n nVar = (kp.n) this.f298887a;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearConnectionProviderImpl", "createGroupAsync: " + j17);
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) nVar.f392332b).mo141623x754a37bb(), null, null, new kp.j(nVar, j17, null), 3, null);
    }

    /* renamed from: ZIDL_GV */
    public void m113233x1964d237(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f fVar = this.f298887a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        kp.n nVar = (kp.n) fVar;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearConnectionProviderImpl", "connectToGroupAsync: " + j17 + ", networkName: " + str);
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) nVar.f392332b).mo141623x754a37bb(), null, null, new kp.i(nVar, str, str2, j17, null), 3, null);
    }

    /* renamed from: ZIDL_H */
    public void m113234x9db8ee00() {
        kp.n nVar = (kp.n) this.f298887a;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearConnectionProviderImpl", "removeGroup");
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) nVar.f392332b).mo141623x754a37bb(), null, null, new kp.k(nVar, null), 3, null);
    }

    /* renamed from: ZIDL_IV */
    public void m113235x1964d275(long j17) {
        this.f298887a.getClass();
    }

    /* renamed from: ZIDL_JV */
    public void m113236x1964d294(long j17) {
        this.f298887a.getClass();
    }

    /* renamed from: ZIDL_K */
    public void m113237x9db8ee03(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f fVar = this.f298887a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((kp.n) fVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearConnectionProviderImpl", "disconnectFromGroup: ".concat(str));
    }

    /* renamed from: ZIDL_L */
    public int m113238x9db8ee04() {
        this.f298887a.getClass();
        return 0;
    }

    /* renamed from: ZIDL_M */
    public int m113239x9db8ee05() {
        return ((kp.i1) ((kp.n) this.f298887a).a()).cj() ? 1 : 0;
    }

    /* renamed from: ZIDL_N */
    public byte[] m113240x9db8ee06(byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f fVar = this.f298887a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((kp.n) fVar).getClass();
        return new byte[0];
    }

    /* renamed from: ZIDL_OV */
    public void m113241x1964d32f(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f fVar = this.f298887a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.e eVar = ((kp.n) fVar).f392331a;
        if (eVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.C27346x7a630531) eVar).Q1(j17, new byte[0]);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.f) obj;
        this.f298887a = fVar;
        ((kp.n) fVar).f392331a = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearConnectionProviderImpl", "setCallback");
    }
}
