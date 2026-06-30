package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class h2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f233373o = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f233374d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f233375e;

    /* renamed from: f, reason: collision with root package name */
    public final wl3.e f233376f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f233377g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f233378h;

    /* renamed from: i, reason: collision with root package name */
    public fm3.u f233379i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f233380m;

    /* renamed from: n, reason: collision with root package name */
    public in5.w f233381n;

    public h2(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f233374d = context;
        this.f233375e = new java.util.ArrayList();
        wl3.e eVar = new wl3.e(context, true);
        this.f233376f = eVar;
        jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f2(this));
        this.f233378h = b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Collections.synchronizedList(new java.util.ArrayList()), "synchronizedList(...)");
        jz5.g b18 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g2(this));
        android.view.View view = eVar.f528591f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.av6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View view2 = eVar.f528591f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        android.view.LayoutInflater.from(view2.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4a, (android.view.ViewGroup) findViewById, true);
        android.view.View view3 = eVar.f528591f;
        android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = com.p314xaae8f345.mm.ui.bl.b(context).y / 2;
        }
        android.view.View view4 = eVar.f528591f;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2) : null;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b2(this));
        }
        android.view.View view5 = eVar.f528591f;
        this.f233377g = view5 != null ? (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.odf) : null;
        android.view.View view6 = eVar.f528591f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = view6 != null ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view6.findViewById(com.p314xaae8f345.mm.R.id.k27) : null;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) b18).mo141623x754a37bb());
        }
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) b17).mo141623x754a37bb());
        }
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) ((jz5.n) b17).mo141623x754a37bb()).f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.c2(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4g, (android.view.ViewGroup) c22849x81a93d25, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f233380m = inflate;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.Mv.MusicMvListDialog", "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + m1Var);
    }
}
