package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f67733d;

    public t3(long j17) {
        this.f67733d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchVoipInterrupted: ");
        long j18 = this.f67733d;
        sb6.append(j18);
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", sb6.toString());
        int h17 = dr0.a3.f242403d.a().h();
        dr0.p1 a17 = dr0.p1.f242489d.a();
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        android.app.ApplicationExitInfo b17 = a17.b(PROCESS_MAIN, h17);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("voipIdList", kz5.b0.c(java.lang.Long.valueOf(j18)));
        if (b17 != null) {
            new com.tencent.mm.feature.performance.s3(linkedHashMap).invoke(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, b17);
            j17 = java.lang.System.currentTimeMillis() - b17.getTimestamp();
            i17 = b17.getReason();
            str = dr0.t3.a(b17);
        } else {
            j17 = -1;
            i17 = -1;
            str = "NotSupported";
        }
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = java.lang.String.valueOf(j17 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        strArr[1] = java.lang.String.valueOf(i17);
        strArr[2] = str;
        if (b17 == null || (str2 = b17.getDescription()) == null) {
            str2 = "";
        }
        strArr[3] = str2;
        ap.a.a(1, "voipInterruptErr2", null, linkedHashMap, strArr);
    }
}
