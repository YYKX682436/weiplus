package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Bundle f68339e;

    /* renamed from: d, reason: collision with root package name */
    public lk0.f f68340d;

    static {
        android.os.Bundle bundle = new android.os.Bundle();
        f68339e = bundle;
        bundle.putBoolean("__command_release_ref", true);
    }

    public d(lk0.f fVar) {
        this.f68340d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            rk0.c.c("IPC.IPCInvokeCallbackProxy", "notify release ref of callback(%s).", java.lang.Integer.valueOf(this.f68340d.hashCode()));
            this.f68340d.f(f68339e);
            lk0.f fVar = this.f68340d;
            if (fVar == null) {
                java.util.Set set = pk0.a.f355413a;
            } else {
                java.util.Set set2 = pk0.a.f355413a;
                synchronized (set2) {
                    ((java.util.HashSet) set2).remove(fVar);
                }
            }
            this.f68340d = null;
        } catch (android.os.RemoteException e17) {
            rk0.c.b("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s", android.util.Log.getStackTraceString(e17));
        } catch (java.lang.Exception e18) {
            rk0.c.b("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s\n %s", e18.getMessage(), android.util.Log.getStackTraceString(e18));
        }
    }
}
