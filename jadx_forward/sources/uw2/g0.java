package uw2;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f513201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f513202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f513203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f513204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f513205i;

    public g0(android.view.View view, float f17, android.view.MotionEvent motionEvent, boolean z17, float f18, long j17) {
        this.f513200d = view;
        this.f513201e = f17;
        this.f513202f = motionEvent;
        this.f513203g = z17;
        this.f513204h = f18;
        this.f513205i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uw2.h0.f(uw2.h0.f513207a, this.f513200d, this.f513201e, this.f513202f, this.f513203g, this.f513204h, this.f513205i, 0L, 0L, 192, null).start();
    }
}
