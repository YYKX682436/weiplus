package d52;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d52.d f308063b;

    /* renamed from: a, reason: collision with root package name */
    public final d52.a f308064a = new d52.n();

    public static d52.d a() {
        if (f308063b == null) {
            synchronized (d52.d.class) {
                if (f308063b == null) {
                    f308063b = new d52.d();
                }
            }
        }
        return f308063b;
    }

    public final void b(d52.b bVar) {
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HellMsgQManager", "sendMainProcess skip, isMainProcStandby=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("key_hell_msg", d52.e.b(bVar).mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, d52.c.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HellMsgQManager", "IPCInvoker.invokeSync err [%s]", e17.toString());
        }
    }

    public void c(int i17) {
        d52.b bVar = new d52.b();
        bVar.f308061a = i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            this.f308064a.a(bVar);
        } else {
            b(bVar);
        }
    }

    public void d(int i17, java.lang.Object obj) {
        d52.b bVar = new d52.b();
        bVar.f308061a = i17;
        bVar.f308062b = obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            this.f308064a.a(bVar);
        } else {
            b(bVar);
        }
    }
}
