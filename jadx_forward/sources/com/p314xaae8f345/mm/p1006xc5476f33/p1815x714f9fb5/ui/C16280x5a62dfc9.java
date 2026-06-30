package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.LoaddingView */
/* loaded from: classes3.dex */
public class C16280x5a62dfc9 extends android.widget.LinearLayout implements za3.c {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f226135d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f226136e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.animation.Animation f226137f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f226138g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f226139h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f226140i;

    public C16280x5a62dfc9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226139h = false;
        this.f226140i = "";
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f226137f = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559443ey);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsr, (android.view.ViewGroup) this, true);
        this.f226136e = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.ine);
        this.f226135d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.inx);
        this.f226138g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.in6);
        if (j65.e.b()) {
            this.f226138g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8k);
        }
        this.f226135d.setText("");
        this.f226135d.setVisibility(0);
        this.f226136e.setVisibility(0);
    }

    @Override // za3.c
    /* renamed from: getPreText */
    public java.lang.String mo65930x2ac69e3a() {
        return this.f226140i;
    }

    /* renamed from: setPreText */
    public void m65931x9e37ebae(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f226140i = str + "\n";
    }

    /* renamed from: setProgressAlwaysGone */
    public void m65932x4ee3555d(boolean z17) {
        this.f226139h = z17;
        this.f226136e.setVisibility(8);
        this.f226135d.setVisibility(8);
    }

    @Override // za3.c
    /* renamed from: setText */
    public void mo65933x765074af(java.lang.String str) {
        if (this.f226135d == null || this.f226136e == null || this.f226139h) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f226135d.setText("");
            this.f226135d.setVisibility(0);
            this.f226136e.setVisibility(0);
            return;
        }
        this.f226135d.setText(str + "");
        this.f226136e.setVisibility(8);
        this.f226135d.setVisibility(0);
    }

    public C16280x5a62dfc9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226139h = false;
        this.f226140i = "";
        a(context);
    }
}
