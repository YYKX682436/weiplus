package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e2 f163291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e2 e2Var) {
        super(1);
        this.f163291d = e2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12158x43cb8db6 c12158x43cb8db6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12158x43cb8db6 c12158x43cb8db62;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12 imageInfo = (com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        java.util.List<com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1> m85033xb00b5ecb = imageInfo.m85033xb00b5ecb();
        if (m85033xb00b5ecb == null) {
            m85033xb00b5ecb = kz5.p0.f395529d;
        }
        boolean isEmpty = m85033xb00b5ecb.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e2 e2Var = this.f163291d;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "imgInfoList is null");
            c12158x43cb8db6 = e2Var.mResult;
            c12158x43cb8db6.f163151d = -3;
            c12158x43cb8db62 = e2Var.mResult;
            e2Var.m50420x7b736e5c(c12158x43cb8db62);
        } else {
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c2(m85033xb00b5ecb.size(), m85033xb00b5ecb, e2Var));
        }
        return jz5.f0.f384359a;
    }
}
