package tk1;

/* loaded from: classes7.dex */
public class b implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f501426d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tk1.c f501427e;

    public b(tk1.c cVar, tk1.a aVar) {
        this.f501427e = cVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "WebsocketWriteThread";
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.f501426d && !java.lang.Thread.interrupted()) {
            try {
                try {
                    try {
                        try {
                            if (!this.f501427e.f501429f.f490472d.isEmpty()) {
                                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ((java.util.concurrent.LinkedBlockingQueue) this.f501427e.f501429f.f490472d).poll(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                                if (byteBuffer != null) {
                                    this.f501427e.f501432i.write(byteBuffer.array(), 0, byteBuffer.limit());
                                    this.f501427e.f501432i.flush();
                                }
                            }
                        } catch (java.io.IOException e17) {
                            tk1.c cVar = this.f501427e;
                            cVar.getClass();
                            if (e17 instanceof javax.net.ssl.SSLException) {
                                cVar.l(e17);
                            }
                            cVar.f501429f.e();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetWork.WebSocketClient", e17, "[WebsocketWriteThread] run IOException", new java.lang.Object[0]);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
                        }
                    } catch (java.lang.Exception e18) {
                        tk1.c cVar2 = this.f501427e;
                        cVar2.getClass();
                        if (e18 instanceof javax.net.ssl.SSLException) {
                            cVar2.l(e18);
                        }
                        cVar2.f501429f.e();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetWork.WebSocketClient", e18, "[WebsocketWriteThread] run Exception", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
                    try {
                        this.f501427e.f501432i.close();
                    } catch (java.io.IOException unused) {
                    }
                    tk1.c.h(this.f501427e);
                    throw th6;
                }
            } catch (java.lang.InterruptedException unused2) {
                java.util.Iterator it = ((java.util.concurrent.LinkedBlockingQueue) this.f501427e.f501429f.f490472d).iterator();
                while (it.hasNext()) {
                    java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) it.next();
                    this.f501427e.f501432i.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                    this.f501427e.f501432i.flush();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetWork.WebSocketClient", "[WebsocketWriteThread] closeSocket");
        try {
            this.f501427e.f501432i.close();
        } catch (java.io.IOException unused3) {
        }
        tk1.c.h(this.f501427e);
    }
}
