package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class z8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f186623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186626g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186627h;

    public z8(boolean[] zArr, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, int i17, android.view.View view) {
        this.f186623d = zArr;
        this.f186624e = s0Var;
        this.f186625f = qeVar;
        this.f186626g = i17;
        this.f186627h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        boolean z17;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f186623d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_like", "<FeedLike>");
            sVar.H2("ce_feed_like", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_like");
        }
        in5.s0 s0Var = this.f186624e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        boolean c17 = hc2.o0.c(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186625f;
        if (!c17) {
            qeVar.L1(s0Var, abstractC14490x69736cb5);
            str = "forbid like";
        } else if (qeVar.f185891f.d0()) {
            android.content.Context context = s0Var.f374654e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = activity != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e) activity.findViewById(com.p314xaae8f345.mm.R.id.edo) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15307x329a684e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.w(c15307x329a684e, this.f186624e, abstractC14490x69736cb5.getFeedObject(), null, 0, null, null, 56, null);
            str = "open like in self scene";
        } else {
            qeVar.getClass();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = elapsedRealtime - qeVar.f185895m;
            if (!(41 <= j17 && j17 < 300) || (i17 = qeVar.f185897o) >= 5) {
                qeVar.f185897o = 0;
                z17 = true;
            } else {
                qeVar.f185897o = i17 + 1;
                qeVar.f185895m = elapsedRealtime;
                z17 = false;
            }
            if (z17) {
                qeVar.f185895m = android.os.SystemClock.elapsedRealtime();
                this.f186625f.l0(this.f186624e, 1, false, null, this.f186626g);
                str = "can like other";
            } else {
                str = "can't like other";
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "[onClickLike]:" + s0Var.m8183xf806b362() + " feedId:" + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()) + " res=" + str);
        d92.s sVar2 = d92.k0.f309019e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        java.lang.String a17 = sVar2.a(view, true);
        android.view.View view2 = this.f186627h;
        view2.announceForAccessibility(a17);
        view2.setContentDescription(sVar2.a(view, false));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
