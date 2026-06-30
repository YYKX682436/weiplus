package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.w f194036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i6 f194037e;

    public f6(cm2.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i6 i6Var) {
        this.f194036d = wVar;
        this.f194037e = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorInviteMicBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cm2.w wVar = this.f194036d;
        if (wVar.f124939v.m75939xb282bd08(2) == 3) {
            ml2.n4 n4Var = ml2.n4.f409292x1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 60");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        } else {
            ml2.n4 n4Var2 = ml2.n4.N;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 37");
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i6 i6Var = this.f194037e;
        if (((mm2.e1) i6Var.f194453e.a(mm2.e1.class)).g7()) {
            r45.ih1 ih1Var = wVar.f124939v;
            i6Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i6Var.f194457i, "requestAudioMic pos: " + ih1Var.m75939xb282bd08(1));
            zl2.r4 r4Var = zl2.r4.f555483a;
            gk2.e eVar = i6Var.f194453e;
            android.content.Context context = i6Var.f194452d;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573358ec4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            if (r4Var.B(context, eVar, string, string2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h6(i6Var, ih1Var))) {
                i6Var.a();
            } else {
                i6Var.b(ih1Var);
            }
        } else {
            r45.ih1 ih1Var2 = wVar.f124939v;
            i6Var.getClass();
            qo0.b bVar = qo0.b.V3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", ih1Var2.m75939xb282bd08(1));
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ih1Var2.m75934xbce7f2f(4);
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", true);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", 4);
            i6Var.f194454f.mo46557x60d69242(bVar, bundle);
            i6Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorInviteMicBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
