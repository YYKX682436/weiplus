package androidx.customview.widget;

/* loaded from: classes14.dex */
public abstract class d extends n3.c {
    private static final java.lang.String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final android.graphics.Rect INVALID_PARENT_BOUNDS = new android.graphics.Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final androidx.customview.widget.e NODE_ADAPTER = new androidx.customview.widget.a();
    private static final androidx.customview.widget.f SPARSE_VALUES_ADAPTER = new androidx.customview.widget.b();
    private final android.view.View mHost;
    private final android.view.accessibility.AccessibilityManager mManager;
    private androidx.customview.widget.c mNodeProvider;
    private final android.graphics.Rect mTempScreenRect = new android.graphics.Rect();
    private final android.graphics.Rect mTempParentRect = new android.graphics.Rect();
    private final android.graphics.Rect mTempVisibleRect = new android.graphics.Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public d(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.u0.c(view) == 0) {
            n3.u0.s(view, 1);
        }
    }

    public final android.view.accessibility.AccessibilityEvent a(int i17, int i18) {
        if (i17 == -1) {
            android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i18);
            this.mHost.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        android.view.accessibility.AccessibilityEvent obtain2 = android.view.accessibility.AccessibilityEvent.obtain(i18);
        o3.l obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i17);
        obtain2.getText().add(obtainAccessibilityNodeInfo.h());
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = obtainAccessibilityNodeInfo.f342642a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i17, obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        o3.r.a(obtain2, this.mHost, i17);
        obtain2.setPackageName(this.mHost.getContext().getPackageName());
        return obtain2;
    }

    public final o3.l b(int i17) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
        o3.l lVar = new o3.l(obtain);
        lVar.q(true);
        lVar.r(true);
        lVar.n(DEFAULT_CLASS_NAME);
        android.graphics.Rect rect = INVALID_PARENT_BOUNDS;
        lVar.k(rect);
        lVar.l(rect);
        android.view.View view = this.mHost;
        lVar.f342643b = -1;
        obtain.setParent(view);
        onPopulateNodeForVirtualView(i17, lVar);
        if (lVar.h() == null && obtain.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        lVar.f(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new java.lang.RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        android.view.View view2 = this.mHost;
        lVar.f342644c = i17;
        obtain.setSource(view2, i17);
        boolean z17 = false;
        if (this.mAccessibilityFocusedVirtualViewId == i17) {
            lVar.i(true);
            lVar.a(128);
        } else {
            lVar.i(false);
            lVar.a(64);
        }
        boolean z18 = this.mKeyboardFocusedVirtualViewId == i17;
        if (z18) {
            lVar.a(2);
        } else if (obtain.isFocusable()) {
            lVar.a(1);
        }
        obtain.setFocused(z18);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        obtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            lVar.f(this.mTempScreenRect);
            if (lVar.f342643b != -1) {
                o3.l lVar2 = new o3.l(android.view.accessibility.AccessibilityNodeInfo.obtain());
                for (int i18 = lVar.f342643b; i18 != -1; i18 = lVar2.f342643b) {
                    android.view.View view3 = this.mHost;
                    lVar2.f342643b = -1;
                    lVar2.f342642a.setParent(view3, -1);
                    lVar2.k(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i18, lVar2);
                    lVar2.f(this.mTempParentRect);
                    android.graphics.Rect rect2 = this.mTempScreenRect;
                    android.graphics.Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                lVar.l(this.mTempScreenRect);
                android.graphics.Rect rect4 = this.mTempScreenRect;
                if (rect4 != null && !rect4.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    java.lang.Object parent = this.mHost.getParent();
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
                    lVar.f342642a.setVisibleToUser(true);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.c(int, android.graphics.Rect):boolean");
    }

    public final boolean clearKeyboardFocusForVirtualView(int i17) {
        if (this.mKeyboardFocusedVirtualViewId != i17) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i17, false);
        sendEventForVirtualView(i17, 8);
        return true;
    }

    public final void d(int i17) {
        int i18 = this.mHoveredVirtualViewId;
        if (i18 == i17) {
            return;
        }
        this.mHoveredVirtualViewId = i17;
        sendEventForVirtualView(i17, 128);
        sendEventForVirtualView(i18, 256);
    }

    public final boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            d(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        d(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
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
        int i19 = this.mKeyboardFocusedVirtualViewId;
        if (i19 != Integer.MIN_VALUE) {
            onPerformActionForVirtualView(i19, 16, null);
        }
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // n3.c
    public o3.p getAccessibilityNodeProvider(android.view.View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new androidx.customview.widget.c(this);
        }
        return this.mNodeProvider;
    }

    @java.lang.Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f17, float f18);

    public abstract void getVisibleVirtualViews(java.util.List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i17) {
        invalidateVirtualView(i17, 0);
    }

    public o3.l obtainAccessibilityNodeInfo(int i17) {
        if (i17 != -1) {
            return b(i17);
        }
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.mHost);
        o3.l lVar = new o3.l(obtain);
        android.view.View view = this.mHost;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            lVar.f342642a.addChild(this.mHost, ((java.lang.Integer) arrayList.get(i18)).intValue());
        }
        return lVar;
    }

    public final void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        int i18 = this.mKeyboardFocusedVirtualViewId;
        if (i18 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i18);
        }
        if (z17) {
            c(i17, rect);
        }
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        onPopulateNodeForHost(lVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i17, int i18, android.os.Bundle bundle);

    public void onPopulateEventForHost(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i17, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(o3.l lVar) {
    }

    public abstract void onPopulateNodeForVirtualView(int i17, o3.l lVar);

    public void onVirtualViewKeyboardFocusChanged(int i17, boolean z17) {
    }

    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        int i19;
        if (i17 == -1) {
            android.view.View view = this.mHost;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            return n3.u0.j(view, i18, bundle);
        }
        boolean z17 = true;
        if (i18 == 1) {
            return requestKeyboardFocusForVirtualView(i17);
        }
        if (i18 == 2) {
            return clearKeyboardFocusForVirtualView(i17);
        }
        if (i18 == 64) {
            if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled() && (i19 = this.mAccessibilityFocusedVirtualViewId) != i17) {
                if (i19 != Integer.MIN_VALUE) {
                    this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
                    this.mHost.invalidate();
                    sendEventForVirtualView(i19, 65536);
                }
                this.mAccessibilityFocusedVirtualViewId = i17;
                this.mHost.invalidate();
                sendEventForVirtualView(i17, 32768);
            }
            z17 = false;
        } else {
            if (i18 != 128) {
                return onPerformActionForVirtualView(i17, i18, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId == i17) {
                this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
                this.mHost.invalidate();
                sendEventForVirtualView(i17, 65536);
            }
            z17 = false;
        }
        return z17;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i17) {
        int i18;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i18 = this.mKeyboardFocusedVirtualViewId) == i17) {
            return false;
        }
        if (i18 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i18);
        }
        this.mKeyboardFocusedVirtualViewId = i17;
        onVirtualViewKeyboardFocusChanged(i17, true);
        sendEventForVirtualView(i17, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i17, int i18) {
        android.view.ViewParent parent;
        if (i17 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, a(i17, i18));
    }

    public final void invalidateVirtualView(int i17, int i18) {
        android.view.ViewParent parent;
        if (i17 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        android.view.accessibility.AccessibilityEvent a17 = a(i17, 2048);
        o3.b.b(a17, i18);
        parent.requestSendAccessibilityEvent(this.mHost, a17);
    }
}
