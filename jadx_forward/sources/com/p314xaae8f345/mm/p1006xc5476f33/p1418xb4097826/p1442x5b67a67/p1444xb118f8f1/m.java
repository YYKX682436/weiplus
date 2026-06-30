package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class m implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb2.d f186792b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, zb2.d dVar) {
        this.f186791a = e0Var;
        this.f186792b = dVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186791a;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(e0Var.f186765v));
        r45.qj2 qj2Var = e0Var.f186750d;
        lVarArr[1] = new jz5.l("native_drama_id", pm0.v.u(qj2Var != null ? qj2Var.m75942xfb822ef2(0) : 0L));
        lVarArr[2] = new jz5.l("native_drama_item_num", java.lang.Integer.valueOf(e0Var.f186762s));
        zb2.d dVar = this.f186792b;
        r45.fl5 fl5Var = dVar.f552793d;
        lVarArr[3] = new jz5.l("card_native_drama_id", pm0.v.u(fl5Var != null ? fl5Var.m75942xfb822ef2(0) : 0L));
        lVarArr[4] = new jz5.l("card_region", java.lang.Integer.valueOf(dVar.f552797h));
        return kz5.c1.l(lVarArr);
    }
}
