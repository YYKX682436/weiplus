package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b f177497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f177498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177499f;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar, boolean z17) {
        this.f177499f = p0Var;
        this.f177497d = bVar;
        this.f177498e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = this.f177499f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2 r2Var = p0Var.f177557o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2 r2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2.InRoom;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = this.f177497d;
        if (r2Var != r2Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
            if (bVar != null) {
                bVar.a(-10086, com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "not in room", "");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p pVar = p0Var.f177551g.f177502a;
        pVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MyshiftSpeaker beSpeakerphoneOn: ");
        boolean z17 = this.f177498e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker ignoreBluetooth: false");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("MyshiftSpeaker isAvailable: ");
        ew1.a aVar = pVar.f177539c;
        sb7.append(aVar.f338565l != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb7.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isSpeakerSetFailed: " + aVar.f338564k);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("MyshiftSpeaker isBluetoothScoAvailable: ");
        android.media.AudioManager audioManager = aVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
        sb8.append(audioManager.isBluetoothScoAvailableOffCall());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb8.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isBluetoothScoOn: " + aVar.k());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isHeadsetPlugged: " + aVar.l());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isSpeakerphoneOn: " + aVar.n());
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
