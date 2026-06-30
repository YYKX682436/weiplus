package lm4;

/* loaded from: classes14.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f401080d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f401081e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f401082f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f401083g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f401084h;

    /* renamed from: i, reason: collision with root package name */
    public float f401085i;

    /* renamed from: m, reason: collision with root package name */
    public int f401086m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f401087n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f401088o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, android.view.ViewGroup mDecorView, yz5.a dragEnableBlock, yz5.p pVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mDecorView, "mDecorView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragEnableBlock, "dragEnableBlock");
        this.f401080d = mDecorView;
        this.f401081e = dragEnableBlock;
        this.f401082f = pVar;
        this.f401084h = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(getContext(), this, new lm4.b(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f401084h;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
            throw null;
        }
        if (lVar.h(true)) {
            invalidate();
        }
    }

    /* renamed from: getOnDragToClose */
    public final yz5.a m146058xe257e154() {
        return this.f401088o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!((java.lang.Boolean) this.f401081e.mo152xb9724478()).booleanValue()) {
            return false;
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f401084h;
        if (lVar != null) {
            return lVar.t(event);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f401084h;
        if (lVar != null) {
            lVar.m(event);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
        throw null;
    }

    /* renamed from: setOnDragToClose */
    public final void m146059x752e47c8(yz5.a aVar) {
        this.f401088o = aVar;
    }
}
