package d7;

/* loaded from: classes13.dex */
public final class g0 implements w6.z0, w6.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.Resources f308338d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.z0 f308339e;

    public g0(android.content.res.Resources resources, w6.z0 z0Var) {
        q7.n.b(resources);
        this.f308338d = resources;
        q7.n.b(z0Var);
        this.f308339e = z0Var;
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return android.graphics.drawable.BitmapDrawable.class;
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return new android.graphics.drawable.BitmapDrawable(this.f308338d, (android.graphics.Bitmap) this.f308339e.get());
    }

    @Override // w6.z0
    /* renamed from: getSize */
    public int mo14473xfb854877() {
        return this.f308339e.mo14473xfb854877();
    }

    @Override // w6.u0
    /* renamed from: initialize */
    public void mo123606x33ebcb90() {
        w6.z0 z0Var = this.f308339e;
        if (z0Var instanceof w6.u0) {
            ((w6.u0) z0Var).mo123606x33ebcb90();
        }
    }

    @Override // w6.z0
    /* renamed from: recycle */
    public void mo14474x408b7293() {
        this.f308339e.mo14474x408b7293();
    }
}
