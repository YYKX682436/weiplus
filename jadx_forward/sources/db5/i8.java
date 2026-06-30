package db5;

/* loaded from: classes15.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.j8 f309930d;

    public i8(db5.j8 j8Var) {
        this.f309930d = j8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.j8 j8Var = this.f309930d;
        j8Var.f309945c.f279141d.mo79307x5037c3c6().getValues(j8Var.f309944b);
        float f17 = j8Var.f309944b[2];
        float mo45732x7520af94 = j8Var.f309945c.f279141d.mo45732x7520af94() * j8Var.f309945c.f279141d.mo79182x97cbed21();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = j8Var.f309945c;
        int i17 = c21520x5bb48e5e.f279145h;
        float f18 = (mo45732x7520af94 < ((float) i17) ? (i17 / 2.0f) - (mo45732x7520af94 / 2.0f) : 0.0f) - f17;
        db5.f0 f0Var = c21520x5bb48e5e.f279141d;
        if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            f18 = -((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationX();
        }
        if (f18 >= 0.0f) {
            j8Var.f310116a = true;
            db5.f0 f0Var2 = j8Var.f309945c.f279141d;
            if (f0Var2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var2).m45737x3a5986f(false);
            }
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            j8Var.f310116a = true;
            db5.f0 f0Var3 = j8Var.f309945c.f279141d;
            if (f0Var3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var3).m45737x3a5986f(false);
            }
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        j8Var.f309945c.f279141d.c(f18, 0.0f);
        db5.f0 f0Var4 = j8Var.f309945c.f279141d;
        if (f0Var4 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var4).y(f18, 0.0f);
        }
    }
}
