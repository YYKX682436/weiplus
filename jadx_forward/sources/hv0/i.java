package hv0;

/* loaded from: classes5.dex */
public final class i implements hv0.j {

    /* renamed from: a, reason: collision with root package name */
    public float f366793a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f366794b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f366795c = jz5.h.b(new hv0.g(this));

    @Override // hv0.j
    public void a(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animView, "animView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundView, "backgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTranslation, "onTranslation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        animView.animate().withEndAction(new hv0.h(end)).setDuration(300L).start();
    }

    @Override // hv0.j
    public void b(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animView, "animView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundView, "backgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTranslation, "onTranslation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        this.f366794b = onTranslation;
        end.mo152xb9724478();
    }
}
