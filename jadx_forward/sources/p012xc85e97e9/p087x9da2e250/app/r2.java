package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f93000a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final p012xc85e97e9.p087x9da2e250.app.b3 f93001b = new p012xc85e97e9.p087x9da2e250.app.x2();

    /* renamed from: c, reason: collision with root package name */
    public static final p012xc85e97e9.p087x9da2e250.app.b3 f93002c;

    static {
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var;
        try {
            b3Var = (p012xc85e97e9.p087x9da2e250.app.b3) u4.c0.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            b3Var = null;
        }
        f93002c = b3Var;
    }

    public static void a(java.util.ArrayList arrayList, x.b bVar, java.util.Collection collection) {
        for (int i17 = bVar.f532379f - 1; i17 >= 0; i17--) {
            android.view.View view = (android.view.View) bVar.l(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (collection.contains(n3.a1.k(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0039, code lost:
    
        if (r0.f3414xbdc32c93 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0077, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0088, code lost:
    
        if (r0.f3430x6dac477 == false) goto L69;
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
    public static void b(p012xc85e97e9.p087x9da2e250.app.a r8, p012xc85e97e9.p087x9da2e250.app.h2 r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p087x9da2e250.app.r2.b(androidx.fragment.app.a, androidx.fragment.app.h2, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702, boolean z17, x.b bVar, boolean z18) {
        if (z17) {
            componentCallbacksC1101xa17d46702.m7441x84a1f17c();
        } else {
            componentCallbacksC1101xa17d4670.m7441x84a1f17c();
        }
    }

    public static x.b d(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, x.b bVar, java.lang.Object obj, p012xc85e97e9.p087x9da2e250.app.q2 q2Var) {
        java.util.ArrayList arrayList;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = q2Var.f92989a;
        android.view.View m7474xfb86a31b = componentCallbacksC1101xa17d4670.m7474xfb86a31b();
        if (bVar.m174752x7aab3243() || obj == null || m7474xfb86a31b == null) {
            bVar.clear();
            return null;
        }
        x.b bVar2 = new x.b();
        b3Var.h(bVar2, m7474xfb86a31b);
        p012xc85e97e9.p087x9da2e250.app.a aVar = q2Var.f92991c;
        if (q2Var.f92990b) {
            componentCallbacksC1101xa17d4670.m7444x8a6aed6e();
            arrayList = aVar.f92890n;
        } else {
            componentCallbacksC1101xa17d4670.m7441x84a1f17c();
            arrayList = aVar.f92891o;
        }
        if (arrayList != null) {
            x.m.k(bVar2, arrayList);
            x.m.k(bVar2, bVar.values());
        }
        int i17 = bVar.f532379f;
        while (true) {
            i17--;
            if (i17 < 0) {
                return bVar2;
            }
            if (!bVar2.m174748xc6607c0((java.lang.String) bVar.l(i17))) {
                bVar.j(i17);
            }
        }
    }

    public static x.b e(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, x.b bVar, java.lang.Object obj, p012xc85e97e9.p087x9da2e250.app.q2 q2Var) {
        java.util.ArrayList arrayList;
        if (bVar.m174752x7aab3243() || obj == null) {
            bVar.clear();
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = q2Var.f92992d;
        x.b bVar2 = new x.b();
        b3Var.h(bVar2, componentCallbacksC1101xa17d4670.m7554x159e75aa());
        p012xc85e97e9.p087x9da2e250.app.a aVar = q2Var.f92994f;
        if (q2Var.f92993e) {
            componentCallbacksC1101xa17d4670.m7441x84a1f17c();
            arrayList = aVar.f92891o;
        } else {
            componentCallbacksC1101xa17d4670.m7444x8a6aed6e();
            arrayList = aVar.f92890n;
        }
        if (arrayList != null) {
            x.m.k(bVar2, arrayList);
        }
        x.m.k(bVar, bVar2.keySet());
        return bVar2;
    }

    public static p012xc85e97e9.p087x9da2e250.app.b3 f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (componentCallbacksC1101xa17d4670 != null) {
            java.lang.Object m7443x880e8209 = componentCallbacksC1101xa17d4670.m7443x880e8209();
            if (m7443x880e8209 != null) {
                arrayList.add(m7443x880e8209);
            }
            java.lang.Object m7462x602d321b = componentCallbacksC1101xa17d4670.m7462x602d321b();
            if (m7462x602d321b != null) {
                arrayList.add(m7462x602d321b);
            }
            java.lang.Object m7464xbb7ca7e6 = componentCallbacksC1101xa17d4670.m7464xbb7ca7e6();
            if (m7464xbb7ca7e6 != null) {
                arrayList.add(m7464xbb7ca7e6);
            }
        }
        if (componentCallbacksC1101xa17d46702 != null) {
            java.lang.Object m7440xdf997417 = componentCallbacksC1101xa17d46702.m7440xdf997417();
            if (m7440xdf997417 != null) {
                arrayList.add(m7440xdf997417);
            }
            java.lang.Object m7459x389d8f04 = componentCallbacksC1101xa17d46702.m7459x389d8f04();
            if (m7459x389d8f04 != null) {
                arrayList.add(m7459x389d8f04);
            }
            java.lang.Object m7463x6eee98ec = componentCallbacksC1101xa17d46702.m7463x6eee98ec();
            if (m7463x6eee98ec != null) {
                arrayList.add(m7463x6eee98ec);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var = f93001b;
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
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var2 = f93002c;
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

    public static java.util.ArrayList g(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, java.lang.Object obj, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.util.ArrayList arrayList, android.view.View view) {
        if (obj == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.view.View m7474xfb86a31b = componentCallbacksC1101xa17d4670.m7474xfb86a31b();
        if (m7474xfb86a31b != null) {
            b3Var.f(arrayList2, m7474xfb86a31b);
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

    public static android.view.View h(x.b bVar, p012xc85e97e9.p087x9da2e250.app.q2 q2Var, java.lang.Object obj, boolean z17) {
        java.util.ArrayList arrayList;
        p012xc85e97e9.p087x9da2e250.app.a aVar = q2Var.f92991c;
        if (obj == null || bVar == null || (arrayList = aVar.f92890n) == null || arrayList.isEmpty()) {
            return null;
        }
        return (android.view.View) bVar.m174751x4aabfc28(z17 ? (java.lang.String) aVar.f92890n.get(0) : (java.lang.String) aVar.f92891o.get(0), null);
    }

    public static java.lang.Object i(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        return (obj == null || obj2 == null || componentCallbacksC1101xa17d4670 == null) ? true : z17 ? componentCallbacksC1101xa17d4670.m7433x754b36cf() : componentCallbacksC1101xa17d4670.m7432xe393aead() ? b3Var.l(obj2, obj, obj3) : b3Var.k(obj2, obj, obj3);
    }

    public static void j(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, java.lang.Object obj, java.lang.Object obj2, x.b bVar, boolean z17, p012xc85e97e9.p087x9da2e250.app.a aVar) {
        java.util.ArrayList arrayList = aVar.f92890n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        android.view.View view = (android.view.View) bVar.m174751x4aabfc28(z17 ? (java.lang.String) aVar.f92891o.get(0) : (java.lang.String) aVar.f92890n.get(0), null);
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
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
    public static void l(android.content.Context r40, p012xc85e97e9.p087x9da2e250.app.s0 r41, java.util.ArrayList r42, java.util.ArrayList r43, int r44, int r45, boolean r46, p012xc85e97e9.p087x9da2e250.app.p2 r47) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p087x9da2e250.app.r2.l(android.content.Context, androidx.fragment.app.s0, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.p2):void");
    }
}
