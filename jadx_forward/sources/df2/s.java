package df2;

/* loaded from: classes3.dex */
public final class s extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312811m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312812n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312811m = "Finder.AnchorMiniViewController";
    }

    public final void Z6() {
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.ra8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312811m, "checkShowMiniViewBtn isAnchor:" + zl2.r4.f555483a.x1() + ", isLiveStarted:" + this.f312812n);
        if (!this.f312812n) {
            if (S6 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/AnchorMiniViewController", "checkShowMiniViewBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/finder/live/controller/AnchorMiniViewController", "checkShowMiniViewBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.D1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 1);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        if (S6 != null) {
            S6.setOnClickListener(new df2.p(this));
        }
        if (S6 != null) {
            if2.d0 d0Var = new if2.d0(S6, this);
            this.f372636i = new df2.q(d0Var);
            d0Var.d(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        this.f312812n = true;
        Z6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        Z6();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
    }
}
