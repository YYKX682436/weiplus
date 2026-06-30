package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class h implements ls0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f71693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f71694d;

    public h(java.lang.String str, java.lang.String str2, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, long j17) {
        this.f71691a = str;
        this.f71692b = str2;
        this.f71693c = videoTransPara;
        this.f71694d = j17;
    }

    @Override // ls0.m
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "mediaCodecRemuxer remux onFinish");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelvideoh265toh264.j.e(0, this.f71694d);
            java.lang.Object obj = com.tencent.mm.modelvideoh265toh264.j.f71695a;
            synchronized (obj) {
                try {
                    obj.notifyAll();
                    com.tencent.mm.modelvideoh265toh264.j.f71696b = true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferUtil", e17, "wait mediaCodecRemuxer error", new java.lang.Object[0]);
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TransferUtil", "MediaCodecRemuxer remux failed, ret path is null, retry x264");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 244L, 1L, false);
        try {
            com.tencent.mm.modelvideoh265toh264.j.c(this.f71691a, this.f71692b, this.f71693c, this.f71694d);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer error!!!");
            com.tencent.mm.modelvideoh265toh264.j.e(-1, this.f71694d);
        }
        java.lang.Object obj2 = com.tencent.mm.modelvideoh265toh264.j.f71695a;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
                com.tencent.mm.modelvideoh265toh264.j.f71696b = true;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferUtil", e18, "wait mediaCodecRemuxer error", new java.lang.Object[0]);
            }
        }
    }
}
