package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.NetworkServiceImpl */
/* loaded from: classes12.dex */
public class C3254xffc5bb87 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3485x2846c1d2 {
    private static final java.lang.String TAG = "MicroMsg.WXPNetworkServiceImpl";

    /* renamed from: getBaseRequestOnError */
    private byte[] m25943xb0d89101(int i17) {
        try {
            byte[] bArr = {0, 1};
            r45.he heVar = new r45.he();
            heVar.f457613g = o45.wf.f424562g;
            heVar.f457612f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, 2);
            heVar.f457614h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, 2);
            heVar.f457615i = i17;
            heVar.f457610d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, 2);
            heVar.f457611e = gm0.j1.b().h();
            return heVar.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return new byte[0];
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3485x2846c1d2
    /* renamed from: getBaseRequest */
    public byte[] mo25944xa452ad48(int i17) {
        r45.he heVar = new r45.he();
        byte[] m25943xb0d89101 = m25943xb0d89101(i17);
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        if (r1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, new java.lang.Throwable(), "kernel().network().getNetSceneQueue() return null!!", new java.lang.Object[0]);
            return m25943xb0d89101;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = r1Var.f152297d;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, new java.lang.Throwable(), "netSceneQueue.getDispatcher() return null!!", new java.lang.Object[0]);
            return m25943xb0d89101;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.o G = sVar.G();
        if (G == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, new java.lang.Throwable(), "dispatcher.getAccInfo() return null!!", new java.lang.Object[0]);
            return m25943xb0d89101;
        }
        heVar.f457613g = o45.wf.f424562g;
        heVar.f457615i = i17;
        heVar.f457611e = G.mo9862xb5887524();
        gm0.j1.b().h();
        G.mo9862xb5887524();
        G.mo9863x6c03c64c();
        G.q();
        G.mo9865x7b0e9c5f();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(wo.w0.k().getBytes());
        heVar.f457612f = b17;
        if (b17.f273689a.length >= 16) {
            b17.f(16);
            heVar.f457612f = b17;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b18 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(wo.q.f529313a.getBytes());
        heVar.f457614h = b18;
        if (b18.f273689a.length >= 132) {
            b18.f(132);
            heVar.f457614h = b18;
        }
        try {
            heVar.f457610d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.a(new java.lang.String("\u0000"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getLocalizedMessage());
        }
        try {
            byte[] mo14344x5f01b1f6 = heVar.mo14344x5f01b1f6();
            int length = mo14344x5f01b1f6.length;
            return mo14344x5f01b1f6;
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            e18.getMessage();
            return m25943xb0d89101;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3485x2846c1d2
    /* renamed from: invoke */
    public void mo25945xb9724478(com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a abstractC3437x23203a, com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360 abstractC3484x5b74a360) {
        java.lang.Thread.currentThread();
        java.lang.Thread.currentThread().getId();
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3261x5ce02b8f(abstractC3437x23203a.mo27904x744122ca(), abstractC3437x23203a.mo27904x744122ca(), abstractC3437x23203a.mo27905x13e365a0(), abstractC3437x23203a.mo27906xea2d8da7(), abstractC3437x23203a.mo27912xef7c892b(), abstractC3437x23203a.mo27910xa8e25f3d(), abstractC3437x23203a.mo27909x1e5bbda3(), abstractC3437x23203a, abstractC3484x5b74a360));
        abstractC3437x23203a.mo27905x13e365a0();
    }
}
