package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h2 f71185d;

    public z1(com.tencent.mm.modelcdntran.h2 h2Var) {
        this.f71185d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCrashTask onAppForeground = ");
        com.tencent.mm.modelcdntran.h2 h2Var = this.f71185d;
        sb6.append(h2Var.f70992p);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", sb6.toString());
        if (h2Var.f70992p) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : h2Var.f70985f.entrySet()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - ((com.tencent.mm.modelcdntran.f2) entry.getValue()).f70950d;
            long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_cdn_callback_tooslow_crash_maxtime, u04.d.f423477c);
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "getToolSlowCrashMaxTime:" + Ui);
            if (currentTimeMillis > java.lang.Math.max(u04.d.f423477c, Ui) && ((com.tencent.mm.modelcdntran.f2) entry.getValue()).f70951e == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "tooSlowlist add:" + ((com.tencent.mm.modelcdntran.f2) entry.getValue()).f70948b);
                arrayList.add((com.tencent.mm.modelcdntran.f2) entry.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkCrashTaskd");
        sb7.append(h2Var.f70992p);
        sb7.append(", ");
        sb7.append(h2Var.f70989m == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", sb7.toString());
        if (h2Var.f70992p) {
            return;
        }
        java.lang.Thread thread = h2Var.f70989m;
        if (thread != null) {
            for (java.lang.StackTraceElement stackTraceElement : thread.getStackTrace()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportService", stackTraceElement.toString());
            }
        }
        com.tencent.mm.modelcdntran.g2 g2Var = (com.tencent.mm.modelcdntran.g2) arrayList.get(0);
        com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
        errorMsgInfoStruct.f56113e = 1040L;
        errorMsgInfoStruct.p(g2Var.f70948b);
        errorMsgInfoStruct.f56112d = java.lang.System.currentTimeMillis() - g2Var.f70950d;
        errorMsgInfoStruct.o();
        errorMsgInfoStruct.k();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("assert(before sleep)");
        sb8.append(h2Var.f70992p);
        sb8.append(", ");
        sb8.append(h2Var.f70989m == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", sb8.toString());
        h2Var.getClass();
        java.lang.String a17 = j62.e.g().a("clicfg_cdn_callback_allow_slowcrash", "0", false, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "getIsAllowSlowCrash() sw:%s", a17);
        if (com.tencent.mm.sdk.platformtools.t8.D0(a17, "1")) {
            try {
                java.lang.Thread.sleep(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            } catch (java.lang.InterruptedException unused) {
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("assert(after sleep)");
            sb9.append(h2Var.f70992p);
            sb9.append(", ");
            sb9.append(h2Var.f70989m == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", sb9.toString());
            if (h2Var.f70992p) {
                return;
            }
            iz5.a.h("Cdn callback too Slow: " + ((com.tencent.mm.modelcdntran.f2) arrayList.get(0)).f70948b);
            throw null;
        }
    }
}
