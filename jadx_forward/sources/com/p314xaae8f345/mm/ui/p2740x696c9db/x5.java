package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.y5 f292437d;

    public x5(com.p314xaae8f345.mm.ui.p2740x696c9db.y5 y5Var) {
        this.f292437d = y5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.y5 y5Var = this.f292437d;
        y5Var.f292456c.f291589e.getImageMatrix().getValues(y5Var.f292455b);
        float f17 = y5Var.f292455b[2];
        float mo45732x7520af94 = y5Var.f292456c.f291589e.mo45732x7520af94() * y5Var.f292456c.f291589e.mo79182x97cbed21();
        int i17 = y5Var.f292456c.f291590f;
        float f18 = (mo45732x7520af94 < ((float) i17) ? (i17 / 2.0f) - (mo45732x7520af94 / 2.0f) : 0.0f) - f17;
        if (f18 >= 0.0f) {
            y5Var.f292133a = true;
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            y5Var.f292133a = true;
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        y5Var.f292456c.f291589e.c(f18, 0.0f);
    }
}
