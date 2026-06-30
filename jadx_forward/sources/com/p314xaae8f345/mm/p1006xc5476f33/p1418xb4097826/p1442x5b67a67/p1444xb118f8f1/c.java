package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class c extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f186735e;

    /* renamed from: f, reason: collision with root package name */
    public int f186736f;

    /* renamed from: g, reason: collision with root package name */
    public long f186737g;

    /* renamed from: h, reason: collision with root package name */
    public long f186738h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f186739i;

    /* renamed from: m, reason: collision with root package name */
    public int f186740m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f186741n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f186742o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f186735e = new java.util.ArrayList();
        this.f186740m = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.oj2> m75941xfb8219142;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        r45.nb4 nb4Var = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            hc2.i.e(abstractActivityC21394xb3d2c0cf, true);
        }
        this.f186737g = m158359x1e885992().getLongExtra("native_drama_id", 0L);
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("native_drama_episode");
        if (byteArrayExtra != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.nb4().mo11468x92b714fd(byteArrayExtra);
            if (mo11468x92b714fd instanceof r45.nb4) {
                nb4Var = (r45.nb4) mo11468x92b714fd;
            }
        }
        java.util.ArrayList arrayList = this.f186735e;
        if (nb4Var != null && (m75941xfb8219142 = nb4Var.m75941xfb821914(0)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            for (r45.oj2 oj2Var : m75941xfb8219142) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oj2Var);
                arrayList2.add(new zb2.b(oj2Var));
            }
            arrayList.addAll(arrayList2);
        }
        this.f186736f = m158359x1e885992().getIntExtra("native_drama_init_position", 0);
        this.f186738h = m158359x1e885992().getLongExtra("native_drama_enter_object_id", 0L);
        this.f186740m = m158359x1e885992().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        this.f186742o = m158359x1e885992().getStringExtra("native_drama_session_buffer");
        this.f186739i = m158359x1e885992().getStringExtra("native_drama_enter_dupflag");
        this.f186734d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ujx);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ujw);
        if (textView != null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf((nb4Var == null || (m75941xfb821914 = nb4Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size());
            textView.setText(m80379x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyd, objArr));
        }
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ujn)).getPaint());
        this.f186741n = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f564769a25);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f186734d;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(m80379x76847179(), 6));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f186734d;
        if (c1163xf1deaba42 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaAllEpisodeUIC$onCreate$2
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c.this);
                }
            }, arrayList, false);
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.b(this);
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f186734d;
        if (c1163xf1deaba43 == null || (mo7946xf939df19 = c1163xf1deaba43.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f186735e = new java.util.ArrayList();
        this.f186740m = -1;
    }
}
