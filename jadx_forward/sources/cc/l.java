package cc;

/* loaded from: classes14.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f121917d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f121918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.m f121919f;

    public l(cc.m mVar) {
        this.f121919f = mVar;
        java.util.Collection collection = mVar.f121922e;
        this.f121918e = collection;
        cc.r rVar = mVar.f121925h;
        this.f121917d = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        cc.m mVar = this.f121919f;
        mVar.e();
        if (mVar.f121922e != this.f121918e) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a();
        return this.f121917d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        a();
        return this.f121917d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f121917d.remove();
        cc.m mVar = this.f121919f;
        cc.r rVar = mVar.f121925h;
        rVar.f121931h--;
        mVar.g();
    }

    public l(cc.m mVar, java.util.Iterator it) {
        this.f121919f = mVar;
        this.f121918e = mVar.f121922e;
        this.f121917d = it;
    }
}
