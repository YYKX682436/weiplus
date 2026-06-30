package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.r f210734d;

    public q(yz5.r rVar) {
        super(-1, null, 2, null);
        this.f210734d = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavStaggeredConfig$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                in5.r rVar;
                if (type == -7) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zh();
                }
                if (type == -5) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
                }
                if (type == -3) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
                }
                if (type != 2) {
                    if (type != 4) {
                        if (type == 9) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q.this;
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk(qVar.f208549a, qVar.f208550b, null, null, 12, null);
                        }
                        if (type != 3001) {
                            if (type != 3002) {
                                yz5.l lVar2 = lVar;
                                return (lVar2 == null || (rVar = (in5.r) lVar2.mo146xb9724478(java.lang.Integer.valueOf(type))) == null) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2() : rVar;
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q qVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q.this;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk(qVar2.f208549a, qVar2.f208550b, qVar2.f210734d, null, 8, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q qVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q.this;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh(qVar3.f208549a, qVar3.f208550b, qVar3.f210734d, null, 8, null);
            }
        };
    }
}
