package df2;

/* loaded from: classes3.dex */
public final class kw extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312136m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f312137n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f312138o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f312139p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312136m = "LiveVisitorGuideController";
        this.f312137n = new java.util.LinkedHashMap();
        this.f312138o = new java.util.LinkedHashSet();
        this.f312139p = jz5.h.b(new df2.dw(this));
    }

    public final boolean Z6() {
        jf2.k0 k0Var = (jf2.k0) m56789x25fe639c(jf2.k0.class);
        return k0Var != null && k0Var.f7(20);
    }

    public final void a7(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (!zl2.r4.f555483a.o2()) {
            jSONObject.put("pos", 1);
        } else if (Z6()) {
            jSONObject.put("pos", 3);
        } else {
            jSONObject.put("pos", 2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408817z2, jSONObject2, 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        yg2.b m57691xa0fa63f9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = pluginLayout instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout : null;
        if (k0Var != null && (m57691xa0fa63f9 = k0Var.m57691xa0fa63f9()) != null) {
            this.f372636i = new df2.cw(this, m57691xa0fa63f9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout;
        ((mm2.x6) m56788xbba4bfc0(mm2.x6.class)).f411079f.mo7806x9d92d11c(k0Var2, new df2.ew(this));
        ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410330e4.mo7806x9d92d11c(k0Var2, df2.fw.f311704d);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        java.util.Map map = this.f312137n;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl) ((java.util.Map.Entry) it.next()).getValue()).dismiss();
        }
        this.f312138o.clear();
        ((java.util.LinkedHashMap) map).clear();
    }
}
