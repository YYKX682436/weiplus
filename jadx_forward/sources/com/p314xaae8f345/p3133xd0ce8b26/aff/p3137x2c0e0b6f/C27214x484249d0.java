package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* renamed from: com.tencent.wechat.aff.chatbot.ZIDL_BW9_jv1TB */
/* loaded from: classes14.dex */
class C27214x484249d0 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h0 f297585a;

    /* renamed from: ZIDL_AX */
    private native void m111876x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_AV */
    public void m111877x1964d17d(long j17, byte[][] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h0 h0Var = this.f297585a;
        java.util.ArrayList<java.lang.String> m119643x3ed538a1 = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119643x3ed538a1(bArr);
        ((wx.o) h0Var).getClass();
        for (hy.a0 a0Var : hy.b0.f367261a.a()) {
            a0Var.f367257d.post(new hy.d(a0Var, m119643x3ed538a1));
        }
    }

    /* renamed from: ZIDL_B */
    public byte[] m111878x9db8edfa() {
        ((wx.o) this.f297585a).getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i0 i0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.i0.f297798y;
        wo.s1 s1Var = wo.t1.f529333a;
        i0Var.f297799d = s1Var.a();
        boolean[] zArr = i0Var.f297816x;
        zArr[1] = true;
        i0Var.f297800e = wo.r.a();
        zArr[2] = true;
        i0Var.f297801f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(wo.r.e(), 0);
        zArr[3] = true;
        i0Var.f297802g = s1Var.b();
        zArr[4] = true;
        i0Var.f297803h = lp0.b.X() + "/ilink";
        zArr[5] = true;
        i0Var.f297804i = android.os.Build.VERSION.INCREMENTAL;
        zArr[6] = true;
        i0Var.f297805m = wo.w0.m();
        zArr[7] = true;
        i0Var.f297806n = android.os.Build.DISPLAY;
        zArr[8] = true;
        i0Var.f297807o = android.os.Build.VERSION.RELEASE;
        zArr[9] = true;
        i0Var.f297808p = android.os.Build.MANUFACTURER;
        zArr[10] = true;
        i0Var.f297809q = lp0.b.h() + "voip/Models";
        zArr[11] = true;
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(wo.w0.g(false));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        char[] charArray = a17.toCharArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(charArray.length);
        for (char c17 : charArray) {
            arrayList.add(java.lang.Integer.valueOf(c17));
        }
        i0Var.f297810r.addAll(arrayList);
        zArr[12] = true;
        java.lang.String format = java.lang.String.format("0x%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        i0Var.f297811s = format;
        zArr[13] = true;
        i0Var.f297812t = android.os.Build.VERSION.RELEASE;
        zArr[14] = true;
        return i0Var.m75963xebb06ba0();
    }

    /* renamed from: ZIDL_C */
    public byte[] m111879x9db8edfb() {
        ((wx.o) this.f297585a).getClass();
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f0().m75963xebb06ba0();
    }

    /* renamed from: ZIDL_D */
    public byte[] m111880x9db8edfc(int i17) {
        ((wx.o) this.f297585a).getClass();
        return java.lang.String.valueOf(i17).getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h0 h0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h0) obj;
        this.f297585a = h0Var;
        h0Var.getClass();
    }
}
