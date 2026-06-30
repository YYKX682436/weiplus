package p52;

/* loaded from: classes15.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f433576a;

    /* renamed from: b, reason: collision with root package name */
    public static final p52.b f433577b;

    /* renamed from: c, reason: collision with root package name */
    public static final r52.c f433578c;

    /* renamed from: d, reason: collision with root package name */
    public static final p52.m f433579d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f433576a = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V"));
        arrayList.add(android.util.Pair.create("onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V"));
        hashMap.put("androidx/recyclerview/widget/RecyclerView$OnScrollListener", arrayList);
        f433577b = new p52.b();
        f433578c = new r52.c();
        f433579d = new p52.m();
    }

    public static final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a() {
        java.lang.ref.WeakReference weakReference;
        p52.b bVar = f433577b;
        o52.e eVar = bVar.f433531e;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (eVar == null || (weakReference = eVar.f424632a) == null) ? null : (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) weakReference.get();
        if (componentCallbacksC1101xa17d4670 != null) {
            return componentCallbacksC1101xa17d4670;
        }
        java.lang.ref.WeakReference weakReference2 = bVar.f433532f;
        return bVar.b(weakReference2 != null ? (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8) weakReference2.get() : null, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.app.Activity r20, long r21) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p52.k.b(android.app.Activity, long):void");
    }

    public static final void c(java.lang.String str) {
        p52.b bVar = f433577b;
        bVar.f433527a = str;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FinderFragmentCallback", "monitor...");
            bVar.f433535i = -1;
            bVar.f433529c = true;
            bVar.f433530d = false;
            synchronized (bVar.f433537k) {
                if (!bVar.f433536j) {
                    bVar.f433536j = true;
                    xj0.a.h().m(bVar.f433538l, bVar.f433539m);
                }
            }
        }
    }

    public static final void d(java.lang.String str) {
        p52.b bVar = f433577b;
        bVar.f433528b = str;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FinderFragmentCallback", "unmonitor...");
            bVar.f433529c = false;
            bVar.f433530d = true;
            synchronized (bVar.f433537k) {
                xj0.a.h().p(bVar.f433538l, bVar.f433539m);
                bVar.f433536j = false;
            }
        }
    }
}
