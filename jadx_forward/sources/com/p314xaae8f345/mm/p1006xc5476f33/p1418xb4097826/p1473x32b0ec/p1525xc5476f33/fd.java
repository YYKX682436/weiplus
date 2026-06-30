package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f194073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar) {
        super(0);
        this.f194072d = str;
        this.f194073e = adVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f194072d;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = this.f194073e;
        if (z17) {
            str = adVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8o);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(adVar.f446856d.getContext());
        u1Var.g(str);
        u1Var.n(adVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhn));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
