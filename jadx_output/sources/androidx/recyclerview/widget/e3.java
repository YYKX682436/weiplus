package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    public int f12011a;

    /* renamed from: b, reason: collision with root package name */
    public int f12012b;

    /* renamed from: d, reason: collision with root package name */
    public int f12014d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12016f = false;

    /* renamed from: c, reason: collision with root package name */
    public int f12013c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Interpolator f12015e = null;

    public e3(int i17, int i18) {
        this.f12011a = i17;
        this.f12012b = i18;
    }

    public void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i17 = this.f12014d;
        if (i17 >= 0) {
            this.f12014d = -1;
            recyclerView.F0(i17);
            this.f12016f = false;
            return;
        }
        if (this.f12016f) {
            android.view.animation.Interpolator interpolator = this.f12015e;
            if (interpolator != null && this.f12013c < 1) {
                throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i18 = this.f12013c;
            if (i18 < 1) {
                throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
            }
            if (interpolator != null) {
                recyclerView.C1.c(this.f12011a, this.f12012b, i18, interpolator);
            } else if (i18 == Integer.MIN_VALUE) {
                androidx.recyclerview.widget.j3 j3Var = recyclerView.C1;
                int i19 = this.f12011a;
                int i27 = this.f12012b;
                j3Var.c(i19, i27, j3Var.a(i19, i27, 0, 0), androidx.recyclerview.widget.RecyclerView.f11885a2);
            } else {
                androidx.recyclerview.widget.j3 j3Var2 = recyclerView.C1;
                int i28 = this.f12011a;
                int i29 = this.f12012b;
                j3Var2.getClass();
                j3Var2.c(i28, i29, i18, androidx.recyclerview.widget.RecyclerView.f11885a2);
            }
            this.f12016f = false;
        }
    }

    public void b(int i17, int i18, int i19, android.view.animation.Interpolator interpolator) {
        this.f12011a = i17;
        this.f12012b = i18;
        this.f12013c = i19;
        this.f12015e = interpolator;
        this.f12016f = true;
    }
}
