package bg2;

/* loaded from: classes2.dex */
public final class o8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x8 f20371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f20372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f20373f;

    public o8(bg2.x8 x8Var, in5.s0 s0Var, so2.h1 h1Var) {
        this.f20371d = x8Var;
        this.f20372e = s0Var;
        this.f20373f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zy2.ra Sj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController$onFocusFeedCenter$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.x8 x8Var = this.f20371d;
        uc2.g gVar = (uc2.g) x8Var.O6(uc2.g.class);
        if (gVar != null) {
            in5.s0 s0Var = this.f20372e;
            so2.h1 h1Var = this.f20373f;
            kotlin.jvm.internal.o.d(view);
            ((sb2.l) gVar).f7("7", s0Var, h1Var, view, 1);
        }
        x8Var.getClass();
        android.content.Context context = this.f20372e.f293121e;
        r45.qt2 V6 = (context == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
        java.util.HashMap hashMap = new java.util.HashMap();
        so2.h1 h1Var2 = this.f20373f;
        r45.nw1 liveInfo = h1Var2.getFeedObject().getLiveInfo();
        hashMap.put("liveid", pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L));
        hashMap.put("feedid", pm0.v.u(h1Var2.getFeedObject().getFeedObject().getId()));
        hashMap.put("delay_time", java.lang.String.valueOf(0L));
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.Y2, hashMap, V6 != null ? V6.getString(1) : null, V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)).toString() : null, h1Var2.g0(), null, false, 96, null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = x8Var.f417141d.f417148h;
        if (baseFinderFeed != null) {
            com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 501);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            v3Var.a(V6, baseFinderFeed, jSONObject2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController$onFocusFeedCenter$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
