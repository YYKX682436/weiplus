package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 f265872e;

    public a3(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var) {
        this.f265871d = i17;
        this.f265872e = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74;
        db5.d5 d5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var = this.f265872e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c742 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) j3Var.f265985b.get();
        if (abstractActivityC19367xd1ae8c742 != null) {
            abstractActivityC19367xd1ae8c742.da(j3Var.D);
        }
        android.content.Context context = j3Var.f265984a;
        if (this.f265871d == 12) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mul);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(string);
            u1Var.a(true);
            u1Var.c(null, null);
            u1Var.q(false);
        } else {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mum);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var2.g(string2);
            u1Var2.a(true);
            u1Var2.c(null, null);
            u1Var2.q(false);
        }
        db5.d5 d5Var2 = j3Var.f265995l;
        if (d5Var2 != null) {
            if ((d5Var2.isShowing()) && (d5Var = j3Var.f265995l) != null) {
                d5Var.dismiss();
            }
        }
        java.lang.ref.WeakReference weakReference = j3Var.f265985b;
        if (weakReference == null || (abstractActivityC19367xd1ae8c74 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) weakReference.get()) == null) {
            return;
        }
        abstractActivityC19367xd1ae8c74.R9();
    }
}
