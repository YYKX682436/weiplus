package pk2;

/* loaded from: classes3.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437440h;

    public k3(r45.t62 t62Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, pk2.q3 q3Var, pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f437436d = t62Var;
        this.f437437e = c15371xf336b8cc;
        this.f437438f = q3Var;
        this.f437439g = o9Var;
        this.f437440h = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc = this.f437437e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(!c15371xf336b8cc.f292896x ? 1 : 0);
        r45.t62 config = this.f437436d;
        config.set(0, valueOf);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "2");
        jSONObject.put("switch_result", c15371xf336b8cc.f292896x ? "1" : "0");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 33L, jSONObject.toString(), null, 4, null);
        p3325xe03a0797.p3326xc267989b.y0 j17 = this.f437438f.j();
        if (j17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(j17, null, null, new pk2.j3(this.f437439g, this.f437438f, this.f437436d, this.f437440h, null), 3, null);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            hb2.i iVar = hb2.i.f361587e;
            iVar.getClass();
            iVar.n(config, null);
            this.f437440h.h();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
