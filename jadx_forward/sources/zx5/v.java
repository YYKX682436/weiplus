package zx5;

/* loaded from: classes13.dex */
public class v extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx5.w f558810f;

    public v(zx5.w wVar) {
        this.f558810f = wVar;
    }

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        zx5.w wVar = this.f558810f;
        zx5.x xVar = wVar.f558812b;
        xx5.i iVar = new xx5.i();
        zx5.f fVar = wVar.f558811a;
        iVar.b(fVar);
        iVar.f539578e = 2;
        iVar.f539581h = java.lang.System.currentTimeMillis();
        int intValue = zx5.x.c(fVar).intValue();
        iVar.a(intValue);
        return java.lang.Integer.valueOf(intValue);
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        zx5.w wVar = this.f558810f;
        if (intValue != 0) {
            wVar.f(num.intValue(), wVar.f558811a.f558761a);
            return;
        }
        by5.l0 l0Var = wVar.f558811a.f558761a;
        by5.c4.f("XWebRuntimeDownloadListener", "onXWebUpdateCompleted");
        if (l0Var != null) {
            l0Var.V(null);
        }
        zx5.j0.a();
        zx5.i0.b();
        if (by5.d4.a("XWEB_USER_INFO", false).getInt("USER_ID", 0) != 0) {
            return;
        }
        by5.s0.e(1749L, 21L, 1L);
    }
}
