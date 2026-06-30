package fp;

/* loaded from: classes8.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346733a;

    /* renamed from: b, reason: collision with root package name */
    public volatile android.net.LocalServerSocket f346734b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f346735c = 0;

    public h0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("lockName is null or empty.");
        }
        synchronized (this) {
            this.f346733a = str + "-" + android.os.Process.myUid();
        }
    }

    public synchronized boolean a() {
        if (this.f346734b != null) {
            this.f346735c++;
            return true;
        }
        try {
            this.f346734b = new android.net.LocalServerSocket(this.f346733a);
            this.f346735c++;
            return true;
        } catch (java.lang.Throwable unused) {
            this.f346734b = null;
            return false;
        }
    }

    public synchronized void b() {
        if (this.f346735c > 0) {
            this.f346735c--;
        }
        if (this.f346735c == 0 && this.f346734b != null) {
            try {
                this.f346734b.close();
            } catch (java.lang.Throwable unused) {
            }
            this.f346734b = null;
        }
    }
}
