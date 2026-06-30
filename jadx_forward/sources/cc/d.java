package cc;

/* loaded from: classes14.dex */
public final class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f121895d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Collection f121896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.e f121897f;

    public d(cc.e eVar) {
        this.f121897f = eVar;
        this.f121895d = eVar.f121898f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f121895d.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f121895d.next();
        this.f121896e = (java.util.Collection) entry.getValue();
        java.lang.Object key = entry.getKey();
        java.util.Collection c17 = this.f121897f.f121899g.c(key, (java.util.Collection) entry.getValue());
        int i17 = cc.h0.f121913a;
        return new cc.x(key, c17);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f121895d.remove();
        this.f121897f.f121899g.f121931h -= this.f121896e.size();
        this.f121896e.clear();
    }
}
