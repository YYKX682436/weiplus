package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f129113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface f129114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd f129115f;

    public j(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface nativeCallBackInterface) {
        this.f129115f = c3932x19b83abd;
        this.f129113d = tVar;
        this.f129114e = nativeCallBackInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding InitCallBack ");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd = this.f129115f;
        if (c3932x19b83abd.f15700xee6151ec != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding  udpNative != null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) this.f129113d.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding v8Addon is null");
            return;
        }
        z17 = c3932x19b83abd.f15701x9af8eb22;
        if (z17) {
            c3932x19b83abd.f15700xee6151ec = new com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            c3932x19b83abd.f15700xee6151ec = new com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc(l0Var.L(), l0Var.G(), 0L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "createWxAudioBinding InitCallBack ret:%d", java.lang.Integer.valueOf(c3932x19b83abd.f15700xee6151ec.m46444x8696a1b5(this.f129114e)));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6277x7b363fbe c6277x7b363fbe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6277x7b363fbe();
        c6277x7b363fbe.f136526g.getClass();
        c6277x7b363fbe.e();
    }
}
