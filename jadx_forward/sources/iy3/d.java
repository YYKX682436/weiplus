package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String string = data.getString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = data.getString("avatar");
        if (string2 == null) {
            string2 = "";
        }
        my3.c0 a17 = my3.c0.f414317k.a();
        iy3.c cVar = new iy3.c(rVar);
        a17.getClass();
        if (!a17.f414322d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "connectWatch not init");
            return;
        }
        a17.f414328j = false;
        a17.f414327i = string2;
        if (a17.f414323e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "ChannelReady");
            gy3.a aVar = a17.f414319a;
            cVar.a(true, aVar != null ? ((gy3.d) aVar).c() : "");
            return;
        }
        gy3.a aVar2 = a17.f414319a;
        if (aVar2 != null) {
            ((gy3.d) aVar2).d(string);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "connect no ready. wait");
        a17.f414324f = cVar;
        gy3.a aVar3 = a17.f414319a;
        if (aVar3 != null) {
            ((gy3.d) aVar3).b();
        }
    }
}
