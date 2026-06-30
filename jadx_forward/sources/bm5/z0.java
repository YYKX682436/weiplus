package bm5;

/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f104299a = {-1};

    /* renamed from: b, reason: collision with root package name */
    public final bm5.y0 f104300b;

    public z0(bm5.y0 y0Var) {
        this.f104300b = y0Var;
    }

    public boolean a() {
        int[] iArr = this.f104299a;
        if (-1 == iArr[0]) {
            synchronized (iArr) {
                int[] iArr2 = this.f104299a;
                if (-1 == iArr2[0]) {
                    iArr2[0] = this.f104300b.a() ? 1 : 0;
                    return 1 == this.f104299a[0];
                }
            }
        }
        return 1 == this.f104299a[0];
    }
}
