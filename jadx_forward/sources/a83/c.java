package a83;

/* loaded from: classes11.dex */
public final class c implements a83.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f83788a = null;

    public c(a83.a aVar) {
    }

    @Override // a83.e
    public void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.f2 f2Var) {
        if (this.f83788a == null) {
            this.f83788a = java.lang.Boolean.valueOf(ak0.o.f());
        }
        f2Var.a("is_patched", this.f83788a);
        f2Var.a("patch_client_version", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
        f2Var.a("patch_rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        f2Var.a("base_client_version", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y1(lp0.a.f401782c)));
        f2Var.a("base_rev", lp0.a.f401781b);
    }
}
