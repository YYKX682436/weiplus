package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface f291076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.r6 f291077e;

    public q6(com.p314xaae8f345.mm.ui.r6 r6Var, android.content.DialogInterface dialogInterface) {
        this.f291077e = r6Var;
        this.f291076d = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean E = c01.d9.b().E();
        com.p314xaae8f345.mm.ui.r6 r6Var = this.f291077e;
        if (E) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("had_detected_no_sdcard_space", true);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
            j45.l.j(r6Var.f291132d.f290983a, "clean", ".ui.CleanUI", intent, null);
        } else {
            db5.t7.k(r6Var.f291132d.f290983a, null);
        }
        this.f291076d.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(282L, 1L, 1L, false);
    }
}
