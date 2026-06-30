package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* renamed from: com.tencent.mm.plugin.flash.FaceFlashProcessLayout */
/* loaded from: classes14.dex */
public class C15530x17431dc6 extends android.widget.RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f218573q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 f218574d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f218575e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f218576f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f218577g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f218578h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f218579i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f218580m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.Animation f218581n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.Animation f218582o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.animation.Animation f218583p;

    public C15530x17431dc6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "showSuccessAnimation");
        findViewById(com.p314xaae8f345.mm.R.id.lqx).setPadding(0, com.p314xaae8f345.mm.ui.bl.a(getContext()), 0, 0);
        this.f218575e.setText(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572707c82));
        this.f218578h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562966t8);
        this.f218577g.setImageDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f79705x4155bcd9));
        this.f218577g.startAnimation(this.f218582o);
        this.f218578h.startAnimation(this.f218581n);
        this.f218579i.setVisibility(4);
        this.f218576f.setVisibility(4);
        this.f218580m.setVisibility(4);
    }

    public C15530x17431dc6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f218574d = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547) getContext();
        this.f218581n = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559303az);
        this.f218582o = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559305b1);
        this.f218583p = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559304b0);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aa_, (android.view.ViewGroup) this, true);
        this.f218575e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dnt);
        this.f218576f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dnq);
        this.f218577g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.dnr);
        this.f218579i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dnm);
        this.f218580m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dnl);
        this.f218578h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dnp);
    }
}
