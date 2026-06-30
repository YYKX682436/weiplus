package al5;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 f87548d;

    public s(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88) {
        this.f87548d = c22602x8bae1c88;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f87548d.m81255x42802184() != al5.q.f87524g) {
            return;
        }
        int i17 = this.f87548d.f292784w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        al5.l4.f87480c.a(this.f87548d, arrayList);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 wrapper = this.f87548d;
        java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            android.view.View view = (android.view.View) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapper, "wrapper");
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
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = this.f87548d;
            java.util.WeakHashMap weakHashMap = c22602x8bae1c88.G;
            java.lang.Object obj = weakHashMap.get(view2);
            if (obj == null) {
                obj = java.lang.Integer.valueOf(view2.getPaddingBottom());
                weakHashMap.put(view2, obj);
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            if (view2 instanceof android.view.ViewGroup) {
                java.util.WeakHashMap weakHashMap2 = c22602x8bae1c88.H;
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
