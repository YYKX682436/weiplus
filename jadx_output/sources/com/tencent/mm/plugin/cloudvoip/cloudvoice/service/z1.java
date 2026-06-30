package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f96148d;

    public z1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
        this.f96148d = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "wechat VoIP call is coming and broken. exit room if in room");
        this.f96148d.k(dz.k.ReasonInCommingCall);
    }
}
