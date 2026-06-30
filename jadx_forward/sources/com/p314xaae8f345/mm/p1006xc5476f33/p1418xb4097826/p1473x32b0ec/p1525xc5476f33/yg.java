package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ah f196727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ah ahVar) {
        super(3);
        this.f196727d = ahVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.content.Context context = (android.content.Context) obj;
        android.content.Intent intent = (android.content.Intent) obj2;
        java.lang.Integer num = (java.lang.Integer) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dk2.xf W0 = this.f196727d.W0();
        if (W0 != null) {
            ((dk2.r4) W0).Y(context, intent, num);
        }
        return jz5.f0.f384359a;
    }
}
