package x0;

/* loaded from: classes14.dex */
public final class t0 implements java.util.Map.Entry, zz5.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f532480d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f532481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.u0 f532482f;

    public t0(x0.u0 u0Var) {
        this.f532482f = u0Var;
        java.util.Map.Entry entry = u0Var.f532488g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
        this.f532480d = entry.getKey();
        java.util.Map.Entry entry2 = u0Var.f532488g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry2);
        this.f532481e = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f532480d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f532481e;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        x0.u0 u0Var = this.f532482f;
        if (u0Var.f532485d.b().f532435d != u0Var.f532487f) {
            throw new java.util.ConcurrentModificationException();
        }
        java.lang.Object obj2 = this.f532481e;
        u0Var.f532485d.put(this.f532480d, obj);
        this.f532481e = obj;
        return obj2;
    }
}
