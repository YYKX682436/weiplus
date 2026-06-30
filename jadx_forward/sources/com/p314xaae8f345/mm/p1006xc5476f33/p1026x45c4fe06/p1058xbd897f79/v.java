package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f159845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y f159846f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y yVar) {
        this.f159844d = o6Var;
        this.f159845e = c0Var;
        this.f159846f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159844d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.t(o6Var);
        if (o6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w8 w8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w8(tVar);
            if (o6Var.T) {
                w8Var.a();
            } else {
                o6Var.G.add(w8Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.y.a(o6Var, this.f159846f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.u(this.f159845e));
    }
}
