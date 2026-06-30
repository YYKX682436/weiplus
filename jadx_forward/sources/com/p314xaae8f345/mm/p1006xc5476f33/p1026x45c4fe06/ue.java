package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class ue implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f170813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170814e;

    public ue(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str) {
        this.f170813d = o6Var;
        this.f170814e = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11547xd620f8b5 c11547xd620f8b5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11547xd620f8b5) obj;
        java.lang.String str = this.f170814e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f170813d;
        if (c11547xd620f8b5 == null || !c11547xd620f8b5.f156414d) {
            o6Var.K("MigrateRestartPreLaunch for " + str + " failed", new java.lang.Object[0]);
            o6Var.l0();
            return;
        }
        o6Var.K("MigrateRestartPreLaunch for " + str + " succeed, container:" + o6Var.f156329e, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = o6Var.f156329e;
        if (hcVar == null) {
            o6Var.l0();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c11547xd620f8b5.f156415e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11809xbc286be4);
        c11809xbc286be4.f128802b2 = c11547xd620f8b5.f156416f;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.te(hcVar, c11809xbc286be4, o6Var));
    }
}
