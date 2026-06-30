package ng;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f418419a;

    /* renamed from: b, reason: collision with root package name */
    public final ng.f f418420b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f418421c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f418422d;

    /* renamed from: e, reason: collision with root package name */
    public float f418423e;

    /* renamed from: f, reason: collision with root package name */
    public float f418424f;

    public e(android.content.Context context, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e viewSize, ng.f gestureDetectorListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewSize, "viewSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureDetectorListener, "gestureDetectorListener");
        this.f418419a = viewSize;
        this.f418420b = gestureDetectorListener;
        this.f418424f = 1.0f;
        new ng.k(context, new ng.c(this));
        new ng.h(context, new ng.b(this));
        new android.view.GestureDetector(context, new ng.d(this));
    }
}
