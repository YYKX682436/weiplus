package ng3;

/* loaded from: classes10.dex */
public final class n extends ng3.e {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f418550c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.MotionEvent f418551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super("scale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f418550c = new android.view.ScaleGestureDetector(context, new ng3.m(this));
    }

    @Override // ng3.e
    public boolean b(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((java.util.ArrayList) this.f418538b).clear();
        if ((event.getAction() & 255) == 5 && event.getPointerCount() == 2) {
            c("onScalePrepare pointerCount:" + event.getPointerCount());
            a(new ng3.o(ng3.t.f418569d, 0.0f, 0.0f, 0.0f, event, 14, null));
        }
        if ((event.getAction() & 255) == 6 && event.getPointerCount() == 1) {
            c("onScaleReset pointerCount:" + event.getPointerCount());
            a(new ng3.o(ng3.t.f418572g, 0.0f, 0.0f, 0.0f, event, 14, null));
        } else if ((event.getAction() & 255) == 1) {
            a(new ng3.o(ng3.t.f418572g, 0.0f, 0.0f, 0.0f, event, 14, null));
        }
        this.f418551d = event;
        android.view.ScaleGestureDetector scaleGestureDetector = this.f418550c;
        scaleGestureDetector.isQuickScaleEnabled();
        scaleGestureDetector.onTouchEvent(event);
        return false;
    }

    @Override // ng3.e
    public void e() {
        this.f418551d = null;
    }
}
