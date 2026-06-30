package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f11467a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.fragment.app.b3 f11468b = new androidx.fragment.app.x2();

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.fragment.app.b3 f11469c;

    static {
        androidx.fragment.app.b3 b3Var;
        try {
            b3Var = (androidx.fragment.app.b3) u4.c0.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            b3Var = null;
        }
        f11469c = b3Var;
    }

    public static void a(java.util.ArrayList arrayList, x.b bVar, java.util.Collection collection) {
        for (int i17 = bVar.f450846f - 1; i17 >= 0; i17--) {
            android.view.View view = (android.view.View) bVar.l(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (collection.contains(n3.a1.k(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0039, code lost:
    
        if (r0.mAdded != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0077, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0088, code lost:
    
        if (r0.mHidden == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(androidx.fragment.app.a r8, androidx.fragment.app.h2 r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r2.b(androidx.fragment.app.a, androidx.fragment.app.h2, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, boolean z17, x.b bVar, boolean z18) {
        if (z17) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    public static x.b d(androidx.fragment.app.b3 b3Var, x.b bVar, java.lang.Object obj, androidx.fragment.app.q2 q2Var) {
        java.util.ArrayList arrayList;
        androidx.fragment.app.Fragment fragment = q2Var.f11456a;
        android.view.View view = fragment.getView();
        if (bVar.isEmpty() || obj == null || view == null) {
            bVar.clear();
            return null;
        }
        x.b bVar2 = new x.b();
        b3Var.h(bVar2, view);
        androidx.fragment.app.a aVar = q2Var.f11458c;
        if (q2Var.f11457b) {
            fragment.getExitTransitionCallback();
            arrayList = aVar.f11357n;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = aVar.f11358o;
        }
        if (arrayList != null) {
            x.m.k(bVar2, arrayList);
            x.m.k(bVar2, bVar.values());
        }
        int i17 = bVar.f450846f;
        while (true) {
            i17--;
            if (i17 < 0) {
                return bVar2;
            }
            if (!bVar2.containsKey((java.lang.String) bVar.l(i17))) {
                bVar.j(i17);
            }
        }
    }

    public static x.b e(androidx.fragment.app.b3 b3Var, x.b bVar, java.lang.Object obj, androidx.fragment.app.q2 q2Var) {
        java.util.ArrayList arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        androidx.fragment.app.Fragment fragment = q2Var.f11459d;
        x.b bVar2 = new x.b();
        b3Var.h(bVar2, fragment.requireView());
        androidx.fragment.app.a aVar = q2Var.f11461f;
        if (q2Var.f11460e) {
            fragment.getEnterTransitionCallback();
            arrayList = aVar.f11358o;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = aVar.f11357n;
        }
        if (arrayList != null) {
            x.m.k(bVar2, arrayList);
        }
        x.m.k(bVar, bVar2.keySet());
        return bVar2;
    }

    public static androidx.fragment.app.b3 f(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (fragment != null) {
            java.lang.Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            java.lang.Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            java.lang.Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            java.lang.Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            java.lang.Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            java.lang.Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        androidx.fragment.app.b3 b3Var = f11468b;
        int size = arrayList.size();
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = true;
                break;
            }
            if (!b3Var.e(arrayList.get(i17))) {
                z17 = false;
                break;
            }
            i17++;
        }
        if (z17) {
            return b3Var;
        }
        androidx.fragment.app.b3 b3Var2 = f11469c;
        if (b3Var2 != null) {
            int size2 = arrayList.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    z18 = true;
                    break;
                }
                if (!b3Var2.e(arrayList.get(i18))) {
                    break;
                }
                i18++;
            }
            if (z18) {
                return b3Var2;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid Transition types");
    }

    public static java.util.ArrayList g(androidx.fragment.app.b3 b3Var, java.lang.Object obj, androidx.fragment.app.Fragment fragment, java.util.ArrayList arrayList, android.view.View view) {
        if (obj == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.view.View view2 = fragment.getView();
        if (view2 != null) {
            b3Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        b3Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static android.view.View h(x.b bVar, androidx.fragment.app.q2 q2Var, java.lang.Object obj, boolean z17) {
        java.util.ArrayList arrayList;
        androidx.fragment.app.a aVar = q2Var.f11458c;
        if (obj == null || bVar == null || (arrayList = aVar.f11357n) == null || arrayList.isEmpty()) {
            return null;
        }
        return (android.view.View) bVar.getOrDefault(z17 ? (java.lang.String) aVar.f11357n.get(0) : (java.lang.String) aVar.f11358o.get(0), null);
    }

    public static java.lang.Object i(androidx.fragment.app.b3 b3Var, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, androidx.fragment.app.Fragment fragment, boolean z17) {
        return (obj == null || obj2 == null || fragment == null) ? true : z17 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? b3Var.l(obj2, obj, obj3) : b3Var.k(obj2, obj, obj3);
    }

    public static void j(androidx.fragment.app.b3 b3Var, java.lang.Object obj, java.lang.Object obj2, x.b bVar, boolean z17, androidx.fragment.app.a aVar) {
        java.util.ArrayList arrayList = aVar.f11357n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        android.view.View view = (android.view.View) bVar.getOrDefault(z17 ? (java.lang.String) aVar.f11358o.get(0) : (java.lang.String) aVar.f11357n.get(0), null);
        b3Var.s(obj, view);
        if (obj2 != null) {
            b3Var.s(obj2, view);
        }
    }

    public static void k(java.util.ArrayList arrayList, int i17) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            android.view.View view = (android.view.View) arrayList.get(size);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "androidx/fragment/app/FragmentTransition", "setViewVisibility", "(Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "androidx/fragment/app/FragmentTransition", "setViewVisibility", "(Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(android.content.Context r40, androidx.fragment.app.s0 r41, java.util.ArrayList r42, java.util.ArrayList r43, int r44, int r45, boolean r46, androidx.fragment.app.p2 r47) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r2.l(android.content.Context, androidx.fragment.app.s0, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.p2):void");
    }
}
