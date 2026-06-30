package wf;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf.b f527013d;

    public q(wf.b bVar) {
        this.f527013d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wf.b bVar = this.f527013d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = bVar.f526955p.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17 : m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).V0() : null;
        if (V0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = V0.mo32091x9a3f0ba2();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "requestAppEnterBackground close runtime");
            mo32091x9a3f0ba2.S();
        }
    }
}
