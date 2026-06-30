package n3;

/* loaded from: classes8.dex */
public abstract class f2 {
    public static void a(android.view.Window window, boolean z17) {
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z17 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
