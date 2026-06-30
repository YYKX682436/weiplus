package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView */
/* loaded from: classes15.dex */
public class C13478xcdc36e25 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f180886d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180887e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f180888f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Animation f180889g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f180890h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f180891i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f180892m;

    public C13478xcdc36e25(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f180892m = true;
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f180886d = context;
        android.widget.TextView textView = (android.widget.TextView) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_e, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.beh);
        this.f180887e = textView;
        textView.setVisibility(4);
        this.f180889g = android.view.animation.AnimationUtils.loadAnimation(this.f180886d, com.p314xaae8f345.mm.R.C30854x2dc211.f559246a);
        this.f180890h = android.view.animation.AnimationUtils.loadAnimation(this.f180886d, com.p314xaae8f345.mm.R.C30854x2dc211.f559247b);
        this.f180891i = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v6(this);
        this.f180889g.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.w6(this));
        this.f180890h.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.x6(this));
        this.f180889g.setFillAfter(true);
        this.f180889g.setFillEnabled(true);
        this.f180890h.setFillAfter(true);
        this.f180890h.setFillAfter(true);
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u6(this));
        android.view.View inflate = android.view.LayoutInflater.from(this.f180886d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqa, (android.view.ViewGroup) null);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(inflate, layoutParams);
    }

    /* renamed from: getMotto */
    public java.lang.String m55086x74d1df57() {
        java.lang.String charSequence = this.f180887e.getText().toString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return charSequence == null ? "" : charSequence;
    }

    /* renamed from: setIsShowTip */
    public void m55087xb46aa992(boolean z17) {
        this.f180892m = z17;
    }

    /* renamed from: setMotto */
    public void m55088x535ff9cb(java.lang.String str) {
        this.f180887e.setText(str);
    }

    /* renamed from: setOnViewClickListener */
    public void m55089xdbb477d6(android.view.View.OnClickListener onClickListener) {
        this.f180888f = onClickListener;
    }

    public C13478xcdc36e25(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C13478xcdc36e25(android.content.Context context) {
        super(context);
        this.f180892m = true;
        a(context);
    }
}
