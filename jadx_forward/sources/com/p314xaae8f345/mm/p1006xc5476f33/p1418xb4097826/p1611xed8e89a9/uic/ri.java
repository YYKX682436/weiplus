package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class ri extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f205726i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f205727m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f205728n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7 f205729o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f205730p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f205726i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.qi(this));
        this.f205727m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.pi(this));
        this.f205728n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.oi(this));
        this.f205730p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ji(this));
    }

    public static final vb2.n0 O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ri riVar) {
        return (vb2.n0) ((jz5.n) riVar.f205726i).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_j;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.i6, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        super.mo450x3e5a77bb(bundle);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.dft);
        if (textView != null) {
            textView.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f09));
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var == null || (str = p2Var.m58743x6c03c64c()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int intExtra = m158359x1e885992().getIntExtra("key_enter_profile_type", 0);
        java.lang.String e17 = xy2.c.e(m80379x76847179());
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingSongListFragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7 c13911x99e9c3b7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7(3, 3, intExtra, str2, e17, V6, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14916xf6211cf4) m158358x197d1fc6).f205030t);
        c13911x99e9c3b7.f189154o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ki(this, c13911x99e9c3b7);
        this.f205729o = c13911x99e9c3b7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(c13911x99e9c3b7, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ii) ((jz5.n) this.f205730p).mo141623x754a37bb(), false, 2, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) ((jz5.n) this.f205727m).mo141623x754a37bb()).m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.li(this));
        jz5.g gVar = this.f205728n;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(2, 1);
        c15416x1f1f78b7.m8091xc21abdf5(true);
        c22849x81a93d25.mo7967x900dcbe1(c15416x1f1f78b7);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.mi());
        final boolean z17 = m58719xb9a8ab96() && m58720x17be6422();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb();
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderProfileTingSongListPatchConvert$Companion$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == ms2.e.class.hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ou(z17);
                }
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderProfileTingSongListPatchConvert", "type invalid", new java.lang.Object[0]);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7 c13911x99e9c3b72 = this.f205729o;
        if (c13911x99e9c3b72 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, c13911x99e9c3b72.m56387xe6796cde(), false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ni();
        c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7 c13911x99e9c3b73 = this.f205729o;
        if (c13911x99e9c3b73 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(c13911x99e9c3b73, false, 1, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13911x99e9c3b7 c13911x99e9c3b7 = this.f205729o;
        if (c13911x99e9c3b7 != null) {
            c13911x99e9c3b7.m56401x31d4943c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ii) ((jz5.n) this.f205730p).mo141623x754a37bb());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
    }
}
