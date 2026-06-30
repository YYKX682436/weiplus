package ng3;

/* loaded from: classes10.dex */
public final class o implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f418552a;

    /* renamed from: b, reason: collision with root package name */
    public final float f418553b;

    /* renamed from: c, reason: collision with root package name */
    public final float f418554c;

    /* renamed from: d, reason: collision with root package name */
    public final float f418555d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.MotionEvent f418556e;

    public o(ng3.t trigger, float f17, float f18, float f19, android.view.MotionEvent motionEvent, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 2) != 0 ? 0.0f : f17;
        f18 = (i17 & 4) != 0 ? 0.0f : f18;
        f19 = (i17 & 8) != 0 ? 0.0f : f19;
        motionEvent = (i17 & 16) != 0 ? null : motionEvent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        this.f418552a = trigger;
        this.f418553b = f17;
        this.f418554c = f18;
        this.f418555d = f19;
        this.f418556e = motionEvent;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f418552a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gesture, "gesture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f418569d;
        android.view.MotionEvent motionEvent = this.f418556e;
        float f17 = this.f418555d;
        float f18 = this.f418554c;
        float f19 = this.f418553b;
        ng3.t tVar2 = this.f418552a;
        if (tVar2 == tVar) {
            java.lang.String content = "ScaleEvent: cancel viewpager " + f19 + ", " + f18 + ", " + f17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            pageGesture.g(obtain);
            return;
        }
        if (tVar2 == ng3.t.f418570e) {
            java.lang.String content2 = "ScaleEvent: into adapterScale " + f19 + ", " + f18 + ", " + f17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture).B(f19, f18, f17);
            return;
        }
        if (tVar2 != ng3.t.f418571f || motionEvent == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100 = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture;
        c16501x5a606100.c(motionEvent);
        android.view.KeyEvent.Callback contentView = c16501x5a606100.getContentView();
        rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
        if (gVar == null) {
            return;
        }
        gVar.b();
    }
}
