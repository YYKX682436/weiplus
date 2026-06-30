package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/s;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class s implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.IPCSyncInvokeTask_HandleVoIPEvent", "invoke HandleVoIPEvent");
        int i17 = bundle != null ? bundle.getInt("voip_status", 0) : 0;
        boolean z17 = bundle != null ? bundle.getBoolean("voip_is_video") : false;
        java.lang.String string = bundle != null ? bundle.getString("voip_talkername") : null;
        java.lang.String string2 = bundle != null ? bundle.getString("voip_nickname") : null;
        java.lang.String string3 = bundle != null ? bundle.getString("voip_avatar") : null;
        boolean z18 = bundle != null ? bundle.getBoolean("voip_is_outcall") : false;
        my3.c0 a17 = my3.c0.f414317k.a();
        if (a17.f414322d) {
            com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = a17.f414320b;
            if (c27663xee5e94d4 != null) {
                c27663xee5e94d4.m119281xc516391(i17, z17, string, string2, string3, z18);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "handleVoIPEvent but not init");
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
