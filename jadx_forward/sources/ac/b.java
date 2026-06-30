package ac;

/* loaded from: classes5.dex */
public final class b implements ul5.m {
    @Override // ul5.m
    public void b(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        view.setTranslationY(i17);
    }

    @Override // ul5.m
    public int d(android.view.View view) {
        return -(view != null ? view.getHeight() : 0);
    }

    @Override // ul5.m
    public int e(android.view.View view) {
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // ul5.m
    public int f(android.view.View view) {
        if (view != null) {
            return (int) view.getTranslationY();
        }
        return 0;
    }
}
