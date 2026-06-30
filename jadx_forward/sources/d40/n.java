package d40;

@j95.b
/* loaded from: classes5.dex */
public final class n extends i95.w implements e40.v {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f307898d = jz5.h.b(d40.m.f307897d);

    public long Ai() {
        return wi() ? Bi() : ip.c.k();
    }

    public final long Bi() {
        java.lang.Object m143895xf1229813;
        ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
        ez.v0 v0Var = ez.v0.f339310a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), ez.s0.class)).f149938d;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(ip.c.j()));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = 10737418240L;
        }
        return ((java.lang.Number) m143895xf1229813).longValue();
    }

    public boolean wi() {
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20163xfeae538c()) == 1) || !((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(1)) {
            return false;
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHelperFeatureService", "checkDeviceScoreForLargeFileSend inner user");
        } else {
            try {
                java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20157x2fb3bdf9());
                if (f17 == null || f17.length() == 0) {
                    return false;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                java.util.List f07 = r26.n0.f0(f17, new java.lang.String[]{":"}, false, 0, 6, null);
                if (f07.size() != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileHelperFeatureService", "invalid device score config: ".concat(f17));
                    return false;
                }
                java.lang.Integer h17 = r26.h0.h((java.lang.String) f07.get(0));
                int intValue = h17 != null ? h17.intValue() : 0;
                java.lang.Integer h18 = r26.h0.h((java.lang.String) f07.get(1));
                int intValue2 = h18 != null ? h18.intValue() : 0;
                if (intValue <= 0 || intValue2 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHelperFeatureService", "cpuThreshold: " + intValue + ", gpuThreshold: " + intValue2);
                    return false;
                }
                rh0.x xVar = (rh0.x) i95.n0.c(rh0.x.class);
                if (xVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileHelperFeatureService", "IWeVisEffectConfigService is null");
                    return false;
                }
                p05.v2 v2Var = (p05.v2) xVar;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = v2Var.Bi();
                p05.p3 p3Var = p05.p3.f432172a;
                float l17 = Bi.l("cpu_score");
                float l18 = v2Var.Bi().l("gpu_score");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileHelperFeatureService", "checkDeviceScoreForLargeFileSend cpuScore: " + l17 + " , cpuThreshold: " + intValue + " , gpuScore: " + l18 + " , gpuThreshold: " + intValue2);
                if (l17 < intValue || l18 < intValue2) {
                    return false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileHelperFeatureService", "getExptString failed", e17);
                return false;
            }
        }
        return true;
    }
}
