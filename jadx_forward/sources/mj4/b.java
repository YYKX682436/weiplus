package mj4;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mj4.b f408589d = new mj4.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_TextStatus_ForceUseNewClusterId_Int, 0);
        if (g17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusClusterHelper", "isClusterOpen init true by force");
            return java.lang.Integer.valueOf(g17);
        }
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_square_new_cluster_and, 1) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusClusterHelper", "isClusterOpen init false by xswitch closed");
            return 0;
        }
        int e17 = ai4.m0.f86706a.G().e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusClusterHelper", "isClusterValid init: %s", java.lang.Integer.valueOf(e17));
        return java.lang.Integer.valueOf(e17);
    }
}
