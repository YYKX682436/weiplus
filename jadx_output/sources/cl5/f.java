package cl5;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl5.n f42982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42983e;

    public f(cl5.n nVar, android.view.View view) {
        this.f42982d = nVar;
        this.f42983e = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/banner/PushBanner$initView$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        cl5.n nVar = this.f42982d;
        boolean z17 = false;
        if (action == 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f42983e.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            nVar.getClass();
            com.tencent.mm.ui.yk.c("PushBanner", "onDown: ", new java.lang.Object[0]);
            nVar.f43003h = motionEvent.getRawY();
            nVar.f43002g = ((android.view.WindowManager.LayoutParams) layoutParams).y;
        } else if (action == 1 || action == 3) {
            nVar.getClass();
            int b17 = nVar.b(motionEvent.getRawY());
            com.tencent.mm.ui.yk.c("PushBanner", "onDragFinish: " + b17, new java.lang.Object[0]);
            if (nVar.f43000e || nVar.b(motionEvent.getRawY()) > nVar.f43002g) {
                nVar.f43000e = false;
            } else {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(nVar.b(motionEvent.getRawY()), nVar.f43002g);
                android.view.View view2 = nVar.f42997b;
                if (view2 != null) {
                    ofInt.addListener(new cl5.h(b17, view2));
                    ofInt.addUpdateListener(new cl5.i(view2, nVar));
                }
                ofInt.setDuration(300L);
                ofInt.start();
            }
        }
        android.view.GestureDetector gestureDetector = nVar.f43005j;
        if (gestureDetector != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/ui/widget/banner/PushBanner$initView$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/ui/widget/banner/PushBanner$initView$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        boolean z18 = z17;
        yj0.a.i(z18, this, "com/tencent/mm/ui/widget/banner/PushBanner$initView$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z18;
    }
}
