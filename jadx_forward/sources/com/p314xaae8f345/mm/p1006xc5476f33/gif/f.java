package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.k f223664d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar) {
        this.f223664d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = this.f223664d;
        if ((kVar.f223670d || kVar.f223683t == 0) && android.os.SystemClock.uptimeMillis() >= kVar.A) {
            kVar.f223688y = java.lang.System.currentTimeMillis();
            kVar.I = true;
            kVar.invalidateSelf();
            com.p314xaae8f345.mm.p1006xc5476f33.gif.x xVar = kVar.F;
            if (xVar != null) {
                xVar.mo65006x92d0313b();
            }
        }
    }
}
