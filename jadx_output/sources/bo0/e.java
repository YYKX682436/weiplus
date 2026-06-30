package bo0;

/* loaded from: classes13.dex */
public class e implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup.OnHierarchyChangeListener f22973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup f22974e;

    public e(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup, bo0.a aVar) {
        this.f22974e = multiLineRadioGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup = this.f22974e;
        if (view == multiLineRadioGroup && (view2 instanceof android.widget.RadioButton)) {
            if (view2.getId() == -1) {
                view2.setId(view2.hashCode());
            }
            ((android.widget.RadioButton) view2).setOnCheckedChangeListener(multiLineRadioGroup.f68568e);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f22973d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
        yj0.a.h(this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (view == this.f22974e && (view2 instanceof android.widget.RadioButton)) {
            ((android.widget.RadioButton) view2).setOnCheckedChangeListener(null);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f22973d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
        yj0.a.h(this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
