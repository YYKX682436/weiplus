package a82;

/* loaded from: classes12.dex */
public class w0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f2198d = new java.util.HashMap();

    public w0() {
        gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, this);
        gm0.j1.d().a(401, this);
    }

    public static void a(a82.w0 w0Var, a82.v0 v0Var, boolean z17) {
        int i17;
        w0Var.getClass();
        int i18 = v0Var.f2186d - 1;
        v0Var.f2186d = i18;
        if (i18 < 0) {
            if (android.os.SystemClock.elapsedRealtime() - v0Var.f2185c < 7200000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "try mod item fail time limit, favid %d, localId %d, edit type %d", java.lang.Integer.valueOf(v0Var.f2184b), java.lang.Long.valueOf(v0Var.f2183a.field_localId), java.lang.Integer.valueOf(v0Var.f2183a.field_type));
                return;
            } else {
                v0Var.f2185c = android.os.SystemClock.elapsedRealtime();
                v0Var.f2186d = 3;
            }
        }
        int i19 = v0Var.f2184b;
        if (i19 <= 0) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(v0Var.f2183a.field_localId);
            if (F == null || (i17 = F.field_id) <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavEditService", "want to start mod item, but favid is invalid, local id %d", java.lang.Long.valueOf(v0Var.f2183a.field_localId));
                return;
            } else {
                v0Var.f2184b = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "want mod item, find id %d by local id %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(v0Var.f2183a.field_localId));
            }
        } else if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavEditService", "want to mod item, favid %d, it is running, but not enforce, return", java.lang.Integer.valueOf(i19));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "try mod item, enforce %B, favid %d, edit type %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(v0Var.f2184b), java.lang.Integer.valueOf(v0Var.f2183a.field_type));
        gm0.j1.d().g(new o72.l5(v0Var.f2184b, v0Var.f2183a));
    }

    public static java.lang.String b(long j17, int i17) {
        return j17 + "&&" + i17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "on edit service scene end, errType=%d errCode=%d, %s, scene type %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var.getType() == 401) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "on add fav item scene end, try mod item");
            gm0.j1.e().j(new a82.t0(this));
            return;
        }
        if (m1Var instanceof o72.l5) {
            o72.l5 l5Var = (o72.l5) m1Var;
            if (l5Var.f343400g != 0) {
                java.util.Map map = this.f2198d;
                o72.m2 m2Var = l5Var.f343401h;
                if (i17 == 0 && i18 == 0) {
                    java.lang.String b17 = b(l5Var.H(), m2Var == null ? -1 : m2Var.field_type);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "clear job, key %s", b17);
                    ((java.util.HashMap) map).remove(b17);
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().j1(l5Var.H(), m2Var != null ? m2Var.field_type : -1);
                    o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(l5Var.H());
                    if (F != null) {
                        o72.v2.f(F.field_id, F.field_tagProto.f385096e.size(), m2Var == null ? 1 : m2Var.field_scene);
                        return;
                    }
                    return;
                }
                long H = l5Var.H();
                int i19 = m2Var != null ? m2Var.field_type : -1;
                java.lang.String b18 = b(H, i19);
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavEditService", "retry job, key %s", b18);
                a82.v0 v0Var = (a82.v0) ((java.util.HashMap) map).get(b18);
                if (v0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavEditService", "want to retry mod item, localid %d, type %d", java.lang.Long.valueOf(H), java.lang.Integer.valueOf(i19));
                } else {
                    gm0.j1.e().k(new a82.u0(this, v0Var), 3000L);
                }
            }
        }
    }
}
