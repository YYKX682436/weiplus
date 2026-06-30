package dr0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldr0/d1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class d1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c data = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean z17 = data.f149933d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcLifeTasks", "ipc CheckAliveTask, checkAlive=" + z17);
        if (z17) {
            dr0.t0 t0Var = dr0.t0.f324073k;
            t0Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "#postCheckAlive");
                t0Var.f324075b = 0;
                dr0.q3.j(dr0.q3.f324046t, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, null, 2, null);
            }
        }
        dr0.p1 a17 = dr0.p1.f324022d.a();
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        boolean j17 = a17.j(PROCESS_MAIN);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.ProcLifeTasks", "ipc CheckAliveTask done, isMainProcAlive=" + j17);
        if (j17) {
            try {
                callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.ProcLifeTasks", "ipc onCallback err: " + e17.getMessage());
            }
        }
    }
}
