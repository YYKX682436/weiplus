package cc;

/* loaded from: classes14.dex */
public final class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map.Entry f121908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f121909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.h f121910f;

    public g(cc.h hVar, java.util.Iterator it) {
        this.f121910f = hVar;
        this.f121909e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f121909e.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f121909e.next();
        this.f121908d = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.Map.Entry entry = this.f121908d;
        if (!(entry != null)) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        java.util.Collection collection = (java.util.Collection) entry.getValue();
        this.f121909e.remove();
        this.f121910f.f121912e.f121931h -= collection.size();
        collection.clear();
    }
}
