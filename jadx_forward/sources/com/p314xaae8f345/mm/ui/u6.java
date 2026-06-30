package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface f292603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.v6 f292604e;

    public u6(com.p314xaae8f345.mm.ui.v6 v6Var, android.content.DialogInterface dialogInterface) {
        this.f292604e = v6Var;
        this.f292603d = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean E = c01.d9.b().E();
        com.p314xaae8f345.mm.ui.v6 v6Var = this.f292604e;
        if (E) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("had_detected_no_sdcard_space", true);
            j45.l.j(v6Var.f292640d.f290983a, "clean", ".ui.CleanUI", intent, null);
        } else {
            db5.t7.k(v6Var.f292640d.f290983a, null);
        }
        this.f292603d.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(282L, 1L, 1L, false);
    }
}
