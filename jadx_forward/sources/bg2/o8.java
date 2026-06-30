package bg2;

/* loaded from: classes2.dex */
public final class o8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x8 f101904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f101905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f101906f;

    public o8(bg2.x8 x8Var, in5.s0 s0Var, so2.h1 h1Var) {
        this.f101904d = x8Var;
        this.f101905e = s0Var;
        this.f101906f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zy2.ra Sj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController$onFocusFeedCenter$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.x8 x8Var = this.f101904d;
        uc2.g gVar = (uc2.g) x8Var.O6(uc2.g.class);
        if (gVar != null) {
            in5.s0 s0Var = this.f101905e;
            so2.h1 h1Var = this.f101906f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ((sb2.l) gVar).f7("7", s0Var, h1Var, view, 1);
        }
        x8Var.getClass();
        android.content.Context context = this.f101905e.f374654e;
        r45.qt2 V6 = (context == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
        java.util.HashMap hashMap = new java.util.HashMap();
        so2.h1 h1Var2 = this.f101906f;
        r45.nw1 m59258xd0557130 = h1Var2.getFeedObject().m59258xd0557130();
        hashMap.put("liveid", pm0.v.u(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L));
        hashMap.put("feedid", pm0.v.u(h1Var2.getFeedObject().getFeedObject().m76784x5db1b11()));
        hashMap.put("delay_time", java.lang.String.valueOf(0L));
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.Y2, hashMap, V6 != null ? V6.m75945x2fec8307(1) : null, V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)).toString() : null, h1Var2.g0(), null, false, 96, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = x8Var.f498674d.f498681h;
        if (abstractC14490x69736cb5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 501);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            v3Var.a(V6, abstractC14490x69736cb5, jSONObject2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController$onFocusFeedCenter$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
