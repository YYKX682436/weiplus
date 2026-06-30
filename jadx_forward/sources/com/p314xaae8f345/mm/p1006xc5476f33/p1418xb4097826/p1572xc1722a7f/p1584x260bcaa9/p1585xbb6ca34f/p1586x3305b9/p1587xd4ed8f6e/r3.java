package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.h0 f203449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t3 f203450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f203452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.ic f203453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f203454i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203455m;

    public r3(vp2.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t3 t3Var, java.util.List list, int i17, dk2.ic icVar, int i18, in5.s0 s0Var) {
        this.f203449d = h0Var;
        this.f203450e = t3Var;
        this.f203451f = list;
        this.f203452g = i17;
        this.f203453h = icVar;
        this.f203454i = i18;
        this.f203455m = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        dk2.hc hcVar;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NpsSurveyCardConvert$onBindViewHolder$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vp2.h0 h0Var = this.f203449d;
        if (h0Var.f520460g != null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NpsSurveyCardConvert$onBindViewHolder$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t3 t3Var = this.f203450e;
        t3Var.getClass();
        java.util.Iterator it = this.f203451f.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            dk2.ic icVar = null;
            boolean z17 = true;
            int i18 = this.f203452g;
            if (!hasNext) {
                dk2.bc bcVar = h0Var.f520458e;
                if (bcVar != null && (hcVar = bcVar.f314789c) != null && (list = hcVar.f315116e) != null) {
                    icVar = (dk2.ic) kz5.n0.a0(list, i18);
                }
                h0Var.f520460g = icVar;
                yz5.q qVar = t3Var.f203483g;
                int i19 = this.f203454i;
                qVar.mo147xb9724478(this.f203453h, java.lang.Integer.valueOf(i19), h0Var);
                h0Var.getClass();
                in5.s0 holder = this.f203455m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                boolean z18 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                rq2.w wVar = (rq2.w) zVar.a(activityC0065xcd7aa112).a(rq2.w.class);
                java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                dk2.ic icVar2 = h0Var.f520460g;
                jSONObject.putOpt("select_options", (icVar2 == null || (str = icVar2.f315156b) == null) ? "" : r26.i0.t(str, ",", ";", false));
                jSONObject.putOpt("card_index", java.lang.Integer.valueOf(i19));
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                wVar.Q6(m75945x2fec8307, "square_nps_quest_card", r26.i0.t(jSONObject2, ",", ";", false));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NpsSurveyCardConvert$onBindViewHolder$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.Button button = (android.widget.Button) next;
            if (i17 != i18) {
                z17 = false;
            }
            button.setSelected(z17);
            i17 = i27;
        }
    }
}
