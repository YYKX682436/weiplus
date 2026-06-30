package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.o f301994a;

    public n(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.l lVar) {
        this.f301994a = null;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        if (m120281x9cf0d20b == null) {
            return;
        }
        try {
            this.f301994a = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p(new by5.h0(m120281x9cf0d20b.m120198xfefc2a39("ProfileStore"), new java.lang.Class[0]).a(new java.lang.Object[0]));
        } catch (java.lang.UnsupportedOperationException e17) {
            by5.c4.d("ProfileStore", "ProfileStore constructor for pinus error", e17);
        }
    }

    public com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.k a(java.lang.String str) {
        by5.i0 i0Var;
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.o oVar = this.f301994a;
        if (oVar == null) {
            return null;
        }
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p pVar = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p) oVar;
        pVar.getClass();
        try {
            synchronized (pVar) {
                i0Var = pVar.f301996b;
                if (i0Var == null) {
                    i0Var = new by5.i0(pVar.f301995a, "getOrCreateProfile", java.lang.String.class);
                    pVar.f301996b = i0Var;
                }
            }
            java.lang.Object b17 = i0Var.b(str);
            if (b17 == null) {
                return null;
            }
            return new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.k(b17);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
