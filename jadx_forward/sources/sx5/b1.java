package sx5;

/* loaded from: classes13.dex */
public class b1 implements sx5.a {

    /* renamed from: d, reason: collision with root package name */
    public final by5.i0 f495233d;

    /* renamed from: e, reason: collision with root package name */
    public final by5.i0 f495234e;

    /* renamed from: f, reason: collision with root package name */
    public final by5.i0 f495235f;

    /* renamed from: g, reason: collision with root package name */
    public final by5.i0 f495236g;

    /* renamed from: h, reason: collision with root package name */
    public final by5.i0 f495237h;

    /* renamed from: i, reason: collision with root package name */
    public final by5.i0 f495238i;

    /* renamed from: m, reason: collision with root package name */
    public final by5.i0 f495239m;

    /* renamed from: n, reason: collision with root package name */
    public final by5.i0 f495240n;

    /* renamed from: o, reason: collision with root package name */
    public final by5.i0 f495241o;

    /* renamed from: p, reason: collision with root package name */
    public final by5.i0 f495242p;

    /* renamed from: q, reason: collision with root package name */
    public final by5.i0 f495243q;

    /* renamed from: r, reason: collision with root package name */
    public final by5.i0 f495244r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Object f495245s;

    public b1(java.lang.Object obj) {
        this.f495245s = obj;
        this.f495233d = new by5.i0(obj, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, android.app.Activity.class, android.view.View.class, android.view.View.class, android.content.Context.class, java.lang.String.class);
        this.f495234e = new by5.i0(obj, "initConfigs", android.os.Bundle.class);
        java.lang.Class cls = java.lang.Boolean.TYPE;
        this.f495235f = new by5.i0(obj, "evaluteJavascript", cls, cls);
        this.f495236g = new by5.i0(obj, "onShowCustomView", android.view.View.class, android.webkit.WebChromeClient.CustomViewCallback.class);
        this.f495237h = new by5.i0(obj, "onHideCustomView", new java.lang.Class[0]);
        new by5.i0(obj, "hasEnteredFullscreen", new java.lang.Class[0]);
        this.f495238i = new by5.i0(obj, "registerJavascriptInterface", java.lang.Object.class);
        this.f495239m = new by5.i0(obj, "disableJsCallback", cls);
        this.f495240n = new by5.i0(obj, "setVideoJsCallback", java.lang.Object.class);
        new by5.i0(obj, "videoChangeStatus", new java.lang.Class[0]);
        this.f495241o = new by5.i0(obj, "videoPlay", new java.lang.Class[0]);
        this.f495242p = new by5.i0(obj, "videoPause", new java.lang.Class[0]);
        this.f495243q = new by5.i0(obj, "videoSeek", java.lang.Double.TYPE);
        new by5.i0(obj, "videoMute", cls);
        new by5.i0(obj, "videoPlaybackRate", java.lang.Double.TYPE);
        new by5.i0(obj, "videoExitFullscreen", new java.lang.Class[0]);
        this.f495244r = new by5.i0(obj, "supportSetRequestedOrientationCallback", new java.lang.Class[0]);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public void a(double d17) {
        try {
            this.f495243q.b(java.lang.Double.valueOf(d17));
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "videoSeek invoke error:" + th6);
        }
    }

    @Override // sx5.a
    public void b(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f495236g.b(view, customViewCallback);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "onShowCustomView error:" + th6);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public void c() {
        try {
            this.f495242p.b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "videoPause invoke error:" + th6);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public boolean d() {
        try {
            return ((java.lang.Boolean) this.f495244r.b(new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "supportSetRequestedOrientationCallback invoke error:" + th6);
            return false;
        }
    }

    @Override // sx5.a
    public void e() {
        try {
            this.f495237h.b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "onHideCustomView error:" + th6);
        }
    }

    @Override // sx5.a
    public boolean f(java.lang.Object obj) {
        cy5.h d17 = cy5.m.d(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450);
        if (d17 == null || d17.f306412a < 10) {
            if (d17 != null) {
                by5.c4.f("VideoNativeInterfaceRuntime", "setVideoJsCallback return false, fullScreenVideoPlugin is not available, version:" + d17.f306412a);
            } else {
                by5.c4.f("VideoNativeInterfaceRuntime", "setVideoJsCallback return false, fullScreenVideoPlugin is not available");
            }
            return false;
        }
        try {
            return ((java.lang.Boolean) this.f495240n.b(obj)).booleanValue();
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "setVideoJsCallback invoke error:" + th6);
            return false;
        }
    }

    @Override // sx5.a
    public void g(boolean z17, boolean z18) {
        try {
            this.f495235f.b(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "evaluteJavascript error:" + th6);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o0
    public void h() {
        try {
            this.f495241o.b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.f("VideoNativeInterfaceRuntime", "videoPlay invoke error:" + th6);
        }
    }

    @Override // sx5.a
    public void i(boolean z17) {
        try {
            this.f495239m.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "disableJsCallback error:" + th6);
        }
    }

    @Override // sx5.a
    public void j(java.lang.Object obj) {
        try {
            this.f495238i.b(obj);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "registerJavascriptInterface error:" + th6);
        }
    }

    public void k(android.app.Activity activity, android.view.View view, android.view.View view2, android.content.Context context, java.lang.String str) {
        try {
            this.f495233d.b(activity, view, view2, context, str);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("VideoNativeInterfaceRuntime", "init error:" + th6);
            throw new java.lang.Exception(th6);
        }
    }
}
