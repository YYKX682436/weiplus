package a82;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.w0 f83705d;

    public t0(a82.w0 w0Var) {
        this.f83705d = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<o72.m2> E5 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().E5();
        if (E5 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "infos size %d", java.lang.Integer.valueOf(E5.size()));
        for (o72.m2 m2Var : E5) {
            java.lang.String b17 = a82.w0.b(m2Var.f67419x88be67a1, m2Var.f67423x2262335f);
            a82.w0 w0Var = this.f83705d;
            a82.v0 v0Var = (a82.v0) ((java.util.HashMap) w0Var.f83731d).get(b17);
            if (v0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "not match key %s", b17);
                a82.v0 v0Var2 = new a82.v0(null);
                v0Var2.f83716a = m2Var;
                v0Var2.f83719d = 3;
                v0Var2.f83718c = android.os.SystemClock.elapsedRealtime();
                ((java.util.HashMap) w0Var.f83731d).put(b17, v0Var2);
                a82.w0.a(w0Var, v0Var2, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "match key %s, check start", b17);
                a82.w0.a(w0Var, v0Var, false);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m833x9616526c() {
        return super.toString() + "|run";
    }
}
