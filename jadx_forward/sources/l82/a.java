package l82;

/* loaded from: classes12.dex */
public abstract class a {
    public static final java.util.List a(long j17) {
        if (!c82.e.d()) {
            p75.i0 i17 = dm.j3.f319290u.i();
            i17.f434190d = dm.j3.f319292w.i(java.lang.Long.valueOf(j17));
            i17.f434189c = "MicroMsg.SDK.BaseFavCdnInfo";
            return i17.a().k(c82.e.f121201a.a(), o72.e2.class);
        }
        try {
            java.util.List m07 = z72.a.m0(c82.e.f121201a.b().m106797xde3eb429(up5.b.a(), "FavCdnInfo", up5.b.f511427d.eq(j17)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m07);
            return m07;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnStorageKt", "Operation failed: " + e17.getMessage());
            return kz5.p0.f395529d;
        }
    }
}
