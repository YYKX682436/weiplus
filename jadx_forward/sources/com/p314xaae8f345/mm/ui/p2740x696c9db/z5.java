package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.a6 f292476d;

    public z5(com.p314xaae8f345.mm.ui.p2740x696c9db.a6 a6Var) {
        this.f292476d = a6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.a6 a6Var = this.f292476d;
        android.view.View selectedView = a6Var.f291805b.getSelectedView();
        if (selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) selectedView;
            float f17 = -c21537x5f41189f.getTranslationX();
            if (f17 >= 0.0f) {
                a6Var.f292133a = true;
            } else if (java.lang.Math.abs(f17) <= 5.0f) {
                a6Var.f292133a = true;
            } else {
                f17 = 2.0f * (-((float) (java.lang.Math.abs(f17) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f17)) - 1.0d, 2.0d))));
            }
            c21537x5f41189f.y(f17, 0.0f);
        }
    }
}
