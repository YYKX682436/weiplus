package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class q2 implements androidx.recyclerview.widget.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f12201a;

    public q2(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        this.f12201a = layoutManager;
    }

    @Override // androidx.recyclerview.widget.z3
    public int a() {
        return this.f12201a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.z3
    public int b() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12201a;
        return layoutManager.getWidth() - layoutManager.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.z3
    public int c(android.view.View view) {
        return this.f12201a.getDecoratedLeft(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.z3
    public int d(android.view.View view) {
        return this.f12201a.getDecoratedRight(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.z3
    public android.view.View getChildAt(int i17) {
        return this.f12201a.getChildAt(i17);
    }
}
