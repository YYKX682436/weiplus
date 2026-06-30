package m54;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.g0 f405801a = new m54.g0();

    public final void a(java.lang.String eventName, org.json.JSONObject jSONObject) {
        java.lang.Object m143895xf1229813;
        q80.g0 g0Var;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (g0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            return;
        }
        java.util.Iterator it = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).tj("wxalite0c45e912005759856ea55eb382e8c509").iterator();
        while (true) {
            if (!it.hasNext()) {
                l17 = null;
                break;
            } else {
                l17 = (java.lang.Long) it.next();
                if (l17 != null) {
                    break;
                }
            }
        }
        if (l17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            return;
        }
        long longValue = l17.longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(longValue, eventName, jSONObject);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghPageEventPublisher", "the event name is " + eventName + ", params is " + jSONObject);
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishVangoghPageEvent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
    }
}
