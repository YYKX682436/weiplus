package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class we implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf f201710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201711b;

    public we(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar, java.lang.String str) {
        this.f201710a = cfVar;
        this.f201711b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = this.f201710a;
        boolean z17 = true;
        cfVar.g0(true);
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        android.content.Context context = cfVar.f199716e;
        if (i17 == 0 && fVar.f152149b == 0) {
            db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddi), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            yz5.p pVar = cfVar.f199536J;
            if (pVar == null) {
                return null;
            }
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, this.f201711b);
            return f0Var;
        }
        java.lang.String str = fVar.f152150c;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        db5.t7.g(context, z17 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddh) : fVar.f152150c);
        return f0Var;
    }
}
