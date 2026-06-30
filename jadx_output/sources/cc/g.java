package cc;

/* loaded from: classes14.dex */
public final class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map.Entry f40375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f40376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.h f40377f;

    public g(cc.h hVar, java.util.Iterator it) {
        this.f40377f = hVar;
        this.f40376e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40376e.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f40376e.next();
        this.f40375d = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.Map.Entry entry = this.f40375d;
        if (!(entry != null)) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        java.util.Collection collection = (java.util.Collection) entry.getValue();
        this.f40376e.remove();
        this.f40377f.f40379e.f40398h -= collection.size();
        collection.clear();
    }
}
