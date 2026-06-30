package kk;

/* loaded from: classes7.dex */
public class v extends java.lang.Number {

    /* renamed from: d, reason: collision with root package name */
    public final int f390011d;

    public v(int i17) {
        this.f390011d = 0;
        this.f390011d = i17;
    }

    public static java.lang.String a(int i17) {
        return new kk.v(i17).m143587x9616526c();
    }

    public static int b(java.lang.String str) {
        try {
            return new kk.v(java.lang.Long.valueOf(str).longValue()).f390011d;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return (this.f390011d | 0) + 0.0d;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) ((this.f390011d | 0) + 0.0d);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f390011d;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f390011d & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
    }

    /* renamed from: toString */
    public java.lang.String m143587x9616526c() {
        return "" + (this.f390011d & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    public v(long j17) {
        this.f390011d = 0;
        this.f390011d = (int) (j17 & (-1));
    }
}
