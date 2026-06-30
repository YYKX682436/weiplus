package sd;

/* loaded from: classes8.dex */
public class s0 extends sd.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.u0 f488184a;

    public s0(sd.u0 u0Var) {
        this.f488184a = u0Var;
    }

    @Override // sd.p0
    public java.lang.String a() {
        sd.u0 u0Var = this.f488184a;
        if (u0Var.f488191o == null) {
            java.lang.String j17 = u0Var.j();
            if (android.text.TextUtils.isEmpty(j17)) {
                j17 = "";
            }
            u0Var.f488191o = j17;
        }
        return u0Var.f488191o;
    }

    @Override // sd.p0
    public void b(java.lang.String str) {
        sd.u0 u0Var = this.f488184a;
        sd.j jVar = u0Var.f488146g;
        if (((sd.t0) jVar) != null) {
            ((sd.t0) jVar).c(u0Var, str);
        }
        u0Var.f488144e.a(sd.d0.class);
    }

    @Override // sd.p0
    public void c(java.lang.String str) {
        sd.u0 u0Var = this.f488184a;
        sd.j jVar = u0Var.f488146g;
        if (((sd.t0) jVar) != null) {
            ((sd.t0) jVar).d(u0Var, str);
        }
    }

    @Override // sd.p0
    public android.webkit.WebResourceResponse d(android.webkit.WebResourceRequest webResourceRequest, android.os.Bundle bundle) {
        sd.j jVar = this.f488184a.f488146g;
        if (((sd.t0) jVar) != null) {
            return ((sd.t0) jVar).a(webResourceRequest, bundle);
        }
        return null;
    }

    @Override // sd.p0
    public android.webkit.WebResourceResponse e(java.lang.String str) {
        sd.j jVar = this.f488184a.f488146g;
        if (((sd.t0) jVar) != null) {
            return ((sd.t0) jVar).b(str);
        }
        return null;
    }
}
