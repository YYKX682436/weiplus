package s13;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483666d;

    public a(java.lang.String str) {
        this.f483666d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            s13.b.a();
            if (s13.b.f483669c != null) {
                s13.b.f483669c.invoke(null, this.f483666d);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
