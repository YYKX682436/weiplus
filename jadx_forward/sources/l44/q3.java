package l44;

/* loaded from: classes4.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.q3 f397846a = new l44.q3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f397847b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f397848c = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 1, u26.u.DROP_OLDEST, 1, null);

    public final void a(java.lang.String str, yz5.a callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdRemovedEventHelper", "registerAdRemovedListener() called with: snsStringId = null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
            return;
        }
        java.util.Map map = f397847b;
        synchronized (map) {
            try {
                java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(str);
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(callback);
                map.put(str, list);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdRemovedEventHelper", "registerAd, snsId=" + str + ", size=" + list.size());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
    }
}
