package r0;

/* loaded from: classes14.dex */
public final class c extends r0.b implements zz5.e {

    /* renamed from: f, reason: collision with root package name */
    public final r0.i f449493f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f449494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r0.i parentIterator, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentIterator, "parentIterator");
        this.f449493f = parentIterator;
        this.f449494g = obj2;
    }

    @Override // r0.b, java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f449494g;
    }

    @Override // r0.b, java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.f449494g;
        this.f449494g = obj;
        r0.g gVar = this.f449493f.f449512d;
        r0.f fVar = gVar.f449507g;
        java.lang.Object obj3 = this.f449491d;
        if (fVar.containsKey(obj3)) {
            boolean z17 = gVar.f449500f;
            if (!z17) {
                fVar.put(obj3, obj);
            } else {
                if (!z17) {
                    throw new java.util.NoSuchElementException();
                }
                r0.v vVar = gVar.f449498d[gVar.f449499e];
                java.lang.Object obj4 = vVar.f449525d[vVar.f449527f];
                fVar.put(obj3, obj);
                gVar.d(obj4 != null ? obj4.hashCode() : 0, fVar.f449503f, obj4, 0);
            }
            gVar.f449510m = fVar.f449505h;
        }
        return obj2;
    }
}
