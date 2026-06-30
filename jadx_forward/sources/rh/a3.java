package rh;

/* loaded from: classes12.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c3 f476837d;

    public a3(rh.c3 c3Var) {
        this.f476837d = c3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.c3 c3Var = this.f476837d;
        try {
            try {
                java.lang.Number number = (java.lang.Number) c3Var.f476875c.mo40854x58b836e(c3Var);
                if (!number.equals(rh.c3.f476872o)) {
                    c3Var.f476883k = number.doubleValue();
                    int i17 = c3Var.f476879g + 1;
                    c3Var.f476879g = i17;
                    double d17 = c3Var.f476886n * (i17 - 1);
                    double d18 = c3Var.f476883k;
                    c3Var.f476886n = (d17 + d18) / i17;
                    if (c3Var.f476882j == Double.MIN_VALUE) {
                        c3Var.f476882j = d18;
                        c3Var.f476884l = d18;
                        c3Var.f476885m = d18;
                    } else {
                        if (d18 > c3Var.f476884l) {
                            c3Var.f476884l = d18;
                        }
                        if (d18 < c3Var.f476885m) {
                            c3Var.f476885m = d18;
                        }
                    }
                }
                if (c3Var.f476877e) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                oj.j.d("Matrix.battery.Sampler", e17, "onSamplingFailed: " + e17, new java.lang.Object[0]);
                if (c3Var.f476877e) {
                    return;
                }
            }
            c3Var.f476874b.postDelayed(this, c3Var.f476878f);
        } catch (java.lang.Throwable th6) {
            if (!c3Var.f476877e) {
                c3Var.f476874b.postDelayed(this, c3Var.f476878f);
            }
            throw th6;
        }
    }
}
