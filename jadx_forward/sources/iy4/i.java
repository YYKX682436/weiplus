package iy4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy4/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webwx/model/AutoDownloadAddTaskData;", "", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299 data = (com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IPC addTask received: msgId=");
        long j17 = data.f269491d;
        sb6.append(j17);
        sb6.append(", talker=");
        java.lang.String str = data.f269492e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoDownloadAddTaskIPCTask", sb6.toString());
        iy4.j.f377504a.b(j17, str);
        if (rVar != null) {
            rVar.a(java.lang.Boolean.TRUE);
        }
    }
}
