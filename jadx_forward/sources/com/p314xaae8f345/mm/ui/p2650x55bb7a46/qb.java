package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f284156d;

    public qb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar) {
        this.f284156d = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar = this.f284156d;
        if (tbVar.m158354x19263085().isFinishing() || tbVar.m158354x19263085().isDestroyed()) {
            return;
        }
        tbVar.T6();
    }
}
