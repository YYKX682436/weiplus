package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class bp extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f215448d;

    /* renamed from: e, reason: collision with root package name */
    public int f215449e;

    /* renamed from: f, reason: collision with root package name */
    public td2.c f215450f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka f215451g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f215452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215448d = -1;
        this.f215449e = -1;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085 : null;
        if (activityC21401x6ce6f73f != null) {
            P6(activityC21401x6ce6f73f);
        }
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp bpVar, int i17, int i18) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = bpVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).U6(i18);
        if (U6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerUIC", "hideMoreInterestBubble fail, get tabType:" + i18 + " fragment fail!");
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.b(U6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = d1Var.f215595i;
        if (qgVar != null) {
            java.lang.String source = "Finder.FinderMoreInterestDividerUIC_" + i18 + '_' + i17;
            in5.s0 s0Var = d1Var.f215596m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullMergedHeaderConvert", source + " hideMoreInterestDividerBubble,moreInterestBubbleView:" + qgVar.f185921p);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15297xddfc703b c15297xddfc703b = qgVar.f185921p;
            if (c15297xddfc703b != null) {
                c15297xddfc703b.removeCallbacks(c15297xddfc703b.f212669d);
                c15297xddfc703b.setVisibility(8);
            }
            if (s0Var != null) {
                qgVar.r(s0Var, true, true);
            }
        }
    }

    public final void P6(final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        td2.c cVar = this.f215450f;
        if (cVar != null) {
            activityC21401x6ce6f73f.mo273xed6858b4().c(cVar);
        }
        td2.c cVar2 = this.f215450f;
        if (cVar2 == null) {
            cVar2 = new td2.c() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderMoreInterestDividerUIC$bindLifeCycle$2
                @Override // td2.c
                /* renamed from: onCreate */
                public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }

                @Override // td2.c
                /* renamed from: onDestroy */
                public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka kaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp.this.f215451g;
                    if (kaVar != null) {
                        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = activityC21401x6ce6f73f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o.remove(kaVar);
                    }
                }

                @Override // td2.c
                /* renamed from: onPause */
                public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }

                @Override // td2.c
                /* renamed from: onResume */
                public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }

                @Override // td2.c
                /* renamed from: onStart */
                public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }

                @Override // td2.c
                /* renamed from: onStop */
                public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp bpVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp.O6(bpVar, bpVar.f215449e, bpVar.f215448d);
                }
            };
        }
        this.f215450f = cVar2;
        activityC21401x6ce6f73f.mo273xed6858b4().a(cVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f215448d = -1;
        this.f215449e = -1;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085 : null;
        if (activityC21401x6ce6f73f != null) {
            P6(activityC21401x6ce6f73f);
        }
    }
}
