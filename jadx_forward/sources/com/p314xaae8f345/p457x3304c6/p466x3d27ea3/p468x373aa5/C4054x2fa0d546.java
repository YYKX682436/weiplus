package com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p468x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/tencent/maas/handlebox/view/RenderViewContainer;", "Landroid/widget/FrameLayout;", "", "d", "J", "getVibrateTimeMills", "()J", "setVibrateTimeMills", "(J)V", "vibrateTimeMills", "Lcom/tencent/maas/instamovie/MJMovieSession;", "f", "Lcom/tencent/maas/instamovie/MJMovieSession;", "getMovieSession", "()Lcom/tencent/maas/instamovie/MJMovieSession;", "setMovieSession", "(Lcom/tencent/maas/instamovie/MJMovieSession;)V", "movieSession", "Log/a;", "handlerBoxListener", "Log/a;", "getHandlerBoxListener", "()Log/a;", "setHandlerBoxListener", "(Log/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MaasSDK_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: com.tencent.maas.handlebox.view.RenderViewContainer */
/* loaded from: classes5.dex */
public final class C4054x2fa0d546 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long vibrateTimeMills;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f129583e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 movieSession;

    /* renamed from: g, reason: collision with root package name */
    public final pg.a f129585g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4054x2fa0d546(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.movieSession == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 m33005x760af7bc = m33005x760af7bc();
        android.content.Context context = getContext();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(getWidth(), getHeight());
        m33004x78b7cbeb();
        m33005x760af7bc.m33384xa7907a83(context, c3974x289f3e, null, this.f129585g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("handleBoxTouchHelper");
        throw null;
    }

    /* renamed from: getHandlerBoxListener */
    public final og.a m33004x78b7cbeb() {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("handlerBoxListener");
        throw null;
    }

    /* renamed from: getMovieSession */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 m33005x760af7bc() {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83 = this.movieSession;
        if (c4079x793f83 != null) {
            return c4079x793f83;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("movieSession");
        throw null;
    }

    public final long getVibrateTimeMills() {
        return this.vibrateTimeMills;
    }

    /* renamed from: setHandlerBoxListener */
    public final void m33007xfe34df7(og.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
    }

    /* renamed from: setMovieSession */
    public final void m33008xac53f2c8(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4079x793f83, "<set-?>");
        this.movieSession = c4079x793f83;
    }

    /* renamed from: setVibrateTimeMills */
    public final void m33009x8d928dd(long j17) {
        this.vibrateTimeMills = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4054x2fa0d546(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.vibrateTimeMills = 10L;
        this.f129585g = new pg.a(this);
    }
}
