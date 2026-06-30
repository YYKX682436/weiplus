package ql3;

/* loaded from: classes7.dex */
public class d extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f446117d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f446118e;

    public d(l75.k0 k0Var) {
        super(k0Var, ql3.c.f446116z, "PieceMusicInfo", null);
        this.f446118e = k0Var;
        this.f446117d = new jt0.j(20);
    }

    public ql3.c y0(java.lang.String str) {
        kk.j jVar = this.f446117d;
        if (((lt0.f) jVar).get(str) != null) {
            return (ql3.c) ((lt0.f) jVar).get(str);
        }
        android.database.Cursor f17 = this.f446118e.f(java.lang.String.format("Select * From PieceMusicInfo Where musicId=?", new java.lang.Object[0]), new java.lang.String[]{str}, 2);
        if (f17 == null || !f17.moveToFirst()) {
            if (f17 == null) {
                return null;
            }
            f17.close();
            return null;
        }
        ql3.c cVar = new ql3.c();
        cVar.mo9015xbf5d97fd(f17);
        f17.close();
        ((lt0.f) jVar).put(str, cVar);
        return cVar;
    }
}
