package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 f225964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0) {
        super(3);
        this.f225964d = c16237x250976b0;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a) obj, "<anonymous parameter 0>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a.f225912e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = this.f225964d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0.c(c16237x250976b0, aVar, intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c uiEventListener = c16237x250976b0.getUiEventListener();
        if (!c16237x250976b0.getHasArrivedTop() && uiEventListener != null) {
            uiEventListener.a();
        }
        c16237x250976b0.m65874xd36a0aa0(true);
        return jz5.f0.f384359a;
    }
}
