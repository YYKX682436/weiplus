package x51;

/* loaded from: classes12.dex */
public final class p1 {
    public p1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public final boolean a(java.lang.String expt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expt, "expt");
        boolean z17 = true;
        ?? r07 = (((fz.l) ((cp.f) i95.n0.c(cp.f.class))).f348810e || mm.o.a()) ? 1 : 0;
        if (j62.e.g().i(expt, r07, false, false) != 1) {
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a())) {
                z17 = false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetThreadWorker", "enableThreadPool: " + z17 + ", expt=" + expt + ", def=" + ((boolean) r07));
        return z17;
    }
}
