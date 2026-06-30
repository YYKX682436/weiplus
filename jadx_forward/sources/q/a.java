package q;

/* loaded from: classes13.dex */
public class a extends q.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f440734h = new java.util.HashMap();

    @Override // q.h
    public q.d d(java.lang.Object obj) {
        return (q.d) this.f440734h.get(obj);
    }

    @Override // q.h
    public java.lang.Object e(java.lang.Object obj, java.lang.Object obj2) {
        q.d d17 = d(obj);
        if (d17 != null) {
            return d17.f440736e;
        }
        java.util.HashMap hashMap = this.f440734h;
        q.d dVar = new q.d(obj, obj2);
        this.f440747g++;
        q.d dVar2 = this.f440745e;
        if (dVar2 == null) {
            this.f440744d = dVar;
            this.f440745e = dVar;
        } else {
            dVar2.f440737f = dVar;
            dVar.f440738g = dVar2;
            this.f440745e = dVar;
        }
        hashMap.put(obj, dVar);
        return null;
    }

    @Override // q.h
    public java.lang.Object g(java.lang.Object obj) {
        java.lang.Object g17 = super.g(obj);
        this.f440734h.remove(obj);
        return g17;
    }
}
