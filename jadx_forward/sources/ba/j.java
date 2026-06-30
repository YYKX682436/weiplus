package ba;

/* loaded from: classes13.dex */
public class j implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup.OnHierarchyChangeListener f100204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173 f100205e;

    public j(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173 c2695x770e6173, ba.g gVar) {
        this.f100205e = c2695x770e6173;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2695x770e6173 c2695x770e6173 = this.f100205e;
        if (view == c2695x770e6173 && (view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c)) {
            if (view2.getId() == -1) {
                view2.setId(android.view.View.generateViewId());
            }
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) view2).m20224x7da65987(c2695x770e6173.f126015m);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f100204d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        if (view == this.f100205e && (view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c)) {
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c) view2).m20224x7da65987(null);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f100204d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
