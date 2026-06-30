package r0;

/* loaded from: classes14.dex */
public final class d extends kz5.j implements p0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final r0.d f449495f = new r0.d(r0.u.f449520e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final r0.u f449496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f449497e;

    public d(r0.u node, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        this.f449496d = node;
        this.f449497e = i17;
    }

    public r0.d b(java.lang.Object obj, java.lang.Object obj2) {
        r0.t u17 = this.f449496d.u(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return u17 == null ? this : new r0.d(u17.f449518a, this.f449497e + u17.f449519b);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f449496d.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f449496d.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
