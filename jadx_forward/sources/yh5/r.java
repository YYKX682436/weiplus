package yh5;

/* loaded from: classes12.dex */
public final class r extends pf3.g {

    /* renamed from: v, reason: collision with root package name */
    public final yh5.p f543976v;

    /* renamed from: w, reason: collision with root package name */
    public final fg3.g f543977w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f543978x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mf3.p apiCenter) {
        super(apiCenter, "CleanGallery.VideoSourceLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f543976v = new yh5.p(apiCenter);
        this.f543977w = new fg3.g(apiCenter);
        this.f543978x = "";
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        this.f543977w.F();
        this.f543976v.F();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new android.widget.FrameLayout(context);
    }

    @Override // mf3.e
    public java.lang.String L() {
        return this.f543978x;
    }

    @Override // pf3.g
    public void a0() {
        this.f543977w.a0();
        this.f543976v.a0();
    }

    @Override // pf3.g, pf3.h
    public void c() {
        this.f543977w.c();
        this.f543976v.c();
    }

    @Override // pf3.g, mf3.l
    public void d(float f17) {
        this.f543977w.d(f17);
        this.f543976v.d(f17);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void i() {
        this.f543977w.i();
        this.f543976v.i();
    }

    @Override // pf3.d, mf3.n
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return this.f543977w.n(event) || this.f543976v.n(event);
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        this.f543977w.getClass();
        this.f543976v.getClass();
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        this.f543977w.mo129544x6761d4f();
        this.f543976v.mo124474x57429eec();
        a0();
    }

    @Override // mf3.e, mf3.n
    public void p(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f543978x = value;
        yh5.p pVar = this.f543976v;
        pVar.getClass();
        pVar.f407639f = value;
        fg3.g gVar = this.f543977w;
        gVar.getClass();
        gVar.f407639f = value;
    }

    @Override // pf3.g, mf3.l
    public void q(float f17) {
        this.f543977w.q(f17);
        this.f543976v.q(f17);
    }

    @Override // pf3.g, mf3.e, mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        this.f543977w.mo129548x408b7293();
        this.f543976v.mo129548x408b7293();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        this.f543977w.t(bindContext);
        this.f543976v.t(bindContext);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        this.f543976v.u(parentView);
        this.f543977w.u(parentView);
    }
}
