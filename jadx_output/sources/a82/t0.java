package a82;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.w0 f2172d;

    public t0(a82.w0 w0Var) {
        this.f2172d = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<o72.m2> E5 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().E5();
        if (E5 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "infos size %d", java.lang.Integer.valueOf(E5.size()));
        for (o72.m2 m2Var : E5) {
            java.lang.String b17 = a82.w0.b(m2Var.field_localId, m2Var.field_type);
            a82.w0 w0Var = this.f2172d;
            a82.v0 v0Var = (a82.v0) ((java.util.HashMap) w0Var.f2198d).get(b17);
            if (v0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "not match key %s", b17);
                a82.v0 v0Var2 = new a82.v0(null);
                v0Var2.f2183a = m2Var;
                v0Var2.f2186d = 3;
                v0Var2.f2185c = android.os.SystemClock.elapsedRealtime();
                ((java.util.HashMap) w0Var.f2198d).put(b17, v0Var2);
                a82.w0.a(w0Var, v0Var2, true);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "match key %s, check start", b17);
                a82.w0.a(w0Var, v0Var, false);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|run";
    }
}
