package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 f178727d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 y0Var) {
        this.f178727d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 y0Var = this.f178727d;
        try {
            java.util.Iterator it = y0Var.f178736e.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0.g(y0Var, java.lang.Long.valueOf(((java.lang.Long) it.next()).longValue()));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", e17.getMessage());
        }
    }
}
