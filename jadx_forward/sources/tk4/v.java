package tk4;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501548e;

    public v(tk4.c0 c0Var, android.view.View view) {
        this.f501547d = c0Var;
        this.f501548e = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z17 = false;
        tk4.c0 c0Var = this.f501547d;
        if (action == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f501548e.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioPush.TipsManager", "onDown: ");
            c0Var.f501503h = motionEvent.getRawY();
            c0Var.f501502g = ((android.view.WindowManager.LayoutParams) layoutParams).y;
        } else if (action == 1 || action == 3) {
            c0Var.getClass();
            int rawY = c0Var.f501502g + ((int) (motionEvent.getRawY() - c0Var.f501503h));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioPush.TipsManager", "onDragFinish: " + rawY);
            if (!c0Var.f501500e) {
                float rawY2 = motionEvent.getRawY();
                int i17 = c0Var.f501502g;
                if (((int) (rawY2 - c0Var.f501503h)) + i17 <= i17) {
                    float rawY3 = motionEvent.getRawY();
                    int i18 = c0Var.f501502g;
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((int) (rawY3 - c0Var.f501503h)) + i18, i18);
                    android.view.View view2 = c0Var.f501497b;
                    if (view2 != null) {
                        ofInt.addListener(new tk4.t(rawY, view2));
                        ofInt.addUpdateListener(new tk4.u(view2, c0Var));
                    }
                    ofInt.setDuration(300L);
                    ofInt.start();
                }
            }
            c0Var.f501500e = false;
        }
        android.view.GestureDetector gestureDetector = c0Var.f501499d;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        boolean z18 = z17;
        yj0.a.i(z18, this, "com/tencent/mm/plugin/ting/audiopush/TingAudioPushTipsManager$show$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z18;
    }
}
