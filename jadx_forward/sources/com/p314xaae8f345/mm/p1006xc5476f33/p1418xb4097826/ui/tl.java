package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class tl extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 {
    public final java.lang.String A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, boolean z17) {
        super(i17, context, z17, false, false, 24, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A = "Finder.FinderShareFeedDetailUI";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.Presenter$buildItemCoverts$1
            /* renamed from: getLikeBuffer */
            private final com.p314xaae8f345.mm.p2495xc50a8b8b.g m60900x8e819aad() {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl.this.f187954d;
                if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c) {
                    return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c) abstractActivityC21394xb3d2c0cf).G;
                }
                return null;
            }

            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 2) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl.this, false, 0, false, 14, null);
                }
                if (type != 4) {
                    hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl.this.A, type);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl tlVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl.this;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh(tlVar.f187962o, tlVar, false, 0, false, 28, null);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public java.lang.String v() {
        return this.A;
    }
}
