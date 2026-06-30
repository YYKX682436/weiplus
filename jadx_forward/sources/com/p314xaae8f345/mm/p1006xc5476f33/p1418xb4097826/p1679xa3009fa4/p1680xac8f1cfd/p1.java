package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class p1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.s5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f217031d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f217032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217031d = new java.util.LinkedHashMap();
        this.f217032e = new java.util.LinkedHashMap();
    }

    public final void O6(long j17, java.lang.String step, org.json.JSONObject extraData, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(step, "step");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceUIC", "recordTrace feedId=" + pm0.v.u(j17) + " step=" + step + " extraData=" + extraData);
        java.util.Map map = this.f217031d;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n1(j17, step, extraData, j18));
    }

    public final void P6(long j17) {
        java.lang.String str;
        java.util.List list = (java.util.List) this.f217031d.remove(java.lang.Long.valueOf(j17));
        if (list == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i17 = 0;
        int i18 = nyVar != null ? nyVar.f216913n : 0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216642d.a().f216645a.get(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1(j17, i18));
        int i19 = j1Var != null ? j1Var.f216327f : 0;
        if (i19 == 0) {
            str = "None";
        } else if (i19 == 1) {
            str = "Dispatched";
        } else if (i19 == 2) {
            str = "Consumed";
        } else if (i19 == 3) {
            str = "Focused";
        } else if (i19 != 4) {
            str = "Unknown#" + i19;
        } else {
            str = "UnFocused";
        }
        jSONObject.put("status", str);
        long j18 = 0;
        for (java.lang.Object obj : list) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n1) obj;
            long j19 = n1Var.f216780d;
            if (j19 != 0) {
                org.json.JSONObject jSONObject2 = n1Var.f216779c;
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0, i27);
                jSONObject.put(n1Var.f216778b, jSONObject2);
                j18 = j19;
            }
            i17 = i27;
        }
        qc2.b bVar = qc2.b.f443042a;
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        qc2.b.a(bVar, 2, j17, i18, j18, false, "", 0, 0, false, jSONObject3, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.util.HashMap hashMap = new java.util.HashMap(this.f217031d);
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) ((java.util.Map.Entry) it.next()).getKey();
            if (l17 == null || l17.longValue() != 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                P6(l17.longValue());
            }
        }
        hashMap.clear();
    }
}
