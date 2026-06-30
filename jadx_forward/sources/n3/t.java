package n3;

/* loaded from: classes13.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f415940a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f415941b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f415942c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Field f415943d;

    public static boolean a(android.view.View view, android.view.KeyEvent keyEvent) {
        java.lang.ref.WeakReference weakReference;
        int indexOfKey;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.util.ArrayList arrayList = n3.k1.f415882d;
            n3.k1 k1Var = (n3.k1) view.getTag(com.p314xaae8f345.mm.R.id.nxd);
            if (k1Var == null) {
                k1Var = new n3.k1();
                view.setTag(com.p314xaae8f345.mm.R.id.nxd, k1Var);
            }
            java.lang.ref.WeakReference weakReference2 = k1Var.f415885c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                k1Var.f415885c = new java.lang.ref.WeakReference(keyEvent);
                if (k1Var.f415884b == null) {
                    k1Var.f415884b = new android.util.SparseArray();
                }
                android.util.SparseArray sparseArray = k1Var.f415884b;
                if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReference = null;
                } else {
                    weakReference = (java.lang.ref.WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (java.lang.ref.WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    android.view.View view2 = (android.view.View) weakReference.get();
                    if (view2 == null || !n3.x0.b(view2)) {
                        return true;
                    }
                    k1Var.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(n3.s r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.mo2572xc58cf3b0(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = n3.t.f415940a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            n3.t.f415941b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            n3.t.f415940a = r3
        L4c:
            java.lang.reflect.Method r1 = n3.t.f415941b
            if (r1 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L61
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r0 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = n3.l1.c(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = n3.t.f415942c
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            n3.t.f415943d = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            n3.t.f415942c = r3
        L9a:
            java.lang.reflect.Field r7 = n3.t.f415943d
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = n3.l1.c(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = n3.l1.c(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.mo2572xc58cf3b0(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.t.b(n3.s, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
