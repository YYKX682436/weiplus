package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* renamed from: com.tencent.wechat.aff.favorites.ZIDL_jqzaE9_PB */
/* loaded from: classes8.dex */
class C27300x6f8c7947 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.s f298260a;

    /* renamed from: ZIDL_BX */
    private native void m112692x1964d19e(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_FX */
    private native void m112693x1964d21a(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_GX */
    private native void m112694x1964d239(long j17, long j18, int i17, java.lang.String str);

    /* renamed from: ZIDL_IX */
    private native void m112695x1964d277(long j17, long j18, int i17, java.lang.String str);

    /* renamed from: ZIDL_A */
    public java.lang.String m112696x9db8edf9() {
        ((u72.a) this.f298260a).getClass();
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("favorite");
        if (c17 == null) {
            c17 = "";
        }
        if (c17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoritesNativeUtilImpl", "getRootPath: failed");
        }
        java.lang.String b17 = com.p314xaae8f345.mm.vfs.x6.b(c17, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "exportExternalPath(...)");
        return b17;
    }

    /* renamed from: ZIDL_BV */
    public void m112697x1964d19c(long j17) {
        this.f298260a.getClass();
    }

    /* renamed from: ZIDL_C */
    public java.lang.String m112698x9db8edfb(java.lang.String str) {
        ((u72.a) this.f298260a).getClass();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getDisplayName(...)");
        return e17;
    }

    /* renamed from: ZIDL_D */
    public java.lang.String m112699x9db8edfc() {
        ((u72.a) this.f298260a).getClass();
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        return k17;
    }

    /* renamed from: ZIDL_E */
    public long m112700x9db8edfd() {
        ((u72.a) this.f298260a).getClass();
        return gm0.j1.b().h();
    }

    /* renamed from: ZIDL_FV */
    public void m112701x1964d218(long j17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.s sVar = this.f298260a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m.f298365i, bArr);
        ((u72.a) sVar).getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadMessageAsync: ");
        sb6.append(j17);
        sb6.append(", ");
        sb6.append(mVar != null ? mVar.b() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoritesNativeUtilImpl", sb6.toString());
    }

    /* renamed from: ZIDL_GV */
    public void m112702x1964d237(long j17, long j18, java.lang.String str, boolean z17, java.lang.String str2, int[] iArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.s sVar = this.f298260a;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119589x2cbe0a03(iArr);
        sVar.getClass();
    }

    /* renamed from: ZIDL_H */
    public java.lang.String m112703x9db8ee00(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.s sVar = this.f298260a;
        sVar.getClass();
        return "";
    }

    /* renamed from: ZIDL_IV */
    public void m112704x1964d275(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, long j18) {
        this.f298260a.getClass();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.s) obj;
        this.f298260a = sVar;
        sVar.getClass();
    }
}
