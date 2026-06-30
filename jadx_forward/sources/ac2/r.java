package ac2;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f84585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d f84586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ac2.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d) {
        super(1);
        this.f84584d = tVar;
        this.f84585e = abstractC14490x69736cb5;
        this.f84586f = c15272xcb1f133d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ac2.t tVar = this.f84584d;
        java.lang.String str = tVar.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wait countDownFinish ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f84585e;
        sb6.append(abstractC14490x69736cb5.mo2128x1ed62e84());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        abstractC14490x69736cb5.y1(true);
        this.f84586f.m61970xf664cfe7(null);
        tVar.D = null;
        tVar.E0();
        boolean booleanValue2 = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209251gd).mo141623x754a37bb()).r()).booleanValue();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = tVar.f187954d;
        if (booleanValue2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var2 = tVar.S;
            if ((w2Var2 != null && w2Var2.isShowing()) && !abstractActivityC21394xb3d2c0cf.isDestroyed() && !abstractActivityC21394xb3d2c0cf.isFinishing() && (w2Var = tVar.S) != null) {
                w2Var.dismiss();
            }
            android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f566428ts4);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f566428ts4);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$Presenter", "finishCountDownDialog", "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (booleanValue) {
            tVar.w0(3, 2, abstractC14490x69736cb5);
        } else {
            tVar.w0(1, 2, abstractC14490x69736cb5);
        }
        tVar.T = 0L;
        return jz5.f0.f384359a;
    }
}
