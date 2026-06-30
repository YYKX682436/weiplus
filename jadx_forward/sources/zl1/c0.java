package zl1;

/* loaded from: classes7.dex */
public class c0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.d0 f555108d;

    public c0(zl1.d0 d0Var) {
        this.f555108d = d0Var;
    }

    @Override // l01.u
    public void b() {
        zl1.d0 d0Var = this.f555108d;
        d0Var.f555161c.a("Failed to load icon via network", d0Var);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f555108d.f555159a;
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        zl1.d0 d0Var = this.f555108d;
        zl1.z zVar = d0Var.f555164f;
        if (zVar != null) {
            zVar.a(bitmap, d0Var);
        }
    }
}
