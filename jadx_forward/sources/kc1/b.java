package kc1;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f387803a;

    /* renamed from: b, reason: collision with root package name */
    public final float f387804b;

    /* renamed from: c, reason: collision with root package name */
    public final float f387805c;

    /* renamed from: d, reason: collision with root package name */
    public final float f387806d;

    /* renamed from: e, reason: collision with root package name */
    public final float f387807e;

    public b(kc1.f fVar, float[] fArr) {
        this.f387803a = 0.0f;
        this.f387804b = 0.0f;
        this.f387805c = 0.0f;
        this.f387806d = 0.0f;
        this.f387807e = 0.0f;
        if (fArr == null || fArr.length != 5) {
            return;
        }
        this.f387803a = fArr[0];
        this.f387804b = fArr[1];
        this.f387805c = fArr[2];
        this.f387806d = fArr[3];
        this.f387807e = fArr[4];
    }
}
