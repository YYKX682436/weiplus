package gh;

/* loaded from: classes14.dex */
public class j extends android.view.SurfaceView implements gh.r, android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f353363d;

    /* renamed from: e, reason: collision with root package name */
    public final gh.y f353364e;

    /* renamed from: f, reason: collision with root package name */
    public gh.t f353365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f353363d = this;
        this.f353364e = gh.y.SurfaceView;
        getHolder().addCallback(this);
    }

    public void a(android.view.SurfaceHolder holder, boolean z17) {
        java.lang.Object mo131548x182e20a4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        gh.t tVar = this.f353365f;
        if (tVar != null) {
            if (mo131548x182e20a4() == null) {
                mo131548x182e20a4 = holder.getSurface();
            } else {
                mo131548x182e20a4 = mo131548x182e20a4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo131548x182e20a4);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo131548x182e20a4, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            tVar.a(mo131548x182e20a4, z17);
        }
    }

    @Override // gh.r
    /* renamed from: getSurface */
    public java.lang.Object mo131547xcf572877() {
        return gh.q.a(this);
    }

    /* renamed from: getSurfaceTexture */
    public java.lang.Object mo131548x182e20a4() {
        return null;
    }

    @Override // gh.r
    /* renamed from: getThisView */
    public android.view.View mo131549xc514bbd9() {
        return this.f353363d;
    }

    @Override // gh.r
    /* renamed from: getViewType */
    public gh.y mo131550xc321a0f5() {
        return this.f353364e;
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        callback.mo146xb9724478(java.lang.Boolean.TRUE);
    }

    @Override // gh.r
    /* renamed from: onDestroy */
    public void mo131551xac79a11b() {
    }

    @Override // gh.r
    /* renamed from: setSurfaceListener */
    public void mo131552xb06c83bf(gh.t tVar) {
        this.f353365f = tVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        java.lang.Object mo131548x182e20a4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        gh.t tVar = this.f353365f;
        if (tVar != null) {
            if (mo131548x182e20a4() == null) {
                mo131548x182e20a4 = holder.getSurface();
            } else {
                mo131548x182e20a4 = mo131548x182e20a4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo131548x182e20a4);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo131548x182e20a4, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            tVar.c(mo131548x182e20a4, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        java.lang.Object mo131548x182e20a4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.graphics.Rect surfaceFrame = holder.getSurfaceFrame();
        gh.t tVar = this.f353365f;
        if (tVar != null) {
            if (mo131548x182e20a4() == null) {
                mo131548x182e20a4 = holder.getSurface();
            } else {
                mo131548x182e20a4 = mo131548x182e20a4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo131548x182e20a4);
            }
            java.lang.Object obj = mo131548x182e20a4;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            gh.s.a(tVar, obj, surfaceFrame.width(), surfaceFrame.height(), false, false, 16, null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        a(holder, false);
    }
}
