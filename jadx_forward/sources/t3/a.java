package t3;

/* loaded from: classes14.dex */
public class a implements android.view.View.OnApplyWindowInsetsListener {
    public a(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b) {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b) view;
        boolean z17 = windowInsets.getSystemWindowInsetTop() > 0;
        c1097xe647fb9b.B = windowInsets;
        c1097xe647fb9b.C = z17;
        c1097xe647fb9b.setWillNotDraw(!z17 && c1097xe647fb9b.getBackground() == null);
        c1097xe647fb9b.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
