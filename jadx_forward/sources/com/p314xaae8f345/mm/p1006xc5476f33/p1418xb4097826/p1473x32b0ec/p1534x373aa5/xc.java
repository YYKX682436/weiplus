package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class xc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f198342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 f198343e;

    public xc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d6210) {
        this.f198342d = c14994x9b99c079;
        this.f198343e = c14370x2f9d6210;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$renderView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f198342d;
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        long m75942xfb822ef2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d6210 = this.f198343e;
        r45.qt2 reportObj = c14370x2f9d6210.getReportObj();
        java.lang.String str = (reportObj == null || (m75945x2fec8307 = reportObj.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307;
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1002");
        hashMap.put("liveid", java.lang.String.valueOf(m75942xfb822ef2));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.N1, hashMap, str, null, null, null, false, 120, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndProfileBtnClicked report23059, page_id = " + ((java.lang.String) hashMap.get("page_id")) + ", liveid = " + ((java.lang.String) hashMap.get("liveid")));
        android.content.Context context = c14370x2f9d6210.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.v2 v2Var = ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveid", pm0.v.u(v2Var.f492192n.m75942xfb822ef2(0)));
        jSONObject.put("exposeType", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ml2.x1 x1Var = ml2.x1.f409740n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "abel end page log, 21053, action=7, extra=".concat(jSONObject2));
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        long m59287xa52af937 = c14994x9b99c079.m59287xa52af937();
        r45.nw1 m59258xd05571302 = c14994x9b99c079.m59258xd0557130();
        long m75942xfb822ef22 = m59258xd05571302 != null ? m59258xd05571302.m75942xfb822ef2(0) : -1L;
        java.lang.String m59299x6bf53a6c = c14994x9b99c079.m59299x6bf53a6c();
        long m75939xb282bd08 = c14994x9b99c079.m59258xd0557130() != null ? r14.m75939xb282bd08(1) : -1L;
        ml2.q1 q1Var = ml2.q1.f409345e;
        j0Var.pj(m59287xa52af937, m75942xfb822ef22, null, m59299x6bf53a6c, -1L, m75939xb282bd08, x1Var, "temp_30", jSONObject2, 1, c14994x9b99c079.getFeedObject());
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d("temp_30");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        ml2.i4 i4Var = ml2.i4.f409100o;
        y4Var.getClass();
        y4Var.I = i4Var;
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        ((m30.m) rVar).Bi(b52.b.b());
        android.content.Intent intent = new android.content.Intent();
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.b(intent);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(c14994x9b99c079.getFeedObject());
        intent.putExtra("KEY_FEED_END_PAGE_EXPOSE_TYPE", 2);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(5, c14994x9b99c079.getFeedObject());
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context2 = c14370x2f9d6210.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context2, intent, arrayList2, 0, wk0Var, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$renderView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
