package te2;

/* loaded from: classes3.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l f499498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f499499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f499500c;

    public e(te2.l lVar, yz5.a aVar, yz5.l lVar2) {
        this.f499498a = lVar;
        this.f499499b = aVar;
        this.f499500c = lVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp
    public void a(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errType, "errType");
        java.lang.String str4 = " sendGiftCallback success:" + z17 + "  errCode:" + i17 + "  errType:" + errType + "  rewardGiftId:" + str + "  balance:" + l17 + "  cnt:" + i18 + "  comboId:" + str2 + "  errMsg:" + str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#onVisitorClick" + str4);
        if (z17) {
            qo0.c.a(this.f499498a.f499715g, qo0.b.S4, null, 2, null);
        } else {
            this.f499499b.mo152xb9724478();
            this.f499500c.mo146xb9724478(str4);
        }
    }
}
