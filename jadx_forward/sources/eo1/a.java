package eo1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final eo1.a f337078a = new eo1.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f337079b = new java.util.HashMap(20);

    public final synchronized long a(long j17) {
        long longValue;
        java.util.HashMap hashMap = f337079b;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17));
        if (l17 == null) {
            longValue = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().h(j17).f297425i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AutoBackupPauseTimeCache", "[getRestartTime] restart time is " + longValue);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(longValue));
        } else {
            longValue = l17.longValue();
        }
        return longValue;
    }

    public final synchronized void b(long j17, long j18) {
        f337079b.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().m(j17, j18);
    }
}
