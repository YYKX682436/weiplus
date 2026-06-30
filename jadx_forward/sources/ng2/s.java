package ng2;

/* loaded from: classes10.dex */
public class s extends lg2.d {

    /* renamed from: v, reason: collision with root package name */
    public ig2.q f418520v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f418521w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f418522x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f418522x = jz5.h.b(new ng2.r(context));
    }

    @Override // kg2.b
    public void f(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom isRunning:");
        android.animation.AnimatorSet animatorSet = this.f400097o;
        sb6.append(animatorSet != null ? java.lang.Boolean.valueOf(animatorSet.isRunning()) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        kz2.c cVar = ig2.o.f372944a;
        kz2.c cVar2 = ig2.o.f372944a;
        cVar2.c("switchInLiveRoom before");
        if (this.f400104r && renderView == this.f418521w) {
            onFirstFrameRenderCallback.mo146xb9724478(java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "switchInLiveRoom skipped by float view is detached.");
            return;
        }
        mn0.b0 b0Var = d().f372942h;
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new ng2.p(this, renderView, onFirstFrameRenderCallback, isDetachInvokeFun));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            onFirstFrameRenderCallback.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        this.f418521w = renderView;
        android.animation.AnimatorSet animatorSet2 = this.f400097o;
        boolean z17 = false;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            z17 = true;
        }
        if (z17) {
            android.animation.AnimatorSet animatorSet3 = this.f400097o;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new ng2.q(this, renderView));
            }
        } else {
            mn0.b0 b0Var2 = d().f372942h;
            if (b0Var2 != null) {
                mn0.b0.B(b0Var2, renderView, null, 2, null);
            }
        }
        cVar2.b("switchInLiveRoom after");
    }

    @Override // lg2.a
    public void j(jg2.b builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        ig2.j d17 = d();
        android.content.Context context = this.f400089d;
        if (d17.f372919k) {
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9d);
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ng2.k(this));
            builder.a(ofFloat);
            android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color2));
            ofObject.addUpdateListener(new ng2.l(this));
            builder.a(ofObject);
            return;
        }
        super.j(builder);
        int color3 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9d);
        int color4 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        ig2.q qVar = this.f418520v;
        float scaleX = qVar != null ? qVar.getScaleX() : 1.0f;
        ig2.q qVar2 = this.f418520v;
        float scaleY = qVar2 != null ? qVar2.getScaleY() : 1.0f;
        android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color3), java.lang.Integer.valueOf(color4));
        ofObject2.addUpdateListener(new ng2.j(this));
        builder.a(ofObject2);
        if (qg2.d.f444326a.i(d())) {
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new ng2.h(this, scaleX, scaleY));
            builder.a(ofFloat2);
        } else {
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new ng2.i(this));
            builder.a(ofFloat3);
        }
    }

    @Override // lg2.d, lg2.a
    public void k() {
        if (!d().f372919k) {
            super.k();
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f418522x).mo141623x754a37bb();
        android.widget.FrameLayout frameLayout = this.f400105s;
        android.view.WindowManager.LayoutParams a17 = qg2.d.f444326a.a();
        a17.height = this.f400092g;
        windowManager.addView(frameLayout, a17);
        this.f400104r = false;
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        int[] iArr = new int[2];
        qg2.d dVar = qg2.d.f444326a;
        android.view.View view = this.f400103q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        dVar.e(view, iArr);
        android.view.View view2 = this.f400103q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
        ig2.j d17 = d();
        int i17 = iArr[0];
        d17.f372943i = new android.graphics.Rect(i17, iArr[1], viewGroup.getWidth() + i17, iArr[1] + viewGroup.getHeight());
        return d().f372943i;
    }

    @Override // lg2.a
    public void p() {
        jz5.f0 f0Var;
        java.lang.String str = "detachFloatView view: " + this.f400105s + " isFloatWindowEnter: " + d().f372919k;
        java.lang.String str2 = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        this.f400104r = true;
        android.widget.FrameLayout frameLayout = this.f400105s;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(null);
        }
        if (d().f372919k) {
            qg2.d dVar = qg2.d.f444326a;
            try {
                new ng2.m(this).mo152xb9724478();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveFluentUtil", "safeInvoke exception ", th6);
            }
        } else {
            ig2.q qVar = this.f418520v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "detachMaskView videoView:" + qVar + " surfaceTexture:" + qVar.getSurfaceTexture());
            qVar.setSurfaceTextureListener(new ig2.p("detachMaskView", true));
            android.view.ViewParent parent = qVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(qVar);
            }
            if (viewGroup != null) {
                viewGroup.addView(qVar);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "liveView is null.");
            }
            android.view.View view = this.f400103q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            android.view.View rootView = view.getRootView();
            android.view.View findViewWithTag = rootView.findViewWithTag("fluent_view_tag");
            if (findViewWithTag != null) {
                findViewWithTag.setOnTouchListener(null);
            }
            ((android.view.ViewGroup) rootView).removeView(findViewWithTag);
        }
        this.f418521w = null;
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchOutLiveDirector";
    }

    @Override // lg2.a
    public long t() {
        return z().f372935a == ez2.a.f339388d ? 0L : 240L;
    }

    @Override // lg2.d
    public void v() {
        android.view.TextureView textureView = d().f372918j;
        if (textureView == null) {
            return;
        }
        textureView.setSurfaceTextureListener(new ig2.p("liveView surfaceTexture", false));
        java.lang.String str = "attachMaskView surfaceTexture:" + textureView.getSurfaceTexture();
        java.lang.String str2 = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        android.content.Context context = this.f400089d;
        ig2.q qVar = new ig2.q(context);
        android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
        qVar.setSurfaceTexture(surfaceTexture);
        if (d().f372919k) {
            int i17 = d().f372939e;
            int i18 = d().f372940f;
            qVar.f372947d = i17;
            qVar.f372948e = i18;
            qVar.a(q().width(), q().height());
        } else if (qg2.d.f444326a.i(d())) {
            qVar.setScaleX((d().f372941g * q().height()) / q().width());
        } else {
            int i19 = d().f372939e;
            int i27 = d().f372940f;
            qVar.f372947d = i19;
            qVar.f372948e = i27;
            qVar.a(q().width(), q().height());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "createTexture scaleX： " + qVar.getScaleX() + " scaleY: " + qVar.getScaleY() + " videoRate: " + d().f372941g + " with: " + q().width() + " height: " + q().height());
        this.f418520v = qVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f400106t;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.addView(this.f418520v, layoutParams);
        }
        if (d().f372922n != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(d().f372922n);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = this.f400106t;
            if (c22646x1e9ca552 != null) {
                c22646x1e9ca552.addView(imageView, layoutParams2);
            }
        }
        qg2.d dVar = qg2.d.f444326a;
        android.view.ViewParent parent = textureView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(textureView);
        }
        if (viewGroup != null) {
            viewGroup.addView(textureView);
        }
    }
}
