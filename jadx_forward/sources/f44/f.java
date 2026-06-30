package f44;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f341088a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f341089b = new java.util.concurrent.ConcurrentHashMap();

    public f44.e a(f44.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        if (eVar != null) {
            java.lang.String str = eVar.f341083a;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                boolean isEmpty = android.text.TextUtils.isEmpty(str);
                java.util.Map map = this.f341088a;
                boolean z17 = false;
                if (isEmpty) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5Prefetch", "the task info is empty!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                } else if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5Prefetch", "the task key is in pending task, the task key is : " + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    f44.d dVar = (f44.d) ((java.util.concurrent.ConcurrentHashMap) this.f341089b).get(str);
                    if (dVar == null || currentTimeMillis >= dVar.f341082b + 600000) {
                        int i17 = eVar.f341084b;
                        if (i17 == 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = eVar.f341086d;
                            if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70377x3172ed()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5Prefetch", "the sns info is not ad!");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                                z17 = true;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        } else if (i17 == 1) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            if (a84.b0.d(eVar.f341085c)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5Prefetch", "the urls is empty!");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                                z17 = true;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5Prefetch", "the task key has been prefetch, the task key is : " + str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    return null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.H5Prefetch", "the task info is to prefetch, the task key  is : " + str);
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, eVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                return eVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        return null;
    }

    public final void b(f44.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        if (eVar != null && !android.text.TextUtils.isEmpty(eVar.f341083a) && ku5.t0.f394148d != null) {
            ((ku5.t0) ku5.t0.f394148d).g(new f44.c(this, eVar.f341083a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
    }
}
