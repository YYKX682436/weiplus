package j52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static j52.c f379331e;

    /* renamed from: a, reason: collision with root package name */
    public j52.a f379332a;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f379334c;

    /* renamed from: b, reason: collision with root package name */
    public int f379333b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final yj0.d f379335d = new j52.b(this);

    public c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onPostOpen", "(Z)V"));
        arrayList.add(android.util.Pair.create("onPostClose", "()V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", arrayList);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f379334c = hashMap2;
        hashMap2.put("com/tencent/mm/ui/MoreTabUI$", hashMap);
    }

    public static void a(j52.c cVar, java.lang.Object obj, boolean z17) {
        cVar.getClass();
        r45.a07 a07Var = new r45.a07();
        a07Var.f451134d = z17 ? "onStoryOpen" : "onStoryClose";
        a07Var.f451142o = java.lang.System.currentTimeMillis();
        a07Var.f451135e = a07Var.f451134d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e17 = i52.l.e("com.tencent.mm.ui.LauncherUI");
        a07Var.f451137g = e17 == null ? "MoreTabUI" : e17.getClass().getSimpleName();
        a07Var.f451141n = e17 == null ? -1 : e17.m7479x8cdac1b();
        java.lang.String str = a07Var.f451137g;
        a07Var.f451136f = str;
        if (obj != null) {
            str = obj.getClass().getName();
        }
        a07Var.f451138h = str;
        k52.g gVar = k52.g.f385827e;
        a07Var.f451139i = 10;
        a07Var.f451148u = 0;
        java.util.Map map = k52.l.f385843a;
        k52.l.f385847e.a(null, a07Var);
    }

    public static j52.c c() {
        if (f379331e == null) {
            synchronized (j52.c.class) {
                if (f379331e == null) {
                    f379331e = new j52.c();
                }
            }
        }
        return f379331e;
    }

    public void b(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, endHook");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f17 = i52.l.f(activityC1102x9ee2d9f, "com.tencent.mm.ui.MoreTabUI");
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, curFragment == null");
            return;
        }
        java.lang.String canonicalName = f17.getClass().getCanonicalName();
        if (!"com.tencent.mm.ui.MoreTabUI".equals(canonicalName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor endHook FALSE: %s", canonicalName);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor endHook real: %s", canonicalName);
            xj0.a.h().q(this.f379334c, this.f379335d);
        }
    }

    public final void d(int i17, long j17) {
        this.f379333b = i17;
        j52.a aVar = this.f379332a;
        if (aVar != null) {
            ((i52.j) aVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "mHijackCallback, event: %d", java.lang.Integer.valueOf(i17));
            d52.d.a().d(i17 == 0 ? 300 : i17 == 1 ? 301 : -1, java.lang.Long.valueOf(j17));
        }
    }

    public void e(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, j52.a aVar) {
        if (!a52.a.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, startHook, fetchHellhoundConfig: FALSE");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f17 = i52.l.f(activityC1102x9ee2d9f, "com.tencent.mm.ui.MoreTabUI");
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook: curFragment == null");
            return;
        }
        java.lang.String canonicalName = f17.getClass().getCanonicalName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook-2: %s", canonicalName);
        if (!"com.tencent.mm.ui.MoreTabUI".equals(canonicalName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook Fail: %s", canonicalName);
            return;
        }
        this.f379332a = aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook real: %s", canonicalName);
        xj0.a.h().n(this.f379334c, this.f379335d);
    }
}
