package wj2;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab f528229a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f528230b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f528231c;

    /* renamed from: d, reason: collision with root package name */
    public int f528232d = 10;

    /* renamed from: e, reason: collision with root package name */
    public float f528233e;

    /* renamed from: f, reason: collision with root package name */
    public float f528234f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f528235g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f528236h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f528237i;

    public final boolean a(android.view.MotionEvent motionEvent) {
        android.view.ViewGroup viewGroup;
        if (!this.f528231c) {
            return false;
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f528235g = false;
            this.f528236h = false;
            this.f528237i = false;
            this.f528233e = motionEvent.getX();
            this.f528234f = motionEvent.getY();
        } else {
            boolean z17 = true;
            if (valueOf != null && valueOf.intValue() == 2) {
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                float abs = java.lang.Math.abs(x17 - this.f528233e);
                float abs2 = java.lang.Math.abs(y17 - this.f528234f);
                if (abs > this.f528232d && abs > abs2) {
                    if (!this.f528236h) {
                        motionEvent.setAction(3);
                        this.f528235g = false;
                        android.view.ViewGroup viewGroup2 = this.f528230b;
                        if (viewGroup2 != null) {
                            viewGroup2.dispatchTouchEvent(motionEvent);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeToCloseProcessor", "dispatchTouchEvent cancelEvent to originView");
                        this.f528236h = true;
                    }
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                    if (obtain != null) {
                        obtain.setLocation(obtain.getRawX(), obtain.getRawY());
                    }
                    if (!this.f528237i) {
                        obtain.setAction(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeToCloseProcessor", "dispatchTouchEvent downEvent to swipeView");
                        this.f528237i = true;
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = this.f528229a;
                    boolean b17 = c22649x858f5ab != null ? c22649x858f5ab.b(obtain) : false;
                    this.f528235g = b17;
                    if (b17 && (viewGroup = this.f528230b) != null) {
                        viewGroup.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
            } else {
                if ((valueOf == null || valueOf.intValue() != 3) && (valueOf == null || valueOf.intValue() != 1)) {
                    z17 = false;
                }
                if (z17) {
                    if (this.f528235g) {
                        android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(motionEvent);
                        if (obtain2 != null) {
                            obtain2.setLocation(obtain2.getRawX(), obtain2.getRawY());
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab2 = this.f528229a;
                        if (c22649x858f5ab2 != null) {
                            c22649x858f5ab2.b(obtain2);
                        }
                    }
                    this.f528235g = false;
                    this.f528236h = false;
                    this.f528237i = false;
                }
            }
        }
        return false;
    }

    public final void b(android.view.ViewGroup originalView) {
        android.view.Window window;
        android.view.View decorView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalView, "originalView");
        android.content.Context context = originalView.getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            c22649x858f5ab = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) decorView.findViewById(com.p314xaae8f345.mm.R.id.nsv);
        }
        this.f528229a = c22649x858f5ab;
        this.f528230b = originalView;
        this.f528232d = android.view.ViewConfiguration.get(originalView.getContext()).getScaledTouchSlop();
        ae2.in inVar = ae2.in.f85221a;
        this.f528231c = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).mo141623x754a37bb()).r()).intValue() == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate swipe=");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab2 = this.f528229a;
        sb6.append(c22649x858f5ab2 != null ? c22649x858f5ab2.hashCode() : 0);
        sb6.append(" swipeSlop=");
        sb6.append(this.f528232d);
        sb6.append(" swipeToCloseEnable=");
        sb6.append(this.f528231c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeToCloseProcessor", sb6.toString());
    }
}
