package k55;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public k55.h f386004b;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f386006d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f386003a = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final android.content.ServiceConnection f386005c = new k55.j(this);

    public k(android.content.Context context) {
        this.f386006d = context instanceof android.app.Activity ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
    }

    public void a(java.lang.Runnable runnable) {
        java.lang.Thread.currentThread().getId();
        if (c()) {
            runnable.run();
            return;
        }
        if (this.f386006d == null) {
            return;
        }
        ((java.util.LinkedList) this.f386003a).add(runnable);
        android.content.Intent intent = new android.content.Intent(this.f386006d, (java.lang.Class<?>) com.p314xaae8f345.mm.p2501x31c413af.ServiceC19824xc49bdb6f.class);
        android.content.Context context = this.f386006d;
        l85.r0 r0Var = l85.s0.f398741d;
        android.content.ServiceConnection serviceConnection = this.f386005c;
        r0Var.a(intent, serviceConnection);
        context.bindService(intent, serviceConnection, 1);
    }

    public void b(k55.e eVar, java.lang.String str, android.os.Bundle bundle) {
        if (c()) {
            try {
                this.f386004b.Na(eVar.getClass().getName(), str, bundle, eVar);
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteServiceProxy", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
    }

    public boolean c() {
        k55.h hVar = this.f386004b;
        return hVar != null && hVar.asBinder().isBinderAlive();
    }

    public void d() {
        android.content.ServiceConnection serviceConnection;
        if (this.f386004b != null && (serviceConnection = this.f386005c) != null) {
            this.f386006d.unbindService(serviceConnection);
            this.f386004b = null;
        }
        this.f386006d = null;
    }
}
