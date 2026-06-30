package ng3;

/* loaded from: classes10.dex */
public final class c implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f418529a;

    /* renamed from: b, reason: collision with root package name */
    public final float f418530b;

    /* renamed from: c, reason: collision with root package name */
    public final float f418531c;

    public c(ng3.t trigger, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        this.f418529a = trigger;
        this.f418530b = f17;
        this.f418531c = f18;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f418529a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gesture, "gesture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f418582t;
        float f17 = this.f418531c;
        float f18 = this.f418530b;
        ng3.t tVar2 = this.f418529a;
        if (tVar2 == tVar) {
            pageGesture.a(f18, f17);
        }
        if (tVar2 == ng3.t.f418583u) {
            pageGesture.a(f18, f17);
        }
        if (tVar2 == ng3.t.f418584v) {
            pageGesture.d();
        }
    }
}
