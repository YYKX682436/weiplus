package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f185910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185912g;

    public qf(in5.s0 s0Var, so2.h1 h1Var, java.lang.String str, java.lang.String str2) {
        this.f185909d = s0Var;
        this.f185910e = h1Var;
        this.f185911f = str;
        this.f185912g = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f185909d.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class)).S6();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409499m3;
        jz5.l[] lVarArr = new jz5.l[2];
        so2.h1 h1Var = this.f185910e;
        r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
        lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null));
        ml2.a3[] a3VarArr = ml2.a3.f408736d;
        lVarArr[1] = new jz5.l("button_status", java.lang.String.valueOf(0));
        zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), this.f185911f, this.f185912g, h1Var.g0(), null, false, 96, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
