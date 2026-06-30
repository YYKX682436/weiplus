package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class n9 implements yn.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f286442d;

    public n9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h9 h9Var) {
    }

    @Override // yn.l
    public void E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingEnterAnimEnd");
    }

    @Override // yn.l
    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingExitAnimEnd releasePrepareLiteApp");
    }

    @Override // yn.l
    public void K() {
        yb5.d dVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingExitAnimStart");
        java.lang.ref.WeakReference weakReference = this.f286442d;
        if (weakReference == null || (dVar = (yb5.d) weakReference.get()) == null) {
            return;
        }
        c01.n2.d().e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m9.a(dVar));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4) ((yn.j) dVar.f542241c.a(yn.j.class))).c(this);
    }

    @Override // yn.l
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingInit");
    }

    @Override // yn.l
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingResume");
    }

    @Override // yn.l
    public void y() {
    }

    @Override // yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingEnterAnimStart");
    }
}
