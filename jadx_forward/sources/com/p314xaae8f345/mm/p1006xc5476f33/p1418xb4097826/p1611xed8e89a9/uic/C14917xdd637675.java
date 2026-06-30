package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC */
/* loaded from: classes15.dex */
public final class C14917xdd637675 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f6 {

    /* renamed from: v, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.si f205031v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.si(null);

    /* renamed from: e, reason: collision with root package name */
    public int f205032e;

    /* renamed from: f, reason: collision with root package name */
    public int f205033f;

    /* renamed from: g, reason: collision with root package name */
    public final is2.c f205034g;

    /* renamed from: h, reason: collision with root package name */
    public ya2.b2 f205035h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f205036i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f205037m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f205038n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f205039o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f205040p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f205041q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f205042r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f205043s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f205044t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14918x663918cd f205045u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1] */
    public C14917xdd637675(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f205033f = -1;
        this.f205034g = new is2.c(m158354x19263085(), m158358x197d1fc6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f205044t = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209134aa).mo141623x754a37bb()).r()).intValue() == 1 && !m58704xd2e07a89();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f205045u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1
            {
                this.f39173x3fe91575 = 2090220060;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c c5470xdd7cf62c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c event = c5470xdd7cf62c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.fb fbVar = event.f135808g;
                if (fbVar == null) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "callback actionType:" + fbVar.f88197b);
                int i17 = fbVar.f88197b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675 c14917xdd637675 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.this;
                if (i17 != 50000) {
                    if (i17 != 50001) {
                        return true;
                    }
                    c14917xdd637675.m58695x60022348();
                    return true;
                }
                java.lang.String url = fbVar.f88201f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
                int i18 = fbVar.f88200e;
                int i19 = (int) (255 * 1.0f);
                if (i19 <= 0) {
                    i19 = 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.O6(c14917xdd637675, url, ((255 > i19 ? i19 : 255) << 24) + (i18 & 16777215));
                return true;
            }
        };
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675 c14917xdd637675, java.lang.String str, int i17) {
        boolean z17 = c14917xdd637675.f205044t;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14917xdd637675.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.class)).e7().f516036a.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle return for LogOutVisible");
                return;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle return for isTeenMode");
                c14917xdd637675.m58695x60022348();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle curStyle:" + c14917xdd637675.f205032e + " coverPath:" + str + ", coverColor:" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.si siVar = f205031v;
            int a17 = siVar.a(0.4f, i17);
            int a18 = siVar.a(1.0f, i17);
            is2.c cVar = c14917xdd637675.f205034g;
            ns2.n nVar = cVar.f376008z;
            if (nVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("extractColorTextStyle");
                throw null;
            }
            nVar.f420946d = a17;
            ns2.q qVar = cVar.A;
            if (qVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("extractColorIconStyle");
                throw null;
            }
            qVar.f420951d = java.lang.Integer.valueOf(a17);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c14917xdd637675.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.class)).d7(true, a18);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = c14917xdd637675.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie ieVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie.class);
            ieVar.f205344p = true;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = ieVar.f205342n;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = c14917xdd637675.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd) zVar.a(activity4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.class)).H7(true);
            cVar.b(200);
            c14917xdd637675.f205032e = 200;
            if (z17) {
                android.view.View view = c14917xdd637675.f205036i;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
                    throw null;
                }
                view.setBackground(null);
                android.view.View view2 = c14917xdd637675.f205038n;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descHeaderContainer");
                    throw null;
                }
                view2.setBackground(null);
                android.view.View view3 = c14917xdd637675.f205037m;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = c14917xdd637675.f205039o;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel1");
                    throw null;
                }
                view4.setBackgroundColor(a18);
                android.widget.ImageView imageView = c14917xdd637675.f205040p;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel2");
                    throw null;
                }
                if (z17) {
                    mn2.j0 j0Var = new mn2.j0(str == null ? "" : str);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    wo0.c a19 = g1Var.e().a(j0Var);
                    a19.g(g1Var.h(mn2.f1.f411499t));
                    a19.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.vi(str, imageView);
                    a19.c(imageView);
                }
                android.view.View view5 = c14917xdd637675.f205041q;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel3");
                    throw null;
                }
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{siVar.a(0.0f, a18), a18});
                view5.setBackground(gradientDrawable);
                android.view.View view6 = c14917xdd637675.f205043s;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayoutContainer");
                    throw null;
                }
                view6.setBackground(null);
                android.view.View view7 = c14917xdd637675.f205042r;
                if (view7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("friendFollowArrow");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view7, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void P6(java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (this.f205044t) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ti(z17, this, username));
        }
    }

    public final boolean a2() {
        return this.f205044t && this.f205032e == 200;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        java.lang.String str;
        super.mo739xfd763ae1(bundle);
        boolean z17 = this.f205044t;
        if (z17) {
            if (z17) {
                android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564768a24);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
                this.f205036i = mo144222x4ff8c0f0;
                android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.fxo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
                this.f205037m = mo144222x4ff8c0f02;
                android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.fxp);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
                this.f205039o = mo144222x4ff8c0f03;
                android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.fxq);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f04, "findViewById(...)");
                this.f205040p = (android.widget.ImageView) mo144222x4ff8c0f04;
                android.view.View mo144222x4ff8c0f05 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.fxr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f05, "findViewById(...)");
                this.f205041q = mo144222x4ff8c0f05;
                android.view.View mo144222x4ff8c0f06 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.fyp);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f06, "findViewById(...)");
                this.f205042r = mo144222x4ff8c0f06;
                android.view.View mo144222x4ff8c0f07 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.gyg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f07, "findViewById(...)");
                this.f205038n = mo144222x4ff8c0f07;
                android.view.View mo144222x4ff8c0f08 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f08, "findViewById(...)");
                this.f205043s = mo144222x4ff8c0f08;
                android.view.View mo144222x4ff8c0f09 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nup);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f09, "findViewById(...)");
            }
            mo48813x58998cd();
            is2.c cVar = this.f205034g;
            java.util.ArrayList arrayList = cVar.f375985i0;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kfn));
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kff));
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kfb));
            java.util.ArrayList arrayList2 = cVar.f375987j0;
            arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567980l85));
            java.util.ArrayList arrayList3 = cVar.f375979f0;
            arrayList3.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567079i22));
            java.util.ArrayList arrayList4 = cVar.f375981g0;
            arrayList4.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzv));
            java.util.ArrayList arrayList5 = cVar.T;
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566454fx5));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d9l));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fx_));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fxc));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fy8));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.feo));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fdt));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fe7));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567979l84));
            arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567976l81));
            java.util.ArrayList arrayList6 = cVar.S;
            arrayList6.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ov9));
            arrayList6.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fxn));
            boolean a17 = cVar.a();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzr);
            if (!a17) {
                arrayList6.add(valueOf);
            }
            arrayList6.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ttt));
            arrayList6.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f565935tb2));
            java.util.ArrayList arrayList7 = cVar.U;
            arrayList7.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzw));
            java.util.ArrayList arrayList8 = cVar.R;
            arrayList8.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzn));
            arrayList8.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564067h0));
            java.util.ArrayList arrayList9 = cVar.V;
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzk));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.c19));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzw));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jdq));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyi));
            if (cVar.a()) {
                arrayList9.add(valueOf);
            }
            cVar.X.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jkr));
            java.util.ArrayList arrayList10 = cVar.f375973c0;
            arrayList10.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyn));
            arrayList10.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564059gs));
            java.util.ArrayList arrayList11 = cVar.W;
            arrayList11.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzs));
            arrayList11.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzu));
            arrayList11.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jdp));
            arrayList11.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzu));
            cVar.Y.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566278fe3));
            java.util.ArrayList arrayList12 = cVar.f375969a0;
            arrayList12.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fy_));
            arrayList12.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jqi));
            arrayList12.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564848aa4));
            arrayList12.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzl));
            arrayList12.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564066gz));
            arrayList12.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ttu));
            java.util.ArrayList arrayList13 = cVar.f375977e0;
            arrayList13.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fwz));
            arrayList13.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fy6));
            arrayList13.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ffe));
            cVar.f375983h0.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566453fx4));
            java.util.ArrayList arrayList14 = cVar.f375991l0;
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyg), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80128x3e470968)));
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jkr), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80181xf46edebe)));
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzs), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80155x9d99890d)));
            arrayList14.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jdp), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80261x69edcbfe)));
            java.util.ArrayList arrayList15 = cVar.M;
            arrayList15.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kfn));
            arrayList15.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kfh));
            arrayList15.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kff));
            arrayList15.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.kfb));
            arrayList15.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567980l85));
            java.util.ArrayList arrayList16 = cVar.N;
            arrayList16.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567079i22));
            arrayList16.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzv));
            cVar.H.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564067h0));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzk));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.c19));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzw));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jdq));
            arrayList9.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyi));
            boolean a18 = cVar.a();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzr);
            if (a18) {
                arrayList9.add(valueOf2);
            }
            java.util.ArrayList arrayList17 = cVar.I;
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fx_));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fxc));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fy8));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d9l));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566454fx5));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.feo));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.l86));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fe7));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fdt));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567979l84));
            arrayList17.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567976l81));
            java.util.ArrayList arrayList18 = cVar.f375967J;
            arrayList18.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ov9));
            arrayList18.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fxn));
            if (!cVar.a()) {
                arrayList18.add(valueOf2);
            }
            arrayList18.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ttt));
            arrayList18.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f565935tb2));
            java.util.ArrayList arrayList19 = cVar.B;
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fxt));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyg));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzs));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jdp));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzu));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jkr));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fxt));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566278fe3));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ffe));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566453fx4));
            arrayList19.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzu));
            cVar.C.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fy6));
            java.util.ArrayList arrayList20 = cVar.D;
            arrayList20.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fwz));
            arrayList20.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fbi));
            java.util.ArrayList arrayList21 = cVar.E;
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564848aa4));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jqi));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fy_));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzl));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564066gz));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyn));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f564059gs));
            arrayList21.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ttu));
            cVar.G.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzn));
            java.util.ArrayList arrayList22 = cVar.f375993m0;
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fyg), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79747xeccac8c9)));
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jkr), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79809x518ab8fe)));
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.fzs), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79787x448e46cd)));
            arrayList22.add(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.jdp), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79840x71883ea2)));
            int i17 = cVar.f376005w;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = cVar.f375968a;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = cVar.f375970b;
            int i18 = cVar.f375999q;
            int i19 = cVar.f375998p;
            java.util.ArrayList arrayList23 = cVar.f375989k0;
            java.util.ArrayList arrayList24 = cVar.Q;
            int i27 = cVar.f375994n;
            java.util.ArrayList arrayList25 = cVar.R;
            int i28 = cVar.f376000r;
            cVar.f376007y.a(100, kz5.p1.d(new ns2.r(cVar.f375968a, cVar.f375970b, cVar.f375991l0, null, 8, null), new ns2.p(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, i17, arrayList), new ns2.p(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, i18, arrayList2), new ns2.p(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, i19, arrayList3), new ns2.p(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, cVar.f376006x, arrayList4), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, cVar.f375974d, arrayList23), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, cVar.f375988k, arrayList24), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, i27, arrayList5), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, i19, arrayList6), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, cVar.f375992m, arrayList7), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, cVar.f375990l, arrayList25), new ns2.n(activityC0065xcd7aa112, componentCallbacksC1101xa17d4670, i28, arrayList9), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(cVar.f376003u), cVar.X, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(i28), cVar.W, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(cVar.f376002t), cVar.Y, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(i27), cVar.f375969a0, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(cVar.f375996o), cVar.f375971b0, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(i19), cVar.f375975d0, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(i18), cVar.f375977e0, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, java.lang.Integer.valueOf(cVar.f376004v), cVar.f375983h0, null, 16, null), new ns2.q(cVar.f375968a, cVar.f375970b, null, cVar.Z, null, 16, null), new ns2.m(cVar.f375968a, cVar.f375970b, false, "ProfileStyle", null, 16, null)));
            cVar.f376008z = new ns2.n(cVar.f375968a, cVar.f375970b, 0, cVar.O);
            cVar.A = new ns2.q(cVar.f375968a, cVar.f375970b, null, cVar.P, "extractColorIcon", 4, null);
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
            P6(str, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f205044t) {
            mo48814x2efc64();
        }
    }

    /* renamed from: setNormalStyle */
    public final void m58695x60022348() {
        boolean z17 = this.f205044t;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "setCoveredStyle curStyle:" + this.f205032e + ' ');
            if (this.f205032e == 100) {
                return;
            }
            this.f205033f = -1;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.class)).d7(false, this.f205033f);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie ieVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie.class);
            ieVar.f205344p = false;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = ieVar.f205342n;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.class)).H7(false);
            this.f205032e = 100;
            this.f205034g.b(100);
            if (z17) {
                android.view.View view = this.f205037m;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f205039o;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel1");
                    throw null;
                }
                view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
                android.widget.ImageView imageView = this.f205040p;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel2");
                    throw null;
                }
                imageView.setImageDrawable(null);
                android.widget.ImageView imageView2 = this.f205040p;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel2");
                    throw null;
                }
                imageView2.setVisibility(4);
                android.view.View view3 = this.f205042r;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("friendFollowArrow");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f205041q;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgLevel3");
                    throw null;
                }
                view4.setBackground(null);
                android.view.View view5 = this.f205036i;
                if (view5 != null) {
                    view5.setBackgroundColor(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1] */
    public C14917xdd637675(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f205033f = -1;
        this.f205034g = new is2.c(m158354x19263085(), m158358x197d1fc6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f205044t = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209134aa).mo141623x754a37bb()).r()).intValue() == 1 && !m58704xd2e07a89();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f205045u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$coverSetEvent$1
            {
                this.f39173x3fe91575 = 2090220060;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c c5470xdd7cf62c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c event = c5470xdd7cf62c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.fb fbVar = event.f135808g;
                if (fbVar == null) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "callback actionType:" + fbVar.f88197b);
                int i17 = fbVar.f88197b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675 c14917xdd637675 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.this;
                if (i17 != 50000) {
                    if (i17 != 50001) {
                        return true;
                    }
                    c14917xdd637675.m58695x60022348();
                    return true;
                }
                java.lang.String url = fbVar.f88201f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
                int i18 = fbVar.f88200e;
                int i19 = (int) (255 * 1.0f);
                if (i19 <= 0) {
                    i19 = 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.O6(c14917xdd637675, url, ((255 > i19 ? i19 : 255) << 24) + (i18 & 16777215));
                return true;
            }
        };
    }
}
