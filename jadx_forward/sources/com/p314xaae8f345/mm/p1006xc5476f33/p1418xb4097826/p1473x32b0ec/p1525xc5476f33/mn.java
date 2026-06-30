package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class mn extends android.animation.FloatEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f195073a;

    /* renamed from: b, reason: collision with root package name */
    public final float f195074b;

    public mn(int i17, int i18, yz5.p pVar) {
        this.f195073a = pVar;
        this.f195074b = (i17 * 1.0f) / (i17 + i18);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public java.lang.Float evaluate(float f17, java.lang.Number number, java.lang.Number number2) {
        float floatValue;
        float f18 = this.f195074b;
        yz5.p pVar = this.f195073a;
        if (f17 < f18) {
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Float.valueOf(f17), java.lang.Boolean.TRUE);
            }
            if (number != null && number2 != null) {
                floatValue = number.floatValue() + (((number2.floatValue() - number.floatValue()) * f17) / f18);
            } else {
                return java.lang.Float.valueOf(0.0f);
            }
        } else {
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Float.valueOf(f17), java.lang.Boolean.FALSE);
            }
            java.lang.Float f19 = number2 instanceof java.lang.Float ? (java.lang.Float) number2 : null;
            floatValue = f19 != null ? f19.floatValue() : 1.0f;
        }
        return java.lang.Float.valueOf(floatValue);
    }
}
