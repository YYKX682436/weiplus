package op4;

/* loaded from: classes10.dex */
public final class b extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce f428798e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f428799f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f428798e = pluginLayout;
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8();
        this.f428824d = c6758x9af036f8;
        c6758x9af036f8.f140839j = c6758x9af036f8.b("isSlowMotion", "", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f82 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        if (c6758x9af036f82 == null) {
            return;
        }
        c6758x9af036f82.f140835f = c6758x9af036f82.b("ExtraInfo", "", true);
    }

    @Override // op4.k
    public void d() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f8 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        if (c6758x9af036f8 != null) {
            c6758x9af036f8.f140849t = 1L;
        }
        j();
    }

    @Override // op4.k
    public java.lang.String g() {
        return "19904";
    }

    public final void j() {
        rm5.v vVar;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f8 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = this.f428798e;
        if (c6758x9af036f8 != null) {
            bp4.e4 e4Var = (bp4.e4) abstractC17010x26b2d1ce.j(bp4.e4.class);
            c6758x9af036f8.f140847r = (e4Var == null || (c18833x82cf22d = e4Var.f104693h) == null) ? 0L : c18833x82cf22d.getScrollCount();
        }
        lp4.u uVar = (lp4.u) abstractC17010x26b2d1ce.j(lp4.u.class);
        if (uVar != null && (vVar = uVar.f401962h) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 a17 = np4.a.a(vVar);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f82 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f82 != null) {
                gp4.j jVar = (gp4.j) abstractC17010x26b2d1ce.j(gp4.j.class);
                c6758x9af036f82.f140852w = c6758x9af036f82.b("TextInfo", jVar != null ? jVar.M(a17.m(), false) : null, true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f83 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f83 != null) {
                gp4.j jVar2 = (gp4.j) abstractC17010x26b2d1ce.j(gp4.j.class);
                c6758x9af036f83.f140853x = c6758x9af036f83.b("EmojiInfo", jVar2 != null ? jVar2.L(a17.m(), false) : null, true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f84 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f84 != null) {
                c6758x9af036f84.f140854y = c6758x9af036f84.b("TransitionInfo", a17.o(), true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f85 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f85 != null) {
                c6758x9af036f85.f140855z = c6758x9af036f85.b("TrSpeedInfo", a17.n(), true);
            }
            java.util.ArrayList arrayList = a17.f257130c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257159k);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it6.next()).f37766xd5250246 ? 1 : 0));
            }
            java.lang.String g07 = kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                arrayList4.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it7.next()).f37769x2a5f0245)));
            }
            java.lang.String g08 = kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList5.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it8.next()).f37767xaa09dada)));
            }
            java.lang.String g09 = kz5.n0.g0(arrayList5, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                arrayList6.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it9.next()).f37763xebe5543b));
            }
            java.lang.String g010 = kz5.n0.g0(arrayList6, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                arrayList7.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it10.next()).f37768x712595e5));
            }
            java.lang.String g011 = kz5.n0.g0(arrayList7, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it11 = arrayList2.iterator();
            while (it11.hasNext()) {
                arrayList8.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it11.next()).f37762xd5b83c7d));
            }
            java.lang.String g012 = kz5.n0.g0(arrayList8, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it12 = arrayList2.iterator();
            while (it12.hasNext()) {
                arrayList9.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it12.next()).f37764x7935d5a1));
            }
            java.lang.String g013 = kz5.n0.g0(arrayList9, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it13 = arrayList2.iterator();
            while (it13.hasNext()) {
                arrayList10.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it13.next()).f37765x82a6880e));
            }
            java.lang.String g014 = kz5.n0.g0(arrayList10, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList11 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it14 = arrayList2.iterator();
            while (it14.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem editItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it14.next();
                java.util.ArrayList arrayList12 = arrayList2;
                java.lang.String str = g08;
                arrayList11.add(java.lang.Integer.valueOf(editItem.f37769x2a5f0245 < editItem.f37767xaa09dada ? 1 : 0));
                arrayList2 = arrayList12;
                g08 = str;
            }
            java.util.ArrayList arrayList13 = arrayList2;
            java.lang.String str2 = g08;
            java.lang.String g015 = kz5.n0.g0(arrayList11, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList14 = new java.util.ArrayList(kz5.d0.q(arrayList13, 10));
            java.util.Iterator it15 = arrayList13.iterator();
            while (it15.hasNext()) {
                arrayList14.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem) it15.next()).f37770x368f3a));
            }
            java.lang.String g016 = kz5.n0.g0(arrayList14, "#", null, null, 0, null, null, 62, null);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f86 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f86 == null) {
                z17 = true;
            } else {
                z17 = true;
                c6758x9af036f86.f140836g = c6758x9af036f86.b("isBeauty", g07, true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f87 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f87 != null) {
                c6758x9af036f87.f140837h = c6758x9af036f87.b("targetDuration", str2, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f88 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f88 != null) {
                c6758x9af036f88.f140838i = c6758x9af036f88.b("originDuration", g09, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f89 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f89 != null) {
                c6758x9af036f89.f140840k = c6758x9af036f89.b("dragCount", g010, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f810 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f810 != null) {
                c6758x9af036f810.f140841l = c6758x9af036f810.b("scaleCount", g011, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f811 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f811 != null) {
                c6758x9af036f811.f140842m = c6758x9af036f811.b("clickEditCount", g012, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f812 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f812 != null) {
                c6758x9af036f812.f140843n = c6758x9af036f812.b("durationCutCount", g013, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f813 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f813 != null) {
                c6758x9af036f813.f140844o = c6758x9af036f813.b("durationScrollCount", g014, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f814 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f814 != null) {
                c6758x9af036f814.f140845p = c6758x9af036f814.b("isDurationCut", g015, z17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f815 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f815 != null) {
                c6758x9af036f815.f140850u = c6758x9af036f815.b("VideoType", g016, z17);
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f816 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        if (c6758x9af036f816 != null) {
            cp4.r rVar = (cp4.r) abstractC17010x26b2d1ce.j(cp4.r.class);
            c6758x9af036f816.f140851v = c6758x9af036f816.b("CaptionInfo", rVar != null ? rVar.F() : null, true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f817 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        if (c6758x9af036f817 != null) {
            c6758x9af036f817.D = 101L;
        }
        boolean z18 = this.f428799f;
        java.util.HashMap hashMap = so4.g.f492316h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("count", hashMap.size());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Collection<android.util.Pair> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (android.util.Pair pair : values) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pair.first);
            sb6.append('#');
            stringBuffer.append(sb6.toString());
        }
        jSONObject.put("labelList", stringBuffer);
        jSONObject.put("enable", z18 ? 1 : 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f818 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        if (c6758x9af036f818 != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6758x9af036f818.A = c6758x9af036f818.b("FilterInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        }
        java.lang.String i17 = i();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("filterInfo:");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f819 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        sb7.append(c6758x9af036f819 != null ? c6758x9af036f819.A : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i17, sb7.toString());
        h();
        this.f428824d = null;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f820 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8();
        this.f428824d = c6758x9af036f820;
        c6758x9af036f820.f140839j = c6758x9af036f820.b("isSlowMotion", "", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f821 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
        if (c6758x9af036f821 == null) {
            return;
        }
        c6758x9af036f821.f140835f = c6758x9af036f821.b("ExtraInfo", "", true);
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 64) {
            if (ordinal != 144) {
                return;
            }
            this.f428799f = bundle != null ? bundle.getBoolean("PARAM_1_BOOLEAN", false) : false;
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8 c6758x9af036f8 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6758x9af036f8) this.f428824d;
            if (c6758x9af036f8 != null) {
                c6758x9af036f8.f140849t = 2L;
            }
            j();
        }
    }
}
