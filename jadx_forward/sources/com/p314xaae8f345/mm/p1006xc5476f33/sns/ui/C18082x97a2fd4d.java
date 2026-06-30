package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotifyBanner */
/* loaded from: classes.dex */
public class C18082x97a2fd4d extends android.widget.RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f248840f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f248841d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f248842e;

    public C18082x97a2fd4d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
        android.view.View inflate = ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csw, (android.view.ViewGroup) this, true);
        this.f248841d = inflate;
        this.f248842e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6p);
        ((android.widget.ImageView) this.f248841d.findViewById(com.p314xaae8f345.mm.R.id.n6o)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.en(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
    }

    /* renamed from: setOnClickNotify */
    public void m70798xb3feae50(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gn gnVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnClickNotify", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
        this.f248842e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fn(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnClickNotify", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
    }

    public C18082x97a2fd4d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
