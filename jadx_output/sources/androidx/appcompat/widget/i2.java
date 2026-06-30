package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class i2 extends android.view.TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f9607a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f9608b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f9609c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f9610d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9611e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9612f;

    public i2(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        super(rect, view);
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f9611e = scaledTouchSlop;
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.f9608b = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.f9610d = rect4;
        android.graphics.Rect rect5 = new android.graphics.Rect();
        this.f9609c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i17 = -scaledTouchSlop;
        rect4.inset(i17, i17);
        rect5.set(rect2);
        this.f9607a = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        boolean z18;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z19 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z18 = this.f9612f;
                if (z18 && !this.f9610d.contains(x17, y17)) {
                    z19 = z18;
                    z17 = false;
                }
            } else {
                if (action == 3) {
                    z18 = this.f9612f;
                    this.f9612f = false;
                }
                z17 = true;
                z19 = false;
            }
            z19 = z18;
            z17 = true;
        } else {
            if (this.f9608b.contains(x17, y17)) {
                this.f9612f = true;
                z17 = true;
            }
            z17 = true;
            z19 = false;
        }
        if (!z19) {
            return false;
        }
        android.graphics.Rect rect = this.f9609c;
        android.view.View view = this.f9607a;
        if (!z17 || rect.contains(x17, y17)) {
            motionEvent.setLocation(x17 - rect.left, y17 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
