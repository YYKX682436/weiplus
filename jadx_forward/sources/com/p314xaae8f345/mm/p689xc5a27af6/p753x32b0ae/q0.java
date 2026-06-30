package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes8.dex */
public class q0 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f148788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148790c;

    public q0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar, java.lang.String str) {
        this.f148790c = iVar;
        this.f148788a = hVar;
        this.f148789b = str;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onError: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f148788a;
        if (hVar != null) {
            hVar.mo25333x2fd71e(this.f148789b, 2);
        }
    }

    @Override // kh0.e
    /* renamed from: onSuccess */
    public void mo45046xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onSuccess: " + str);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = this.f148790c.Bj(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f148788a;
        if (hVar != null) {
            hVar.mo25334x90b54003(Bj, 0);
        }
    }
}
