package cc;

/* loaded from: classes14.dex */
public abstract class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f121902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f121903e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Collection f121904f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Iterator f121905g = cc.a0.f121892a;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc.r f121906h;

    public f(cc.r rVar) {
        this.f121906h = rVar;
        this.f121902d = rVar.f121930g.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f121902d.hasNext() || this.f121905g.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f121905g.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f121902d.next();
            this.f121903e = entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.f121904f = collection;
            this.f121905g = collection.iterator();
        }
        return this.f121905g.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f121905g.remove();
        if (this.f121904f.isEmpty()) {
            this.f121902d.remove();
        }
        cc.r rVar = this.f121906h;
        rVar.f121931h--;
    }
}
