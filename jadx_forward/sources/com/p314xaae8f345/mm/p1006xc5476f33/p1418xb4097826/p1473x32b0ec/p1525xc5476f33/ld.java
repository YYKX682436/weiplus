package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public abstract class ld {
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, int i17) {
        long j17;
        if (adVar.f446856d.getContext() instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && c1Var.f410334f2 == 2) {
                ct2.j jVar = (ct2.j) efVar.i(ct2.j.class);
                j17 = jVar != null ? jVar.f303799g : 0L;
            } else {
                j17 = ((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q;
            }
            sb6.append(j17);
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            java.lang.String sessionId = sb6.toString();
            android.content.Context context = adVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gd gdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gd(adVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "showRechargeFoodsDialog sessionId:".concat(sessionId));
            js4.n nVar = new js4.n();
            nVar.f383076a = i17;
            nVar.f383078c = sessionId;
            nVar.f383088m = true;
            nVar.f383079d = new dk2.m4(activityC1102x9ee2d9f, gdVar);
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(activityC1102x9ee2d9f, nVar);
            if (i17 == 16) {
                boolean z17 = ((mm2.c1) adVar.P0(mm2.c1.class)).f410334f2 == 2;
                long j18 = ((mm2.e1) adVar.P0(mm2.e1.class)).f410516m;
                if (!z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f408813y1, 6, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q);
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("object_id", pm0.v.u(j18));
                ml2.z0.f409863a.a(jSONObject);
                zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.o3[] o3VarArr = ml2.o3.f409306d;
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                ((ml2.j0) zbVar).Wj("watch_live_pay", jSONObject2);
            }
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adVar, "<this>");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderLiveChargePayPluginEx", "payForLive fromClick:" + z17, new java.lang.Object[0]);
        if (z17) {
            ml2.z0.f409863a.c(false, ((mm2.c1) adVar.P0(mm2.c1.class)).f410334f2 == 2, ((mm2.e1) adVar.P0(mm2.e1.class)).f410516m);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(adVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dd(adVar, z17, null), 3, null);
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, long j17) {
        boolean z17;
        ne2.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adVar, "<this>");
        if (((mm2.d1) adVar.P0(mm2.d1.class)).N6()) {
            ((mm2.d1) adVar.P0(mm2.d1.class)).f410485g = true;
        }
        adVar.x1(false);
        mm2.g0 g0Var = (mm2.g0) adVar.P0(mm2.g0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before setPurchased true,");
        cm2.a aVar = cm2.a.f124861a;
        sb6.append(aVar.y(((mm2.e1) g0Var.m147920xbba4bfc0(mm2.e1.class)).f410521r));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", sb6.toString());
        r45.o52 P6 = g0Var.P6();
        if (P6 != null) {
            P6.set(1, java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", "after setPurchased true," + aVar.y(((mm2.e1) g0Var.m147920xbba4bfc0(mm2.e1.class)).f410521r));
        db5.t7.i(adVar.f446856d.getContext(), adVar.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_5), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
        df2.j0 j0Var = (df2.j0) adVar.U0(df2.j0.class);
        if (j0Var != null && (kVar = j0Var.f311974n) != null) {
            kVar.d(((mm2.e1) adVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), true, true);
        }
        rl2.d dVar = (rl2.d) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj();
        if (!dVar.f478723f) {
            dVar.z0();
        }
        rl2.c cVar = (rl2.c) dVar.f478724g.get(java.lang.Long.valueOf(j17));
        if (cVar != null) {
            cVar.f478720d = 1;
            cVar.f478721e = 0;
        }
        java.lang.Object obj = dVar.f478724g.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dVar.P0(j17, (rl2.c) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeInfoStorage", "setPayForLive liveId:" + j17 + ",cache size:" + dVar.f478724g.m77804x35e001());
        qo0.c.a(adVar.f193393p, qo0.b.W4, null, 2, null);
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        if (e1Var != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
            am.ia iaVar = c5445x963cab3.f135785g;
            iaVar.f88451a = m75942xfb822ef2;
            iaVar.f88452b = 21;
            z17 = true;
            iaVar.f88454d = 1;
            c5445x963cab3.e();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            long m75942xfb822ef22 = e1Var.f410521r.m75942xfb822ef2(0);
            am.ia iaVar2 = c5445x963cab32.f135785g;
            iaVar2.f88451a = m75942xfb822ef22;
            iaVar2.f88452b = 28;
            iaVar2.f88454d = 1;
            c5445x963cab32.e();
        } else {
            z17 = true;
        }
        adVar.K0(8);
        int i17 = adVar.A;
        boolean z18 = ((mm2.c1) adVar.P0(mm2.c1.class)).f410334f2 == 2 ? z17 : false;
        long j18 = ((mm2.e1) adVar.P0(mm2.e1.class)).f410516m;
        ct2.j jVar = (ct2.j) adVar.P0(ct2.j.class);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j19 = jVar.f303799g;
        long j27 = (j19 <= 0 || j19 >= elapsedRealtime) ? 0L : elapsedRealtime - j19;
        int i18 = ((ct2.j) adVar.P0(ct2.j.class)).f303806q;
        if (!z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f408813y1, 2, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(j18));
        jSONObject.put("amount", i17);
        jSONObject.put("duration", j27 <= 0 ? java.lang.Integer.valueOf(i18) : java.lang.Long.valueOf(j27));
        ml2.z0.f409863a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f409306d;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj("pay_live_record", jSONObject2);
    }
}
