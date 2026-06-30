package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p962x4177e4be.g f153210d;

    public f(com.p314xaae8f345.mm.p962x4177e4be.g gVar) {
        this.f153210d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p962x4177e4be.g gVar = this.f153210d;
        if (gVar.f153216f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "delay to stop decoder");
            try {
                gVar.f153216f.y();
                gVar.f153216f.q();
                gVar.f153216f = null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecTranscodeDecoder", e17, "delay to stop decoder error: %s", e17.getMessage());
            }
        }
    }
}
