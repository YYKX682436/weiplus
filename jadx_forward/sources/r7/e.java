package r7;

/* loaded from: classes13.dex */
public final class e implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final r7.d f474602a;

    /* renamed from: b, reason: collision with root package name */
    public final r7.g f474603b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.e f474604c;

    public e(m3.e eVar, r7.d dVar, r7.g gVar) {
        this.f474604c = eVar;
        this.f474602a = dVar;
        this.f474603b = gVar;
    }

    @Override // m3.e
    public java.lang.Object a() {
        java.lang.Object a17 = this.f474604c.a();
        if (a17 == null) {
            a17 = this.f474602a.mo161970xaf65a0fc();
            if (android.util.Log.isLoggable("FactoryPools", 2)) {
                a17.getClass().toString();
            }
        }
        if (a17 instanceof r7.f) {
            ((r7.j) ((r7.f) a17).h()).f474606a = false;
        }
        return a17;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        if (obj instanceof r7.f) {
            ((r7.j) ((r7.f) obj).h()).f474606a = true;
        }
        this.f474603b.a(obj);
        return this.f474604c.b(obj);
    }
}
