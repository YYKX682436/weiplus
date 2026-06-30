package db5;

/* loaded from: classes15.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h8 f309886d;

    public g8(db5.h8 h8Var) {
        this.f309886d = h8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        float f18;
        float f19;
        db5.h8 h8Var = this.f309886d;
        h8Var.f309923c.f279141d.mo79307x5037c3c6().getValues(h8Var.f309922b);
        float mo45732x7520af94 = h8Var.f309923c.f279141d.mo45732x7520af94() * h8Var.f309923c.f279141d.mo79182x97cbed21();
        float mo45732x7520af942 = h8Var.f309923c.f279141d.mo45732x7520af94() * h8Var.f309923c.f279141d.mo79180x47e2bd2c();
        float[] fArr = h8Var.f309922b;
        float f27 = fArr[2];
        float f28 = fArr[5];
        float f29 = f27 + mo45732x7520af94;
        float f37 = f28 + mo45732x7520af942;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = h8Var.f309923c;
        int i17 = c21520x5bb48e5e.f279146i;
        float f38 = i17;
        int i18 = c21520x5bb48e5e.f279145h;
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
        db5.f0 f0Var = c21520x5bb48e5e.f279141d;
        if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            f58 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationX();
            f48 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) h8Var.f309923c.f279141d).getTranslationY();
        }
        if (java.lang.Math.abs(f58) > 5.0f || java.lang.Math.abs(f48) > 5.0f) {
            f58 = (f58 >= 0.0f ? (float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f58) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f58)) - 1.0d, 2.0d)))) * 2.0f;
            f48 = (f48 >= 0.0f ? (float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)) : -((float) (java.lang.Math.abs(f48) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f48)) - 1.0d, 2.0d)))) * 2.0f;
        } else {
            h8Var.f310116a = true;
            db5.f0 f0Var2 = h8Var.f309923c.f279141d;
            if (f0Var2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var2).m45737x3a5986f(false);
            }
        }
        h8Var.f309923c.f279141d.c(f58, f48);
        db5.f0 f0Var3 = h8Var.f309923c.f279141d;
        if (f0Var3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var3).y(-f58, -f48);
        }
    }
}
