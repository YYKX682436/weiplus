package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes2.dex */
public final class k extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.ArrayList data, boolean z17, final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar) {
        super(new in5.s() { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoAdapter$Companion$defaultItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 4) {
                    return new yn2.m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e.this);
                }
                switch (type) {
                    case 11000:
                        return new yn2.n();
                    case 11001:
                        return new yn2.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e.this);
                    case 11002:
                        return new yn2.u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e.this);
                    case 11003:
                        return new bo2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e.this);
                    default:
                        hc2.l.a("Finder.MegaVideo.MegaVideoAdapter", type);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
            }
        }, data, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // in5.n0
    public java.lang.String k0(java.lang.Exception e17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            return j5Var.toString();
        }
        return "Feed[" + j5Var + "] is not BaseFinderFeed";
    }

    @Override // in5.n0
    public java.lang.String l0(java.lang.Exception e17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MegaVideo.MegaVideoAdapter", java.lang.String.valueOf(e17.getMessage()));
        return super.l0(e17, i17);
    }
}
