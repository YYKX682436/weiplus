package p72;

/* loaded from: classes12.dex */
public final class a extends dm.l3 {
    public static final l75.e0 F = dm.l3.m125193x3593deb(dm.l3.class);
    public static final java.text.SimpleDateFormat G = new java.text.SimpleDateFormat("yyyy.MM.dd HH:mm", java.util.Locale.ENGLISH);

    public final java.lang.String J0(long j17) {
        try {
            java.lang.String format = G.format(java.lang.Long.valueOf(j17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            return format;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavDelMgr", th6, "format err", new java.lang.Object[0]);
            return java.lang.String.valueOf(j17);
        }
    }

    @Override // dm.l3, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return F;
    }

    /* renamed from: toString */
    public java.lang.String m157931x9616526c() {
        return mo124851xcc313de3().toString() + "delTimeF:" + J0(u0()) + " updateTimeF:" + J0(v0());
    }
}
