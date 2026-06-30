package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.y1 f71159d;

    public x1(com.tencent.mm.modelcdntran.y1 y1Var) {
        this.f71159d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "appForegroundListener onAppBackground");
        com.tencent.mm.modelcdntran.y1 y1Var = this.f71159d;
        com.tencent.mm.modelcdntran.h2.c(y1Var.f71166d);
        java.util.Iterator it = y1Var.f71166d.f70984e.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelcdntran.g2 g2Var = (com.tencent.mm.modelcdntran.g2) y1Var.f71166d.f70984e.remove(((java.util.Map.Entry) it.next()).getKey());
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = g2Var != null ? g2Var.toString() : "null";
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "remove %s", objArr);
        }
    }
}
