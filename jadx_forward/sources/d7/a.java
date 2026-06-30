package d7;

/* loaded from: classes13.dex */
public class a implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final t6.n f308315a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f308316b;

    public a(android.content.res.Resources resources, t6.n nVar) {
        q7.n.b(resources);
        this.f308316b = resources;
        q7.n.b(nVar);
        this.f308315a = nVar;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        w6.z0 a17 = this.f308315a.a(obj, i17, i18, lVar);
        if (a17 == null) {
            return null;
        }
        return new d7.g0(this.f308316b, a17);
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        return this.f308315a.b(obj, lVar);
    }
}
