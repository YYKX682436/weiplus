package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes5.dex */
public class i2 extends android.view.TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f91140a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f91141b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f91142c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f91143d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91144e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91145f;

    public i2(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        super(rect, view);
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f91144e = scaledTouchSlop;
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.f91141b = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.f91143d = rect4;
        android.graphics.Rect rect5 = new android.graphics.Rect();
        this.f91142c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i17 = -scaledTouchSlop;
        rect4.inset(i17, i17);
        rect5.set(rect2);
        this.f91140a = view;
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
                z18 = this.f91145f;
                if (z18 && !this.f91143d.contains(x17, y17)) {
                    z19 = z18;
                    z17 = false;
                }
            } else {
                if (action == 3) {
                    z18 = this.f91145f;
                    this.f91145f = false;
                }
                z17 = true;
                z19 = false;
            }
            z19 = z18;
            z17 = true;
        } else {
            if (this.f91141b.contains(x17, y17)) {
                this.f91145f = true;
                z17 = true;
            }
            z17 = true;
            z19 = false;
        }
        if (!z19) {
            return false;
        }
        android.graphics.Rect rect = this.f91142c;
        android.view.View view = this.f91140a;
        if (!z17 || rect.contains(x17, y17)) {
            motionEvent.setLocation(x17 - rect.left, y17 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
