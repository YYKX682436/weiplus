package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class p90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f217072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f217073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f217072d = context;
        this.f217073e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int f206440z = it.getF206440z();
        android.content.Context context = this.f217072d;
        if (f206440z == (context != null ? context.hashCode() : -1) && (it.getIsViewFocused() || it.getF206434t())) {
            this.f217073e.f391656d = it;
        }
        return java.lang.Boolean.FALSE;
    }
}
