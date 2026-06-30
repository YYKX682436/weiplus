package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.c6 f291833d;

    public b6(com.p314xaae8f345.mm.ui.p2740x696c9db.c6 c6Var) {
        this.f291833d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c6 c6Var = this.f291833d;
        c6Var.f291846c.f291589e.getImageMatrix().getValues(c6Var.f291845b);
        float mo45732x7520af94 = c6Var.f291846c.f291589e.mo45732x7520af94() * c6Var.f291846c.f291589e.mo79182x97cbed21();
        float f17 = c6Var.f291845b[2] + mo45732x7520af94;
        int i17 = c6Var.f291846c.f291590f;
        float f18 = i17;
        if (mo45732x7520af94 < i17) {
            f18 = (i17 / 2.0f) + (mo45732x7520af94 / 2.0f);
        }
        float f19 = f18 - f17;
        if (f19 <= 0.0f) {
            c6Var.f292133a = true;
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            c6Var.f292133a = true;
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        c6Var.f291846c.f291589e.c(f19, 0.0f);
    }
}
