package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* renamed from: com.tencent.wechat.aff.chatbot.ZIDL_PpcIJ66fB */
/* loaded from: classes11.dex */
class C27221xf58e5b8 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m0 f297587a;

    /* renamed from: ZIDL_AX */
    private native void m111985x1964d17f(long j17, long j18, byte[] bArr);

    public void Q1(long j17, java.lang.String str) {
        m111985x1964d17f(this.f60633xf042a733, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: ZIDL_AV */
    public void m111986x1964d17d(long j17) {
        wx.a aVar = (wx.a) this.f297587a;
        aVar.getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("chatbot");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.f531935a, "get user cache path:" + c17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l0 l0Var = aVar.f531936b;
        if (l0Var != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.C27221xf58e5b8) l0Var).Q1(j17, c17);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m0 m0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.m0) obj;
        this.f297587a = m0Var;
        ((wx.a) m0Var).f531936b = this;
    }
}
