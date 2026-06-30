package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes15.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 f167366a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var) {
        this.f167366a = a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var = this.f167366a;
        if (a0Var.f167328q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "is interrupting");
        } else {
            a0Var.i();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var = this.f167366a;
        if (!a0Var.f167328q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "not call onInterruptionEnd");
            return;
        }
        a0Var.f167328q = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onInterruptionEnd");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89641a = 7;
        unVar.f89643c = "interruptionEnd";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = a0Var.f167315d;
        if (c12420xb1146e9c != null) {
            unVar.f89650j = c12420xb1146e9c.f167377p;
        }
        c5826x579920c5.b(android.os.Looper.getMainLooper());
    }
}
