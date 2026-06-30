package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelvideoh265toh264.g f71677d;

    public f(com.tencent.mm.modelvideoh265toh264.g gVar) {
        this.f71677d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelvideoh265toh264.g gVar = this.f71677d;
        if (gVar.f71683f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "delay to stop decoder");
            try {
                gVar.f71683f.y();
                gVar.f71683f.q();
                gVar.f71683f = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", e17, "delay to stop decoder error: %s", e17.getMessage());
            }
        }
    }
}
