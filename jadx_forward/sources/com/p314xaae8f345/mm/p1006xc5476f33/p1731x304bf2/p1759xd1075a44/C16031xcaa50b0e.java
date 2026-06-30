package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.AutoScrollTextView */
/* loaded from: classes5.dex */
public class C16031xcaa50b0e extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f223457d;

    /* renamed from: e, reason: collision with root package name */
    public int f223458e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f223459f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f223460g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f223461h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.animation.Animation f223462i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f223463m;

    public C16031xcaa50b0e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223457d = new java.util.ArrayList();
        this.f223458e = 0;
        this.f223463m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new s53.a(this), true);
        android.widget.TextView textView = new android.widget.TextView(context, attributeSet);
        this.f223459f = textView;
        textView.setVisibility(8);
        android.widget.TextView textView2 = new android.widget.TextView(context, attributeSet);
        this.f223460g = textView2;
        textView2.setVisibility(8);
        addView(this.f223459f);
        addView(this.f223460g);
        setOrientation(1);
        setGravity(17);
        setPadding(0, 0, 0, 0);
        this.f223461h = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559412e3);
        this.f223462i = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559425eg);
    }

    public final void a(android.widget.TextView textView, java.lang.String str) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f223463m.d();
    }

    /* renamed from: setText */
    public void m64842x765074af(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = this.f223457d;
        arrayList.clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f223463m;
        b4Var.d();
        if (list == null || list.size() == 0) {
            this.f223459f.setVisibility(8);
            this.f223460g.setVisibility(8);
            return;
        }
        arrayList.addAll(list);
        a(this.f223459f, (java.lang.String) arrayList.get(0));
        this.f223459f.setVisibility(0);
        this.f223458e = 0;
        if (arrayList.size() == 1) {
            return;
        }
        b4Var.c(5000L, 5000L);
    }
}
