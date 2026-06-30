package a12;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.GestureDetector f82051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.GestureDetector gestureDetector) {
        super(1);
        this.f82051d = gestureDetector;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent event = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.GestureDetector gestureDetector = this.f82051d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$1", "invoke", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$1", "invoke", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return jz5.f0.f384359a;
    }
}
