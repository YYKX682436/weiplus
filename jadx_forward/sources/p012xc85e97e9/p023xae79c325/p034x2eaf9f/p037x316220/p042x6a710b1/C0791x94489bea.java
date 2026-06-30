package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.LongRational */
/* loaded from: classes13.dex */
final class C0791x94489bea {

    /* renamed from: mDenominator */
    private final long f1963x33d6b3b9;

    /* renamed from: mNumerator */
    private final long f1964xe2dd809c;

    public C0791x94489bea(long j17, long j18) {
        this.f1964xe2dd809c = j17;
        this.f1963x33d6b3b9 = j18;
    }

    /* renamed from: getDenominator */
    public long m5917x639fe930() {
        return this.f1963x33d6b3b9;
    }

    /* renamed from: getNumerator */
    public long m5918x6793a7d3() {
        return this.f1964xe2dd809c;
    }

    /* renamed from: toDouble */
    public double m5919x7c386e2c() {
        return this.f1964xe2dd809c / this.f1963x33d6b3b9;
    }

    /* renamed from: toString */
    public java.lang.String m5920x9616526c() {
        return this.f1964xe2dd809c + "/" + this.f1963x33d6b3b9;
    }

    public C0791x94489bea(double d17) {
        this((long) (d17 * 10000.0d), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }
}
