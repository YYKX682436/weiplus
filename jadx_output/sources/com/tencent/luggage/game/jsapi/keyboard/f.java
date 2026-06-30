package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47208d;

    public f(com.tencent.luggage.game.jsapi.keyboard.g gVar, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f47208d = e9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ie.d N;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = this.f47208d.V0();
        if (V0 == null || (N = ie.d.N(V0.getContentView())) == null) {
            return;
        }
        N.z();
    }
}
