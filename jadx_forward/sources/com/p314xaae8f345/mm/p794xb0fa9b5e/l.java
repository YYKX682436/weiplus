package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class l implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f149897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.m f149898f;

    public l(com.p314xaae8f345.mm.p794xb0fa9b5e.m mVar, int i17, android.os.IBinder iBinder) {
        this.f149898f = mVar;
        this.f149896d = i17;
        this.f149897e = iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        rk0.c.c("IPC.IPCBridgeManager", "binderDied(%d, tid:%d)", java.lang.Integer.valueOf(this.f149896d), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.p314xaae8f345.mm.p794xb0fa9b5e.m mVar = this.f149898f;
        java.lang.String str = mVar.f149901d;
        mVar.f149904g.c(str);
        rk0.c.c("IPC.DeathRecipientImpl", "binderDied(%s)", str);
        if (str != null && str.length() != 0) {
            pk0.a.a(str);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.m mVar2 = this.f149898f;
        com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar = mVar2.f149904g;
        java.lang.String str2 = mVar2.f149901d;
        synchronized (qVar.f149926f) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) qVar.f149926f).get(str2);
            if (set != null) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p794xb0fa9b5e.s0) it.next()).a();
                }
            }
        }
        this.f149897e.unlinkToDeath(this, 0);
    }
}
