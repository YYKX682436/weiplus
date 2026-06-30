package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter {

    /* renamed from: h, reason: collision with root package name */
    public final int f202372h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f202373i;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f202374m;

    /* renamed from: n, reason: collision with root package name */
    public final int f202375n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, long j17, long j18, java.lang.String objectNonceId, java.lang.String anchorUsername, byte[] bArr, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 loader) {
        super(loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f202372h = i17;
        this.f202373i = anchorUsername;
        this.f202374m = bArr;
        this.f202375n = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter$generateAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type == so2.z2.class.hashCode() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.j() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.i();
            }
        }, this.f204084d.m56388xcaeb60d0(), false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.e(this);
        return c22848x6ddd90cf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.g(callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f204084d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 c13868x9104670 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670) abstractC13919x46aff122 : null;
        if (c13868x9104670 != null) {
            android.content.Intent intent = callback.f204089d.getIntent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
            c13868x9104670.m56361x5fd54ec8(intent);
            c13868x9104670.f189014h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.f(this);
        }
    }
}
