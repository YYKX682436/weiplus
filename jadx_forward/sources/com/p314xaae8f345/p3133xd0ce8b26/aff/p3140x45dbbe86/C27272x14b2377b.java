package com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86;

/* renamed from: com.tencent.wechat.aff.emoticon.ZIDL_QiUbpaAjB */
/* loaded from: classes8.dex */
class C27272x14b2377b extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.a f298165a;

    /* renamed from: ZIDL_A */
    public boolean m112499x9db8edf9(byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.a aVar = this.f298165a;
        bw5.b0 b0Var = (bw5.b0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(bw5.b0.f107001f, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b) aVar).getClass();
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return com.p314xaae8f345.mm.vfs.w6.R(str, fp.i0.a(b0Var)) != 0;
    }

    /* renamed from: ZIDL_B */
    public byte[] m112500x9db8edfa(byte[] bArr) {
        java.lang.String M;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.a aVar = this.f298165a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b) aVar).getClass();
        bw5.b0 b0Var = new bw5.b0();
        try {
            if (com.p314xaae8f345.mm.vfs.w6.j(str) && (M = com.p314xaae8f345.mm.vfs.w6.M(str)) != null) {
                java.nio.charset.Charset charset = r26.c.f450398a;
                byte[] bytes = M.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                b0Var.mo11468x92b714fd(bytes);
                byte[] bytes2 = M.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                b0Var.f107003e = bytes2.length;
            }
        } catch (java.lang.Exception e17) {
            java.lang.System.out.println((java.lang.Object) ("read file fail: " + e17.getMessage()));
        }
        return b0Var.m75963xebb06ba0();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f298165a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.a) obj;
    }
}
