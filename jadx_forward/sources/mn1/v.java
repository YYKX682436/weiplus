package mn1;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f411422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411423e;

    public v(mn1.w wVar, java.util.Set set, int i17) {
        this.f411422d = set;
        this.f411423e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f411422d.iterator();
        while (it.hasNext()) {
            ((kn1.e) it.next()).a(this.f411423e);
        }
    }
}
