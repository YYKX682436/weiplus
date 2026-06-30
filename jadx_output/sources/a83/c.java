package a83;

/* loaded from: classes11.dex */
public final class c implements a83.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f2255a = null;

    public c(a83.a aVar) {
    }

    @Override // a83.e
    public void a(com.tencent.mm.sdk.platformtools.f2 f2Var) {
        if (this.f2255a == null) {
            this.f2255a = java.lang.Boolean.valueOf(ak0.o.f());
        }
        f2Var.a("is_patched", this.f2255a);
        f2Var.a("patch_client_version", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.z.f193112h));
        f2Var.a("patch_rev", com.tencent.mm.sdk.platformtools.z.f193109e);
        f2Var.a("base_client_version", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.y1(lp0.a.f320249c)));
        f2Var.a("base_rev", lp0.a.f320248b);
    }
}
