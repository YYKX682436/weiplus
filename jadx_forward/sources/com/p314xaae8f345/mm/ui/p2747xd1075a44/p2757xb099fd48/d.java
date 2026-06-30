package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f f293294d;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar) {
        this.f293294d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar = this.f293294d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = fVar.f293318c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        fVar.f293318c = null;
    }
}
