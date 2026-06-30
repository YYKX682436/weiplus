package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavConfig$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                in5.r rVar;
                if (type == -7) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zh();
                }
                if (type != 10002) {
                    yz5.l lVar2 = lVar;
                    return (lVar2 == null || (rVar = (in5.r) lVar2.mo146xb9724478(java.lang.Integer.valueOf(type))) == null) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2() : rVar;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.z.this;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qo(zVar.f208549a, zVar.f208550b, zVar.f210734d, null, 8, null);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 c() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context);
    }
}
