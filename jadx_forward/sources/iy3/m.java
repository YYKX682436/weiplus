package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/m;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4;
        gy3.a aVar;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCSyncINvokeTask_OnForegroundChange", "invoke OnForegroundChange");
        my3.c0 a17 = my3.c0.f414317k.a();
        java.lang.Boolean valueOf = c10750x9556b48c != null ? java.lang.Boolean.valueOf(c10750x9556b48c.f149933d) : null;
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "isForeground: " + valueOf);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) && (aVar = a17.f414319a) != null) {
            gy3.d dVar = (gy3.d) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "onForeground");
            dVar.f359095j.a();
            if (!dVar.f359094i && !dVar.f359093h && dVar.e()) {
                dVar.b();
            }
        }
        if (valueOf != null && (c27663xee5e94d4 = a17.f414320b) != null) {
            c27663xee5e94d4.m119275x34e933a8(valueOf.booleanValue());
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
