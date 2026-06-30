package tp5;

/* loaded from: classes12.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f502707d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f502708e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tp5.c f502709f;

    public e(tp5.c cVar, tp5.d dVar) {
        this.f502709f = cVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f502707d) {
            return false;
        }
        if (!this.f502708e) {
            tp5.c cVar = this.f502709f;
            cVar.f502701f.m107085x3606cc();
            if (cVar.f502701f.m107080xb9a1ffcc()) {
                cVar.close();
                this.f502707d = true;
                return false;
            }
            this.f502708e = true;
        }
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f502707d || !(this.f502708e || hasNext())) {
            throw new java.util.NoSuchElementException();
        }
        tp5.c cVar = this.f502709f;
        java.lang.Object a17 = cVar.f502702g.a(cVar.f502701f);
        this.f502708e = false;
        return a17;
    }
}
