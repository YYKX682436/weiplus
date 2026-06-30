package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes14.dex */
public class FaceDetectView extends android.widget.RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f100118w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView f100119d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView f100120e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f100121f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f100122g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f100123h;

    /* renamed from: i, reason: collision with root package name */
    public i72.x f100124i;

    /* renamed from: m, reason: collision with root package name */
    public e72.h f100125m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f100126n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f100127o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f100128p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f100129q;

    /* renamed from: r, reason: collision with root package name */
    public long f100130r;

    /* renamed from: s, reason: collision with root package name */
    public long f100131s;

    /* renamed from: t, reason: collision with root package name */
    public long f100132t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Animation f100133u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f100134v;

    public FaceDetectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView, e72.f fVar) {
        boolean z17;
        faceDetectView.getClass();
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectView", "hy: motion eat but no data");
            return;
        }
        int i17 = fVar.f249900a;
        if (i17 > 0) {
            i72.x xVar = faceDetectView.f100124i;
            z17 = true;
            if (xVar != null) {
                com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI = (com.tencent.mm.plugin.facedetect.ui.FaceDetectUI) xVar;
                if (i17 == 1) {
                    faceDetectUI.f100081r.a(null);
                }
            }
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.lang.String str = fVar.f249902c;
        faceDetectView.e(str != null ? str : faceDetectView.getContext().getString(com.tencent.mm.R.string.c6l));
        i72.x xVar2 = faceDetectView.f100124i;
        if (xVar2 != null) {
            if (str == null) {
                str = faceDetectView.getContext().getString(com.tencent.mm.R.string.c6l);
            }
            ((com.tencent.mm.plugin.facedetect.ui.FaceDetectUI) xVar2).V6(fVar.f249901b, str);
        }
    }

    public static void b(com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView) {
        e72.h hVar = faceDetectView.f100125m;
        if (hVar == null || !hVar.i()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectView", "hy: meet require");
        faceDetectView.f100119d.F();
        faceDetectView.f100128p = true;
        long j17 = faceDetectView.f100131s;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectView", "hy: current motion used time: %d", java.lang.Long.valueOf(elapsedRealtime));
        long j18 = faceDetectView.f100130r;
        if (elapsedRealtime < j18 - 5) {
            com.tencent.mm.sdk.platformtools.u3.i(new i72.q(faceDetectView), j18 - elapsedRealtime);
        } else {
            if (faceDetectView.f100124i == null || faceDetectView.f100127o) {
                return;
            }
            ((com.tencent.mm.plugin.facedetect.ui.FaceDetectUI) faceDetectView.f100124i).V6(0, "");
        }
    }

    public final void c() {
        this.f100121f.setText("");
        this.f100121f.setVisibility(4);
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
        this.f100134v.startAnimation(alphaAnimation);
    }

    public final void e(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).equals(this.f100121f.getText().toString())) {
            return;
        }
        this.f100121f.setText(str);
        this.f100121f.setVisibility(0);
        this.f100121f.setAnimation(this.f100133u);
    }

    public void f(boolean z17, com.tencent.mm.plugin.facedetect.model.t0 t0Var) {
        e72.h hVar = this.f100125m;
        if (hVar != null) {
            hVar.h();
        }
        if (this.f100127o) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectView", "hy: already end");
            return;
        }
        this.f100127o = true;
        if (!z17) {
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = this.f100119d;
            if (faceDetectCameraView != null) {
                faceDetectCameraView.F();
                com.tencent.mm.plugin.facedetect.model.y.INSTANCE.f100043d.f100044i.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: reelase not init");
            }
        } else if (this.f100119d != null) {
            com.tencent.mm.plugin.facedetect.model.y.f100041f.postToWorker(new i72.s(this, t0Var));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectView", "hy: stopped capture face");
        c();
    }

    public int getCameraBestHeight() {
        return this.f100119d.getEncodeVideoBestSize().y;
    }

    public int getCameraBestWidth() {
        return this.f100119d.getEncodeVideoBestSize().x;
    }

    public int getCameraPreivewWidth() {
        return this.f100119d.getPreviewWidth();
    }

    public int getCameraPreviewHeight() {
        return this.f100119d.getPreviewHeight();
    }

    public int getCameraRotation() {
        return this.f100119d.getCameraRotation();
    }

    public e72.g getCurrentMotionCancelInfo() {
        e72.h hVar = this.f100125m;
        return hVar != null ? hVar.a() : new e72.g(90004, "user cancelled in processing");
    }

    public android.graphics.Bitmap getPreviewBm() {
        return this.f100119d.getPreviewBm();
    }

    public void setBusinessTip(java.lang.String str) {
        this.f100126n = str;
    }

    public void setCallback(i72.x xVar) {
        this.f100124i = xVar;
    }

    public void setErrTextView(android.widget.TextView textView) {
        this.f100121f = textView;
    }

    public FaceDetectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.animation.Animation animation = null;
        this.f100119d = null;
        this.f100120e = null;
        this.f100121f = null;
        this.f100122g = null;
        this.f100123h = null;
        this.f100124i = null;
        this.f100127o = false;
        this.f100128p = false;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jin);
        this.f100129q = true;
        this.f100130r = -1L;
        this.f100131s = -1L;
        this.f100132t = -1L;
        this.f100134v = null;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cv_, (android.view.ViewGroup) null, false);
        addView(inflate);
        this.f100119d = (com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) inflate.findViewById(com.tencent.mm.R.id.b5a);
        this.f100120e = (com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView) inflate.findViewById(com.tencent.mm.R.id.gzw);
        this.f100134v = inflate.findViewById(com.tencent.mm.R.id.f485148gq5);
        this.f100119d.setCallback(new i72.n(this));
        android.content.Context context2 = getContext();
        if (context2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
        } else {
            animation = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477735w);
            animation.setInterpolator(new ta5.i());
        }
        this.f100133u = animation;
    }
}
