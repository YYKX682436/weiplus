package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class u0 implements com.tencent.mars.magicbox.IPxxLogic.ICallBack {

    /* renamed from: a, reason: collision with root package name */
    public static long f72145a;

    /* renamed from: b, reason: collision with root package name */
    public static int f72146b;

    public final void a(int i17, int i18, long j17, long j18) {
        try {
            com.tencent.mm.network.y yVar = com.tencent.mm.network.x2.c().f72002w;
            if (yVar == null) {
                return;
            }
            try {
                yVar.Q7(i17, i18, j17, j18);
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        } catch (java.lang.Exception e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("IPxxCallback", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
        }
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public java.lang.String getCrashFilePath(int i17) {
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis() - (i17 * 86400000));
        java.lang.String str = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd").format(date) + ".txt";
        if (com.tencent.mm.vfs.w6.j(str)) {
            return str;
        }
        return null;
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public java.lang.String getUploadLogExtrasInfo(java.lang.String str) {
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Device:");
            stringBuffer.append(o45.wf.f343025c);
            stringBuffer.append(" ");
            stringBuffer.append(wo.q.f447784e);
            stringBuffer.append("\n");
            return stringBuffer.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public void recoverLinkAddrs() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).recoverLinkAddrs();
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public void reportKv(int i17, java.lang.String str) {
        jx3.f.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public void setNewDnsDebugHostInfo(java.lang.String str, int i17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setNewDnsDebugHost(str, i17 + "");
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public void uploadLogFail(int i17) {
        f72146b = 0;
        a(i17, -1, 0L, 0L);
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public void uploadLogResponse(int i17, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("IPxxCallback", "ipxx progress totalSize:%d uploadSize:%d lastPercent:%d ", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(f72146b));
        long i18 = com.tencent.mm.sdk.platformtools.t8.i1();
        if (i18 - 1 < f72145a) {
            return;
        }
        f72145a = i18;
        int i19 = (j18 < 0 || j17 <= 0 || j18 >= j17) ? 0 : (int) ((100 * j18) / j17);
        if (i19 > 100) {
            i19 = 100;
        }
        int i27 = f72146b;
        int i28 = i27 > i19 ? i27 : i19;
        f72146b = i28;
        a(i17, i28, j17, j18);
    }

    @Override // com.tencent.mars.magicbox.IPxxLogic.ICallBack
    public void uploadLogSuccess(int i17) {
        f72146b = 0;
        a(i17, 100, 0L, 0L);
    }
}
