package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class s implements kh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85847a;

    public s(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85847a = a0Var;
    }

    @Override // kh1.d
    public void a(byte[] bArr, int i17, boolean z17) {
        com.tencent.mm.plugin.appbrand.media.record.a0 a0Var = this.f85847a;
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrameL:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8110c = "frameRecorded";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = a0Var.f85782d;
        if (recordParam != null) {
            unVar.f8117j = recordParam.f85844p;
        }
        unVar.f8108a = 5;
        byte[] bArr2 = new byte[i17];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i17);
        unVar.f8113f = bArr2;
        unVar.f8114g = z17;
        operateRecordEvent.b(android.os.Looper.getMainLooper());
    }
}
