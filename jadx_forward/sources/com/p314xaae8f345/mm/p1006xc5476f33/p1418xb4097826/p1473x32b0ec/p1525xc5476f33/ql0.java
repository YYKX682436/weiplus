package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ql0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 f195557d;

    public ql0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        this.f195557d = km0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWishBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.E1, this.f195557d.v1(), null, null, null, null, false, 124, null);
        int i17 = this.f195557d.f194814r;
        int size = this.f195557d.f194818v.size() - 1;
        if (i17 > size) {
            i17 = size;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) this.f195557d.f194818v.get(i17)).f195958a instanceof r45.zv1;
        ((mm2.f7) this.f195557d.P0(mm2.f7.class)).f410593h.mo7808x76db6cb1(new mm2.a7(true, z17 ? qs5.s.f447999f : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) this.f195557d.f194818v.get(i17)).f195958a instanceof r45.gh6 ? qs5.s.f448000g : qs5.s.f447997d));
        if (z17) {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c18;
            ml2.b4 b4Var = ml2.b4.Z1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWishBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
