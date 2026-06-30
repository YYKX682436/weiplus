package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.e6 f291886d;

    public d6(com.p314xaae8f345.mm.ui.p2740x696c9db.e6 e6Var) {
        this.f291886d = e6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.e6 e6Var = this.f291886d;
        android.view.View selectedView = e6Var.f291908b.getSelectedView();
        if (selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) selectedView;
            float f17 = -c21537x5f41189f.getTranslationX();
            if (f17 >= 0.0f) {
                e6Var.f292133a = true;
            } else if (java.lang.Math.abs(f17) <= 5.0f) {
                e6Var.f292133a = true;
            } else {
                f17 = 2.0f * ((float) (java.lang.Math.abs(f17) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f17)) - 1.0d, 2.0d)));
            }
            c21537x5f41189f.y(f17, 0.0f);
        }
    }
}
