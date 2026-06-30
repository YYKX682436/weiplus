package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.n f223690d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.gif.n nVar) {
        this.f223690d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.gif.n nVar = this.f223690d;
        if (uptimeMillis >= nVar.B) {
            nVar.invalidateSelf();
        }
    }
}
