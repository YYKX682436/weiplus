package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class kd extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f255570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f255570d = new java.util.ArrayList();
    }

    public final void O6(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLikeUIC", "markLike: failed", null);
            return;
        }
        java.util.ArrayList arrayList = this.f255570d;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        java.lang.String str2 = "[markLike] statusId = " + str + ", likeList = " + arrayList;
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLikeUIC", str2, null);
    }

    public final void P6(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLikeUIC", "markLike: failed", null);
            return;
        }
        java.util.ArrayList arrayList = this.f255570d;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        }
        java.lang.String str2 = "[markUnLike] statusId = " + str + ", likeList = " + arrayList;
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLikeUIC", str2, null);
    }
}
