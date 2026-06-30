package ye3;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ye3.l f542758d = new ye3.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g7 g7Var;
        try {
            g7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g7) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g7.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[mediaCacheStorage] init failed", e17);
        }
        if (g7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[mediaCacheStorage] service is null");
            return null;
        }
        ye3.o Bi = g7Var.Bi();
        if (Bi != null) {
            return Bi;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[mediaCacheStorage] storage is null");
        return Bi;
    }
}
