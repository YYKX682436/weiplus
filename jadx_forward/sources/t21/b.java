package t21;

/* loaded from: classes12.dex */
public abstract class b {
    public static void a(t21.v2 v2Var, int i17) {
        long j17;
        if (v2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AtomStatUtil", "report moov location, but video info is null.");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int i18 = 0;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, v2Var.d(), false);
        if (d61.c.a(rj6)) {
            d61.b bVar = new d61.b();
            long a17 = bVar.a(rj6);
            d61.a aVar = bVar.f308246c;
            i18 = 1;
            j17 = aVar != null ? aVar.f308243d : 0L;
            r3 = a17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtomStatUtil", "download video finish, but it is not mp4 file.");
            j17 = 0;
        }
        java.lang.String str = v2Var.f496537c + ";" + t21.v2.c(v2Var.g()) + ";" + v2Var.f496541f + ";" + i18 + ";" + r3 + ";" + j17 + ";" + i17;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11098, 8000, str);
    }
}
