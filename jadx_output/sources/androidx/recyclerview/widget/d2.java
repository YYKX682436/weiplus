package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class d2 implements androidx.recyclerview.widget.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f11999a;

    public d2(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f11999a = recyclerView;
    }

    public int a() {
        return this.f11999a.getChildCount();
    }

    public void b(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11999a;
        android.view.View childAt = recyclerView.getChildAt(i17);
        if (childAt != null) {
            recyclerView.W(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i17);
    }
}
