package ng2;

/* loaded from: classes10.dex */
public class c extends lg2.b {

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f418490s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f418491t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f418492u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // lg2.b, kg2.a
    public void d(og2.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f418492u = params.f426684c;
        super.d(params);
    }

    @Override // lg2.a
    public void j(jg2.b builder) {
        ig2.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        super.j(builder);
        android.content.Context context = this.f400089d;
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9d);
        ig2.n nVar2 = this.f400098p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar2);
        float height = (nVar2.f372941g * s().height()) / s().width();
        float width = s().width();
        ig2.n nVar3 = this.f400098p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar3);
        float height2 = (width / nVar3.f372941g) / s().height();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = true;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if (!w() && (nVar = this.f400098p) != null) {
            float height3 = nVar.f372943i.height() * (nVar.f372939e / nVar.f372940f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400090e, "videoWidth: " + nVar.f372939e + " videoHeight: " + nVar.f372940f + " viewWidth: " + nVar.f372943i.width() + " viewHeight: " + nVar.f372943i.height() + " calcWidth: " + height3);
            if (height3 <= nVar.f372943i.width()) {
                c0Var.f391645d = false;
                c0Var2.f391645d = true;
            }
        }
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color2));
        ofObject.addUpdateListener(new ng2.a(this));
        builder.a(ofObject);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ng2.b(this, height, height2, c0Var, c0Var2));
        builder.a(ofFloat);
    }

    @Override // lg2.a
    public void k() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(w() ? this.f400091f : q().width(), w() ? this.f400092g : q().height());
        if (!w()) {
            layoutParams.gravity = 17;
        }
        android.view.ViewGroup viewGroup = this.f400099q;
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f418490s, layoutParams);
        }
        android.view.ViewGroup viewGroup3 = this.f400099q;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(8);
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        qg2.d dVar = qg2.d.f444326a;
        ig2.n nVar = this.f400098p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return qg2.d.c(dVar, nVar, null, 2, null);
    }

    @Override // lg2.a
    public android.graphics.Rect n() {
        ig2.n nVar = this.f400098p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar.f372943i;
    }

    @Override // lg2.a
    public android.view.View o() {
        android.content.Context context = this.f400089d;
        this.f418490s = new android.widget.FrameLayout(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55(context);
        ig2.n nVar = this.f400098p;
        if ((nVar != null ? nVar.f372935a : null) != ez2.a.f339388d) {
            c22646x1e9ca55.m81437x205ac394(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        }
        android.widget.ImageView v17 = v();
        this.f418491t = v17;
        v17.setImageBitmap(y());
        int width = w() ? q().width() : -1;
        int height = w() ? q().height() : -1;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(width, height);
        if (w()) {
            layoutParams.topMargin = q().top;
            layoutParams.leftMargin = q().left;
        }
        c22646x1e9ca55.addView(this.f418491t, new android.widget.FrameLayout.LayoutParams(width, height));
        android.widget.FrameLayout frameLayout = this.f418490s;
        if (frameLayout != null) {
            frameLayout.addView(c22646x1e9ca55, layoutParams);
        }
        return c22646x1e9ca55;
    }

    @Override // lg2.a
    public void p() {
        x();
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchInLiveDirector";
    }

    @Override // lg2.a
    public long t() {
        ig2.n nVar = this.f400098p;
        return (nVar != null ? nVar.f372935a : null) == ez2.a.f339388d ? 0L : 240L;
    }

    public void x() {
        android.view.TextureView mo46536x4ee17f0a;
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f418492u;
        android.view.TextureView mo46536x4ee17f0a2 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null ? scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a() : null;
        if (mo46536x4ee17f0a2 != null) {
            mo46536x4ee17f0a2.setSurfaceTextureListener(new ig2.p("SwitchInLiveDirector", false));
        }
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 = this.f418492u;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 == null || (mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2.mo46536x4ee17f0a()) == null || (bitmap = mo46536x4ee17f0a.getBitmap()) == null) {
            return;
        }
        android.widget.ImageView v17 = v();
        if (!w()) {
            android.widget.ImageView imageView = this.f418491t;
            v17.setScaleX(imageView != null ? imageView.getScaleX() : 1.0f);
            android.widget.ImageView imageView2 = this.f418491t;
            v17.setScaleY(imageView2 != null ? imageView2.getScaleY() : 1.0f);
        }
        v17.setImageBitmap(bitmap);
        ig2.n nVar = this.f400098p;
        ig2.j jVar = nVar instanceof ig2.j ? (ig2.j) nVar : null;
        if (jVar != null) {
            android.view.View view = jVar.f372921m;
            android.widget.FrameLayout frameLayout = view instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) view : null;
            if (frameLayout != null) {
                android.view.View findViewWithTag = frameLayout.findViewWithTag("nearby-live-fluent-preview-view-tag");
                if (findViewWithTag != null) {
                    frameLayout.removeView(findViewWithTag);
                }
                v17.setTag("nearby-live-fluent-preview-view-tag");
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(s().width(), s().height());
                layoutParams.gravity = 17;
                frameLayout.addView(v17, 0, layoutParams);
            }
        }
    }

    public android.graphics.Bitmap y() {
        android.view.TextureView mo46536x4ee17f0a;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f418492u;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null || (mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a()) == null) {
            return null;
        }
        return mo46536x4ee17f0a.getBitmap();
    }
}
