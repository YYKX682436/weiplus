package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/k;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class k implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_RtosLogin", "invoke login");
        java.lang.String string = bundle != null ? bundle.getString(dm.i4.f66875xa013b0d5) : null;
        java.lang.String string2 = bundle != null ? bundle.getString("ticket") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new android.os.Bundle();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.IPCASyncInvokeTask_RtosLogin", "ticket is empty");
            if (rVar != null) {
                rVar.a(h0Var.f391656d);
                return;
            }
            return;
        }
        my3.c0 a17 = my3.c0.f414317k.a();
        iy3.j jVar = new iy3.j(h0Var, rVar);
        a17.getClass();
        if (!a17.f414322d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "inited but not init");
            return;
        }
        a17.f414326h = jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onGetOAuthTicket " + string + "  " + string2);
        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = a17.f414320b;
        if (c27663xee5e94d4 != null) {
            c27663xee5e94d4.m119283x8697a32c(0, 0, string, string2 != null ? r26.i0.m(string2) : null);
        }
    }
}
