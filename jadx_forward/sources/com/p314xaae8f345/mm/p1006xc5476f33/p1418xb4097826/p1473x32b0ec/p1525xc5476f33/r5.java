package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 f195619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var) {
        super(1);
        this.f195619d = v5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String licenseUrl = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(licenseUrl, "licenseUrl");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", licenseUrl);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var = this.f195619d;
        dk2.xf W0 = v5Var.W0();
        if (W0 != null) {
            android.content.Context context = v5Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((dk2.r4) W0).Y(context, intent, null);
        }
        return jz5.f0.f384359a;
    }
}
