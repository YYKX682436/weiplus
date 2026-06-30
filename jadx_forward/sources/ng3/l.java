package ng3;

/* loaded from: classes10.dex */
public final class l implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f418544a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f418545b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.MotionEvent f418546c;

    /* renamed from: d, reason: collision with root package name */
    public final float f418547d;

    /* renamed from: e, reason: collision with root package name */
    public final float f418548e;

    public l(ng3.t trigger, android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        this.f418544a = trigger;
        this.f418545b = motionEvent;
        this.f418546c = e27;
        this.f418547d = f17;
        this.f418548e = f18;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f418544a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gesture, "gesture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f418574i;
        android.view.MotionEvent motionEvent = this.f418545b;
        android.view.MotionEvent event = this.f418546c;
        float f17 = this.f418548e;
        float f18 = this.f418547d;
        ng3.t tVar2 = this.f418544a;
        if (tVar2 == tVar) {
            java.lang.String content = "MoveEvent: into dispatcher.onScroll(MOVE_SCROLL) " + f18 + ' ' + f17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture).D1.onScroll(motionEvent, event, f18, f17);
            return;
        }
        if (tVar2 == ng3.t.f418575m) {
            java.lang.String content2 = "MoveEvent: into dispatcher.onScroll(MOVE_VERTICAL_SCROLL) " + f18 + ' ' + f17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture).D1.onScroll(motionEvent, event, f18, f17);
            return;
        }
        if (tVar2 == ng3.t.f418573h) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture).D1.onDown(event);
            return;
        }
        if (tVar2 == ng3.t.f418577o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100 = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) gesture;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            c16501x5a606100.t();
            c16501x5a606100.u();
            c16501x5a606100.v();
            c16501x5a606100.x();
            c16501x5a606100.w();
            java.util.Objects.toString(c16501x5a606100.getVisibilityRect());
            java.util.Objects.toString(c16501x5a606100.getContentRectF());
            if (c16501x5a606100.t()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa.I(c16501x5a606100, null, 1, null);
            }
            android.view.KeyEvent.Callback contentView = c16501x5a606100.getContentView();
            rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
            if (gVar == null) {
                return;
            }
            gVar.b();
        }
    }

    public /* synthetic */ l(ng3.t tVar, android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(tVar, (i17 & 2) != 0 ? null : motionEvent, motionEvent2, (i17 & 8) != 0 ? 0.0f : f17, (i17 & 16) != 0 ? 0.0f : f18);
    }
}
