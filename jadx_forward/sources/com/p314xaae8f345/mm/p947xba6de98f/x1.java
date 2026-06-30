package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.y1 f152692d;

    public x1(com.p314xaae8f345.mm.p947xba6de98f.y1 y1Var) {
        this.f152692d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "appForegroundListener onAppBackground");
        com.p314xaae8f345.mm.p947xba6de98f.y1 y1Var = this.f152692d;
        com.p314xaae8f345.mm.p947xba6de98f.h2.c(y1Var.f152699d);
        java.util.Iterator it = y1Var.f152699d.f152517e.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p947xba6de98f.g2 g2Var = (com.p314xaae8f345.mm.p947xba6de98f.g2) y1Var.f152699d.f152517e.remove(((java.util.Map.Entry) it.next()).getKey());
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = g2Var != null ? g2Var.m48073x9616526c() : "null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "remove %s", objArr);
        }
    }
}
