package ba;

/* loaded from: classes13.dex */
public class j implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup.OnHierarchyChangeListener f18671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.ChipGroup f18672e;

    public j(com.google.android.material.chip.ChipGroup chipGroup, ba.g gVar) {
        this.f18672e = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        com.google.android.material.chip.ChipGroup chipGroup = this.f18672e;
        if (view == chipGroup && (view2 instanceof com.google.android.material.chip.Chip)) {
            if (view2.getId() == -1) {
                view2.setId(android.view.View.generateViewId());
            }
            ((com.google.android.material.chip.Chip) view2).setOnCheckedChangeListenerInternal(chipGroup.f44482m);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f18671d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        if (view == this.f18672e && (view2 instanceof com.google.android.material.chip.Chip)) {
            ((com.google.android.material.chip.Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f18671d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
