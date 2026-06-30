package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class s3 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 f269066d;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var) {
        this.f269066d = u3Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebViewClient", "onServiceConnected");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.f269066d;
        if (u3Var.f269082b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebViewClient", "onServiceConnected, activity destroyed");
            return;
        }
        try {
            u3Var.f269084d = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t0.d(iBinder);
            u3Var.f269084d.rg(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t3(new java.lang.ref.WeakReference(u3Var.B)), u3Var.f269082b.hashCode());
            android.os.Bundle bundle = u3Var.f269088h;
            if (bundle != null) {
                u3Var.f269084d.pb(bundle, u3Var.f269082b.hashCode());
            }
            u3Var.J();
            u3Var.L();
            u3Var.S(u3Var.f269084d, u3Var.f269085e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebViewClient", "addCallback fail, ex = %s", e17.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebViewClient", "edw onServiceDisconnected");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.f269066d;
        if (u3Var.f269082b.f292909y) {
            u3Var.f269084d = null;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebViewClient", "maybe mm process crash, try rebind service");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebViewClient", "tryBindService");
        android.content.MutableContextWrapper mutableContextWrapper = u3Var.f269081a;
        mutableContextWrapper.bindService(new android.content.Intent(mutableContextWrapper, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.class), u3Var.A, 1);
    }
}
