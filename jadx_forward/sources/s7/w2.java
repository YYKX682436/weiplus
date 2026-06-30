package s7;

/* loaded from: classes16.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f485415a;

    /* renamed from: b, reason: collision with root package name */
    public final float f485416b;

    /* renamed from: c, reason: collision with root package name */
    public float f485417c;

    /* renamed from: d, reason: collision with root package name */
    public float f485418d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f485419e = false;

    public w2(s7.f3 f3Var, float f17, float f18, float f19, float f27) {
        this.f485417c = 0.0f;
        this.f485418d = 0.0f;
        this.f485415a = f17;
        this.f485416b = f18;
        double sqrt = java.lang.Math.sqrt((f19 * f19) + (f27 * f27));
        if (sqrt != 0.0d) {
            this.f485417c = (float) (f19 / sqrt);
            this.f485418d = (float) (f27 / sqrt);
        }
    }

    public void a(float f17, float f18) {
        float f19 = f17 - this.f485415a;
        float f27 = f18 - this.f485416b;
        double sqrt = java.lang.Math.sqrt((f19 * f19) + (f27 * f27));
        if (sqrt != 0.0d) {
            f19 = (float) (f19 / sqrt);
            f27 = (float) (f27 / sqrt);
        }
        float f28 = this.f485417c;
        if (f19 != (-f28) || f27 != (-this.f485418d)) {
            this.f485417c = f28 + f19;
            this.f485418d += f27;
        } else {
            this.f485419e = true;
            this.f485417c = -f27;
            this.f485418d = f19;
        }
    }

    public void b(s7.w2 w2Var) {
        float f17 = w2Var.f485417c;
        float f18 = this.f485417c;
        if (f17 == (-f18)) {
            float f19 = w2Var.f485418d;
            if (f19 == (-this.f485418d)) {
                this.f485419e = true;
                this.f485417c = -f19;
                this.f485418d = w2Var.f485417c;
                return;
            }
        }
        this.f485417c = f18 + f17;
        this.f485418d += w2Var.f485418d;
    }

    /* renamed from: toString */
    public java.lang.String m164034x9616526c() {
        return "(" + this.f485415a + "," + this.f485416b + " " + this.f485417c + "," + this.f485418d + ")";
    }
}
