package fn2;

/* loaded from: classes5.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f345951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fn2.b0 b0Var) {
        super(0);
        this.f345951d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fn2.b0 b0Var = this.f345951d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = b0Var.f345749h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c2718xca2902ff, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = b0Var.f345750i;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1190x18d3c3fe, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
