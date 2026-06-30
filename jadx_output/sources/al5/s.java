package al5;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout f6015d;

    public s(com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout) {
        this.f6015d = edgeToEdgeWrapperLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6015d.getEffectiveStrategy() != al5.q.f5991g) {
            return;
        }
        int i17 = this.f6015d.f211251w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        al5.l4.f5947c.a(this.f6015d, arrayList);
        com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout wrapper = this.f6015d;
        java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            android.view.View view = (android.view.View) next;
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(wrapper, "wrapper");
            if (view.getHeight() > 0 && i17 > 0) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int height = iArr[1] + view.getHeight();
                int[] iArr2 = new int[2];
                wrapper.getLocationInWindow(iArr2);
                if (height >= (iArr2[1] + wrapper.getHeight()) - i17) {
                    z17 = true;
                }
            }
            if (z17) {
                arrayList2.add(next);
            }
        }
        arrayList.size();
        arrayList2.size();
        for (android.view.View view2 : arrayList2) {
            com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = this.f6015d;
            java.util.WeakHashMap weakHashMap = edgeToEdgeWrapperLayout.G;
            java.lang.Object obj = weakHashMap.get(view2);
            if (obj == null) {
                obj = java.lang.Integer.valueOf(view2.getPaddingBottom());
                weakHashMap.put(view2, obj);
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            if (view2 instanceof android.view.ViewGroup) {
                java.util.WeakHashMap weakHashMap2 = edgeToEdgeWrapperLayout.H;
                if (weakHashMap2.get(view2) == null) {
                    weakHashMap2.put(view2, java.lang.Boolean.valueOf(((android.view.ViewGroup) view2).getClipToPadding()));
                }
            }
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), num.intValue() + i17);
            if (view2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view2).setClipToPadding(false);
            }
        }
    }
}
