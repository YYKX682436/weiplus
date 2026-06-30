package na2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.k f417494d;

    public g(na2.k kVar) {
        this.f417494d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        na2.k kVar = this.f417494d;
        kVar.getClass();
        qs2.e eVar = new qs2.e(1, 112, 31);
        eVar.f447795d = kVar.f417505p;
        eVar.f447796e = kVar.f417506q;
        eVar.f447806o = kVar.f417504o;
        java.lang.String str = kVar.f417507r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        eVar.f447807p = str;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = kVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        eVar.f447797f = nyVar != null ? nyVar.V6().m75939xb282bd08(7) : 0;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = kVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        na2.f fVar = (na2.f) pf5.z.f435481a.a(activity).e(na2.f.class);
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "onPostBtnClick: delegate to FinderPostPlayAudioExtractorUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = fVar.f417490d;
            if (c14994x9b99c079 == null || !((qd2.g) ((jz5.n) fVar.f417493g).mo141623x754a37bb()).e(fVar.m158354x19263085())) {
                fVar.O6(eVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "tryPostWithAudio: waiting audio download, sourceFeedId=".concat(pm0.v.u(c14994x9b99c079.getFeedObject().m76784x5db1b11())));
                fVar.f417492f = eVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "onPostBtnClick: audio UIC missing, fallback to plain post, sourceFeedId=".concat(pm0.v.u(kVar.f417505p)));
            i95.m c17 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            w40.e.Df((w40.e) c17, kVar.m158354x19263085(), eVar, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
