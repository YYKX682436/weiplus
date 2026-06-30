package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_RtosClose", "invoke RtosClose " + valueOf);
        if ((valueOf == null || valueOf.intValue() != 11) && ((valueOf == null || valueOf.intValue() != 9) && (valueOf == null || valueOf.intValue() != 13))) {
            my3.u uVar = my3.c0.f414317k;
            my3.c0 a17 = uVar.a();
            if (a17.f414322d) {
                com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = a17.f414320b;
                if (c27663xee5e94d4 != null) {
                    c27663xee5e94d4.m119270xa144cd0f();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "sleep 1s for sending cancel login");
                java.lang.Thread.sleep(1000L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "already close");
            }
            uVar.a().a();
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
    }
}
