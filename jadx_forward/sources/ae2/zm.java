package ae2;

/* loaded from: classes.dex */
public final class zm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.zm f85880d = new ae2.zm();

    public zm() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = true;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_mmpagview_rfx_switch_live_disable_scene, "", true);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (Zi != null && Zi.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.util.Iterator it = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a((java.lang.String) it.next())));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveConfig", "clicfg_mmpagview_rfx_switch_live_disable_scene: " + Zi);
        return hashSet;
    }
}
