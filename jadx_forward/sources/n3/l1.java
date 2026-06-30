package n3;

/* loaded from: classes14.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f415895a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f415896b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f415897c;

    static {
        new java.util.concurrent.atomic.AtomicInteger(1);
        f415895a = null;
        f415897c = false;
        new java.util.WeakHashMap();
    }

    public static n3.z1 a(android.view.View view) {
        if (f415895a == null) {
            f415895a = new java.util.WeakHashMap();
        }
        n3.z1 z1Var = (n3.z1) f415895a.get(view);
        if (z1Var != null) {
            return z1Var;
        }
        n3.z1 z1Var2 = new n3.z1(view);
        f415895a.put(view, z1Var2);
        return z1Var2;
    }

    public static n3.g3 b(android.view.View view, n3.g3 g3Var) {
        android.view.WindowInsets h17 = g3Var.h();
        if (h17 != null) {
            android.view.WindowInsets a17 = n3.y0.a(view, h17);
            if (!a17.equals(h17)) {
                return n3.g3.i(a17, view);
            }
        }
        return g3Var;
    }

    public static boolean c(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        java.util.ArrayList arrayList = n3.k1.f415882d;
        n3.k1 k1Var = (n3.k1) view.getTag(com.p314xaae8f345.mm.R.id.nxd);
        if (k1Var == null) {
            k1Var = new n3.k1();
            view.setTag(com.p314xaae8f345.mm.R.id.nxd, k1Var);
        }
        if (keyEvent.getAction() == 0) {
            java.util.WeakHashMap weakHashMap = k1Var.f415883a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList arrayList2 = n3.k1.f415882d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (k1Var.f415883a == null) {
                        k1Var.f415883a = new java.util.WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        java.util.ArrayList arrayList3 = n3.k1.f415882d;
                        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            k1Var.f415883a.put(view2, java.lang.Boolean.TRUE);
                            for (android.view.ViewParent parent = view2.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                k1Var.f415883a.put((android.view.View) parent, java.lang.Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        android.view.View a17 = k1Var.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a17 != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                if (k1Var.f415884b == null) {
                    k1Var.f415884b = new android.util.SparseArray();
                }
                k1Var.f415884b.put(keyCode, new java.lang.ref.WeakReference(a17));
            }
        }
        return a17 != null;
    }

    public static void d(android.view.View view) {
        n3.c e17 = e(view);
        if (e17 == null) {
            e17 = new n3.c();
        }
        l(view, e17);
    }

    public static n3.c e(android.view.View view) {
        android.view.View.AccessibilityDelegate f17 = f(view);
        if (f17 == null) {
            return null;
        }
        return f17 instanceof n3.a ? ((n3.a) f17).f415854a : new n3.c(f17);
    }

    public static android.view.View.AccessibilityDelegate f(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return n3.f1.a(view);
        }
        if (f415897c) {
            return null;
        }
        if (f415896b == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                f415896b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                f415897c = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = f415896b.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            f415897c = true;
            return null;
        }
    }

    public static java.lang.CharSequence g(android.view.View view) {
        java.lang.Object tag;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            tag = n3.e1.b(view);
        } else {
            tag = view.getTag(com.p314xaae8f345.mm.R.id.nwi);
            if (!java.lang.CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (java.lang.CharSequence) tag;
    }

    public static void h(android.view.View view, int i17) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z17 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (n3.x0.a(view) != 0 || z17) {
                android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                obtain.setEventType(z17 ? 32 : 2048);
                n3.x0.g(obtain, i17);
                if (z17) {
                    obtain.getText().add(g(view));
                    if (n3.u0.c(view) == 0) {
                        n3.u0.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i17 != 32) {
                if (view.getParent() != null) {
                    try {
                        n3.x0.e(view.getParent(), view, view, i17);
                        return;
                    } catch (java.lang.AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            android.view.accessibility.AccessibilityEvent obtain2 = android.view.accessibility.AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            n3.x0.g(obtain2, i17);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static n3.g3 i(android.view.View view, n3.g3 g3Var) {
        android.view.WindowInsets h17 = g3Var.h();
        if (h17 != null) {
            android.view.WindowInsets b17 = n3.y0.b(view, h17);
            if (!b17.equals(h17)) {
                return n3.g3.i(b17, view);
            }
        }
        return g3Var;
    }

    public static void j(int i17, android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.p314xaae8f345.mm.R.id.nwf);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            view.setTag(com.p314xaae8f345.mm.R.id.nwf, arrayList);
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((o3.f) arrayList.get(i18)).f424169a).getId() == i17) {
                arrayList.remove(i18);
                return;
            }
        }
    }

    public static void k(android.view.View view, o3.f fVar, java.lang.CharSequence charSequence, o3.a0 a0Var) {
        if (a0Var == null && charSequence == null) {
            j(((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) fVar.f424169a).getId(), view);
            h(view, 0);
            return;
        }
        o3.f fVar2 = new o3.f(null, fVar.f424170b, charSequence, a0Var, fVar.f424171c);
        d(view);
        j(((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) fVar2.f424169a).getId(), view);
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.p314xaae8f345.mm.R.id.nwf);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            view.setTag(com.p314xaae8f345.mm.R.id.nwf, arrayList);
        }
        arrayList.add(fVar2);
        h(view, 0);
    }

    public static void l(android.view.View view, n3.c cVar) {
        if (cVar == null && (f(view) instanceof n3.a)) {
            cVar = new n3.c();
        }
        if (n3.u0.c(view) == 0) {
            n3.u0.s(view, 1);
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.m148922x12c9c67f());
    }

    public static void m(android.view.View view, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/core/view/ViewCompat", "setAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/core/view/ViewCompat", "setAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public static void n(android.view.View view, java.lang.String[] strArr, n3.l0 l0Var) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            n3.h1.c(view, strArr, l0Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z17 = false;
        if (l0Var != null) {
            m3.h.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                if (strArr[i17].startsWith("*")) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            m3.h.b(!z17, "A MIME type set here must not start with *: " + java.util.Arrays.toString(strArr));
        }
        view.setTag(com.p314xaae8f345.mm.R.id.f568749nx2, strArr);
        view.setTag(com.p314xaae8f345.mm.R.id.f568748nx1, l0Var);
    }

    public static void o(android.view.View view, n3.j2 j2Var) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(j2Var != null ? new n3.p2(j2Var) : null);
            return;
        }
        android.view.animation.Interpolator interpolator = n3.o2.f415912e;
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f568747nx0);
        if (j2Var == null) {
            view.setTag(com.p314xaae8f345.mm.R.id.nxg, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        android.view.View.OnApplyWindowInsetsListener n2Var = new n3.n2(view, j2Var);
        view.setTag(com.p314xaae8f345.mm.R.id.nxg, n2Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(n2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(android.view.View view, int i17) {
        if (view instanceof n3.d0) {
            ((n3.d0) view).p(i17);
        } else if (i17 == 0) {
            n3.a1.z(view);
        }
    }
}
