package v16;

/* loaded from: classes15.dex */
public class b implements o26.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f514129a;

    public b(boolean z17) {
        this.f514129a = z17;
    }

    @Override // o26.d
    public java.lang.Iterable a(java.lang.Object obj) {
        o06.d dVar = (o06.d) obj;
        if (this.f514129a) {
            dVar = dVar != null ? dVar.a() : null;
        }
        java.util.Collection i17 = dVar != null ? dVar.i() : null;
        return i17 == null ? kz5.p0.f395529d : i17;
    }
}
