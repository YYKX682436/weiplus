package db5;

/* loaded from: classes5.dex */
public class c5 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f309839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(db5.d5 d5Var, android.content.Context context) {
        super(context);
        this.f309839d = d5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
                return super.dispatchKeyEvent(keyEvent);
            }
            this.f309839d.dismiss();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.f309839d.f309851a;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i17) {
        return super.onCreateDrawableState(i17);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        db5.d5 d5Var = this.f309839d;
        if (action == 0 && (x17 < 0 || x17 >= getWidth() || y17 < 0 || y17 >= getHeight())) {
            d5Var.dismiss();
            return true;
        }
        if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        d5Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i17) {
        if (getChildCount() == 1) {
            getChildAt(0).sendAccessibilityEvent(i17);
        } else {
            super.sendAccessibilityEvent(i17);
        }
        super.sendAccessibilityEvent(i17);
    }
}
