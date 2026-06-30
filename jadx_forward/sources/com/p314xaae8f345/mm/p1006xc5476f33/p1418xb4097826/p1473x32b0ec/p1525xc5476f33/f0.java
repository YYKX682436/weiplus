package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 f194009d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var) {
        this.f194009d = q0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f0 f0Var = this;
        mm2.f fVar = (mm2.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var = f0Var.f194009d;
        java.lang.String adVideoId = ((mm2.w) q0Var.P0(mm2.w.class)).f411035n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "liveAdId:" + adVideoId + " onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e0.f193889a[fVar.ordinal()];
        ml2.u uVar = q0Var.f195476s;
        if (i17 == 1) {
            uVar.a(adVideoId);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                if (i17 != 4) {
                    return;
                }
                uVar.a(adVideoId);
                return;
            } else {
                uVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adVideoId, "adVideoId");
                if (android.text.TextUtils.isEmpty(adVideoId)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoEnter return for adVideoId:".concat(adVideoId));
                    return;
                } else {
                    uVar.f409560a = c01.id.c();
                    return;
                }
            }
        }
        uVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adVideoId, "adVideoId");
        if (android.text.TextUtils.isEmpty(adVideoId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoExit return for adVideoId:".concat(adVideoId));
        } else if (uVar.f409560a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoExit return for startupVideoEnter:" + uVar.f409560a);
        } else {
            if (android.text.TextUtils.isEmpty(adVideoId)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoEnterInternal return for adVideoId:".concat(adVideoId));
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put("advertise_id", adVideoId);
                jSONObject.put("advertise_type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoEnterInternal json: " + jSONObject);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.hj((ml2.r0) c17, ml2.b4.D1, t17, 0L, null, null, null, null, null, 252, null);
            }
            long c18 = c01.id.c() - uVar.f409560a;
            uVar.f409560a = 0L;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", 2);
            jSONObject3.put("advertise_id", adVideoId);
            jSONObject3.put("advertise_type", 1);
            jSONObject3.put("watch_duration", c18);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            java.lang.String t18 = r26.i0.t(jSONObject4, ",", ";", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdVideoReporter", "reportStartupVideoExit json: " + jSONObject3);
            i95.m c19 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ml2.r0.hj((ml2.r0) c19, ml2.b4.D1, t18, 0L, null, null, null, null, null, 252, null);
            f0Var = this;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var2 = f0Var.f194009d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(q0Var2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d0(q0Var2, null), 3, null);
    }
}
