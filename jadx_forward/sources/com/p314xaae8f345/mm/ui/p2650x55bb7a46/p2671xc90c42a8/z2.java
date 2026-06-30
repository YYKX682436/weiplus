package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class z2 implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a3 f284111d;

    public z2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a3 a3Var) {
        this.f284111d = a3Var;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        zb5.g gVar;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a3 a3Var = this.f284111d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[requestExitSelectedMode] %s del size:%s job:%s", currentThread, java.lang.Integer.valueOf(a3Var.f283640e.size()), e3Var);
        if (e3Var != ot0.e3.del || (gVar = a3Var.f283641f.f283889d) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) gVar).X6();
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        if (e3Var == ot0.e3.del) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a3 a3Var = this.f284111d;
            a3Var.f283641f.f283890e.removeAll(a3Var.f283640e);
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
