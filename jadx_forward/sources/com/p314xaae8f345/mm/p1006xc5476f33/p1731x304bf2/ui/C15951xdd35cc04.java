package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView */
/* loaded from: classes5.dex */
public class C15951xdd35cc04 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f222262d;

    /* renamed from: e, reason: collision with root package name */
    public int f222263e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f222264f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f222265g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f222266h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f222267i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f222268m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f222269n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.Animation f222270o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.animation.Animation f222271p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f222272q;

    public C15951xdd35cc04(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222262d = new java.util.ArrayList();
        this.f222263e = 0;
        this.f222272q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m2(this), true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfb, (android.view.ViewGroup) this, false);
        this.f222264f = viewGroup;
        this.f222265g = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.gji);
        this.f222266h = (android.widget.TextView) this.f222264f.findViewById(com.p314xaae8f345.mm.R.id.gjj);
        addView(this.f222264f);
        this.f222264f.setVisibility(8);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfb, (android.view.ViewGroup) this, false);
        this.f222267i = viewGroup2;
        this.f222268m = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.gji);
        this.f222269n = (android.widget.TextView) this.f222267i.findViewById(com.p314xaae8f345.mm.R.id.gjj);
        addView(this.f222267i);
        this.f222267i.setVisibility(8);
        this.f222270o = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559412e3);
        this.f222271p = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559425eg);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f222272q.d();
    }

    /* renamed from: setText */
    public void m64739x765074af(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = this.f222262d;
        arrayList.clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f222272q;
        b4Var.d();
        if (list == null || list.size() == 0 || list.size() % 2 != 0) {
            this.f222264f.setVisibility(8);
            this.f222267i.setVisibility(8);
            return;
        }
        arrayList.addAll(list);
        this.f222263e = 0;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(0);
        float textSize = this.f222265g.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f222265g.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, textSize));
        this.f222266h.setText((java.lang.CharSequence) arrayList.get(1));
        this.f222264f.setVisibility(0);
        this.f222267i.setVisibility(8);
        if (arrayList.size() / 2 == 1) {
            return;
        }
        b4Var.c(5000L, 5000L);
    }
}
