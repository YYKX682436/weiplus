package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes15.dex */
public class s implements kh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 f167380a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var) {
        this.f167380a = a0Var;
    }

    @Override // kh1.d
    public void a(byte[] bArr, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var = this.f167380a;
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrameL:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5();
        am.un unVar = c5826x579920c5.f136134g;
        unVar.f89643c = "frameRecorded";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = a0Var.f167315d;
        if (c12420xb1146e9c != null) {
            unVar.f89650j = c12420xb1146e9c.f167377p;
        }
        unVar.f89641a = 5;
        byte[] bArr2 = new byte[i17];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i17);
        unVar.f89646f = bArr2;
        unVar.f89647g = z17;
        c5826x579920c5.b(android.os.Looper.getMainLooper());
    }
}
