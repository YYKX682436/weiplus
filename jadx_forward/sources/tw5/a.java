package tw5;

/* loaded from: classes8.dex */
public final class a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final long f504017d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f504018e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f504019f;

    /* renamed from: g, reason: collision with root package name */
    public final ww5.c f504020g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f504021h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f504022i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f504023m;

    /* renamed from: n, reason: collision with root package name */
    public final float f504024n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, java.lang.String frameSetRootId, java.lang.String frameSetId, android.content.Context context, ww5.c canvasViewType, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        canvasViewType = (i17 & 16) != 0 ? ww5.c.f531929d : canvasViewType;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetRootId, "frameSetRootId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasViewType, "canvasViewType");
        this.f504017d = j17;
        this.f504018e = frameSetRootId;
        this.f504019f = frameSetId;
        this.f504020g = canvasViewType;
        this.f504024n = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: getDensity */
    public final float m167112x9a59d0b2() {
        return this.f504024n;
    }

    /* renamed from: getFrameSetViewHeight */
    public final int m167113xf1bccfb7() {
        return (int) (getHeight() / this.f504024n);
    }

    /* renamed from: getFrameSetViewWidth */
    public final int m167114x426fdd36() {
        return (int) (getWidth() / this.f504024n);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f504021h) {
            return;
        }
        float f17 = i19 - i17;
        float f18 = this.f504024n;
        com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.b.f301575b.f(this.f504017d, this.f504019f, this.f504018e, (int) (f17 / f18), (int) ((i27 - i18) / f18));
        this.f504021h = true;
        yz5.l lVar = this.f504023m;
        if (lVar != null) {
            if (lVar != null) {
                lVar.mo146xb9724478(this);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onFrameSetViewBound");
                throw null;
            }
        }
    }

    /* renamed from: setUpOnFrameSetViewBoundCallback */
    public final void m167115x1faad40d(yz5.l onFrameSetViewBound) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFrameSetViewBound, "onFrameSetViewBound");
        this.f504023m = onFrameSetViewBound;
    }
}
