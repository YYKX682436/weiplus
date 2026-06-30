package cc;

/* loaded from: classes14.dex */
public final class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f40362d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Collection f40363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.e f40364f;

    public d(cc.e eVar) {
        this.f40364f = eVar;
        this.f40362d = eVar.f40365f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40362d.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f40362d.next();
        this.f40363e = (java.util.Collection) entry.getValue();
        java.lang.Object key = entry.getKey();
        java.util.Collection c17 = this.f40364f.f40366g.c(key, (java.util.Collection) entry.getValue());
        int i17 = cc.h0.f40380a;
        return new cc.x(key, c17);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40362d.remove();
        this.f40364f.f40366g.f40398h -= this.f40363e.size();
        this.f40363e.clear();
    }
}
