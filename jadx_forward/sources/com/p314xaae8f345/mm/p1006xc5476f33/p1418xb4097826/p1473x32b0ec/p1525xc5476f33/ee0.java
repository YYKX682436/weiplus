package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ee0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 f193936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f193937e;

    public ee0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var, android.view.ViewGroup viewGroup) {
        this.f193936d = le0Var;
        this.f193937e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = this.f193936d;
        ((mm2.c1) le0Var.P0(mm2.c1.class)).R5 = true;
        android.view.ViewGroup viewGroup = this.f193937e;
        if (viewGroup.getAlpha() <= 0.0f || le0Var.f194920p.getAlpha() <= 0.0f) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (viewGroup.getContext().getResources().getConfiguration().orientation == 1) {
            le0Var.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ACTION_POST_LANDSCAPE", "LANDSCAPE_ACTION_CHANGE_VIDEO");
            ((mm2.c1) le0Var.P0(mm2.c1.class)).f410386o2 = new km2.i("EVENT_POST_LANDSCAPE_ACTION", bundle, null);
            le0Var.R0().m57722xf53174f2(((mm2.c1) le0Var.P0(mm2.c1.class)).f410346h2, ((mm2.c1) le0Var.P0(mm2.c1.class)).f410340g2, bundle, null);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409520t, kz5.c1.l(new jz5.l("screen_type", "1")), null, null, null, null, false, 124, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.q1(le0Var, "PORTRAIT_ACTION_CHANGE_VIDEO", null, 2, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409520t, kz5.c1.l(new jz5.l("screen_type", "2")), null, null, null, null, false, 124, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
