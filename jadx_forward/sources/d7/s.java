package d7;

/* loaded from: classes13.dex */
public class s extends d7.v {
    @Override // d7.v
    public d7.u a(int i17, int i18, int i19, int i27) {
        return d7.v.f308377g ? d7.u.QUALITY : d7.u.MEMORY;
    }

    @Override // d7.v
    public float b(int i17, int i18, int i19, int i27) {
        if (d7.v.f308377g) {
            return java.lang.Math.min(i19 / i17, i27 / i18);
        }
        if (java.lang.Math.max(i18 / i27, i17 / i19) == 0) {
            return 1.0f;
        }
        return 1.0f / java.lang.Integer.highestOneBit(r2);
    }
}
