package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class o00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 f195224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var) {
        super(2);
        this.f195224d = w00Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = this.f195224d;
        if (booleanValue) {
            if (w00Var.M) {
                qo0.c.a(w00Var.f196375p, qo0.b.f446872d2, null, 2, null);
            }
            android.view.ViewGroup viewGroup = w00Var.f446856d;
            java.lang.String string = booleanValue2 ? viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecr) : viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.h(viewGroup.getContext(), string);
        } else {
            java.lang.String string2 = w00Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            db5.t7.g(w00Var.f446856d.getContext(), string2);
        }
        return jz5.f0.f384359a;
    }
}
