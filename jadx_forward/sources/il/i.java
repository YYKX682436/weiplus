package il;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static il.i f373532c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f373533a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f373534b = new java.lang.Object();

    public static il.i a() {
        if (f373532c == null) {
            synchronized (il.i.class) {
                if (f373532c == null) {
                    f373532c = new il.i();
                }
            }
        }
        return f373532c;
    }

    public hl.e b() {
        synchronized (this.f373534b) {
            if (this.f373533a.size() <= 0) {
                return new hl.e();
            }
            return (hl.e) this.f373533a.remove(r1.size() - 1);
        }
    }
}
