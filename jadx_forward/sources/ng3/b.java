package ng3;

/* loaded from: classes10.dex */
public final class b extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public android.view.VelocityTracker f418525c;

    /* renamed from: d, reason: collision with root package name */
    public float f418526d;

    /* renamed from: e, reason: collision with root package name */
    public float f418527e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f418528f;

    public b() {
        super("drag");
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((java.util.ArrayList) this.f418538b).clear();
        if (this.f418525c == null) {
            this.f418525c = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f418525c;
        if (velocityTracker == null) {
            return false;
        }
        velocityTracker.addMovement(event);
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        int yVelocity = (int) velocityTracker.getYVelocity();
        int action = event.getAction() & 255;
        if (action == 0) {
            this.f418526d = event.getRawX();
            this.f418527e = event.getRawY();
            c("drag raw down, downX:" + this.f418526d + " downY:" + this.f418527e);
        } else if (action == 1) {
            this.f418528f = false;
            a(new ng3.c(ng3.t.f418584v, 0.0f, 0.0f));
            android.view.VelocityTracker velocityTracker2 = this.f418525c;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f418525c = null;
        } else if (action == 2) {
            float rawX = event.getRawX() - this.f418526d;
            float rawY = event.getRawY() - this.f418527e;
            c("drag exit check: tx:" + rawX + " ty:" + rawY + " velocityX:" + xVelocity + " velocityY:" + yVelocity);
            if (this.f418528f) {
                a(new ng3.c(ng3.t.f418583u, rawX, rawY));
                return true;
            }
            if (java.lang.Math.abs(rawX) <= 250.0d && rawY > 10.0f && yVelocity > 100 && java.lang.Math.abs(yVelocity) > java.lang.Math.abs(xVelocity) && !this.f418528f) {
                this.f418526d = event.getRawX();
                this.f418527e = event.getRawY();
                float rawX2 = event.getRawX() - this.f418526d;
                float rawY2 = event.getRawY() - this.f418527e;
                c("drag raw prepare, downX:" + this.f418526d + " downY:" + this.f418527e);
                c("drag raw prepare: tx:" + rawX2 + " ty:" + rawY2 + " velocityX:" + xVelocity + " velocityY:" + yVelocity);
                this.f418528f = true;
                a(new ng3.c(ng3.t.f418582t, rawX2, rawY2));
                a(new ng3.c(ng3.t.f418583u, rawX2, rawY2));
                return true;
            }
        }
        return false;
    }

    @Override // ng3.e
    public void e() {
        this.f418528f = false;
        this.f418525c = android.view.VelocityTracker.obtain();
    }
}
