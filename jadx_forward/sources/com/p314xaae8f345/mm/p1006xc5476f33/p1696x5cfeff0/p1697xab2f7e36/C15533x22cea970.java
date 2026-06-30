package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout */
/* loaded from: classes14.dex */
public class C15533x22cea970 extends android.widget.RelativeLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f218621t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd f218622d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f218623e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f218624f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f218625g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f218626h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f218627i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f218628m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f218629n;

    /* renamed from: o, reason: collision with root package name */
    public float f218630o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f218631p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.animation.Animation f218632q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.animation.Animation f218633r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.animation.Animation f218634s;

    public C15533x22cea970(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionProcessLayout", "showSuccessAnimation");
        if (this.f218631p) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f218629n.getLayoutParams();
            layoutParams.removeRule(3);
            int p17 = i17 - com.p314xaae8f345.mm.ui.bk.p(getContext());
            float f17 = this.f218630o;
            double d17 = p17 * 0.5d;
            if (((int) f17) > d17) {
                layoutParams.topMargin = ((int) d17) - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100);
            } else {
                layoutParams.topMargin = ((int) f17) - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100);
            }
            this.f218629n.setLayoutParams(layoutParams);
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f218629n.getLayoutParams();
            layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.dnt);
            layoutParams2.topMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 48);
            this.f218629n.setLayoutParams(layoutParams2);
        }
        this.f218623e.setText(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572707c82));
        this.f218625g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562966t8);
        this.f218624f.setImageDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f79705x4155bcd9));
        this.f218624f.startAnimation(this.f218633r);
        this.f218625g.startAnimation(this.f218632q);
        this.f218626h.setVisibility(4);
        this.f218627i.setVisibility(4);
        this.f218628m.setVisibility(4);
    }

    /* renamed from: setCircleY */
    public void m63479xdfe966c7(float f17) {
        this.f218630o = f17;
    }

    public C15533x22cea970(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f218622d = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd) getContext();
        this.f218632q = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559303az);
        this.f218633r = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559305b1);
        this.f218634s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559304b0);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570283aa5, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dnt);
        this.f218623e = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f218624f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.dnr);
        this.f218626h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dnm);
        this.f218628m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dnl);
        this.f218625g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dnp);
        this.f218627i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dnk);
        this.f218629n = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.dns);
    }
}
