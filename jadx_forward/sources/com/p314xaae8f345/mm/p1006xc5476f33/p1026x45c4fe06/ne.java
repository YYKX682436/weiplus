package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class ne implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f167598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f167599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oe f167600f;

    public ne(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oe oeVar) {
        this.f167598d = c11809xbc286be4;
        this.f167599e = c12559xbdae8559;
        this.f167600f = oeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f167598d;
        c11809xbc286be4.f158842v2 = true;
        c11809xbc286be4.S1 = false;
        c11809xbc286be4.f128802b2 = this.f167599e;
        c11809xbc286be4.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = this.f167598d;
        java.lang.String instanceId = this.f167600f.f167778a.u0().f158831k2.f169667d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(instanceId, "instanceId");
        wg1.b bVar = wg1.b.f527245e;
        c11809xbc286be42.f128801a2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1(instanceId, bVar.h());
        this.f167600f.f167778a.z1(this.f167598d, bVar.h());
    }
}
