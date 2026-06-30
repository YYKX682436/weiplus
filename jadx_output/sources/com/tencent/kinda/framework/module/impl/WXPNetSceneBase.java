package com.tencent.kinda.framework.module.impl;

/* loaded from: classes12.dex */
public class WXPNetSceneBase extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {
    private static final java.lang.String TAG = "MicroMsg.KindaLibWXPNetSceneBase";
    private com.tencent.kinda.gen.KCgi cgi;
    private int cgiId;
    private java.lang.String cgiUri;
    private com.tencent.mm.modelbase.u0 onSceneEndCallback;
    private int respCmdId = 0;
    private com.tencent.kinda.framework.module.impl.WXPCommReqResp wxpCommReqResp;

    /* renamed from: com.tencent.kinda.framework.module.impl.WXPNetSceneBase$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$KindaNewDNSBusinessType;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.KindaNewDNSBusinessType.values().length];
            $SwitchMap$com$tencent$kinda$gen$KindaNewDNSBusinessType = iArr;
            try {
                iArr[com.tencent.kinda.gen.KindaNewDNSBusinessType.PAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    public WXPNetSceneBase(int i17, int i18, java.lang.String str, int i19, int i27, int i28, byte[] bArr, com.tencent.kinda.gen.KCgi kCgi, com.tencent.kinda.gen.KNetworkMockManager kNetworkMockManager) {
        this.cgiId = i18;
        this.cgiUri = str;
        this.cgi = kCgi;
        com.tencent.kinda.framework.module.impl.WXPCommReqResp wXPCommReqResp = new com.tencent.kinda.framework.module.impl.WXPCommReqResp(bArr, str, i18, i17, 0, true, i28, i27, kCgi.getRouteInfo(), kNetworkMockManager);
        this.wxpCommReqResp = wXPCommReqResp;
        wXPCommReqResp.setNewDNSBusinessType(getCgiNewDNSBusinessType(kCgi));
        setIsKinda(true);
        com.tencent.mars.xlog.Log.i(TAG, "init scene: cgiId:%d, cgiUri:%s ", java.lang.Integer.valueOf(i18), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearField() {
        this.cgi = null;
        if (this.wxpCommReqResp != null) {
            this.wxpCommReqResp = null;
        }
    }

    private int getCgiNewDNSBusinessType(com.tencent.kinda.gen.KCgi kCgi) {
        return com.tencent.kinda.framework.module.impl.WXPNetSceneBase.AnonymousClass3.$SwitchMap$com$tencent$kinda$gen$KindaNewDNSBusinessType[kCgi.getNewDNSBusinessType().ordinal()] != 1 ? 0 : 2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        com.tencent.mars.xlog.Log.e(TAG, "cancel: thread when doScene: %s, thread id: %d, cgiUri: %s", java.lang.Thread.currentThread(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this.cgiUri);
        super.cancel();
        if (this.cgi == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.WXPNetSceneBase.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.cgi == null) {
                    return;
                }
                com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.cgi.onResp(1, null, null);
                com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.clearField();
            }
        });
    }

    @Override // com.tencent.mm.modelbase.m1
    public int dispatch(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        return super.dispatch(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.onSceneEndCallback = u0Var;
        rp3.c.a().getClass();
        return dispatch(sVar, this.wxpCommReqResp, this);
    }

    public void finalize() {
        super.finalize();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.cgiId;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, final int i18, final int i19, java.lang.String str, final com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(TAG, "onGYNetEnd: %s, , uri: %s errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(this.cgiId), this.cgiUri, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        final com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp resp = (com.tencent.kinda.framework.module.impl.WXPCommReqResp.Resp) v0Var.getRespObj();
        if (this.cgi == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.WXPNetSceneBase.1
            @Override // java.lang.Runnable
            public void run() {
                r45.xw profile;
                if (com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.cgi == null) {
                    return;
                }
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                hashMap.put("reqHost", v0Var.getReqHost());
                hashMap.put("encryptAlgo", java.lang.Integer.toString(v0Var.getEncryptAlgo()));
                hashMap.put("stn_errCode", java.lang.Integer.toString(i19));
                hashMap.put("stn_errType", java.lang.Integer.toString(i18));
                if (v0Var.getRespObj() != null && (profile = v0Var.getRespObj().getProfile()) != null) {
                    long j17 = profile.f390553w;
                    long j18 = j17 - profile.f390552v;
                    hashMap.put("startTime", java.lang.String.valueOf(j17));
                    hashMap.put("startSendPacketTime", java.lang.String.valueOf(profile.f390541h + j18));
                    hashMap.put("sendPacketFinishedTime", java.lang.String.valueOf(profile.f390542i + j18));
                    hashMap.put("startDecodePacketTime", java.lang.String.valueOf(profile.f390545o + j18));
                    hashMap.put("decodePacketFinishedTime", java.lang.String.valueOf(profile.f390546p + j18));
                    hashMap.put("rtt", java.lang.String.valueOf(profile.f390548r));
                    hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, profile.f390551u);
                }
                int i27 = i18;
                if (i27 == 0) {
                    com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.cgi.onResp(0, resp.getResponseWrapper().getData(), hashMap);
                } else if (i27 == 4 && i19 == -102) {
                    com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.cgi.onResp(351, null, hashMap);
                } else {
                    com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.cgi.onResp(1, null, hashMap);
                }
                com.tencent.kinda.framework.module.impl.WXPNetSceneBase.this.clearField();
            }
        });
        this.onSceneEndCallback.onSceneEnd(i18, i19, str, this);
    }
}
