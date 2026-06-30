package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.g6 f291949d;

    public f6(com.p314xaae8f345.mm.ui.p2740x696c9db.g6 g6Var) {
        this.f291949d = g6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.g6 g6Var = this.f291949d;
        g6Var.f291973c.f291589e.getImageMatrix().getValues(g6Var.f291972b);
        float f17 = g6Var.f291972b[5];
        float mo45732x7520af94 = g6Var.f291973c.f291589e.mo45732x7520af94() * g6Var.f291973c.f291589e.mo79180x47e2bd2c();
        int i17 = g6Var.f291973c.f291591g;
        float f18 = (mo45732x7520af94 < ((float) i17) ? (i17 / 2.0f) - (mo45732x7520af94 / 2.0f) : 0.0f) - f17;
        if (f18 >= 0.0f) {
            g6Var.f292133a = true;
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            g6Var.f292133a = true;
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        g6Var.f291973c.f291589e.c(0.0f, f18);
    }
}
