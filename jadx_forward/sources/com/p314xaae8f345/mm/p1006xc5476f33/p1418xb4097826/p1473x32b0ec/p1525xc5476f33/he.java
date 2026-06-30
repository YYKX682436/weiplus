package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class he extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        super(1);
        this.f194335d = mgVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View chatButton = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatButton, "chatButton");
        if (chatButton.getVisibility() == 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 3);
            this.f194335d.f195036p.mo46557x60d69242(qo0.b.W, bundle);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.vk((ml2.r0) c17, 2, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
