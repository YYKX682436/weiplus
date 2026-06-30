package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.v f203497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.le1 f203498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ue1 f203499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203500g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vp2.g f203501h;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.v vVar, r45.le1 le1Var, r45.ue1 ue1Var, in5.s0 s0Var, vp2.g gVar) {
        this.f203497d = vVar;
        this.f203498e = le1Var;
        this.f203499f = ue1Var;
        this.f203500g = s0Var;
        this.f203501h = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.k74 m76504xa819f0c7;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f203498e.C;
        r45.ue1 ue1Var = this.f203499f;
        java.lang.String str = ue1Var.f468828h;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.v vVar = this.f203497d;
        vVar.getClass();
        if (c19786x6a1e2862 != null && (m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7()) != null && (m75945x2fec8307 = m76504xa819f0c7.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        try {
            org.json.JSONObject jSONObject = str2.length() > 0 ? new org.json.JSONObject(str2) : new org.json.JSONObject();
            jSONObject.put("jump_bypass_buffer", str);
            r45.k74 m76504xa819f0c72 = c19786x6a1e2862 != null ? c19786x6a1e2862.m76504xa819f0c7() : null;
            if (m76504xa819f0c72 != null) {
                m76504xa819f0c72.set(2, jSONObject.toString());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f203512g, e17, "addBufferToQuery ", new java.lang.Object[0]);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        in5.s0 s0Var = this.f203500g;
        android.content.Context context = s0Var.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, this.f203501h.f520455e.C);
        ac4Var.set(4, 1);
        c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        vVar.getClass();
        pf5.z zVar = pf5.z.f435481a;
        boolean z17 = context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt("topic_id", vVar.f203510e);
        java.util.LinkedList product_item = ue1Var.f468826f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(product_item, "product_item");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(product_item, 10));
        java.util.Iterator it = product_item.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((r45.te1) it.next()).f467882i));
        }
        jSONObject2.put("product_id_list", kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null));
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject3, ",", ";", false);
        pf5.z zVar2 = pf5.z.f435481a;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a(activityC0065xcd7aa112).a(rq2.w.class);
        if (wVar != null) {
            wVar.Q6(V6.m75945x2fec8307(1), "main_page_topic_card", t17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f203512g, "report click with json ".concat(t17));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
