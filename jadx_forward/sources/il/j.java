package il;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static il.j f373535d;

    /* renamed from: a, reason: collision with root package name */
    public volatile java.util.LinkedList f373536a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public volatile java.util.HashMap f373537b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.Object f373538c = new java.lang.Object();

    public static il.j a() {
        if (f373535d == null) {
            synchronized (il.j.class) {
                if (f373535d == null) {
                    f373535d = new il.j();
                }
            }
        }
        return f373535d;
    }

    public hl.d b(java.lang.String str) {
        hl.d dVar;
        synchronized (this.f373538c) {
            if (!this.f373536a.contains(str)) {
                this.f373536a.add(str);
            }
            dVar = (hl.d) this.f373537b.get(str);
            if (dVar == null) {
                dVar = new hl.d(str);
                this.f373537b.put(str, dVar);
            }
        }
        return dVar;
    }

    public int c(java.lang.String str) {
        synchronized (this.f373538c) {
            if (!this.f373536a.contains(str)) {
                return 0;
            }
            hl.d dVar = (hl.d) this.f373537b.get(str);
            if (dVar == null) {
                return 0;
            }
            return dVar.k();
        }
    }

    public boolean d(java.lang.String str) {
        synchronized (this.f373538c) {
            if (!this.f373536a.contains(str)) {
                return false;
            }
            hl.d dVar = (hl.d) this.f373537b.get(str);
            return dVar != null && dVar.k() > 0 && dVar.f363552b;
        }
    }
}
