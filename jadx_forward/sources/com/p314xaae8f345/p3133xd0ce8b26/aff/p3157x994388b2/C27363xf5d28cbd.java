package com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2;

/* renamed from: com.tencent.wechat.aff.mm_foundation.ZIDL_JhX8nIbfB */
/* loaded from: classes8.dex */
class C27363xf5d28cbd extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.c f298928a;

    /* renamed from: ZIDL_A */
    public byte[] m113661x9db8edf9(byte[] bArr) {
        f50.a0 a0Var;
        ((e50.x) this.f298928a).getClass();
        java.util.HashMap hashMap = f50.u.f341124a;
        r45.s33 s33Var = new r45.s33();
        if (bArr != null) {
            try {
                s33Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        r45.t33 t33Var = new r45.t33();
        java.lang.String str = s33Var.f466995d;
        if (!(str == null || str.length() == 0) && (a0Var = (f50.a0) f50.u.f341124a.get(s33Var.f466995d)) != null) {
            byte[] g17 = s33Var.f466997f.g();
            java.lang.String str2 = s33Var.f466996e;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f c17 = a0Var.c(g17, str2 != null ? str2 : "");
            if (c17 != null) {
                t33Var.f467625d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c17.mo14344x5f01b1f6());
            }
        }
        byte[] mo14344x5f01b1f6 = t33Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return mo14344x5f01b1f6;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f298928a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.c) obj;
    }
}
