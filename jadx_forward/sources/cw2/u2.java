package cw2;

/* loaded from: classes2.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.w2 f305570d;

    public u2(cw2.w2 w2Var) {
        this.f305570d = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        cw2.w2 w2Var = this.f305570d;
        if (w2Var.f305614f) {
            return;
        }
        w2Var.f305614f = true;
        az2.f fVar = w2Var.f305610b;
        if (fVar != null) {
            fVar.b();
        }
        p012xc85e97e9.p093xedfae76a.k0 k0Var = w2Var.f305611c;
        if (k0Var != null && (j0Var = w2Var.f305612d) != null) {
            j0Var.mo522xb5bdeb7a(k0Var);
        }
        w2Var.f305613e = null;
        w2Var.f305615g = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFullSeekBarLayoutListenVideo", "initListenVideoBtn timeout, clear state");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2137, 5);
        android.content.Context context = w2Var.f305609a;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f574393of3);
        e4Var.c();
    }
}
