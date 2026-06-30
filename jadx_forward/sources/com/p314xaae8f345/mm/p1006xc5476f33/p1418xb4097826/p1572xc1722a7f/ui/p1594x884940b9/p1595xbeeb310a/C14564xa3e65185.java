package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeLargeLivingItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeLivingItemConvertFactory;", "", "type", "Lin5/r;", "getItemConvert", "screenWidth", "Ljz5/f0;", "updateLivingWidth", "Ldr2/a;", "convertOutsideOperator", "Ldr2/a;", "getConvertOutsideOperator", "()Ldr2/a;", "leftRightMargin", "I", "livingWidth", "Landroid/content/Context;", "context", "commentScene", "<init>", "(Landroid/content/Context;ILdr2/a;)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLargeLivingItemConvertFactory */
/* loaded from: classes2.dex */
public final class C14564xa3e65185 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.AbstractC14565x91bfdb1c {
    private final dr2.a convertOutsideOperator;
    private final int leftRightMargin;
    private int livingWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14564xa3e65185(android.content.Context context, int i17, dr2.a convertOutsideOperator) {
        super(context, i17, 0.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertOutsideOperator, "convertOutsideOperator");
        this.convertOutsideOperator = convertOutsideOperator;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        this.leftRightMargin = a17;
        this.livingWidth = m58447xd6cf2784() - (a17 * 2);
    }

    public final dr2.a getConvertOutsideOperator() {
        return this.convertOutsideOperator;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.AbstractC14565x91bfdb1c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.AbstractC14537xab824cd9, in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        return type == 4 ? new yq2.a(this.livingWidth, 1.3333334f, getOutsideOperator(), this.convertOutsideOperator, new br2.a(this)) : m58405xdc866908();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.AbstractC14565x91bfdb1c
    /* renamed from: updateLivingWidth */
    public void mo58439x213e8414(int i17) {
        this.livingWidth = i17 - (this.leftRightMargin * 2);
    }
}
