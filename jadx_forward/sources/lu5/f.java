package lu5;

/* loaded from: classes14.dex */
public final class f implements oz5.i {

    /* renamed from: e, reason: collision with root package name */
    public static final oz5.j f402996e = new lu5.e();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f402997d;

    public f(boolean z17) {
        this.f402997d = z17;
    }

    @Override // oz5.l
    /* renamed from: fold */
    public java.lang.Object mo7093x300c01(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    /* renamed from: getKey */
    public oz5.j mo7094xb5884f29() {
        return f402996e;
    }

    @Override // oz5.l
    /* renamed from: minusKey */
    public oz5.l mo7095xafa9a7cf(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    /* renamed from: plus */
    public oz5.l mo7096x348d9a(oz5.l context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        return oz5.g.a(this, context);
    }
}
