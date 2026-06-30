package ac;

/* loaded from: classes8.dex */
public final class c implements ul5.m {
    @Override // ul5.m
    public void b(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        float abs = java.lang.Math.abs(i17) / view.getHeight();
        if (i17 > 0) {
            view.setPivotY(0.0f);
        } else {
            view.setPivotY(view.getHeight());
        }
        view.setScaleY(1 + abs);
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
        if (view == null) {
            return 0;
        }
        float scaleY = (view.getScaleY() - 1) * view.getHeight();
        return view.getPivotY() > 0.0f ? -((int) scaleY) : (int) scaleY;
    }
}
