package mn1;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f411400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411401e;

    public i(mn1.e eVar, java.util.Set set, int i17) {
        this.f411400d = set;
        this.f411401e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f411400d.iterator();
        while (it.hasNext()) {
            ((kn1.e) it.next()).a(this.f411401e);
        }
    }
}
