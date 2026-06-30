package n;

/* loaded from: classes15.dex */
public abstract class m implements android.view.Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.Window.Callback f414956d;

    public m(android.view.Window.Callback callback) {
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("Window callback may not be null");
        }
        this.f414956d = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.f414956d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f414956d.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.f414956d.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f414956d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f414956d.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.f414956d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.f414956d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.f414956d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f414956d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f414956d.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        return this.f414956d.onCreatePanelMenu(i17, menu);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i17) {
        return this.f414956d.onCreatePanelView(i17);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f414956d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        return this.f414956d.onMenuItemSelected(i17, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i17, android.view.Menu menu) {
        return this.f414956d.onMenuOpened(i17, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu menu) {
        this.f414956d.onPanelClosed(i17, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
        this.f414956d.onPointerCaptureChanged(z17);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        return this.f414956d.onPreparePanel(i17, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i17) {
        this.f414956d.onProvideKeyboardShortcuts(list, menu, i17);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return this.f414956d.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.f414956d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        this.f414956d.onWindowFocusChanged(z17);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.f414956d.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f414956d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        return this.f414956d.onWindowStartingActionMode(callback, i17);
    }
}
