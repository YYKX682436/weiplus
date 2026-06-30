package j7;

/* loaded from: classes13.dex */
public class a implements j7.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f379535a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public boolean f379536b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f379537c;

    @Override // j7.j
    public void a(j7.k kVar) {
        this.f379535a.remove(kVar);
    }

    @Override // j7.j
    public void b(j7.k kVar) {
        this.f379535a.add(kVar);
        if (this.f379537c) {
            kVar.mo15461xac79a11b();
        } else if (this.f379536b) {
            kVar.mo15462xb05099c3();
        } else {
            kVar.mo15463xc39f8281();
        }
    }

    public void c() {
        this.f379537c = true;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379535a)).iterator();
        while (it.hasNext()) {
            ((j7.k) it.next()).mo15461xac79a11b();
        }
    }

    public void d() {
        this.f379536b = true;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379535a)).iterator();
        while (it.hasNext()) {
            ((j7.k) it.next()).mo15462xb05099c3();
        }
    }

    public void e() {
        this.f379536b = false;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379535a)).iterator();
        while (it.hasNext()) {
            ((j7.k) it.next()).mo15463xc39f8281();
        }
    }
}
