package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ak implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk f199318d;

    public ak(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk dkVar) {
        this.f199318d = dkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk dkVar = this.f199318d;
        android.view.ViewGroup viewGroup = dkVar.f199641d;
        dkVar.f199647m = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.gmn);
        dkVar.f199648n = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.gmm);
        android.view.ViewGroup viewGroup2 = dkVar.f199647m;
        java.lang.Integer valueOf = viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.indexOfChild(dkVar)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            zl2.r4.f555483a.Q2(dkVar);
            android.view.ViewGroup viewGroup3 = dkVar.f199647m;
            if (viewGroup3 != null) {
                viewGroup3.addView(dkVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dkVar.f199643f, "bubbleAttachToParent, have contain child!");
        }
        android.view.ViewGroup viewGroup4 = dkVar.f199647m;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(0);
        }
        android.view.View view = dkVar.f199648n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$bubbleAttachToParent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$bubbleAttachToParent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup5 = dkVar.f199647m;
        if (viewGroup5 != null) {
            viewGroup5.setTag(java.lang.Integer.valueOf(dkVar.getId()));
        }
        dkVar.f199655u = 0;
        dkVar.f199656v = 0;
        dkVar.g();
    }
}
