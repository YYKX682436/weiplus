package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj f195954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f195955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj ljVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f195954d = ljVar;
        this.f195955e = hmVar;
        this.f195956f = str;
        this.f195957g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f195955e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj ljVar = this.f195954d;
        if (ljVar != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(ljVar.f194934a, ((mm2.c1) hmVar.P0(mm2.c1.class)).f410385o)) {
                ya2.b2 B1 = hmVar.B1();
                java.lang.String w07 = B1 != null ? B1.w0() : null;
                ya2.b2 B12 = hmVar.B1();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.w1(hmVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj("", w07, B12 != null ? B12.m176700xe5e0d2a0() : null));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.w1(hmVar, ljVar);
            }
        }
        hmVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshSingSongName: songName = ");
        java.lang.String str = this.f195956f;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = hmVar.f194364r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        hmVar.R = str;
        java.lang.String str3 = this.f195957g;
        hmVar.S = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showGiftListContent: " + str3);
        hmVar.K0(0);
        hmVar.f194370x.setVisibility(8);
        android.view.View view = hmVar.f194376z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$showGiftListContent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$showGiftListContent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hmVar.f194369w.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.v1(hmVar);
        p52.h.f433563o = true;
        return jz5.f0.f384359a;
    }
}
