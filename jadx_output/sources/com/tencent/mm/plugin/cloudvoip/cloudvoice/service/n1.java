package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95966f;

    public n1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar, boolean z17) {
        this.f95966f = p0Var;
        this.f95964d = bVar;
        this.f95965e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f95966f;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2 r2Var = p0Var.f96024o;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2 r2Var2 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = this.f95964d;
        if (r2Var != r2Var2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
            if (bVar != null) {
                bVar.a(-10086, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "not in room", "");
                return;
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p pVar = p0Var.f96018g.f95969a;
        pVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MyshiftSpeaker beSpeakerphoneOn: ");
        boolean z17 = this.f95965e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker ignoreBluetooth: false");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("MyshiftSpeaker isAvailable: ");
        ew1.a aVar = pVar.f96006c;
        sb7.append(aVar.f257032l != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb7.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isSpeakerSetFailed: " + aVar.f257031k);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("MyshiftSpeaker isBluetoothScoAvailable: ");
        android.media.AudioManager audioManager = aVar.c();
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        sb8.append(audioManager.isBluetoothScoAvailableOffCall());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb8.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isBluetoothScoOn: " + aVar.k());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isHeadsetPlugged: " + aVar.l());
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isSpeakerphoneOn: " + aVar.n());
        boolean C = (z17 && (aVar.k() || aVar.l())) ? false : aVar.C(z17, false);
        if (bVar != null) {
            if (C) {
                bVar.a(0, 0, "ok", "");
            } else {
                bVar.a(-10086, -15, "set handsFree failed", "");
            }
        }
    }
}
