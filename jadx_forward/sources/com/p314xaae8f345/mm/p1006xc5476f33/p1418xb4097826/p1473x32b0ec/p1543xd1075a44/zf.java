package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class zf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg f202105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar) {
        super(0);
        this.f202104d = str;
        this.f202105e = ggVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f202104d;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gg ggVar = this.f202105e;
        if (z17) {
            str = ggVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ek7);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(ggVar.getContext());
        u1Var.r(true);
        u1Var.g(str);
        u1Var.n(ggVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhn));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
