package db5;

/* loaded from: classes15.dex */
public class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.n8 f309974d;

    public m8(db5.n8 n8Var) {
        this.f309974d = n8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.n8 n8Var = this.f309974d;
        n8Var.f309983c.f279141d.mo79307x5037c3c6().getValues(n8Var.f309982b);
        float f17 = n8Var.f309982b[5];
        float mo45732x7520af94 = n8Var.f309983c.f279141d.mo45732x7520af94() * n8Var.f309983c.f279141d.mo79180x47e2bd2c();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = n8Var.f309983c;
        int i17 = c21520x5bb48e5e.f279146i;
        float f18 = (mo45732x7520af94 < ((float) i17) ? (i17 / 2.0f) - (mo45732x7520af94 / 2.0f) : 0.0f) - f17;
        db5.f0 f0Var = c21520x5bb48e5e.f279141d;
        if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            f18 = -((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationY();
        }
        if (f18 >= 0.0f) {
            n8Var.f310116a = true;
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            n8Var.f310116a = true;
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        n8Var.f309983c.f279141d.c(0.0f, f18);
        db5.f0 f0Var2 = n8Var.f309983c.f279141d;
        if (f0Var2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var2).y(0.0f, f18);
        }
    }
}
