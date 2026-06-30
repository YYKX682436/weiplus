package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qh extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: m, reason: collision with root package name */
    public static r45.ax2 f217240m;

    /* renamed from: n, reason: collision with root package name */
    public static long f217241n;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f217242d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f217243e;

    /* renamed from: f, reason: collision with root package name */
    public final int f217244f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f217245g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f217246h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f217247i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f217242d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ph(this));
        this.f217243e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nh.f216865d);
        this.f217244f = 4;
    }

    public final android.view.View O6() {
        return (android.view.View) this.f217242d.mo141623x754a37bb();
    }

    public final void P6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USREINFO_FINDER_SLIDE_LEFT_TIPS_COUNT_INT_SYNC;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mh(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.view.ViewStub viewStub = (android.view.ViewStub) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566502g35);
        if (viewStub != null) {
            viewStub.inflate();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        f217240m = null;
        android.view.View O6 = O6();
        if (O6 != null && O6.getVisibility() == 0 && this.f217245g) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217242d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ph(this));
        this.f217243e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nh.f216865d);
        this.f217244f = 4;
    }
}
