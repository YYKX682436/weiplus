package cc;

/* loaded from: classes14.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f40384d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f40385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.m f40386f;

    public l(cc.m mVar) {
        this.f40386f = mVar;
        java.util.Collection collection = mVar.f40389e;
        this.f40385e = collection;
        cc.r rVar = mVar.f40392h;
        this.f40384d = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        cc.m mVar = this.f40386f;
        mVar.e();
        if (mVar.f40389e != this.f40385e) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a();
        return this.f40384d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        a();
        return this.f40384d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f40384d.remove();
        cc.m mVar = this.f40386f;
        cc.r rVar = mVar.f40392h;
        rVar.f40398h--;
        mVar.g();
    }

    public l(cc.m mVar, java.util.Iterator it) {
        this.f40386f = mVar;
        this.f40385e = mVar.f40389e;
        this.f40384d = it;
    }
}
