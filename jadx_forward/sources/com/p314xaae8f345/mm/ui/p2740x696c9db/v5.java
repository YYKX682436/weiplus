package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.w5 f292375d;

    public v5(com.p314xaae8f345.mm.ui.p2740x696c9db.w5 w5Var) {
        this.f292375d = w5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        float f18;
        float f19;
        com.p314xaae8f345.mm.ui.p2740x696c9db.w5 w5Var = this.f292375d;
        w5Var.f292408c.f291589e.getImageMatrix().getValues(w5Var.f292407b);
        float mo45732x7520af94 = w5Var.f292408c.f291589e.mo45732x7520af94() * w5Var.f292408c.f291589e.mo79182x97cbed21();
        float mo45732x7520af942 = w5Var.f292408c.f291589e.mo45732x7520af94() * w5Var.f292408c.f291589e.mo79180x47e2bd2c();
        float[] fArr = w5Var.f292407b;
        float f27 = fArr[2];
        float f28 = fArr[5];
        float f29 = f27 + mo45732x7520af94;
        float f37 = f28 + mo45732x7520af942;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = w5Var.f292408c;
        int i17 = c22506x89e75b89.f291591g;
        float f38 = i17;
        int i18 = c22506x89e75b89.f291590f;
        float f39 = i18;
        if (mo45732x7520af942 < i17) {
            float f47 = mo45732x7520af942 / 2.0f;
            f18 = (i17 / 2.0f) - f47;
            f17 = f47 + (i17 / 2.0f);
        } else {
            f17 = f38;
            f18 = 0.0f;
        }
        float f48 = f18 - f28;
        float f49 = f17 - f37;
        if (f48 >= 0.0f) {
            f48 = f49 > 0.0f ? f49 : 0.0f;
        }
        if (mo45732x7520af94 < i18) {
            float f57 = mo45732x7520af94 / 2.0f;
            f19 = (i18 / 2.0f) - f57;
            f39 = (i18 / 2.0f) + f57;
        } else {
            f19 = 0.0f;
        }
        float f58 = f19 - f27;
        float f59 = f39 - f29;
        if (f58 >= 0.0f) {
            f58 = f59 > 0.0f ? f59 : 0.0f;
        }
        if (java.lang.Math.abs(f58) > 5.0f || java.lang.Math.abs(f48) > 5.0f) {
            f58 = (f58 >= 0.0f ? (float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)))) * 2.0f;
            f48 = (f48 >= 0.0f ? (float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)))) * 2.0f;
        } else {
            w5Var.f292133a = true;
        }
        w5Var.f292408c.f291589e.c(f58, f48);
    }
}
