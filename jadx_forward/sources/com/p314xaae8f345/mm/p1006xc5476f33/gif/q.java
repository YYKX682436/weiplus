package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.u f223718d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar) {
        this.f223718d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = this.f223718d;
        if (uVar.f223724e) {
            return;
        }
        if ((uVar.f223723d || uVar.f223741y == 0) && android.os.SystemClock.uptimeMillis() >= uVar.F) {
            uVar.D = java.lang.System.currentTimeMillis();
            uVar.K = true;
            uVar.invalidateSelf();
        }
    }
}
