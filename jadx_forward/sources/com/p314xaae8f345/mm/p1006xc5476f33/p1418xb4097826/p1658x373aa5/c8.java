package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class c8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f213291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665) {
        super(2);
        this.f213291d = c15276x168ec665;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.Long l17 = (java.lang.Long) obj2;
        yz5.p downloadListener = this.f213291d.getDownloadListener();
        if (downloadListener != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            downloadListener.mo149xb9724478(bool, l17);
        }
        return jz5.f0.f384359a;
    }
}
