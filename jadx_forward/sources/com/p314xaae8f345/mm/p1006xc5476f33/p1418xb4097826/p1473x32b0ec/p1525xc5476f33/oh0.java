package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oh0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 f195288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var) {
        super(3);
        this.f195288d = th0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 fromScene = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String giftId = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var = this.f195288d;
        if (booleanValue && !kz5.z.G(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193951h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193953m}, fromScene)) {
            th0Var.x1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aj ajVar = th0Var.f195938s;
            if (ajVar != null) {
                ajVar.c(true);
            }
        }
        if (booleanValue) {
            qo0.c cVar = th0Var.f194858g;
            qo0.b bVar = qo0.b.f446862a5;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_FAN_CLUB_JOIN_GIFT_ID", giftId);
            cVar.mo46557x60d69242(bVar, bundle);
        } else {
            qo0.c.a(th0Var.f194858g, qo0.b.f446866b5, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
