package ac;

/* loaded from: classes15.dex */
public final class a implements ul5.m {
    @Override // ul5.m
    public void b(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        view.setTranslationX(i17);
    }

    @Override // ul5.m
    public int d(android.view.View view) {
        return -(view != null ? view.getWidth() : 0);
    }

    @Override // ul5.m
    public int e(android.view.View view) {
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // ul5.m
    public int f(android.view.View view) {
        if (view != null) {
            return (int) view.getTranslationX();
        }
        return 0;
    }
}
