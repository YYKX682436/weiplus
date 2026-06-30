package vh5;

/* loaded from: classes10.dex */
public final class t implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f518777a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f518778b;

    public t(ng3.t trigger, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        this.f518777a = trigger;
        this.f518778b = e17;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f518777a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gesture, "gesture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageGesture, "pageGesture");
        if (this.f518777a == ng3.t.f418581s) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture).D1.onDoubleTap(this.f518778b);
        }
    }
}
