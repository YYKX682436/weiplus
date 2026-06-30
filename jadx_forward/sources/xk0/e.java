package xk0;

/* loaded from: classes10.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f536479a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f536480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f536481c;

    public e(xk0.f fVar, java.util.List list) {
        int size = list.size();
        this.f536481c = size;
        this.f536479a = new float[size];
        this.f536480b = new float[size];
        for (int i17 = 0; i17 < this.f536481c; i17++) {
            this.f536479a[i17] = ((android.graphics.PointF) list.get(i17)).x;
            this.f536480b[i17] = ((android.graphics.PointF) list.get(i17)).y;
        }
    }
}
