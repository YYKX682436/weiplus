package fp;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346776a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f346777b = 0;

    /* renamed from: c, reason: collision with root package name */
    public android.net.LocalServerSocket f346778c = null;

    public y(java.lang.String str) {
        this.f346776a = str;
    }

    public synchronized void a() {
        if (this.f346778c != null) {
            this.f346777b++;
            return;
        }
        do {
            try {
                this.f346778c = new android.net.LocalServerSocket(this.f346776a + android.os.Process.myUid());
                this.f346777b = this.f346777b + 1;
                break;
            } catch (java.lang.Throwable unused) {
                try {
                    java.lang.Thread.sleep(1L);
                } catch (java.lang.Throwable unused2) {
                }
            }
        } while (this.f346778c != null);
    }

    public synchronized void b() {
        android.net.LocalServerSocket localServerSocket;
        if (this.f346777b == 0) {
            return;
        }
        this.f346777b--;
        if (this.f346777b == 0 && (localServerSocket = this.f346778c) != null) {
            fp.d0.e(localServerSocket);
            this.f346778c = null;
        }
    }

    /* renamed from: finalize */
    public synchronized void m129984xd764dc1e() {
        android.net.LocalServerSocket localServerSocket = this.f346778c;
        if (localServerSocket != null) {
            fp.d0.e(localServerSocket);
            this.f346778c = null;
        }
        super.finalize();
    }
}
