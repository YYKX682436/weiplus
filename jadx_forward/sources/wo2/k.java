package wo2;

@j95.b
/* loaded from: classes2.dex */
public final class k extends l85.m1 implements ws5.g {

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f529620g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f529621h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f529622i;

    public k() {
        super("PluginFinderNearby");
        this.f529620g = new p012xc85e97e9.p093xedfae76a.l1();
        this.f529621h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f529622i = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    public c50.m0 Ai(android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, java.util.List feedList, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager : null;
        if (c1164x587b7ff1 == null || c1164x587b7ff1.f93453d != 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLiveCardAutoPlayMgr: wrong layout manager, ");
            sb6.append(c1164x587b7ff1);
            sb6.append(", spanCount=");
            sb6.append(c1164x587b7ff1 != null ? c1164x587b7ff1.f93453d : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNearbyFeatureService", sb6.toString());
            return null;
        }
        mn0.d0 d0Var = mn0.d0.f411246i;
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
            str = "";
        }
        return new gp2.l0(context, recyclerView, feedList, false, 0, false, false, false, adapter, d0Var, 5, str, 0, false, null, null, 61680, null);
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1579x333b55.ActivityC14517xebb478b4.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterNearbyLiveMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterNearbyLiveMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean Di(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf finder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder, "finder");
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(finder).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n;
        java.util.regex.Pattern pattern = zy2.v.f559123a;
        if (!(i17 == 76 || i17 == 77 || i17 == 80) && !finder.m80392x8a802db(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.class)) {
            ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).getClass();
            if (!(i17 / 100000 == 94) && !(finder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.ActivityC14516x4f028c6e)) {
                return false;
            }
        }
        return true;
    }

    public void Ni(long j17) {
        rq2.u.f480422a.b(j17);
    }

    @Override // l85.m1, p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f529620g;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
