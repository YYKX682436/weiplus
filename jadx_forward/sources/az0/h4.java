package az0;

/* loaded from: classes5.dex */
public final class h4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.h4 f97060d = new az0.h4();

    public h4() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete it = (com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 q17 = az0.i5.f97090a.q();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_maas_cleanup_max_limit, 100000000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "cleanupMaxLimit: " + Ni);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_maas_cleanup_min_limit, 100000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "cleanupMinLimit: " + Ni2);
        q17.a(new com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.ResourceCacheCleanupOptions(Ni, Ni2), it);
        return null;
    }
}
