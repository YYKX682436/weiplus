package ng3;

/* loaded from: classes10.dex */
public final class d implements ng3.f {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f418532a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f418533b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.MotionEvent f418534c;

    /* renamed from: d, reason: collision with root package name */
    public final float f418535d;

    /* renamed from: e, reason: collision with root package name */
    public final float f418536e;

    public d(ng3.t trigger, android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        this.f418532a = trigger;
        this.f418533b = motionEvent;
        this.f418534c = e27;
        this.f418535d = f17;
        this.f418536e = f18;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f418532a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gesture, "gesture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageGesture, "pageGesture");
        if (this.f418532a == ng3.t.f418576n) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MoveEvent: into dispatcher.onFling ");
            float f17 = this.f418535d;
            sb6.append(f17);
            sb6.append(' ');
            float f18 = this.f418536e;
            sb6.append(f18);
            java.lang.String content = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture).D1.onFling(this.f418533b, this.f418534c, f17, f18);
        }
    }
}
