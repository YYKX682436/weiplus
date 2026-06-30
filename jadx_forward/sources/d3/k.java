package d3;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f307630a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f307631b;

    public k(java.util.List list, java.util.List list2) {
        int size = list.size();
        this.f307630a = new int[size];
        this.f307631b = new float[size];
        for (int i17 = 0; i17 < size; i17++) {
            this.f307630a[i17] = ((java.lang.Integer) list.get(i17)).intValue();
            this.f307631b[i17] = ((java.lang.Float) list2.get(i17)).floatValue();
        }
    }

    public k(int i17, int i18) {
        this.f307630a = new int[]{i17, i18};
        this.f307631b = new float[]{0.0f, 1.0f};
    }

    public k(int i17, int i18, int i19) {
        this.f307630a = new int[]{i17, i18, i19};
        this.f307631b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
