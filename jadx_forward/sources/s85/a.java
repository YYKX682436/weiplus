package s85;

/* loaded from: classes4.dex */
public class a implements s85.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f486435d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f486436e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f486438g = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashSet f486437f = new java.util.HashSet();

    public a(java.lang.String str, java.lang.Object obj) {
        this.f486435d = str;
        this.f486436e = obj;
    }

    public final void b(s85.b bVar) {
        boolean add;
        synchronized (this.f486438g) {
            add = this.f486437f.add(bVar);
        }
        if (add) {
            c(bVar);
        }
    }

    public void c(s85.b bVar) {
    }

    public void d(s85.b bVar) {
    }

    public final void e(s85.b bVar) {
        boolean remove;
        synchronized (this.f486438g) {
            remove = this.f486437f.remove(bVar);
        }
        if (remove) {
            d(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(java.lang.Object obj) {
        java.lang.Object obj2 = this.f486436e;
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return;
        }
        this.f486436e = obj;
        synchronized (this.f486438g) {
            java.util.Iterator it = this.f486437f.iterator();
            while (it.hasNext()) {
                ((s85.b) it.next()).a(this, obj);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m164118x9616526c() {
        return "Status: " + this.f486435d;
    }
}
