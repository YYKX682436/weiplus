package bm5;

/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f22766a = {-1};

    /* renamed from: b, reason: collision with root package name */
    public final bm5.y0 f22767b;

    public z0(bm5.y0 y0Var) {
        this.f22767b = y0Var;
    }

    public boolean a() {
        int[] iArr = this.f22766a;
        if (-1 == iArr[0]) {
            synchronized (iArr) {
                int[] iArr2 = this.f22766a;
                if (-1 == iArr2[0]) {
                    iArr2[0] = this.f22767b.a() ? 1 : 0;
                    return 1 == this.f22766a[0];
                }
            }
        }
        return 1 == this.f22766a[0];
    }
}
