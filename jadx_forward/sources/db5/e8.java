package db5;

/* loaded from: classes15.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.f8 f309861d;

    public e8(db5.f8 f8Var) {
        this.f309861d = f8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.f8 f8Var = this.f309861d;
        f8Var.f309867c.f279141d.mo79307x5037c3c6().getValues(f8Var.f309866b);
        float mo45732x7520af94 = f8Var.f309867c.f279141d.mo45732x7520af94() * f8Var.f309867c.f279141d.mo79180x47e2bd2c();
        float f17 = f8Var.f309866b[5] + mo45732x7520af94;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = f8Var.f309867c;
        int i17 = c21520x5bb48e5e.f279146i;
        float f18 = i17;
        if (mo45732x7520af94 < i17) {
            f18 = (i17 / 2.0f) + (mo45732x7520af94 / 2.0f);
        }
        float f19 = f18 - f17;
        db5.f0 f0Var = c21520x5bb48e5e.f279141d;
        if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            f19 = -((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationY();
        }
        if (f19 <= 0.0f) {
            f8Var.f310116a = true;
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            f8Var.f310116a = true;
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        f8Var.f309867c.f279141d.c(0.0f, f19);
        db5.f0 f0Var2 = f8Var.f309867c.f279141d;
        if (f0Var2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var2).y(0.0f, f19);
        }
    }
}
