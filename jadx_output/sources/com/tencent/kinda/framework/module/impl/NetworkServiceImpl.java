package com.tencent.kinda.framework.module.impl;

/* loaded from: classes12.dex */
public class NetworkServiceImpl implements com.tencent.kinda.gen.KNetworkService {
    private static final java.lang.String TAG = "MicroMsg.WXPNetworkServiceImpl";

    private byte[] getBaseRequestOnError(int i17) {
        try {
            byte[] bArr = {0, 1};
            r45.he heVar = new r45.he();
            heVar.f376080g = o45.wf.f343029g;
            heVar.f376079f = new com.tencent.mm.protobuf.g(bArr, 0, 2);
            heVar.f376081h = new com.tencent.mm.protobuf.g(bArr, 0, 2);
            heVar.f376082i = i17;
            heVar.f376077d = new com.tencent.mm.protobuf.g(bArr, 0, 2);
            heVar.f376078e = gm0.j1.b().h();
            return heVar.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return new byte[0];
        }
    }

    @Override // com.tencent.kinda.gen.KNetworkService
    public byte[] getBaseRequest(int i17) {
        r45.he heVar = new r45.he();
        byte[] baseRequestOnError = getBaseRequestOnError(i17);
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        if (r1Var == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, new java.lang.Throwable(), "kernel().network().getNetSceneQueue() return null!!", new java.lang.Object[0]);
            return baseRequestOnError;
        }
        com.tencent.mm.network.s sVar = r1Var.f70764d;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, new java.lang.Throwable(), "netSceneQueue.getDispatcher() return null!!", new java.lang.Object[0]);
            return baseRequestOnError;
        }
        com.tencent.mm.network.o G = sVar.G();
        if (G == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, new java.lang.Throwable(), "dispatcher.getAccInfo() return null!!", new java.lang.Object[0]);
            return baseRequestOnError;
        }
        heVar.f376080g = o45.wf.f343029g;
        heVar.f376082i = i17;
        heVar.f376078e = G.getUin();
        gm0.j1.b().h();
        G.getUin();
        G.getUsername();
        G.q();
        G.isLogin();
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(wo.w0.k().getBytes());
        heVar.f376079f = b17;
        if (b17.f192156a.length >= 16) {
            b17.f(16);
            heVar.f376079f = b17;
        }
        com.tencent.mm.protobuf.g b18 = com.tencent.mm.protobuf.g.b(wo.q.f447780a.getBytes());
        heVar.f376081h = b18;
        if (b18.f192156a.length >= 132) {
            b18.f(132);
            heVar.f376081h = b18;
        }
        try {
            heVar.f376077d = com.tencent.mm.protobuf.g.a(new java.lang.String("\u0000"), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.getLocalizedMessage());
        }
        try {
            byte[] byteArray = heVar.toByteArray();
            int length = byteArray.length;
            return byteArray;
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            e18.getMessage();
            return baseRequestOnError;
        }
    }

    @Override // com.tencent.kinda.gen.KNetworkService
    public void invoke(com.tencent.kinda.gen.KCgi kCgi, com.tencent.kinda.gen.KNetworkMockManager kNetworkMockManager) {
        java.lang.Thread.currentThread();
        java.lang.Thread.currentThread().getId();
        gm0.j1.n().f273288b.g(new com.tencent.kinda.framework.module.impl.WXPNetSceneBase(kCgi.getCgiId(), kCgi.getCgiId(), kCgi.getCgiUrl(), kCgi.getChannelType(), kCgi.getTimeout(), kCgi.getRetryCount(), kCgi.getRequestData(), kCgi, kNetworkMockManager));
        kCgi.getCgiUrl();
    }
}
