package q;

/* loaded from: classes13.dex */
public abstract class f implements java.util.Iterator, q.g {

    /* renamed from: d, reason: collision with root package name */
    public q.d f440742d;

    /* renamed from: e, reason: collision with root package name */
    public q.d f440743e;

    public f(q.d dVar, q.d dVar2) {
        this.f440742d = dVar2;
        this.f440743e = dVar;
    }

    @Override // q.g
    public void a(q.d dVar) {
        q.d dVar2 = null;
        if (this.f440742d == dVar && dVar == this.f440743e) {
            this.f440743e = null;
            this.f440742d = null;
        }
        q.d dVar3 = this.f440742d;
        if (dVar3 == dVar) {
            this.f440742d = b(dVar3);
        }
        q.d dVar4 = this.f440743e;
        if (dVar4 == dVar) {
            q.d dVar5 = this.f440742d;
            if (dVar4 != dVar5 && dVar5 != null) {
                dVar2 = c(dVar4);
            }
            this.f440743e = dVar2;
        }
    }

    public abstract q.d b(q.d dVar);

    public abstract q.d c(q.d dVar);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440743e != null;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        q.d dVar = this.f440743e;
        q.d dVar2 = this.f440742d;
        this.f440743e = (dVar == dVar2 || dVar2 == null) ? null : c(dVar);
        return dVar;
    }
}
