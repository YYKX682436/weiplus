package com.tencent.liteapp.framework.dynamic_module.network;

/* loaded from: classes12.dex */
public class PayMarsLiteAppScene extends com.tencent.kinda.framework.module.impl.WXPNetSceneBase {
    private static final int CASHIER_PRIORITY = 100;
    private static final java.lang.String TAG = "MicroMsg.paymars.scene.android";
    private final int cgiId;
    private final java.lang.String cgiUri;
    private final java.util.concurrent.atomic.AtomicLong nativeCallbackPtr;
    private static final com.tencent.kinda.framework.module.impl.NetworkServiceImpl sNetworkService = new com.tencent.kinda.framework.module.impl.NetworkServiceImpl();
    private static final com.tencent.kinda.framework.module.impl.KindaCrtServiceImpl sCrtService = new com.tencent.kinda.framework.module.impl.KindaCrtServiceImpl();

    public PayMarsLiteAppScene(long j17, int i17, int i18, java.lang.String str, int i19, int i27, int i28, byte[] bArr, com.tencent.kinda.gen.KCgi kCgi) {
        super(i17, i18, str, i19, i27, i28, bArr, kCgi, null);
        this.nativeCallbackPtr = new java.util.concurrent.atomic.AtomicLong(j17);
        this.cgiId = i18;
        this.cgiUri = str;
        setPriority(100);
        com.tencent.mars.xlog.Log.i(TAG, "init: cgiId:%d, cgiUri:%s, nativePtr:%d", java.lang.Integer.valueOf(i18), str, java.lang.Long.valueOf(j17));
    }

    public static java.lang.String crtSign(byte[] bArr) {
        try {
            if (bArr == null) {
                com.tencent.mars.xlog.Log.e(TAG, "crtSign: data is null");
                return null;
            }
            com.tencent.kinda.framework.module.impl.KindaCrtServiceImpl kindaCrtServiceImpl = sCrtService;
            if (!kindaCrtServiceImpl.hasCrt()) {
                com.tencent.mars.xlog.Log.e(TAG, "crtSign: hasCrt=false, dataSize:%d", java.lang.Integer.valueOf(bArr.length));
                return null;
            }
            java.lang.String crtNo = kindaCrtServiceImpl.getCrtNo();
            if (crtNo != null && !crtNo.isEmpty()) {
                java.lang.String sign = kindaCrtServiceImpl.sign(crtNo, bArr);
                if (sign != null && !sign.isEmpty()) {
                    com.tencent.mars.xlog.Log.i(TAG, "crtSign: success, crtNo:%s, dataSize:%d, signLen:%d", crtNo, java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(sign.length()));
                    return "{\"crtNo\":\"" + crtNo + "\",\"sign\":\"" + sign + "\"}";
                }
                com.tencent.mars.xlog.Log.w(TAG, "crtSign: sign returned empty, crtNo:%s, dataSize:%d", crtNo, java.lang.Integer.valueOf(bArr.length));
                return null;
            }
            com.tencent.mars.xlog.Log.e(TAG, "crtSign: getCrtNo returned empty despite hasCrt=true");
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "crtSign error: %s", th6.getMessage());
            return null;
        }
    }

    public static byte[] getBaseRequest(int i17) {
        try {
            byte[] baseRequest = sNetworkService.getBaseRequest(i17);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(baseRequest != null ? baseRequest.length : 0);
            com.tencent.mars.xlog.Log.i(TAG, "getBaseRequest: scene:%d, resultSize:%d", objArr);
            return baseRequest;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "getBaseRequest error: %s", th6.getMessage());
            return null;
        }
    }

    private static native void nativeOnTaskEnd(long j17, byte[] bArr, int i17, int i18, int i19, java.lang.String str);

    public static int startRequest(long j17, byte[] bArr, java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        objArr[3] = java.lang.Integer.valueOf(i19);
        objArr[4] = java.lang.Integer.valueOf(i27);
        objArr[5] = java.lang.Integer.valueOf(i28);
        objArr[6] = java.lang.Thread.currentThread().getName();
        com.tencent.mars.xlog.Log.i(TAG, "startRequest: cgiId:%d, cgiUrl:%s, reqSize:%d, timeout:%d, retry:%d, channel:%d, thread:%s", objArr);
        com.tencent.mm.modelbase.f3 f3Var = com.tencent.mm.modelbase.z2.f70847b;
        com.tencent.mm.modelbase.r1 r1Var = f3Var != null ? ((gm0.n) f3Var).f273260a.f273288b : null;
        if (r1Var == null) {
            com.tencent.mars.xlog.Log.e(TAG, "startRequest: NetSceneQueue not ready");
            return -1;
        }
        if (r1Var.h(new com.tencent.liteapp.framework.dynamic_module.network.PayMarsLiteAppScene(j17, i18, i17, str, i28, i19, i27, bArr, new fd.c(i17, str)), 0)) {
            com.tencent.mars.xlog.Log.i(TAG, "startRequest: queued ok, cgiId:%d, priority:%d", java.lang.Integer.valueOf(i17), 100);
            return 0;
        }
        com.tencent.mars.xlog.Log.e(TAG, "startRequest: queue.doScene rejected, cgiId:%d", java.lang.Integer.valueOf(i17));
        return -1;
    }

    @Override // com.tencent.kinda.framework.module.impl.WXPNetSceneBase, com.tencent.mm.modelbase.m1
    public void cancel() {
        com.tencent.mars.xlog.Log.w(TAG, "cancel: cgiId:%d, nativePtr:%d", java.lang.Integer.valueOf(this.cgiId), java.lang.Long.valueOf(this.nativeCallbackPtr.get()));
        super.cancel();
        long andSet = this.nativeCallbackPtr.getAndSet(0L);
        if (andSet != 0) {
            nativeOnTaskEnd(andSet, null, 3, -1, 0, "canceled");
        }
    }

    @Override // com.tencent.kinda.framework.module.impl.WXPNetSceneBase, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        int i28;
        byte[] bArr2;
        int i29;
        java.lang.String str2;
        byte[] bArr3;
        int i37;
        if (i18 == 0) {
            i28 = -1;
            try {
                com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp resp = (com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp) v0Var.getRespObj();
                if (resp == null || resp.getResponseWrapper() == null) {
                    com.tencent.mars.xlog.Log.e(TAG, "onGYNetEnd: resp or responseWrapper is null despite errType=OK");
                    bArr3 = null;
                    i37 = 0;
                    str2 = "response wrapper is null";
                    i27 = 3;
                } else {
                    byte[] data = resp.getResponseWrapper().getData();
                    i28 = i19;
                    i37 = resp.getRetCode();
                    bArr3 = data;
                    i27 = i18;
                    str2 = str;
                }
                i29 = i37;
                bArr2 = bArr3;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(TAG, "onGYNetEnd extract resp error: %s", th6.getMessage());
                bArr2 = null;
                i29 = 0;
                str2 = "extract resp failed: " + th6.getMessage();
                i27 = 3;
            }
        } else {
            i27 = i18;
            i28 = i19;
            bArr2 = null;
            i29 = 0;
            str2 = str;
        }
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(this.cgiId);
        objArr[2] = java.lang.Integer.valueOf(i27);
        objArr[3] = java.lang.Integer.valueOf(i28);
        objArr[4] = java.lang.Integer.valueOf(i29);
        objArr[5] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
        objArr[6] = java.lang.Thread.currentThread().getName();
        com.tencent.mars.xlog.Log.i(TAG, "onGYNetEnd: netId:%d, cgiId:%d, errType:%d, errCode:%d, retCode:%d, respSize:%d, thread:%s", objArr);
        long andSet = this.nativeCallbackPtr.getAndSet(0L);
        if (andSet != 0) {
            nativeOnTaskEnd(andSet, bArr2, i27, i28, i29, str2);
        }
        com.tencent.mm.modelbase.u0 queueCallback = getQueueCallback();
        if (queueCallback != null) {
            queueCallback.onSceneEnd(i27, i28, str2, this);
        } else {
            com.tencent.mars.xlog.Log.w(TAG, "onGYNetEnd: queueCallback is null, scene may not be managed by queue");
        }
    }
}
