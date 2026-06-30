package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class v00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f201551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, r45.fr1 fr1Var) {
        super(2);
        this.f201550d = m10Var;
        this.f201551e = fr1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201550d;
        if (booleanValue) {
            m10Var.p(this.f201551e);
        } else {
            android.content.Context context = m10Var.f200532a.getContext();
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = m10Var.f200532a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgq);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            db5.t7.g(context, str);
        }
        return jz5.f0.f384359a;
    }
}
