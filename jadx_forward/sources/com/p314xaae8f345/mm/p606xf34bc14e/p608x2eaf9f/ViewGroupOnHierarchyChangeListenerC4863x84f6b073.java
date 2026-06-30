package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "p0", "p1", "Ljz5/f0;", "onChildViewAdded", "onChildViewRemoved", "l1", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getL1", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "l2", "getL2", "<init>", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.AccOnHierarchyChangeListenerMerger */
/* loaded from: classes13.dex */
public final class ViewGroupOnHierarchyChangeListenerC4863x84f6b073 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: $stable */
    public static final int f21033x3b2de05f = 8;

    /* renamed from: _hellAccFlag_ */
    private byte f21034x7f11beae;
    private final android.view.ViewGroup.OnHierarchyChangeListener l1;
    private final android.view.ViewGroup.OnHierarchyChangeListener l2;

    public ViewGroupOnHierarchyChangeListenerC4863x84f6b073(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener, android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2) {
        this.l1 = onHierarchyChangeListener;
        this.l2 = onHierarchyChangeListener2;
    }

    public final android.view.ViewGroup.OnHierarchyChangeListener getL1() {
        return this.l1;
    }

    public final android.view.ViewGroup.OnHierarchyChangeListener getL2() {
        return this.l2;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.l1;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.l2;
        if (onHierarchyChangeListener2 != null) {
            onHierarchyChangeListener2.onChildViewAdded(view, view2);
        }
        yj0.a.h(this, "com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.l1;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.l2;
        if (onHierarchyChangeListener2 != null) {
            onHierarchyChangeListener2.onChildViewRemoved(view, view2);
        }
        yj0.a.h(this, "com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
