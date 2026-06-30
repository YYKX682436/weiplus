package df2;

/* loaded from: classes3.dex */
public final class tc extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f312965m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f312966n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312965m = new java.util.LinkedHashSet();
        this.f312966n = new java.util.LinkedHashMap();
    }

    public static void Z6(df2.tc tcVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 4) != 0) {
            str2 = null;
        }
        if ((i18 & 8) != 0) {
            str3 = null;
        }
        tcVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (str != null) {
            jSONObject.put("msg_id", str);
        }
        if (str2 != null) {
            jSONObject.put("title_length", str2);
        }
        if (str3 != null) {
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str3);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 50L, t17, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        yg2.b m57691xa0fa63f9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = pluginLayout instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout : null;
        if (k0Var == null || (m57691xa0fa63f9 = k0Var.m57691xa0fa63f9()) == null) {
            return;
        }
        this.f372636i = new df2.kc(this, m57691xa0fa63f9);
        p3325xe03a0797.p3326xc267989b.l.d(m57691xa0fa63f9, null, null, new df2.mc(this, pluginLayout, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        java.util.Map map = this.f312966n;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl) ((java.util.Map.Entry) it.next()).getValue()).dismiss();
        }
        this.f312965m.clear();
        ((java.util.LinkedHashMap) map).clear();
    }
}
