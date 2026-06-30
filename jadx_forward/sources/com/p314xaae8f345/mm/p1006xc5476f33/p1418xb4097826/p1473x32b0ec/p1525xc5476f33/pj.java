package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class pj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f195427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f195429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, int i17, boolean z17) {
        super(0);
        this.f195427d = hmVar;
        this.f195428e = i17;
        this.f195429f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f195427d;
        java.lang.String str = hmVar.f194364r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGiftListFromCgi resule,:");
        int i17 = this.f195428e;
        sb6.append(i17);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
        android.view.View view = hmVar.f194376z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$getGiftListFromCgi$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$getGiftListFromCgi$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f195429f) {
            jz5.l C1 = hmVar.C1();
            hmVar.V1((java.util.List) C1.f384366d, (java.util.LinkedHashMap) C1.f384367e);
        } else {
            hmVar.f194370x.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(hmVar.f194364r, "getGiftListFromCgi fail,:" + i17 + '!');
        }
        return jz5.f0.f384359a;
    }
}
