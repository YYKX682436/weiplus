package us1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f511998a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f511999b;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f511999b = arrayList;
        if (a()) {
            arrayList.add(vs1.h.f521403a);
        }
        arrayList.add(vs1.d.f521398a);
    }

    public static final boolean a() {
        int i17;
        boolean z17;
        if (f511998a == null) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_prefetcher_enable_fetch_content_by_web_transfer, 1);
            if (Ni != 1) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            } else {
                z17 = true;
            }
            f511998a = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherContentManager", "initConfig enableFetchContentByWebTransfer config: " + Ni + ", enable: " + f511998a);
        }
        java.lang.Boolean bool = null;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a.a() && (i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().getInt("debugTransfer", -1)) != -1) {
            bool = java.lang.Boolean.valueOf(i17 == 1);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.Boolean bool2 = f511998a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool2);
        return bool2.booleanValue();
    }
}
