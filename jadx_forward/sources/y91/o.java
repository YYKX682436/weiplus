package y91;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f541836a;

    /* renamed from: b, reason: collision with root package name */
    public int f541837b;

    /* renamed from: e, reason: collision with root package name */
    public final y91.m f541840e = new y91.l(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f541838c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f541839d = new java.util.HashMap();

    public o(y91.h hVar) {
    }

    public boolean a() {
        y91.t tVar = y91.s.f541844a;
        tVar.f541849e = null;
        synchronized (tVar) {
            if (tVar.f541845a) {
                tVar.f541845a = false;
                java.net.ServerSocket serverSocket = tVar.f541848d;
                if (serverSocket != null && serverSocket.isClosed()) {
                    try {
                        tVar.f541848d.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        }
        ((java.util.HashMap) this.f541838c).clear();
        ((java.util.HashMap) this.f541839d).clear();
        return true;
    }

    public boolean b() {
        y91.t tVar = y91.s.f541844a;
        tVar.f541849e = this.f541840e;
        synchronized (tVar) {
            if (!tVar.f541845a) {
                tVar.f541845a = true;
                try {
                    java.lang.String b17 = y91.z.b();
                    tVar.f541846b = b17;
                    java.net.ServerSocket serverSocket = new java.net.ServerSocket(0, 32, java.net.InetAddress.getByName(b17));
                    tVar.f541848d = serverSocket;
                    tVar.f541847c = serverSocket.getLocalPort();
                    java.lang.Thread thread = new java.lang.Thread(new y91.r(tVar));
                    thread.setName("DLNA-Server-Thread");
                    thread.start();
                } catch (java.io.IOException unused) {
                }
            }
        }
        this.f541836a = tVar.f541846b;
        this.f541837b = tVar.f541847c;
        return true;
    }

    public final java.lang.String c(java.lang.String str) {
        return "http://" + this.f541836a + ":" + this.f541837b + str;
    }
}
