package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class h80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 f200086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.px1 f200087e;

    public h80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 k80Var, r45.px1 px1Var) {
        this.f200086d = k80Var;
        this.f200087e = px1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/SingerListAdapter$SingerViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.O2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "2");
        r45.px1 px1Var = this.f200087e;
        r45.xn1 xn1Var = px1Var.f464985d;
        if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        gVar.h("rank_username", str);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yz5.l lVar = this.f200086d.f200358g;
        if (lVar != null) {
            r45.xn1 live_contact = px1Var.f464985d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(live_contact, "live_contact");
            lVar.mo146xb9724478(live_contact);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/SingerListAdapter$SingerViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
