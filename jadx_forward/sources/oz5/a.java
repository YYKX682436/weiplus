package oz5;

/* loaded from: classes14.dex */
public abstract class a implements oz5.i {
    private final oz5.j key;

    public a(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.key = key;
    }

    @Override // oz5.l
    /* renamed from: fold */
    public <R> R mo7093x300c01(R r17, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return (R) operation.mo149xb9724478(r17, this);
    }

    @Override // oz5.l
    public <E extends oz5.i> E get(oz5.j jVar) {
        return (E) oz5.h.a(this, jVar);
    }

    @Override // oz5.i
    /* renamed from: getKey */
    public oz5.j mo7094xb5884f29() {
        return this.key;
    }

    @Override // oz5.l
    /* renamed from: minusKey */
    public oz5.l mo7095xafa9a7cf(oz5.j jVar) {
        return oz5.h.b(this, jVar);
    }

    @Override // oz5.l
    /* renamed from: plus */
    public oz5.l mo7096x348d9a(oz5.l context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
