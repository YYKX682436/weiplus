package v2;

/* loaded from: classes15.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f514261a = new java.util.HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    public int f514262b = 0;

    public void a(v2.q qVar) {
        this.f514261a.add(qVar);
    }

    public void b() {
        this.f514262b = 1;
        java.util.Iterator it = this.f514261a.iterator();
        while (it.hasNext()) {
            ((v2.q) it.next()).e();
        }
    }

    public void c() {
        this.f514262b = 0;
        java.util.Iterator it = this.f514261a.iterator();
        while (it.hasNext()) {
            ((v2.q) it.next()).c();
        }
    }

    public boolean d() {
        return this.f514262b == 1;
    }

    public void e() {
    }
}
