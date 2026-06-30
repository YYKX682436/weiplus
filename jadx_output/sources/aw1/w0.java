package aw1;

/* loaded from: classes12.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14699d;

    public w0(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        this.f14699d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ot1.j W0 = ot1.j.W0();
        int[] kMediaSubTypeAppMessageThumb = ot1.h.B1;
        kotlin.jvm.internal.o.f(kMediaSubTypeAppMessageThumb, "kMediaSubTypeAppMessageThumb");
        android.database.Cursor f17 = W0.f348849d.f("SELECT msgSubType,diskSpace,path FROM WxFileIndex3 WHERE msgSubType in ".concat(kz5.z.c0(kMediaSubTypeAppMessageThumb, ",", "(", ")", 0, null, null, 56, null)), null, 0);
        long j17 = 0;
        while (true) {
            if (!f17.moveToNext()) {
                break;
            }
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f14699d;
            if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportImageAndVideoService", "scanAppMessageThumb cursor.moveToNext break");
                break;
            } else {
                f17.getInt(0);
                j17 += f17.getLong(1);
            }
        }
        f17.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportImageAndVideoService", "scanAppMessageThumb, totalSize = " + j17);
        com.tencent.mm.sdk.platformtools.o4.L().B("image_report_appmsg_thumbTotalSize", j17);
        long j18 = com.tencent.mm.sdk.platformtools.o4.L().getLong("extreme_storage_wechat_total", -1L);
        if (j18 > 0) {
            com.tencent.mm.sdk.platformtools.o4.L().A("image_report_appmsg_thumbTotalRatio", (int) ((((float) j17) / ((float) j18)) * 100));
        }
        com.tencent.mm.sdk.platformtools.o4.L().B("scanAppMessageThumbTime", java.lang.System.currentTimeMillis());
    }
}
