package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class l3 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.m3 f12124e;

    public l3(androidx.recyclerview.widget.m3 m3Var) {
        this.f12124e = m3Var;
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        androidx.recyclerview.widget.m3 m3Var = this.f12124e;
        androidx.recyclerview.widget.RecyclerView recyclerView = m3Var.f12143e;
        if (!recyclerView.f11913z || recyclerView.I || recyclerView.f11890g.g()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = m3Var.f12143e;
        if (recyclerView2.getLayoutManager() != null) {
            recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, lVar);
        }
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        boolean z17 = true;
        if (super.performAccessibilityAction(view, i17, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.m3 m3Var = this.f12124e;
        androidx.recyclerview.widget.RecyclerView recyclerView = m3Var.f12143e;
        if (recyclerView.f11913z && !recyclerView.I && !recyclerView.f11890g.g()) {
            z17 = false;
        }
        if (!z17) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = m3Var.f12143e;
            if (recyclerView2.getLayoutManager() != null) {
                return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i17, bundle);
            }
        }
        return false;
    }
}
