package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class uj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21444x679190f4 f292627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f292629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f292630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(com.p314xaae8f345.mm.ui.ActivityC21444x679190f4 activityC21444x679190f4, java.lang.String str, java.util.List list, java.util.List list2) {
        super(1);
        this.f292627d = activityC21444x679190f4;
        this.f292628e = str;
        this.f292629f = list;
        this.f292630g = list2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.ui.hj itemData = (com.p314xaae8f345.mm.ui.hj) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TipUseDuplicateGroupUI", "select: " + itemData.f290419d);
        java.lang.String str = this.f292628e;
        java.util.List list = this.f292629f;
        java.util.List list2 = this.f292630g;
        pm0.v.K(null, new com.p314xaae8f345.mm.ui.tj(str, list, list2, itemData));
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(this.f292627d);
        if (a17 != null && (m67437x4bd5310 = a17.m67437x4bd5310()) != null) {
            ((wi5.n0) m67437x4bd5310.mo140437x75286adb()).F.put("select_num", java.lang.String.valueOf(list2.size()));
            m67437x4bd5310.B3(new wi5.j(itemData.f290419d, false, 7L, 2, null));
        }
        return jz5.f0.f384359a;
    }
}
