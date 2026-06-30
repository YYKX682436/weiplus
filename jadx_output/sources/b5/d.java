package b5;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b5.b f17854d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f17855e;

    /* renamed from: f, reason: collision with root package name */
    public final wa.a f17856f;

    public d(b5.b bVar, java.lang.String str, wa.a aVar) {
        this.f17854d = bVar;
        this.f17855e = str;
        this.f17856f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        try {
            z17 = ((java.lang.Boolean) this.f17856f.get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            z17 = true;
        }
        this.f17854d.d(this.f17855e, z17);
    }
}
