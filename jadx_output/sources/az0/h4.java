package az0;

/* loaded from: classes5.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.h4 f15527d = new az0.h4();

    public h4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.MJMaasCore.OnComplete it = (com.tencent.maas.MJMaasCore.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.MJMaasCore q17 = az0.i5.f15557a.q();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_maas_cleanup_max_limit, 100000000);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "cleanupMaxLimit: " + Ni);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_maas_cleanup_min_limit, 100000);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "cleanupMinLimit: " + Ni2);
        q17.a(new com.tencent.maas.MJMaasCore.ResourceCacheCleanupOptions(Ni, Ni2), it);
        return null;
    }
}
