package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f196488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f196490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f196491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, java.lang.String str, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        super(3);
        this.f196488d = hmVar;
        this.f196489e = str;
        this.f196490f = c1163xf1deaba4;
        this.f196491g = i17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f196488d;
        java.util.Set set = hmVar.F1;
        java.lang.String str = this.f196489e;
        set.remove(str);
        java.lang.String str2 = hmVar.f194364r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[doLoadMoreGiftByGroup] callback success:" + booleanValue + ", errCode:" + intValue + ", hasMore:" + booleanValue2 + ", tabName:" + str);
        java.util.Map map = hmVar.H1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f196490f;
        if (booleanValue) {
            map.remove(str);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ul(hmVar, c1163xf1deaba4, this.f196491g, str));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "access$getLoadMoreCooldownUntilMap$p(...)");
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = hmVar.J1;
            map.put(str, java.lang.Long.valueOf(uptimeMillis + j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[doLoadMoreGiftByGroup] fail, enter cooldown for " + j17 + "ms, tabName:" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.Q1(this.f196488d, this.f196489e, false, intValue, 0, 0L, false, 32, null);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vl(c1163xf1deaba4));
        }
        return jz5.f0.f384359a;
    }
}
