package ww5;

/* loaded from: classes8.dex */
public final class a extends android.view.SurfaceView {

    /* renamed from: d, reason: collision with root package name */
    public final long f531925d;

    /* renamed from: e, reason: collision with root package name */
    public final vw5.c f531926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, vw5.c delegate, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f531925d = j17;
        this.f531926e = delegate;
        getHolder().addCallback(new ww5.d(j17, delegate));
    }

    /* renamed from: getCanvasId */
    public final long m174589x758cc609() {
        return this.f531925d;
    }

    /* renamed from: getDelegate */
    public final vw5.c m174590xacb01afb() {
        return this.f531926e;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return ((com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66) this.f531926e).d(this.f531925d, event);
    }
}
