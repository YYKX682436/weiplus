package db5;

/* loaded from: classes8.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21471xa18b50b f309959d;

    public l(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21471xa18b50b c21471xa18b50b) {
        this.f309959d = c21471xa18b50b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/DragDownContainer$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.MotionEvent.actionToString(event.getAction());
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21471xa18b50b c21471xa18b50b = this.f309959d;
        android.view.VelocityTracker velocityTracker = c21471xa18b50b.f278773i;
        if (velocityTracker == null) {
            velocityTracker = android.view.VelocityTracker.obtain();
            c21471xa18b50b.f278773i = velocityTracker;
        }
        velocityTracker.addMovement(event);
        int action = event.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x17 = event.getX() - c21471xa18b50b.f278769e;
                    float y17 = event.getY() - c21471xa18b50b.f278770f;
                    velocityTracker.computeCurrentVelocity(1000);
                    int xVelocity = (int) velocityTracker.getXVelocity();
                    int yVelocity = (int) velocityTracker.getYVelocity();
                    if ((java.lang.Math.abs(x17) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || yVelocity <= 0) && !c21471xa18b50b.f278774m) {
                        c21471xa18b50b.f278774m = false;
                    } else {
                        c21471xa18b50b.a(x17, y17);
                        c21471xa18b50b.f278774m = true;
                    }
                    if (y17 > 200.0f) {
                        c21471xa18b50b.f278775n = false;
                    } else {
                        c21471xa18b50b.f278775n = true;
                    }
                    if (c21471xa18b50b.f278773i != null) {
                        velocityTracker.recycle();
                        c21471xa18b50b.f278773i = null;
                    }
                }
            } else if (c21471xa18b50b.f278775n) {
                c21471xa18b50b.a(0.0f, 0.0f);
                c21471xa18b50b.f278774m = false;
            } else if (c21471xa18b50b.f278774m) {
                android.content.Context context = c21471xa18b50b.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    activity.finishAfterTransition();
                    activity.overridePendingTransition(0, 0);
                }
                c21471xa18b50b.f278774m = false;
            }
        } else {
            c21471xa18b50b.f278769e = event.getX();
            c21471xa18b50b.f278770f = event.getY();
        }
        boolean z17 = c21471xa18b50b.f278774m;
        yj0.a.i(z17, this, "com/tencent/mm/ui/base/DragDownContainer$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
