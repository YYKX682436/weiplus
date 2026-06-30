package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        super(3);
        this.f202237d = t0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishEditPanelWidget", "createInteractionWish from recommend fail errCode: " + ((java.lang.Integer) obj2) + " errType: " + ((java.lang.Integer) obj3) + " errMsg: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202237d;
        if (str == null) {
            str = t0Var.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oss);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        android.content.Context context = t0Var.f199914d;
        db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575279ow2, str));
        return jz5.f0.f384359a;
    }
}
