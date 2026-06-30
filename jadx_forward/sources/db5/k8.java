package db5;

/* loaded from: classes15.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.l8 f309956d;

    public k8(db5.l8 l8Var) {
        this.f309956d = l8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.l8 l8Var = this.f309956d;
        l8Var.f309967c.f279141d.mo79307x5037c3c6().getValues(l8Var.f309966b);
        float mo45732x7520af94 = l8Var.f309967c.f279141d.mo45732x7520af94() * l8Var.f309967c.f279141d.mo79182x97cbed21();
        float f17 = l8Var.f309966b[2] + mo45732x7520af94;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = l8Var.f309967c;
        int i17 = c21520x5bb48e5e.f279145h;
        float f18 = i17;
        if (mo45732x7520af94 < i17) {
            f18 = (i17 / 2.0f) + (mo45732x7520af94 / 2.0f);
        }
        float f19 = f18 - f17;
        db5.f0 f0Var = c21520x5bb48e5e.f279141d;
        if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            f19 = -((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationX();
        }
        if (f19 <= 0.0f) {
            l8Var.f310116a = true;
            db5.f0 f0Var2 = l8Var.f309967c.f279141d;
            if (f0Var2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var2).m45737x3a5986f(false);
            }
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            l8Var.f310116a = true;
            db5.f0 f0Var3 = l8Var.f309967c.f279141d;
            if (f0Var3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var3).m45737x3a5986f(false);
            }
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        l8Var.f309967c.f279141d.c(f19, 0.0f);
        db5.f0 f0Var4 = l8Var.f309967c.f279141d;
        if (f0Var4 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var4).y(f19, 0.0f);
        }
    }
}
