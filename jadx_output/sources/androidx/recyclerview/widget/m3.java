package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class m3 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f12143e;

    /* renamed from: f, reason: collision with root package name */
    public final n3.c f12144f = new androidx.recyclerview.widget.l3(this);

    public m3(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f12143e = recyclerView;
    }

    public n3.c b() {
        return this.f12144f;
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(androidx.recyclerview.widget.RecyclerView.class.getName());
        if (view instanceof androidx.recyclerview.widget.RecyclerView) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f12143e;
            if (!recyclerView.f11913z || recyclerView.I || recyclerView.f11890g.g()) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) view;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        lVar.n(androidx.recyclerview.widget.RecyclerView.class.getName());
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12143e;
        if ((!recyclerView.f11913z || recyclerView.I || recyclerView.f11890g.g()) || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(lVar);
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        boolean z17 = true;
        if (super.performAccessibilityAction(view, i17, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12143e;
        if (recyclerView.f11913z && !recyclerView.I && !recyclerView.f11890g.g()) {
            z17 = false;
        }
        if (z17 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i17, bundle);
    }
}
