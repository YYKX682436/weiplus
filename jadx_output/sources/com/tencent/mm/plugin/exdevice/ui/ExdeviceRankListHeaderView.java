package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class ExdeviceRankListHeaderView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f99353d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f99354e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f99355f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Animation f99356g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f99357h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f99358i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f99359m;

    public ExdeviceRankListHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f99359m = true;
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f99353d = context;
        android.widget.TextView textView = (android.widget.TextView) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a_e, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.beh);
        this.f99354e = textView;
        textView.setVisibility(4);
        this.f99356g = android.view.animation.AnimationUtils.loadAnimation(this.f99353d, com.tencent.mm.R.anim.f477713a);
        this.f99357h = android.view.animation.AnimationUtils.loadAnimation(this.f99353d, com.tencent.mm.R.anim.f477714b);
        this.f99358i = new com.tencent.mm.plugin.exdevice.ui.v6(this);
        this.f99356g.setAnimationListener(new com.tencent.mm.plugin.exdevice.ui.w6(this));
        this.f99357h.setAnimationListener(new com.tencent.mm.plugin.exdevice.ui.x6(this));
        this.f99356g.setFillAfter(true);
        this.f99356g.setFillEnabled(true);
        this.f99357h.setFillAfter(true);
        this.f99357h.setFillAfter(true);
        setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.u6(this));
        android.view.View inflate = android.view.LayoutInflater.from(this.f99353d).inflate(com.tencent.mm.R.layout.dqa, (android.view.ViewGroup) null);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(inflate, layoutParams);
    }

    public java.lang.String getMotto() {
        java.lang.String charSequence = this.f99354e.getText().toString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return charSequence == null ? "" : charSequence;
    }

    public void setIsShowTip(boolean z17) {
        this.f99359m = z17;
    }

    public void setMotto(java.lang.String str) {
        this.f99354e.setText(str);
    }

    public void setOnViewClickListener(android.view.View.OnClickListener onClickListener) {
        this.f99355f = onClickListener;
    }

    public ExdeviceRankListHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ExdeviceRankListHeaderView(android.content.Context context) {
        super(context);
        this.f99359m = true;
        a(context);
    }
}
