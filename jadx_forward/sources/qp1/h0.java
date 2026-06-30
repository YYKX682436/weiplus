package qp1;

/* loaded from: classes8.dex */
public abstract class h0 {
    public static void a(boolean z17, boolean z18, boolean z19) {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVisibilityUtil", "operateFloatBall, service is null");
            return;
        }
        if (z17) {
            if (z19) {
                Bi.d(z18);
                return;
            } else {
                Bi.B(z18);
                return;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.FloatBallVisibilityUtil", "operateFloatBall, show float ball, mark:%s", java.lang.Boolean.valueOf(z19));
        if (z19) {
            Bi.y(z18);
        } else {
            Bi.E0(z18);
        }
    }

    public static void b() {
        a(false, true, true);
    }
}
