package sc2;

/* loaded from: classes2.dex */
public final class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.av f487400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487401h;

    public e8(android.view.View view, sc2.p8 p8Var, java.lang.String str, r45.av avVar, xc2.p0 p0Var) {
        this.f487397d = view;
        this.f487398e = p8Var;
        this.f487399f = str;
        this.f487400g = avVar;
        this.f487401h = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f487397d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view.findViewById(com.p314xaae8f345.mm.R.id.eic);
        if (c22849x81a93d25 != null) {
            if (c22849x81a93d25.mo7958x54496c8e() != 0) {
                sc2.p8 p8Var = this.f487398e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p8Var.f487685w, "checkLoopCard: don't loop scrollState=" + c22849x81a93d25.mo7958x54496c8e() + ", source=" + this.f487399f + ", carousel_time=" + this.f487400g.m75939xb282bd08(5));
                p8Var.G(view, this.f487401h, "ScrollStateError");
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d25.getLayoutManager();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e c15417x7e33cd1e = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e) layoutManager : null;
            if (c15417x7e33cd1e != null) {
                c15417x7e33cd1e.f214184p = false;
                int o17 = c15417x7e33cd1e.o() + 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(o17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderJumperCarouselCardObserver$checkLoopCard$2$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/feed/component/FinderJumperCarouselCardObserver$checkLoopCard$2$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
    }
}
