package com.tencent.maas.handlebox.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/tencent/maas/handlebox/view/RenderViewContainer;", "Landroid/widget/FrameLayout;", "", "d", "J", "getVibrateTimeMills", "()J", "setVibrateTimeMills", "(J)V", "vibrateTimeMills", "Lcom/tencent/maas/instamovie/MJMovieSession;", "f", "Lcom/tencent/maas/instamovie/MJMovieSession;", "getMovieSession", "()Lcom/tencent/maas/instamovie/MJMovieSession;", "setMovieSession", "(Lcom/tencent/maas/instamovie/MJMovieSession;)V", "movieSession", "Log/a;", "handlerBoxListener", "Log/a;", "getHandlerBoxListener", "()Log/a;", "setHandlerBoxListener", "(Log/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MaasSDK_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RenderViewContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long vibrateTimeMills;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f48050e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.maas.instamovie.MJMovieSession movieSession;

    /* renamed from: g, reason: collision with root package name */
    public final pg.a f48052g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RenderViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.movieSession == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        com.tencent.maas.instamovie.MJMovieSession movieSession = getMovieSession();
        android.content.Context context = getContext();
        com.tencent.maas.base.Vec2 vec2 = new com.tencent.maas.base.Vec2(getWidth(), getHeight());
        getHandlerBoxListener();
        movieSession.createMJHandleBoxTouchHelper(context, vec2, null, this.f48052g);
        kotlin.jvm.internal.o.o("handleBoxTouchHelper");
        throw null;
    }

    public final og.a getHandlerBoxListener() {
        kotlin.jvm.internal.o.o("handlerBoxListener");
        throw null;
    }

    public final com.tencent.maas.instamovie.MJMovieSession getMovieSession() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession = this.movieSession;
        if (mJMovieSession != null) {
            return mJMovieSession;
        }
        kotlin.jvm.internal.o.o("movieSession");
        throw null;
    }

    public final long getVibrateTimeMills() {
        return this.vibrateTimeMills;
    }

    public final void setHandlerBoxListener(og.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
    }

    public final void setMovieSession(com.tencent.maas.instamovie.MJMovieSession mJMovieSession) {
        kotlin.jvm.internal.o.g(mJMovieSession, "<set-?>");
        this.movieSession = mJMovieSession;
    }

    public final void setVibrateTimeMills(long j17) {
        this.vibrateTimeMills = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.vibrateTimeMills = 10L;
        this.f48052g = new pg.a(this);
    }
}
