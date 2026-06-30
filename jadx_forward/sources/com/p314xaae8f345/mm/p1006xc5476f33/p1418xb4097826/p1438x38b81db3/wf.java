package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f186404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f186406f;

    public wf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, in5.s0 s0Var, so2.h1 h1Var) {
        this.f186404d = zfVar;
        this.f186405e = s0Var;
        this.f186406f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshRealNameRecommendLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f186404d;
        zfVar.getClass();
        in5.s0 s0Var = this.f186405e;
        android.content.Context context = s0Var.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = activity != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e) activity.findViewById(com.p314xaae8f345.mm.R.id.tk9) : null;
        if (c15307x329a684e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "lazy init live like drawer");
            c15307x329a684e = zfVar.f185891f.W3();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e2 = c15307x329a684e;
        if (c15307x329a684e2 != null) {
            in5.s0 s0Var2 = this.f186405e;
            so2.h1 h1Var = this.f186406f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.w(c15307x329a684e2, s0Var2, h1Var.getFeedObject(), h1Var.getLikeBuffer(), zfVar.R(s0Var), null, null, 48, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshRealNameRecommendLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
