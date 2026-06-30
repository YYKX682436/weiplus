package vj5;

/* loaded from: classes14.dex */
public class i implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f519249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vj5.n f519250e;

    public i(vj5.n nVar, android.view.ViewGroup viewGroup) {
        this.f519250e = nVar;
        this.f519249d = viewGroup;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.WindowInsets consumeSystemWindowInsets;
        pk.b bVar;
        int i17 = android.os.Build.VERSION.SDK_INT;
        vj5.n nVar = this.f519250e;
        if (i17 < 31 || !nVar.f519257c) {
            nVar.f519259e = windowInsets.getSystemWindowInsetTop();
        } else {
            nVar.f519259e = java.lang.Math.max(windowInsets.getInsets(android.view.WindowInsets.Type.systemBars()).top, windowInsets.getInsets(android.view.WindowInsets.Type.tappableElement()).top);
        }
        int i18 = nVar.f519259e;
        nVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Set set = nVar.f519256b;
        linkedList.addAll(set);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            vj5.k kVar = (vj5.k) weakReference.get();
            if (kVar != null) {
                kVar.n6(i18);
            } else {
                ((java.util.HashSet) set).remove(weakReference);
            }
        }
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 30) {
            nVar.f519263i = windowInsets;
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "<this>");
            nVar.f519262h = i19 >= 29 ? e3.d.b(insets.left, insets.top, insets.right, insets.bottom) : e3.d.f328576e;
            int i27 = insets.bottom;
            int i28 = windowInsets.getInsets(android.view.WindowInsets.Type.tappableElement()).bottom;
            int i29 = windowInsets.getInsets(android.view.WindowInsets.Type.ime()).bottom;
            nVar.f519260f = i27;
            nVar.f519261g = i28;
        } else {
            nVar.getClass();
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            nVar.f519260f = systemWindowInsetBottom;
            nVar.f519261g = systemWindowInsetBottom;
        }
        int i37 = nVar.f519259e;
        int i38 = nVar.f519260f;
        int i39 = nVar.f519261g;
        e3.d dVar = nVar.f519262h;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Set set2 = nVar.f519256b;
        linkedList2.addAll(set2);
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) it6.next();
            vj5.k kVar2 = (vj5.k) weakReference2.get();
            if (kVar2 == null) {
                ((java.util.HashSet) set2).remove(weakReference2);
            } else if (kVar2 instanceof vj5.l) {
                ((vj5.l) kVar2).f4(i37, i38, i39, dVar, windowInsets);
            } else {
                kVar2.n6(i37);
            }
        }
        android.app.Activity activity = (android.app.Activity) nVar.f519255a.get();
        pk.a aVar = pk.a.NONE;
        pk.a m158604x6ac9171 = (activity == null || !com.p314xaae8f345.mm.ui.b4.c(activity) || (bVar = (pk.b) activity.getClass().getAnnotation(pk.b.class)) == null) ? aVar : bVar.m158604x6ac9171();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusBarHeightWatcher", "excludeRegion excludeRegion=" + m158604x6ac9171);
        if (m158604x6ac9171 == aVar) {
            consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            int i47 = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars()).top;
            int i48 = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars()).bottom;
            pk.a aVar2 = pk.a.STATUS_BAR;
            pk.a aVar3 = pk.a.ALL;
            if (m158604x6ac9171 == aVar2 || m158604x6ac9171 == aVar3) {
                i47 = 0;
            }
            if (m158604x6ac9171 == pk.a.NAVIGATION_BAR || m158604x6ac9171 == aVar3) {
                i48 = 0;
            }
            consumeSystemWindowInsets = windowInsets.inset(0, i47, 0, i48);
        } else {
            consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        }
        if (view != this.f519249d) {
            view.onApplyWindowInsets(consumeSystemWindowInsets);
        }
        return consumeSystemWindowInsets;
    }
}
