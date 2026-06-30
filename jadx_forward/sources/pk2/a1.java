package pk2;

/* loaded from: classes3.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.b1 f437068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437070f;

    public a1(pk2.b1 b1Var, pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f437068d = b1Var;
        this.f437069e = o9Var;
        this.f437070f = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gj gjVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.b1 b1Var = this.f437068d;
        boolean n17 = b1Var.n();
        pk2.o9 o9Var = this.f437069e;
        if (n17) {
            o9Var.j(qo0.b.L4, null);
            this.f437070f.h();
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.D, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.f409887h;
            ml2.d1[] d1VarArr = ml2.d1.f408883d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(6), null, 4, null);
        } else {
            java.lang.Integer num = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num != null) {
                num.intValue();
                jSONObject.put("type", num.intValue());
            }
            jSONObject.put("sub_element", 4);
            jSONObject.put("sub_type", 5);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c19;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar2, 37L, jSONObject.toString(), null, 4, null);
            i95.m c27 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            zy2.zb.T8((zy2.zb) c27, ml2.t1.D, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
            pk2.j9 j9Var = o9Var.f437617g;
            if ((j9Var != null ? j9Var.f437420c : null) == null && j9Var != null) {
                gk2.e eVar = o9Var.f437607b;
                j9Var.f437420c = eVar != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gj(o9Var.f437611d, eVar) : null;
            }
            pk2.j9 j9Var2 = o9Var.f437617g;
            if (j9Var2 != null && (gjVar = j9Var2.f437420c) != null) {
                gjVar.c();
            }
        }
        qk2.f.f(b1Var, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorFastCommentOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
