package tu0;

/* loaded from: classes5.dex */
public class h extends tu0.b {

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f503617f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.r6 f503618g;

    @Override // tu0.f
    /* renamed from: close */
    public void mo167049x5a5ddf8() {
        java.io.OutputStream outputStream = this.f503617f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f503617f.close();
            } catch (java.io.IOException unused) {
            }
            this.f503617f = null;
        }
    }

    @Override // tu0.f
    /* renamed from: init */
    public boolean mo167050x316510(java.lang.String str, int i17, int i18, int i19) {
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            this.f503618g = r6Var;
            if (r6Var.m()) {
                this.f503618g.l();
            }
            this.f503618g.k();
            this.f503617f = new java.io.DataOutputStream(com.p314xaae8f345.mm.vfs.w6.K(str, false));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Luggage.PCMAudioEncoder", "", e17);
            return true;
        }
    }
}
