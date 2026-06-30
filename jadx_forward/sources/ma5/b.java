package ma5;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f406764d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f406765e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.MenuInflater f406766f;

    /* renamed from: g, reason: collision with root package name */
    public n.b f406767g = null;

    public b(android.app.Activity activity) {
        this.f406764d = activity;
    }

    public abstract p012xc85e97e9.p016x746ad0e3.app.b e();

    public android.view.MenuInflater f() {
        if (this.f406766f == null) {
            if (this.f406765e == null) {
                this.f406765e = e();
            }
            p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f406765e;
            if (bVar != null) {
                this.f406766f = new n.j(bVar.m());
            } else {
                this.f406766f = new n.j(this.f406764d);
            }
        }
        return this.f406766f;
    }

    public android.view.ActionMode g(android.view.ActionMode.Callback callback) {
        n.f fVar = new n.f(this.f406764d, callback);
        n.b bVar = this.f406767g;
        if (bVar != null) {
            bVar.a();
        }
        ma5.a aVar = new ma5.a(this, fVar);
        if (this.f406765e == null) {
            this.f406765e = e();
        }
        p012xc85e97e9.p016x746ad0e3.app.b bVar2 = this.f406765e;
        if (bVar2 != null) {
            this.f406767g = bVar2.M(aVar);
        }
        n.b bVar3 = this.f406767g;
        if (bVar3 != null) {
            return fVar.e(bVar3);
        }
        return null;
    }
}
