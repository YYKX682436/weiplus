package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f93792a;

    /* renamed from: b, reason: collision with root package name */
    public int f93793b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f93794c = new android.graphics.Rect();

    public w1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.u1 u1Var) {
        this.f93792a = layoutManager;
    }

    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17) {
        if (i17 == 0) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        if (i17 == 1) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
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
        if (Integer.MIN_VALUE == this.f93793b) {
            return 0;
        }
        return l() - this.f93793b;
    }

    public abstract int n(android.view.View view);

    public abstract int o(android.view.View view);

    public abstract void p(int i17);
}
