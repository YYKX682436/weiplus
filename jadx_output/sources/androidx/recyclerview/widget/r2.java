package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class r2 implements androidx.recyclerview.widget.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f12211a;

    public r2(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        this.f12211a = layoutManager;
    }

    @Override // androidx.recyclerview.widget.z3
    public int a() {
        return this.f12211a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.z3
    public int b() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12211a;
        return layoutManager.getHeight() - layoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.z3
    public int c(android.view.View view) {
        return this.f12211a.getDecoratedTop(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.z3
    public int d(android.view.View view) {
        return this.f12211a.getDecoratedBottom(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.z3
    public android.view.View getChildAt(int i17) {
        return this.f12211a.getChildAt(i17);
    }
}
