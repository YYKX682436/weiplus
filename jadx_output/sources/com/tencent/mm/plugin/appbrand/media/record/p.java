package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class p implements com.tencent.mm.plugin.appbrand.media.record.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85833a;

    public p(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85833a = a0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.media.record.k
    public void a() {
        com.tencent.mm.plugin.appbrand.media.record.a0 a0Var = this.f85833a;
        if (a0Var.f85795q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "is interrupting");
        } else {
            a0Var.i();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.media.record.k
    public void b() {
        com.tencent.mm.plugin.appbrand.media.record.a0 a0Var = this.f85833a;
        if (!a0Var.f85795q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "not call onInterruptionEnd");
            return;
        }
        a0Var.f85795q = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onInterruptionEnd");
        com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent = new com.tencent.mm.autogen.events.OperateRecordEvent();
        am.un unVar = operateRecordEvent.f54601g;
        unVar.f8108a = 7;
        unVar.f8110c = "interruptionEnd";
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = a0Var.f85782d;
        if (recordParam != null) {
            unVar.f8117j = recordParam.f85844p;
        }
        operateRecordEvent.b(android.os.Looper.getMainLooper());
    }
}
