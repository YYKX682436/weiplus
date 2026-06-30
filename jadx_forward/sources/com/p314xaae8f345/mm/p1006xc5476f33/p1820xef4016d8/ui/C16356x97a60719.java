package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView */
/* loaded from: classes9.dex */
public class C16356x97a60719 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f227487d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f227488e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f227489f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f227490g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 f227491h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 f227492i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 f227493m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f227494n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RelativeLayout f227495o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f227496p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f227497q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f227498r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f227499s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f227500t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f227501u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f227502v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f227503w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l f227504x;

    public C16356x97a60719(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f227500t = "0";
        this.f227501u = "0";
        this.f227502v = "0";
        this.f227503w = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.btz, this);
        this.f227487d = inflate;
        this.f227491h = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564486sq);
        this.f227492i = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564487sr);
        this.f227493m = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564488ss);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 c16355x97a04787 = this.f227491h;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(c16355x97a04787, 2);
        n3.u0.s(this.f227492i, 2);
        n3.u0.s(this.f227493m, 2);
        this.f227494n = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564490su);
        this.f227495o = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564491sw);
        this.f227496p = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564492sx);
        this.f227497q = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o4m);
        this.f227498r = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o4n);
        this.f227499s = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o4o);
        this.f227488e = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566915hi2);
        this.f227489f = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566916hi3);
        this.f227490g = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566917hi4);
    }

    public void a() {
        this.f227491h.setVisibility(8);
        this.f227492i.setVisibility(8);
        this.f227493m.setVisibility(8);
        this.f227497q.setVisibility(0);
        this.f227498r.setVisibility(0);
        this.f227499s.setVisibility(0);
    }

    public void b() {
        this.f227503w = false;
        this.f227491h.setVisibility(0);
        this.f227492i.setVisibility(0);
        this.f227493m.setVisibility(0);
        this.f227497q.setVisibility(4);
        this.f227498r.setVisibility(4);
        this.f227499s.setVisibility(4);
    }

    public void c(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f227487d.getLayoutParams();
        layoutParams.height = i18;
        this.f227487d.setLayoutParams(layoutParams);
        this.f227487d.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f227488e.getLayoutParams();
        layoutParams2.height = i18;
        layoutParams2.width = i17;
        this.f227488e.setLayoutParams(layoutParams2);
        this.f227488e.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f227489f.getLayoutParams();
        layoutParams3.height = i18;
        layoutParams3.width = i17;
        this.f227489f.setLayoutParams(layoutParams3);
        this.f227489f.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f227490g.getLayoutParams();
        layoutParams4.height = i18;
        layoutParams4.width = i17;
        layoutParams4.leftMargin = i65.a.b(getContext(), 3);
        this.f227490g.setLayoutParams(layoutParams4);
        this.f227490g.invalidate();
    }

    /* renamed from: setFinalText */
    public void m66162x70ee0181(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: setting text: %s", str);
        this.f227500t = str.substring(0, 1);
        this.f227501u = str.substring(2, 3);
        this.f227502v = str.substring(3, 4);
        this.f227491h.m66159xe412d29d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f227500t, 0));
        this.f227492i.m66159xe412d29d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f227501u, 0));
        this.f227493m.m66159xe412d29d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f227502v, 0));
        android.widget.ImageView imageView = this.f227497q;
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787.f227480m;
        imageView.setImageResource(((java.lang.Integer) sparseArray.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f227500t, 0))).intValue());
        this.f227498r.setImageResource(((java.lang.Integer) sparseArray.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f227501u, 0))).intValue());
        this.f227499s.setImageResource(((java.lang.Integer) sparseArray.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f227502v, 0))).intValue());
        this.f227497q.setVisibility(4);
        this.f227498r.setVisibility(4);
        this.f227499s.setVisibility(4);
        this.f227491h.m66160xd59d7dc1(this);
        this.f227492i.m66160xd59d7dc1(this);
        this.f227493m.m66160xd59d7dc1(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: first: %s, second :%s, third: %s", this.f227500t, this.f227501u, this.f227502v);
    }

    public C16356x97a60719(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
