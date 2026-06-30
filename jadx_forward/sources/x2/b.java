package x2;

/* loaded from: classes13.dex */
public class b implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a f533009d;

    public b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a) {
        this.f533009d = c1081xa22a3e5a;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f533009d.f92535v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = this.f533009d;
        c1081xa22a3e5a.r(2);
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = c1081xa22a3e5a.f92535v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
