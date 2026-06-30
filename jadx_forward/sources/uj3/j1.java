package uj3;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f509824a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f509825b;

    /* renamed from: c, reason: collision with root package name */
    public final uj3.k f509826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f509827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f509828e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f509829f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f509830g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f509831h;

    /* renamed from: i, reason: collision with root package name */
    public int f509832i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f509833j;

    public j1(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509824a = context;
        this.f509825b = statusManager;
        this.f509826c = kVar;
        this.f509827d = 4;
        this.f509828e = 1;
        this.f509832i = 4;
        this.f509833j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new uj3.i1(this), true);
    }

    public final void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        android.view.ViewPropertyAnimator duration;
        android.content.res.Resources resources;
        android.widget.TextView textView = this.f509830g;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(this.f509832i));
        }
        android.widget.TextView textView2 = this.f509831h;
        if (textView2 != null) {
            android.content.Context context = this.f509824a;
            textView2.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574296hs4));
        }
        android.widget.TextView textView3 = this.f509830g;
        if (textView3 != null) {
            textView3.setScaleX(1.5f);
        }
        android.widget.TextView textView4 = this.f509830g;
        if (textView4 != null) {
            textView4.setScaleY(1.5f);
        }
        android.widget.TextView textView5 = this.f509830g;
        if (textView5 == null || (animate = textView5.animate()) == null || (scaleX = animate.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null || (duration = scaleY.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }
}
