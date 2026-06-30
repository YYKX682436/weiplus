package cc;

/* loaded from: classes14.dex */
public abstract class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f40369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f40370e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Collection f40371f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Iterator f40372g = cc.a0.f40359a;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc.r f40373h;

    public f(cc.r rVar) {
        this.f40373h = rVar;
        this.f40369d = rVar.f40397g.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40369d.hasNext() || this.f40372g.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f40372g.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f40369d.next();
            this.f40370e = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.f40371f = collection;
            this.f40372g = collection.iterator();
        }
        return this.f40372g.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f40372g.remove();
        if (this.f40371f.isEmpty()) {
            this.f40369d.remove();
        }
        cc.r rVar = this.f40373h;
        rVar.f40398h--;
    }
}
