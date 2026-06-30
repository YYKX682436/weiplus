package db5;

/* loaded from: classes15.dex */
public class s5 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21511xb6a721c9 f310038d;

    public s5(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21511xb6a721c9 c21511xb6a721c9, db5.p5 p5Var) {
        this.f310038d = c21511xb6a721c9;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21511xb6a721c9 c21511xb6a721c9 = this.f310038d;
        if (view == c21511xb6a721c9 && (view2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332)) {
            if (view2.getId() == -1) {
                int hashCode = view2.hashCode();
                if (hashCode <= -1) {
                    hashCode &= Integer.MAX_VALUE;
                }
                view2.setId(hashCode);
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) view2).m79109x6f71a2ad(c21511xb6a721c9.f279081f);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (view == this.f310038d && (view2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) view2).m79109x6f71a2ad(null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
