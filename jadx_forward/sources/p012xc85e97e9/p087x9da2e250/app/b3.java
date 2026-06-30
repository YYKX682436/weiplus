package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class b3 {
    public static void d(java.util.List list, android.view.View view) {
        boolean z17;
        boolean z18;
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = false;
                break;
            } else {
                if (list.get(i17) == view) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            return;
        }
        list.add(view);
        for (int i18 = size; i18 < list.size(); i18++) {
            android.view.View view2 = (android.view.View) list.get(i18);
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = viewGroup.getChildAt(i19);
                    int i27 = 0;
                    while (true) {
                        if (i27 >= size) {
                            z18 = false;
                            break;
                        } else {
                            if (list.get(i27) == childAt) {
                                z18 = true;
                                break;
                            }
                            i27++;
                        }
                    }
                    if (!z18) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean j(java.util.List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(java.lang.Object obj, android.view.View view);

    public abstract void b(java.lang.Object obj, java.util.ArrayList arrayList);

    public abstract void c(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract boolean e(java.lang.Object obj);

    public void f(java.util.ArrayList arrayList, android.view.View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof android.view.ViewGroup)) {
                arrayList.add(view);
                return;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (n3.q1.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                f(arrayList, viewGroup.getChildAt(i17));
            }
        }
    }

    public abstract java.lang.Object g(java.lang.Object obj);

    public void h(java.util.Map map, android.view.View view) {
        if (view.getVisibility() == 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            java.lang.String k17 = n3.a1.k(view);
            if (k17 != null) {
                map.put(k17, view);
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    h(map, viewGroup.getChildAt(i17));
                }
            }
        }
    }

    public void i(android.view.View view, android.graphics.Rect rect) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(view)) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            java.lang.Object parent = view.getParent();
            while (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
    }

    public abstract java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract java.lang.Object l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public java.util.ArrayList m(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view = (android.view.View) arrayList.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            arrayList2.add(n3.a1.k(view));
            n3.a1.v(view, null);
        }
        return arrayList2;
    }

    public abstract void n(java.lang.Object obj, android.view.View view);

    public abstract void o(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract void p(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void q(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3);

    public abstract void r(java.lang.Object obj, android.graphics.Rect rect);

    public abstract void s(java.lang.Object obj, android.view.View view);

    public void t(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.Object obj, j3.h hVar, java.lang.Runnable runnable) {
        runnable.run();
    }

    public void u(android.view.View view, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.Map map) {
        int size = arrayList2.size();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view2 = (android.view.View) arrayList.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            java.lang.String k17 = n3.a1.k(view2);
            arrayList4.add(k17);
            if (k17 != null) {
                n3.a1.v(view2, null);
                java.lang.String str = (java.lang.String) map.get(k17);
                int i18 = 0;
                while (true) {
                    if (i18 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i18))) {
                        n3.a1.v((android.view.View) arrayList2.get(i18), k17);
                        break;
                    }
                    i18++;
                }
            }
        }
        n3.m0.a(view, new p012xc85e97e9.p087x9da2e250.app.y2(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void v(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void w(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract java.lang.Object x(java.lang.Object obj);
}
