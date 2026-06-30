package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class cn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn f188017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar) {
        super(1);
        this.f188017d = hnVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = this.f188017d;
        if (hnVar.f188474p) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errCode ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            sb6.append(", errMsg ");
            sb6.append(fVar != null ? fVar.f152150c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiManageUIContract", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = hnVar.f188467f;
            if (rnVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            ym5.s3 s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8x);
            s3Var.f545050b = -1;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = rnVar.f190463f;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.Q(s3Var);
        }
        return jz5.f0.f384359a;
    }
}
