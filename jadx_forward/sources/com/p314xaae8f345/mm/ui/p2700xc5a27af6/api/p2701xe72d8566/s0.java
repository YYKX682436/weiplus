package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes15.dex */
public final class s0 implements android.view.Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window.Callback f290082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Window.Callback f290083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290084f;

    public s0(android.view.Window.Callback callback, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var) {
        this.f290083e = callback;
        this.f290084f = j1Var;
        this.f290082d = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.f290082d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f290082d.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.f290082d.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f290082d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "user cancelled, hideShareTongue");
            com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290084f;
            j1Var.Ai();
            java.lang.ref.WeakReference weakReference = j1Var.f290035h;
            j1Var.Di(weakReference != null ? (android.app.Activity) weakReference.get() : null);
        }
        return this.f290083e.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.f290082d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.f290082d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.f290082d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f290082d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f290082d.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return this.f290082d.onCreatePanelMenu(i17, p17);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i17) {
        return this.f290082d.onCreatePanelView(i17);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f290082d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return this.f290082d.onMenuItemSelected(i17, p17);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i17, android.view.Menu p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return this.f290082d.onMenuOpened(i17, p17);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        this.f290082d.onPanelClosed(i17, p17);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu p27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p27, "p2");
        return this.f290082d.onPreparePanel(i17, view, p27);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f290082d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.f290082d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        this.f290082d.onWindowFocusChanged(z17);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.f290082d.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return this.f290082d.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        return this.f290082d.onWindowStartingActionMode(callback, i17);
    }
}
