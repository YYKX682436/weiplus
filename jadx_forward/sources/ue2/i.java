package ue2;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.o f508354d;

    public i(ue2.o oVar) {
        this.f508354d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupButtonListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ue2.o oVar = this.f508354d;
        oVar.z(2, 2);
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ue2.o.f508360y, "handleCameraSwitch: 切换摄像头");
        if (((mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class)).l7()) {
            db5.t7.h(oVar.getContext(), oVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwj));
            ((mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class)).D8(0);
            oVar.u();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) oVar.mo57658x143f1b92(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
            if (r5Var != null) {
                r5Var.n7();
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 20L, "2", null, 4, null);
        } else {
            db5.t7.h(oVar.getContext(), oVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwj));
            ((mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class)).D8(1);
            ue2.o.t(oVar, false, 1, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.c1 c1Var2 = ml2.c1.f408858e;
            zy2.zb.j5(zbVar2, 20L, "1", null, 4, null);
        }
        oVar.C(((mm2.c1) oVar.m57635xbba4bfc0(mm2.c1.class)).l7());
        oVar.D();
        oVar.E();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout$setupButtonListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
