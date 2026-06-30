package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.TenpayCgiImpl */
/* loaded from: classes9.dex */
public class C3259xfbc6163a implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3604x21e64cfa {
    private static final java.lang.String TAG = "WXP";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3604x21e64cfa
    /* renamed from: request */
    public void mo25956x414ef28f(int i17, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.util.HashMap<java.lang.String, java.lang.String> hashMap2, com.p314xaae8f345.p347x615374d.gen.AbstractC3605xf145375f abstractC3605xf145375f) {
        java.lang.String.format("requestTenpay: cgiId:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3253xbc01215a c3253xbc01215a = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3253xbc01215a(i17, str, hashMap, hashMap2, abstractC3605xf145375f);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(c3253xbc01215a);
        java.lang.String.format("MMCore.getNetSceneQueue().doScene %s", c3253xbc01215a);
    }
}
