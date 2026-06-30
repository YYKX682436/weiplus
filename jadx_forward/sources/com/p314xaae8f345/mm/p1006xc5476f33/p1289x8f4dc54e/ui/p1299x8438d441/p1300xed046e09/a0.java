package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f175715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        super(4);
        this.f175715d = rVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String errMsg = (java.lang.String) obj3;
        r45.js5 resp = (r45.js5) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("errType", intValue);
        bundle.putInt("errCode", intValue2);
        bundle.putString("errMsg", errMsg);
        bundle.putByteArray("resp", resp.mo14344x5f01b1f6());
        this.f175715d.a(bundle);
        return jz5.f0.f384359a;
    }
}
