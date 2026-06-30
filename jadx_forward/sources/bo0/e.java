package bo0;

/* loaded from: classes13.dex */
public class e implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup.OnHierarchyChangeListener f104506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 f104507e;

    public e(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1, bo0.a aVar) {
        this.f104507e = c10839x2f31b3d1;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1 = this.f104507e;
        if (view == c10839x2f31b3d1 && (view2 instanceof android.widget.RadioButton)) {
            if (view2.getId() == -1) {
                view2.setId(view2.hashCode());
            }
            ((android.widget.RadioButton) view2).setOnCheckedChangeListener(c10839x2f31b3d1.f150101e);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f104506d;
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
        if (view == this.f104507e && (view2 instanceof android.widget.RadioButton)) {
            ((android.widget.RadioButton) view2).setOnCheckedChangeListener(null);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f104506d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
        yj0.a.h(this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
