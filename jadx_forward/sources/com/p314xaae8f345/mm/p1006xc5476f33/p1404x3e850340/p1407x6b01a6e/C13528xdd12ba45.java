package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectView */
/* loaded from: classes14.dex */
public class C13528xdd12ba45 extends android.widget.RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f181651w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a f181652d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13527xdbf7520a f181653e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f181654f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f181655g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f181656h;

    /* renamed from: i, reason: collision with root package name */
    public i72.x f181657i;

    /* renamed from: m, reason: collision with root package name */
    public e72.h f181658m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181659n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f181660o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181661p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f181662q;

    /* renamed from: r, reason: collision with root package name */
    public long f181663r;

    /* renamed from: s, reason: collision with root package name */
    public long f181664s;

    /* renamed from: t, reason: collision with root package name */
    public long f181665t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Animation f181666u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f181667v;

    public C13528xdd12ba45(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45, e72.f fVar) {
        boolean z17;
        c13528xdd12ba45.getClass();
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectView", "hy: motion eat but no data");
            return;
        }
        int i17 = fVar.f331433a;
        if (i17 > 0) {
            i72.x xVar = c13528xdd12ba45.f181657i;
            z17 = true;
            if (xVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614 = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614) xVar;
                if (i17 == 1) {
                    activityC13521xbef6f614.f181614r.a(null);
                }
            }
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.lang.String str = fVar.f331435c;
        c13528xdd12ba45.e(str != null ? str : c13528xdd12ba45.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6l));
        i72.x xVar2 = c13528xdd12ba45.f181657i;
        if (xVar2 != null) {
            if (str == null) {
                str = c13528xdd12ba45.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6l);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614) xVar2).V6(fVar.f331434b, str);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45) {
        e72.h hVar = c13528xdd12ba45.f181658m;
        if (hVar == null || !hVar.i()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectView", "hy: meet require");
        c13528xdd12ba45.f181652d.F();
        c13528xdd12ba45.f181661p = true;
        long j17 = c13528xdd12ba45.f181664s;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectView", "hy: current motion used time: %d", java.lang.Long.valueOf(elapsedRealtime));
        long j18 = c13528xdd12ba45.f181663r;
        if (elapsedRealtime < j18 - 5) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i72.q(c13528xdd12ba45), j18 - elapsedRealtime);
        } else {
            if (c13528xdd12ba45.f181657i == null || c13528xdd12ba45.f181660o) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614) c13528xdd12ba45.f181657i).V6(0, "");
        }
    }

    public final void c() {
        this.f181654f.setText("");
        this.f181654f.setVisibility(4);
    }

    public void d(boolean z17, java.lang.String str) {
        if (z17) {
            s75.d.b(new i72.p(this, str), "face_detect_set_backgroud");
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        this.f181667v.startAnimation(alphaAnimation);
    }

    public final void e(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).equals(this.f181654f.getText().toString())) {
            return;
        }
        this.f181654f.setText(str);
        this.f181654f.setVisibility(0);
        this.f181654f.setAnimation(this.f181666u);
    }

    public void f(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t0 t0Var) {
        e72.h hVar = this.f181658m;
        if (hVar != null) {
            hVar.h();
        }
        if (this.f181660o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectView", "hy: already end");
            return;
        }
        this.f181660o = true;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = this.f181652d;
            if (textureViewSurfaceTextureListenerC13526x5bf79f0a != null) {
                textureViewSurfaceTextureListenerC13526x5bf79f0a.F();
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE.f181576d.f181577i.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: reelase not init");
            }
        } else if (this.f181652d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.m77784x795fa299(new i72.s(this, t0Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectView", "hy: stopped capture face");
        c();
    }

    /* renamed from: getCameraBestHeight */
    public int m55273xa94eb4a6() {
        return this.f181652d.m55268xb6c487f4().y;
    }

    /* renamed from: getCameraBestWidth */
    public int m55274x71a61e67() {
        return this.f181652d.m55268xb6c487f4().x;
    }

    /* renamed from: getCameraPreivewWidth */
    public int m55275x924c04df() {
        return this.f181652d.m55271xf440954();
    }

    /* renamed from: getCameraPreviewHeight */
    public int m55276x7da6b8b4() {
        return this.f181652d.m55270xbf6e2759();
    }

    /* renamed from: getCameraRotation */
    public int m55277xa3f60eb9() {
        return this.f181652d.m55267xa3f60eb9();
    }

    /* renamed from: getCurrentMotionCancelInfo */
    public e72.g m55278x19468201() {
        e72.h hVar = this.f181658m;
        return hVar != null ? hVar.a() : new e72.g(90004, "user cancelled in processing");
    }

    /* renamed from: getPreviewBm */
    public android.graphics.Bitmap m55279xcdcc8b7d() {
        return this.f181652d.m55269xcdcc8b7d();
    }

    /* renamed from: setBusinessTip */
    public void m55280xb9432af9(java.lang.String str) {
        this.f181659n = str;
    }

    /* renamed from: setCallback */
    public void m55281x6c4ebec7(i72.x xVar) {
        this.f181657i = xVar;
    }

    /* renamed from: setErrTextView */
    public void m55282xc5ad0835(android.widget.TextView textView) {
        this.f181654f = textView;
    }

    public C13528xdd12ba45(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.animation.Animation animation = null;
        this.f181652d = null;
        this.f181653e = null;
        this.f181654f = null;
        this.f181655g = null;
        this.f181656h = null;
        this.f181657i = null;
        this.f181660o = false;
        this.f181661p = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jin);
        this.f181662q = true;
        this.f181663r = -1L;
        this.f181664s = -1L;
        this.f181665t = -1L;
        this.f181667v = null;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cv_, (android.view.ViewGroup) null, false);
        addView(inflate);
        this.f181652d = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5a);
        this.f181653e = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13527xdbf7520a) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzw);
        this.f181667v = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566681gq5);
        this.f181652d.m55272x6c4ebec7(new i72.n(this));
        android.content.Context context2 = getContext();
        if (context2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
        } else {
            animation = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559268w);
            animation.setInterpolator(new ta5.i());
        }
        this.f181666u = animation;
    }
}
