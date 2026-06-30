package cw2;

/* loaded from: classes2.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f305257d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        this.f305257d = c15178x4303ff90;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        r45.mb4 mb4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$refreshRotationBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.f212079x0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f305257d;
        boolean w17 = c15178x4303ff90.w();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fullScreenBtn clicked isFullScreenMode");
        sb6.append(w17);
        sb6.append(" feed=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = c15178x4303ff90.H;
        r45.gn2 gn2Var = null;
        sb6.append((abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject2.m59224xc645db1f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FullSeekBarLayout", sb6.toString());
        android.content.Context context = c15178x4303ff90.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = c15178x4303ff90.H;
        cw2.ba baVar = c15178x4303ff90.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = baVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) baVar : null;
        in5.s0 s0Var = ptVar.f217148p;
        so2.j5 j5Var = s0Var != null ? (so2.j5) s0Var.f374658i : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.b7(ptVar, abstractC14490x69736cb53 != null ? java.lang.Long.valueOf(abstractC14490x69736cb53.mo2128x1ed62e84()) : null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s8(!w17), 2, null);
        if (w17) {
            if (c15196x85976f5f != null) {
                c15196x85976f5f.Y(null, true);
            }
        } else if (c15196x85976f5f != null) {
            if (abstractC14490x69736cb52 != null && (feedObject = abstractC14490x69736cb52.getFeedObject()) != null && (m59264x7efe73ec = feedObject.m59264x7efe73ec()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(m59264x7efe73ec)) != null) {
                gn2Var = (r45.gn2) mb4Var.m75936x14adae67(45);
            }
            c15196x85976f5f.Y(new cw2.t4(gn2Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CROP), true);
        }
        ptVar.Q = c15196x85976f5f;
        if (c15178x4303ff90.isSeekMode && !c15178x4303ff90.isPendingExitMode) {
            c15178x4303ff90.t("fullScreenBtn#clicked");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.C(c15178x4303ff90);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$refreshRotationBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
