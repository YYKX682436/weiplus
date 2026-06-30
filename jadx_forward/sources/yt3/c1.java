package yt3;

/* loaded from: classes5.dex */
public final class c1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public static final yt3.z0 f546910s = new yt3.z0(null);

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f546911t = kz5.c1.k(new jz5.l(1, dw3.k0.f325758h), new jz5.l(2, dw3.k0.f325755e), new jz5.l(3, dw3.k0.f325756f), new jz5.l(4, dw3.k0.f325757g));

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f546912f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f546913g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f546914h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f546915i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17044xbdebc02d f546916m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47 f546917n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f546918o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f546919p;

    /* renamed from: q, reason: collision with root package name */
    public int f546920q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f546921r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.view.ViewGroup parent, ju3.d0 status, yz5.l videoInfoFetcher, yz5.a isCaptureScene) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfoFetcher, "videoInfoFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isCaptureScene, "isCaptureScene");
        this.f546912f = parent;
        this.f546913g = videoInfoFetcher;
        this.f546914h = isCaptureScene;
        this.f546915i = p3325xe03a0797.p3326xc267989b.z0.b();
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17044xbdebc02d c17044xbdebc02d = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17044xbdebc02d(context, null, 0, 6, null);
        this.f546916m = c17044xbdebc02d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47 c17045x5f330d47 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47) parent.findViewById(com.p314xaae8f345.mm.R.id.s7f);
        this.f546917n = c17045x5f330d47;
        android.content.Context context2 = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((android.view.ViewGroup) ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).findViewById(android.R.id.content)).addView(c17044xbdebc02d);
        android.view.ViewGroup.LayoutParams layoutParams = c17044xbdebc02d.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        c17044xbdebc02d.setLayoutParams(layoutParams2);
        c17044xbdebc02d.setTranslationZ(10.0f);
        c17044xbdebc02d.setVisibility(8);
        c17044xbdebc02d.m68237x5ed7bb0c(this);
        if (c17045x5f330d47 != null) {
            c17045x5f330d47.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditSecondCutPromotionPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer num = this.f546918o;
        dw3.k0 k0Var = num != null ? (dw3.k0) f546911t.get(java.lang.Integer.valueOf(num.intValue())) : null;
        dw3.o0 a17 = dw3.o0.f325774e.a(java.lang.Integer.valueOf(this.f546920q), ((java.lang.Boolean) this.f546914h.mo152xb9724478()).booleanValue());
        int i17 = this.f546920q;
        p3325xe03a0797.p3326xc267989b.l.d(this.f546915i, null, null, new yt3.b1(this, a17, k0Var, i17 == 1 ? 0 : null, i17 == 1 ? "session" : "moments", null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditSecondCutPromotionPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void z(int i17) {
        if (this.f546919p) {
            this.f546918o = java.lang.Integer.valueOf(i17);
            yt3.z0 z0Var = f546910s;
            int i18 = this.f546920q;
            yz5.a aVar = this.f546914h;
            boolean booleanValue = ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17044xbdebc02d c17044xbdebc02d = this.f546916m;
            z0Var.a(c17044xbdebc02d, i18, booleanValue);
            int i19 = this.f546920q;
            boolean booleanValue2 = ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47 c17045x5f330d47 = this.f546917n;
            z0Var.a(c17045x5f330d47, i19, booleanValue2);
            android.view.ViewGroup viewGroup = this.f546912f;
            if (i17 == 1) {
                java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.n2l);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
                c17044xbdebc02d.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47 c17045x5f330d472 = c17044xbdebc02d.f237551d;
                c17045x5f330d472.getClass();
                c17045x5f330d472.f237552d.setText(r17);
                dy1.a.j(c17044xbdebc02d, "video_edit_basic_miaojian_jump_pagefrom", 1);
            } else if (i17 == 2) {
                java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.n2n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
                c17044xbdebc02d.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47 c17045x5f330d473 = c17044xbdebc02d.f237551d;
                c17045x5f330d473.getClass();
                c17045x5f330d473.f237552d.setText(r18);
                dy1.a.j(c17044xbdebc02d, "video_edit_basic_miaojian_jump_pagefrom", 3);
            } else if (i17 == 3) {
                java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.n2k);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
                c17044xbdebc02d.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17045x5f330d47 c17045x5f330d474 = c17044xbdebc02d.f237551d;
                c17045x5f330d474.getClass();
                c17045x5f330d474.f237552d.setText(r19);
                dy1.a.j(c17044xbdebc02d, "video_edit_basic_miaojian_jump_pagefrom", 4);
            } else if (i17 == 4) {
                if (c17045x5f330d47 != null) {
                    java.lang.String r27 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.n2p);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r27, "getString(...)");
                    c17045x5f330d47.f237552d.setText(r27);
                }
                if (c17045x5f330d47 != null) {
                    dy1.a.j(c17045x5f330d47, "video_edit_basic_miaojian_jump_pagefrom", 2);
                }
            }
            if (i17 == 4) {
                if (c17045x5f330d47 != null) {
                    c17045x5f330d47.setVisibility(0);
                }
                c17044xbdebc02d.setVisibility(8);
            } else {
                if (c17045x5f330d47 != null) {
                    c17045x5f330d47.setVisibility(8);
                }
                c17044xbdebc02d.setVisibility(0);
            }
        }
    }
}
