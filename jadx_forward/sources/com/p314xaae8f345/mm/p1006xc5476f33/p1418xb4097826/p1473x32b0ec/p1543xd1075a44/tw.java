package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class tw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 f201446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201447e;

    public tw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uw uwVar) {
        this.f201446d = c14407x4ca0b248;
        this.f201447e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14407x4ca0b248 c14407x4ca0b248 = this.f201446d;
        java.util.LinkedList linkedList = c14407x4ca0b248.f199209g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pw pwVar = linkedList != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pw) linkedList.get(intValue) : null;
        if (pwVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" click posttion = ");
        sb6.append(intValue);
        sb6.append(", reset = -1 ，activityICon:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ow owVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ow) pwVar;
        sb6.append(owVar.f200863a.m75945x2fec8307(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14407x4ca0b248.f199214o, sb6.toString());
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        r45.y53 y53Var = owVar.f200863a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Fk(this.f201447e, null, 4, y53Var.m75945x2fec8307(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.e(12, y53Var.m75945x2fec8307(2), c14407x4ca0b248.getGameAppId());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
