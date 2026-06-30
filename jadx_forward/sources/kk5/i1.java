package kk5;

/* loaded from: classes8.dex */
public final class i1 extends wm3.a implements wm3.m {

    /* renamed from: m, reason: collision with root package name */
    public static yz5.a f390184m;

    /* renamed from: n, reason: collision with root package name */
    public static xj.m f390185n;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f390186d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f390187e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f390188f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f390189g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f390190h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f390191i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f390186d = jz5.h.b(kk5.h1.f390179d);
        this.f390187e = jz5.h.b(kk5.y0.f390236d);
        this.f390188f = jz5.h.b(kk5.g1.f390176d);
        this.f390189g = jz5.h.b(kk5.x0.f390233d);
        this.f390190h = jz5.h.b(new kk5.f1(this));
        this.f390191i = jz5.h.b(new kk5.e1(this));
    }

    public final ct.k3 T6() {
        return (ct.k3) ((jz5.n) this.f390186d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqz;
    }

    @Override // wm3.m
    public boolean i() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) m158354x19263085 : null;
        if (abstractActivityC16711x120e7ae0 != null) {
            abstractActivityC16711x120e7ae0.mo54450xbf7c1df6("");
            abstractActivityC16711x120e7ae0.mo78530x8b45058f();
            abstractActivityC16711x120e7ae0.mo78529xe76c1b79();
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC16711x120e7ae0.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
            ul5.k m78511x9f88d943 = abstractActivityC16711x120e7ae0.m78511x9f88d943();
            if (m78511x9f88d943 != null) {
                m78511x9f88d943.mo82163x4e0f6657(false);
            }
        }
        ((ht.w) ((jt.c0) ((jz5.n) this.f390188f).mo141623x754a37bb())).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4 h4Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4.f270870a;
        boolean b17 = ik1.b.b(m80379x76847179(), "com.tencent.hunyuan.app.chat");
        xj.m mVar = f390185n;
        f390185n = null;
        jz5.g gVar = this.f390190h;
        if (mVar == null && !b17) {
            em.l4 l4Var = (em.l4) ((jz5.n) gVar).mo141623x754a37bb();
            if (l4Var.f336107b == null) {
                l4Var.f336107b = (android.widget.LinearLayout) l4Var.f336106a.findViewById(com.p314xaae8f345.mm.R.id.hu8);
            }
            l4Var.f336107b.setVisibility(8);
        }
        em.l4 l4Var2 = (em.l4) ((jz5.n) gVar).mo141623x754a37bb();
        if (l4Var2.f336107b == null) {
            l4Var2.f336107b = (android.widget.LinearLayout) l4Var2.f336106a.findViewById(com.p314xaae8f345.mm.R.id.hu8);
        }
        l4Var2.f336107b.setOnClickListener(new kk5.b1(this, mVar, "com.tencent.hunyuan.app.chat"));
        em.l4 l4Var3 = (em.l4) ((jz5.n) gVar).mo141623x754a37bb();
        if (l4Var3.f336108c == null) {
            l4Var3.f336108c = (android.widget.TextView) l4Var3.f336106a.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        }
        l4Var3.f336108c.setOnClickListener(new kk5.c1(this));
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new kk5.d1(this, "com.tencent.hunyuan.app.chat", null), 3, null);
        qg5.e3 e3Var = (qg5.e3) T6();
        ((cy1.a) e3Var.ij()).Hj("multi_select_sub_open_yuanbao_btn", "view_exp", e3Var.nj("journey_copy"), 35480);
    }
}
