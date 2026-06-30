package hr3;

/* loaded from: classes11.dex */
public final class lc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f365291d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f365292e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f365293f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f365294g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f365295h;

    /* renamed from: i, reason: collision with root package name */
    public float f365296i;

    /* renamed from: m, reason: collision with root package name */
    public int f365297m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365298n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(android.app.Activity context, yz5.a dragEnableBlock) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragEnableBlock, "dragEnableBlock");
        this.f365291d = dragEnableBlock;
        this.f365294g = context;
        this.f365295h = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(getContext(), this, new hr3.kc(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f365295h;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
            throw null;
        }
        if (lVar.h(true)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!((java.lang.Boolean) this.f365291d.mo152xb9724478()).booleanValue()) {
            return false;
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f365295h;
        if (lVar != null) {
            return lVar.t(event);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f365295h;
        if (lVar != null) {
            lVar.m(event);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
        throw null;
    }
}
