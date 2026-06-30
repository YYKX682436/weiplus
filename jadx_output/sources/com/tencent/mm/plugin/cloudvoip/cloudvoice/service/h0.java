package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes8.dex */
public class h0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95913d;

    public h0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l0 l0Var, java.lang.String str) {
        this.f95913d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s invokeAsync result: %s", this.f95913d, ((android.os.Bundle) obj).toString());
    }
}
