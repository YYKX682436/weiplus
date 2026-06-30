package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty f195588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar) {
        super(2);
        this.f195588d = tyVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.f195588d;
        if (booleanValue) {
            qo0.c.a(tyVar.f196018p, qo0.b.f446872d2, null, 2, null);
            java.lang.String string = tyVar.A.getString(booleanValue2 ? com.p314xaae8f345.mm.R.C30867xcad56011.e7p : com.p314xaae8f345.mm.R.C30867xcad56011.e7n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.m123883x26a183b(tyVar.R0().getContext(), string, 0).show();
        } else {
            java.lang.String string2 = tyVar.A.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String string3 = tyVar.A.getString(booleanValue2 ? com.p314xaae8f345.mm.R.C30867xcad56011.e7i : com.p314xaae8f345.mm.R.C30867xcad56011.e7o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            db5.t7.m123883x26a183b(tyVar.R0().getContext(), string2.concat(string3), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
