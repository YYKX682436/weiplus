package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/w;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class w implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCSyncInvokeTask_OnGetTicketEvent", "invoke OnGetTicketEvent");
        int i17 = bundle != null ? bundle.getInt("error_type", 0) : 0;
        int i18 = bundle != null ? bundle.getInt(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 0) : 0;
        my3.c0 a17 = my3.c0.f414317k.a();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onGetTicketEvent errorType:" + i17 + " errorCode:" + i18);
        if (i18 != 0 && (c27663xee5e94d4 = a17.f414320b) != null) {
            c27663xee5e94d4.m119283x8697a32c(i17, i18, "", r26.i0.m(""));
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
