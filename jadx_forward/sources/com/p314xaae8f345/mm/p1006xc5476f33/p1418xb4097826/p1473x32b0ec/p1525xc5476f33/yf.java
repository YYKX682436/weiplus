package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f196724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f196725e;

    public yf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, dk2.zf zfVar) {
        this.f196724d = mgVar;
        this.f196725e = zfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#showStickTopTitleMsg itemView click");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.v1(this.f196724d, this.f196725e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
