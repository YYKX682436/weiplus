package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class l implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f68363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f68364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.m f68365f;

    public l(com.tencent.mm.ipcinvoker.m mVar, int i17, android.os.IBinder iBinder) {
        this.f68365f = mVar;
        this.f68363d = i17;
        this.f68364e = iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        rk0.c.c("IPC.IPCBridgeManager", "binderDied(%d, tid:%d)", java.lang.Integer.valueOf(this.f68363d), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.tencent.mm.ipcinvoker.m mVar = this.f68365f;
        java.lang.String str = mVar.f68368d;
        mVar.f68371g.c(str);
        rk0.c.c("IPC.DeathRecipientImpl", "binderDied(%s)", str);
        if (str != null && str.length() != 0) {
            pk0.a.a(str);
        }
        com.tencent.mm.ipcinvoker.m mVar2 = this.f68365f;
        com.tencent.mm.ipcinvoker.q qVar = mVar2.f68371g;
        java.lang.String str2 = mVar2.f68368d;
        synchronized (qVar.f68393f) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) qVar.f68393f).get(str2);
            if (set != null) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.ipcinvoker.s0) it.next()).a();
                }
            }
        }
        this.f68364e.unlinkToDeath(this, 0);
    }
}
