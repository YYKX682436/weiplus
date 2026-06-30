package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f194970d;

    public lu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar) {
        this.f194970d = ivVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin$initListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f194970d;
        if (ivVar.f194548q.mo11219xd0598cf8() == 1) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.A;
            ml2.r3 r3Var = ml2.r3.f409433e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        } else if (ivVar.f194548q.mo11219xd0598cf8() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f409068s, "", 0);
        }
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=support/we-coin/protocol/index");
        dk2.xf W0 = ivVar.W0();
        if (W0 != null) {
            android.content.Context context = ivVar.R0().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            dk2.xf.b(W0, context, intent, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin$initListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
