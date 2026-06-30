package gf;

/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics f352727a = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics();

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f352728b;

    public z(android.view.View view) {
        this.f352728b = view;
    }

    public final int a(android.view.WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < this.f352728b.getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }
}
