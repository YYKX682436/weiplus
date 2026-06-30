package cn2;

/* loaded from: classes3.dex */
public final class m extends android.animation.IntEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f125105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125106b;

    /* renamed from: c, reason: collision with root package name */
    public final float f125107c;

    public m(int i17, int i18, yz5.p pVar) {
        this.f125105a = pVar;
        int i19 = (i18 + i17) / i17;
        this.f125106b = i19;
        this.f125107c = 1 / i19;
    }

    public java.lang.Integer a(float f17, int i17, int i18) {
        float f18 = this.f125107c;
        yz5.p pVar = this.f125105a;
        if (f17 < f18) {
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Float.valueOf(f17), java.lang.Boolean.TRUE);
            }
            i18 = (int) (i17 + ((i18 - i17) * f17 * this.f125106b));
        } else if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Float.valueOf(f17), java.lang.Boolean.FALSE);
        }
        return java.lang.Integer.valueOf(i18);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.IntEvaluator
    public /* bridge */ /* synthetic */ java.lang.Integer evaluate(float f17, java.lang.Integer num, java.lang.Integer num2) {
        return a(f17, num.intValue(), num2.intValue());
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ java.lang.Integer evaluate(float f17, java.lang.Integer num, java.lang.Integer num2) {
        return a(f17, num.intValue(), num2.intValue());
    }
}
