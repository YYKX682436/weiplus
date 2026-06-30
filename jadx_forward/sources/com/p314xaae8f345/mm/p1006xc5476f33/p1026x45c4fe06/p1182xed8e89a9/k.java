package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o f169223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 f169224e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var) {
        this.f169223d = oVar;
        this.f169224e = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o oVar = this.f169223d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = oVar.f169229e;
        sj1.b c17 = sj1.l.c(java.lang.String.valueOf(e9Var != null ? java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()) : null));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId:$");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = oVar.f169229e;
        sb6.append(e9Var2 != null ? java.lang.Integer.valueOf(e9Var2.mo50260x9f1221c2()) : null);
        sb6.append(':');
        sb6.append(c17);
        sb6.append(" initTraceBinding v8.isolatePtr:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = this.f169224e;
        sb6.append(l0Var.L());
        sb6.append(" v8.contextPtr:");
        sb6.append(l0Var.G());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        if (c17 != null) {
            c17.d(l0Var.L(), l0Var.G());
        }
    }
}
