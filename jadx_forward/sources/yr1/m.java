package yr1;

/* loaded from: classes14.dex */
public final class m extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f546183d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f546184e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f546185f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f546186g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f546187h;

    /* renamed from: i, reason: collision with root package name */
    public float f546188i;

    /* renamed from: m, reason: collision with root package name */
    public int f546189m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f546190n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f546191o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, android.view.ViewGroup mDecorView, yz5.a dragEnableBlock, yz5.p pVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mDecorView, "mDecorView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragEnableBlock, "dragEnableBlock");
        this.f546183d = mDecorView;
        this.f546184e = dragEnableBlock;
        this.f546185f = pVar;
        this.f546187h = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(getContext(), this, new yr1.l(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f546187h;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
            throw null;
        }
        if (lVar.h(true)) {
            invalidate();
        }
    }

    /* renamed from: getOnDragToClose */
    public final yz5.a m177546xe257e154() {
        return this.f546191o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!((java.lang.Boolean) this.f546184e.mo152xb9724478()).booleanValue()) {
            return false;
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f546187h;
        if (lVar != null) {
            return lVar.t(event);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f546187h;
        if (lVar != null) {
            lVar.m(event);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
        throw null;
    }

    /* renamed from: setOnDragToClose */
    public final void m177547x752e47c8(yz5.a aVar) {
        this.f546191o = aVar;
    }
}
