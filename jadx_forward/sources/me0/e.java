package me0;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5401xe4b21f18 c5401xe4b21f18 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5401xe4b21f18) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.f Ai = ((ue4.r) i95.n0.c(ue4.r.class)).Ai();
        Ai.getClass();
        am.t8 t8Var = c5401xe4b21f18.f135744g;
        int i18 = t8Var.f89522a;
        am.u8 u8Var = c5401xe4b21f18.f135745h;
        if (i18 != 2) {
            if (i18 == 3) {
                try {
                    org.json.JSONObject c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c();
                    org.json.JSONObject optJSONObject = c17.optJSONObject("extStepApiConfig");
                    if (optJSONObject == null) {
                        optJSONObject = c17.optJSONObject("stepExtConfig");
                    }
                    if (optJSONObject != null) {
                        u8Var.f89589a = optJSONObject.toString();
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u8Var.f89589a)) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(625L, 5L, 1L, false);
                        u8Var.f89591c = 3905;
                    } else {
                        u8Var.f89591c = 1;
                    }
                } catch (java.lang.Exception unused) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(625L, 6L, 1L, false);
                    u8Var.f89591c = 3905;
                }
                u8Var.f89590b = true;
            }
            return true;
        }
        long j17 = t8Var.f89523b;
        long c18 = c01.id.c();
        long j18 = c5401xe4b21f18.f135744g.f89524c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExtApiStepManager", "ExtStepCountEvent PASSIVE_UPDATE stepCount:%s timestamp:%s version:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c18), java.lang.Long.valueOf(j18));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e()) {
            i17 = 3906;
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a;
            long a17 = zVar.a("KEY_EXT_API_LAST_STEP_TIME_LONG", 0L);
            long a18 = zVar.a("KEY_EXT_API_TODAY_STEP_LONG", 0L);
            if (c18 - a17 < 300000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sport.ExtApiStepManager", "update interval must larger than 5 minute, lastUpdateTime:%d lastUpdateStep:%d newUpdateTime:%d newUpdateStep:%d", java.lang.Long.valueOf(a17), java.lang.Long.valueOf(a18), java.lang.Long.valueOf(c18), java.lang.Long.valueOf(j17));
                i17 = 3903;
            } else {
                org.json.JSONObject c19 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T0(c18, a17)) {
                    a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.g();
                    a18 = 0;
                }
                long j19 = c18 - a17;
                long optInt = ((j19 / 300000) + (j19 % 300000 > 0 ? 1 : 0)) * c19.optInt("stepCounterMaxStep5m");
                long j27 = j17 - a18;
                if (j27 < 0 || j27 > optInt) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sport.ExtApiStepManager", "invalid step in 5 minute actual: %d max: %d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(optInt));
                    i17 = 3904;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExtApiStepManager", "can update time: %s, step: %d", com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f(c18), java.lang.Long.valueOf(j17));
                    zVar.d("KEY_EXT_API_LAST_STEP_TIME_LONG", c18);
                    zVar.d("KEY_EXT_API_TODAY_STEP_LONG", j17);
                    zVar.d("KEY_EXT_API_VERSION_LONG", j18);
                    i17 = 1;
                }
            }
        } else {
            i17 = 3902;
        }
        u8Var.f89591c = i17;
        if (i17 == 1) {
            if (Ai.f253315b == 0) {
                Ai.f253315b = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", 0L);
            }
            boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.d(Ai.f253315b, c18);
            boolean c27 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.c(Ai.a(), j17);
            if (d17 && c27) {
                Ai.c(j17);
                jx3.f.INSTANCE.mo68477x336bdfd8(625L, 1L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(625L, 2L, 1L, false);
            }
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(625L, 4L, 1L, false);
        }
        u8Var.f89590b = true;
        return true;
    }
}
