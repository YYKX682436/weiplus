package vh5;

/* loaded from: classes10.dex */
public final class m extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.GestureDetector f518762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context) {
        super("double-tap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f518762c = new android.view.GestureDetector(context, new vh5.l(this));
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((java.util.ArrayList) this.f418538b).clear();
        android.view.GestureDetector gestureDetector = this.f518762c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/media/chat/legacy/DoubleTapController", "handleSyncTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/media/chat/legacy/DoubleTapController", "handleSyncTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
