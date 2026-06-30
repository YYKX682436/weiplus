package p012xc85e97e9.p080xa1c8a596.p082xd1075a44;

/* loaded from: classes14.dex */
public abstract class d extends n3.c {

    /* renamed from: DEFAULT_CLASS_NAME */
    private static final java.lang.String f2883x153095f0 = "android.view.View";

    /* renamed from: HOST_ID */
    public static final int f2884x6c48bf12 = -1;

    /* renamed from: INVALID_ID */
    public static final int f2885xafba8c83 = Integer.MIN_VALUE;

    /* renamed from: INVALID_PARENT_BOUNDS */
    private static final android.graphics.Rect f2886x7f380382 = new android.graphics.Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: NODE_ADAPTER */
    private static final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.e f2887x976f59f2 = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.a();

    /* renamed from: SPARSE_VALUES_ADAPTER */
    private static final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.f f2888x782e3111 = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.b();

    /* renamed from: mHost */
    private final android.view.View f2890x6226bb5;

    /* renamed from: mManager */
    private final android.view.accessibility.AccessibilityManager f2893xcfe1c280;

    /* renamed from: mNodeProvider */
    private p012xc85e97e9.p080xa1c8a596.p082xd1075a44.c f2894x29c20f20;

    /* renamed from: mTempScreenRect */
    private final android.graphics.Rect f2897x4185e931 = new android.graphics.Rect();

    /* renamed from: mTempParentRect */
    private final android.graphics.Rect f2896x4bd0e26f = new android.graphics.Rect();

    /* renamed from: mTempVisibleRect */
    private final android.graphics.Rect f2898xfa4ddcd5 = new android.graphics.Rect();

    /* renamed from: mTempGlobalRect */
    private final int[] f2895x2736b8e8 = new int[2];

    /* renamed from: mAccessibilityFocusedVirtualViewId */
    int f2889x8b6506d5 = Integer.MIN_VALUE;

    /* renamed from: mKeyboardFocusedVirtualViewId */
    int f2892x2891d0e8 = Integer.MIN_VALUE;

    /* renamed from: mHoveredVirtualViewId */
    private int f2891x8f62367d = Integer.MIN_VALUE;

    public d(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.f2890x6226bb5 = view;
        this.f2893xcfe1c280 = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.u0.c(view) == 0) {
            n3.u0.s(view, 1);
        }
    }

    public final android.view.accessibility.AccessibilityEvent a(int i17, int i18) {
        if (i17 == -1) {
            android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i18);
            this.f2890x6226bb5.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        android.view.accessibility.AccessibilityEvent obtain2 = android.view.accessibility.AccessibilityEvent.obtain(i18);
        o3.l m7254x1e1c2599 = m7254x1e1c2599(i17);
        obtain2.getText().add(m7254x1e1c2599.h());
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = m7254x1e1c2599.f424175a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        mo7258xbdc6e658(i17, obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        o3.r.a(obtain2, this.f2890x6226bb5, i17);
        obtain2.setPackageName(this.f2890x6226bb5.getContext().getPackageName());
        return obtain2;
    }

    public final o3.l b(int i17) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
        o3.l lVar = new o3.l(obtain);
        lVar.q(true);
        lVar.r(true);
        lVar.n(f2883x153095f0);
        android.graphics.Rect rect = f2886x7f380382;
        lVar.k(rect);
        lVar.l(rect);
        android.view.View view = this.f2890x6226bb5;
        lVar.f424176b = -1;
        obtain.setParent(view);
        mo7260xeb1f1232(i17, lVar);
        if (lVar.h() == null && obtain.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        lVar.f(this.f2896x4bd0e26f);
        if (this.f2896x4bd0e26f.equals(rect)) {
            throw new java.lang.RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(this.f2890x6226bb5.getContext().getPackageName());
        android.view.View view2 = this.f2890x6226bb5;
        lVar.f424177c = i17;
        obtain.setSource(view2, i17);
        boolean z17 = false;
        if (this.f2889x8b6506d5 == i17) {
            lVar.i(true);
            lVar.a(128);
        } else {
            lVar.i(false);
            lVar.a(64);
        }
        boolean z18 = this.f2892x2891d0e8 == i17;
        if (z18) {
            lVar.a(2);
        } else if (obtain.isFocusable()) {
            lVar.a(1);
        }
        obtain.setFocused(z18);
        this.f2890x6226bb5.getLocationOnScreen(this.f2895x2736b8e8);
        obtain.getBoundsInScreen(this.f2897x4185e931);
        if (this.f2897x4185e931.equals(rect)) {
            lVar.f(this.f2897x4185e931);
            if (lVar.f424176b != -1) {
                o3.l lVar2 = new o3.l(android.view.accessibility.AccessibilityNodeInfo.obtain());
                for (int i18 = lVar.f424176b; i18 != -1; i18 = lVar2.f424176b) {
                    android.view.View view3 = this.f2890x6226bb5;
                    lVar2.f424176b = -1;
                    lVar2.f424175a.setParent(view3, -1);
                    lVar2.k(f2886x7f380382);
                    mo7260xeb1f1232(i18, lVar2);
                    lVar2.f(this.f2896x4bd0e26f);
                    android.graphics.Rect rect2 = this.f2897x4185e931;
                    android.graphics.Rect rect3 = this.f2896x4bd0e26f;
                    rect2.offset(rect3.left, rect3.top);
                }
            }
            this.f2897x4185e931.offset(this.f2895x2736b8e8[0] - this.f2890x6226bb5.getScrollX(), this.f2895x2736b8e8[1] - this.f2890x6226bb5.getScrollY());
        }
        if (this.f2890x6226bb5.getLocalVisibleRect(this.f2898xfa4ddcd5)) {
            this.f2898xfa4ddcd5.offset(this.f2895x2736b8e8[0] - this.f2890x6226bb5.getScrollX(), this.f2895x2736b8e8[1] - this.f2890x6226bb5.getScrollY());
            if (this.f2897x4185e931.intersect(this.f2898xfa4ddcd5)) {
                lVar.l(this.f2897x4185e931);
                android.graphics.Rect rect4 = this.f2897x4185e931;
                if (rect4 != null && !rect4.isEmpty() && this.f2890x6226bb5.getWindowVisibility() == 0) {
                    java.lang.Object parent = this.f2890x6226bb5.getParent();
                    while (true) {
                        if (parent instanceof android.view.View) {
                            android.view.View view4 = (android.view.View) parent;
                            if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                break;
                            }
                            parent = view4.getParent();
                        } else if (parent != null) {
                            z17 = true;
                        }
                    }
                }
                if (z17) {
                    lVar.f424175a.setVisibleToUser(true);
                }
            }
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        if (r12 < (((r13 * 13) * r13) + (r17 * r17))) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d.c(int, android.graphics.Rect):boolean");
    }

    /* renamed from: clearKeyboardFocusForVirtualView */
    public final boolean m7243x3b6818cb(int i17) {
        if (this.f2892x2891d0e8 != i17) {
            return false;
        }
        this.f2892x2891d0e8 = Integer.MIN_VALUE;
        m7261x18de52d4(i17, false);
        m7264x9023e859(i17, 8);
        return true;
    }

    public final void d(int i17) {
        int i18 = this.f2891x8f62367d;
        if (i18 == i17) {
            return;
        }
        this.f2891x8f62367d = i17;
        m7264x9023e859(i17, 128);
        m7264x9023e859(i18, 256);
    }

    /* renamed from: dispatchHoverEvent */
    public final boolean m7244x27b16ed8(android.view.MotionEvent motionEvent) {
        if (!this.f2893xcfe1c280.isEnabled() || !this.f2893xcfe1c280.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int mo7249xde3240ed = mo7249xde3240ed(motionEvent.getX(), motionEvent.getY());
            d(mo7249xde3240ed);
            return mo7249xde3240ed != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f2891x8f62367d == Integer.MIN_VALUE) {
            return false;
        }
        d(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: dispatchKeyEvent */
    public final boolean m7245xfe5d9615(android.view.KeyEvent keyEvent) {
        int i17 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return c(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return c(1, null);
            }
            return false;
        }
        int i18 = 66;
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    if (keyCode == 19) {
                        i18 = 33;
                    } else if (keyCode == 21) {
                        i18 = 17;
                    } else if (keyCode != 22) {
                        i18 = 130;
                    }
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z17 = false;
                    while (i17 < repeatCount && c(i18, null)) {
                        i17++;
                        z17 = true;
                    }
                    return z17;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        int i19 = this.f2892x2891d0e8;
        if (i19 != Integer.MIN_VALUE) {
            mo7256x6c00bf3f(i19, 16, null);
        }
        return true;
    }

    /* renamed from: getAccessibilityFocusedVirtualViewId */
    public final int m7246x9036b90c() {
        return this.f2889x8b6506d5;
    }

    @Override // n3.c
    /* renamed from: getAccessibilityNodeProvider */
    public o3.p mo7150x3c1c23cb(android.view.View view) {
        if (this.f2894x29c20f20 == null) {
            this.f2894x29c20f20 = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.c(this);
        }
        return this.f2894x29c20f20;
    }

    @java.lang.Deprecated
    /* renamed from: getFocusedVirtualView */
    public int m7247x65dace4f() {
        return m7246x9036b90c();
    }

    /* renamed from: getKeyboardFocusedVirtualViewId */
    public final int m7248xf7895851() {
        return this.f2892x2891d0e8;
    }

    /* renamed from: getVirtualViewAt */
    public abstract int mo7249xde3240ed(float f17, float f18);

    /* renamed from: getVisibleVirtualViews */
    public abstract void mo7250x3082c07f(java.util.List list);

    /* renamed from: invalidateRoot */
    public final void m7251x60b610bd() {
        m7253x7a174415(-1, 1);
    }

    /* renamed from: invalidateVirtualView */
    public final void m7252x7a174415(int i17) {
        m7253x7a174415(i17, 0);
    }

    /* renamed from: obtainAccessibilityNodeInfo */
    public o3.l m7254x1e1c2599(int i17) {
        if (i17 != -1) {
            return b(i17);
        }
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.f2890x6226bb5);
        o3.l lVar = new o3.l(obtain);
        android.view.View view = this.f2890x6226bb5;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mo7250x3082c07f(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            lVar.f424175a.addChild(this.f2890x6226bb5, ((java.lang.Integer) arrayList.get(i18)).intValue());
        }
        return lVar;
    }

    /* renamed from: onFocusChanged */
    public final void m7255x8a4c8e3b(boolean z17, int i17, android.graphics.Rect rect) {
        int i18 = this.f2892x2891d0e8;
        if (i18 != Integer.MIN_VALUE) {
            m7243x3b6818cb(i18);
        }
        if (z17) {
            c(i17, rect);
        }
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7239x9d5dd31b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7239x9d5dd31b(view, accessibilityEvent);
        m7257xe9f898a0(accessibilityEvent);
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        mo7259xe546ae06(lVar);
    }

    /* renamed from: onPerformActionForVirtualView */
    public abstract boolean mo7256x6c00bf3f(int i17, int i18, android.os.Bundle bundle);

    /* renamed from: onPopulateEventForHost */
    public void m7257xe9f898a0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: onPopulateEventForVirtualView */
    public void mo7258xbdc6e658(int i17, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: onPopulateNodeForHost */
    public void mo7259xe546ae06(o3.l lVar) {
    }

    /* renamed from: onPopulateNodeForVirtualView */
    public abstract void mo7260xeb1f1232(int i17, o3.l lVar);

    /* renamed from: onVirtualViewKeyboardFocusChanged */
    public void m7261x18de52d4(int i17, boolean z17) {
    }

    /* renamed from: performAction */
    public boolean m7262x8c1184f7(int i17, int i18, android.os.Bundle bundle) {
        int i19;
        if (i17 == -1) {
            android.view.View view = this.f2890x6226bb5;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            return n3.u0.j(view, i18, bundle);
        }
        boolean z17 = true;
        if (i18 == 1) {
            return m7263x11bd4349(i17);
        }
        if (i18 == 2) {
            return m7243x3b6818cb(i17);
        }
        if (i18 == 64) {
            if (this.f2893xcfe1c280.isEnabled() && this.f2893xcfe1c280.isTouchExplorationEnabled() && (i19 = this.f2889x8b6506d5) != i17) {
                if (i19 != Integer.MIN_VALUE) {
                    this.f2889x8b6506d5 = Integer.MIN_VALUE;
                    this.f2890x6226bb5.invalidate();
                    m7264x9023e859(i19, 65536);
                }
                this.f2889x8b6506d5 = i17;
                this.f2890x6226bb5.invalidate();
                m7264x9023e859(i17, 32768);
            }
            z17 = false;
        } else {
            if (i18 != 128) {
                return mo7256x6c00bf3f(i17, i18, bundle);
            }
            if (this.f2889x8b6506d5 == i17) {
                this.f2889x8b6506d5 = Integer.MIN_VALUE;
                this.f2890x6226bb5.invalidate();
                m7264x9023e859(i17, 65536);
            }
            z17 = false;
        }
        return z17;
    }

    /* renamed from: requestKeyboardFocusForVirtualView */
    public final boolean m7263x11bd4349(int i17) {
        int i18;
        if ((!this.f2890x6226bb5.isFocused() && !this.f2890x6226bb5.requestFocus()) || (i18 = this.f2892x2891d0e8) == i17) {
            return false;
        }
        if (i18 != Integer.MIN_VALUE) {
            m7243x3b6818cb(i18);
        }
        this.f2892x2891d0e8 = i17;
        m7261x18de52d4(i17, true);
        m7264x9023e859(i17, 8);
        return true;
    }

    /* renamed from: sendEventForVirtualView */
    public final boolean m7264x9023e859(int i17, int i18) {
        android.view.ViewParent parent;
        if (i17 == Integer.MIN_VALUE || !this.f2893xcfe1c280.isEnabled() || (parent = this.f2890x6226bb5.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f2890x6226bb5, a(i17, i18));
    }

    /* renamed from: invalidateVirtualView */
    public final void m7253x7a174415(int i17, int i18) {
        android.view.ViewParent parent;
        if (i17 == Integer.MIN_VALUE || !this.f2893xcfe1c280.isEnabled() || (parent = this.f2890x6226bb5.getParent()) == null) {
            return;
        }
        android.view.accessibility.AccessibilityEvent a17 = a(i17, 2048);
        o3.b.b(a17, i18);
        parent.requestSendAccessibilityEvent(this.f2890x6226bb5, a17);
    }
}
