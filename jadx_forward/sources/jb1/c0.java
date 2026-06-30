package jb1;

/* loaded from: classes7.dex */
public final class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f380234d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f380234d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.f newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServerManager", "onAuthorizeStateChange, newState: " + newState);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.f.f161596d == newState) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g.f161602a.b(this.f380234d.mo48798x74292566(), this);
            jb1.d0 d0Var = jb1.d0.f380238a;
            jb1.d0.f380242e = true;
            jb1.d0.f380238a.a();
            jb1.d0.f380241d = null;
            jb1.d0.f380242e = false;
        }
    }
}
