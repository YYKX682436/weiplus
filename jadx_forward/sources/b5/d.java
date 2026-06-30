package b5;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b5.b f99387d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f99388e;

    /* renamed from: f, reason: collision with root package name */
    public final wa.a f99389f;

    public d(b5.b bVar, java.lang.String str, wa.a aVar) {
        this.f99387d = bVar;
        this.f99388e = str;
        this.f99389f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        try {
            z17 = ((java.lang.Boolean) this.f99389f.get()).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            z17 = true;
        }
        this.f99387d.d(this.f99388e, z17);
    }
}
