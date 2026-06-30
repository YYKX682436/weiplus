package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager f12259a;

    /* renamed from: b, reason: collision with root package name */
    public int f12260b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f12261c = new android.graphics.Rect();

    public w1(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.u1 u1Var) {
        this.f12259a = layoutManager;
    }

    public static androidx.recyclerview.widget.w1 a(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17) {
        if (i17 == 0) {
            return new androidx.recyclerview.widget.u1(layoutManager);
        }
        if (i17 == 1) {
            return new androidx.recyclerview.widget.v1(layoutManager);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    public abstract int b(android.view.View view);

    public abstract int c(android.view.View view);

    public abstract int d(android.view.View view);

    public abstract int e(android.view.View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f12260b) {
            return 0;
        }
        return l() - this.f12260b;
    }

    public abstract int n(android.view.View view);

    public abstract int o(android.view.View view);

    public abstract void p(int i17);
}
