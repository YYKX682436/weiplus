package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.u5 f292305d;

    public t5(com.p314xaae8f345.mm.ui.p2740x696c9db.u5 u5Var) {
        this.f292305d = u5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.u5 u5Var = this.f292305d;
        u5Var.f292345c.f291589e.getImageMatrix().getValues(u5Var.f292344b);
        float mo45732x7520af94 = u5Var.f292345c.f291589e.mo45732x7520af94() * u5Var.f292345c.f291589e.mo79180x47e2bd2c();
        float f17 = u5Var.f292344b[5] + mo45732x7520af94;
        int i17 = u5Var.f292345c.f291591g;
        float f18 = i17;
        if (mo45732x7520af94 < i17) {
            f18 = (i17 / 2.0f) + (mo45732x7520af94 / 2.0f);
        }
        float f19 = f18 - f17;
        if (f19 <= 0.0f) {
            u5Var.f292133a = true;
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            u5Var.f292133a = true;
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        u5Var.f292345c.f291589e.c(0.0f, f19);
    }
}
