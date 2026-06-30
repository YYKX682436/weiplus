package a82;

/* loaded from: classes12.dex */
public class w0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f83731d = new java.util.HashMap();

    public w0() {
        gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6, this);
        gm0.j1.d().a(401, this);
    }

    public static void a(a82.w0 w0Var, a82.v0 v0Var, boolean z17) {
        int i17;
        w0Var.getClass();
        int i18 = v0Var.f83719d - 1;
        v0Var.f83719d = i18;
        if (i18 < 0) {
            if (android.os.SystemClock.elapsedRealtime() - v0Var.f83718c < 7200000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "try mod item fail time limit, favid %d, localId %d, edit type %d", java.lang.Integer.valueOf(v0Var.f83717b), java.lang.Long.valueOf(v0Var.f83716a.f67419x88be67a1), java.lang.Integer.valueOf(v0Var.f83716a.f67423x2262335f));
                return;
            } else {
                v0Var.f83718c = android.os.SystemClock.elapsedRealtime();
                v0Var.f83719d = 3;
            }
        }
        int i19 = v0Var.f83717b;
        if (i19 <= 0) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(v0Var.f83716a.f67419x88be67a1);
            if (F == null || (i17 = F.f67643xc8a07680) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavEditService", "want to start mod item, but favid is invalid, local id %d", java.lang.Long.valueOf(v0Var.f83716a.f67419x88be67a1));
                return;
            } else {
                v0Var.f83717b = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "want mod item, find id %d by local id %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(v0Var.f83716a.f67419x88be67a1));
            }
        } else if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavEditService", "want to mod item, favid %d, it is running, but not enforce, return", java.lang.Integer.valueOf(i19));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "try mod item, enforce %B, favid %d, edit type %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(v0Var.f83717b), java.lang.Integer.valueOf(v0Var.f83716a.f67423x2262335f));
        gm0.j1.d().g(new o72.l5(v0Var.f83717b, v0Var.f83716a));
    }

    public static java.lang.String b(long j17, int i17) {
        return j17 + "&&" + i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "on edit service scene end, errType=%d errCode=%d, %s, scene type %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var.mo808xfb85f7b0() == 401) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "on add fav item scene end, try mod item");
            gm0.j1.e().j(new a82.t0(this));
            return;
        }
        if (m1Var instanceof o72.l5) {
            o72.l5 l5Var = (o72.l5) m1Var;
            if (l5Var.f424933g != 0) {
                java.util.Map map = this.f83731d;
                o72.m2 m2Var = l5Var.f424934h;
                if (i17 == 0 && i18 == 0) {
                    java.lang.String b17 = b(l5Var.H(), m2Var == null ? -1 : m2Var.f67423x2262335f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "clear job, key %s", b17);
                    ((java.util.HashMap) map).remove(b17);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().j1(l5Var.H(), m2Var != null ? m2Var.f67423x2262335f : -1);
                    o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(l5Var.H());
                    if (F != null) {
                        o72.v2.f(F.f67643xc8a07680, F.f67653xef67d413.f466629e.size(), m2Var == null ? 1 : m2Var.f67421x29cbf907);
                        return;
                    }
                    return;
                }
                long H = l5Var.H();
                int i19 = m2Var != null ? m2Var.f67423x2262335f : -1;
                java.lang.String b18 = b(H, i19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "retry job, key %s", b18);
                a82.v0 v0Var = (a82.v0) ((java.util.HashMap) map).get(b18);
                if (v0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavEditService", "want to retry mod item, localid %d, type %d", java.lang.Long.valueOf(H), java.lang.Integer.valueOf(i19));
                } else {
                    gm0.j1.e().k(new a82.u0(this, v0Var), 3000L);
                }
            }
        }
    }
}
