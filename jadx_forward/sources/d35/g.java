package d35;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {
    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CDownloadCompleted: ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (c2CDownloadResult != null) {
            if (c2CDownloadResult.f17871x139cb015 == 0) {
                jz5.l lVar = (jz5.l) d35.h.f307878b.get(str);
                if (lVar != null) {
                    java.lang.Object obj = lVar.f384366d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).m124847x74d37ac6()), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).I0()));
                    if (((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).m124847x74d37ac6(), ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).Q0()) == null) {
                        android.util.Pair n17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a0.n((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted info is null, initPair:" + ((java.lang.Boolean) n17.first) + ", " + ((java.lang.String) n17.second));
                    }
                    bt3.l0.J((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj, (java.lang.String) lVar.f384367e);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted pair is null");
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(1680L, 14L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(1680L, 15L, 1L, false);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "cdnCallback downloadTaskMap:" + d35.h.f307878b.size() + ", internal:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileLanDownloadMgr", "onDownloadProgressChanged: " + str + ", " + j17 + ", " + j18 + ", " + z17);
    }
}
