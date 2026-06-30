package ha3;

/* loaded from: classes15.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.q0 f361451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult f361453f;

    public p0(ha3.q0 q0Var, java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        this.f361451d = q0Var;
        this.f361452e = str;
        this.f361453f = c2CDownloadResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha3.q0 q0Var = this.f361451d;
        if (com.p314xaae8f345.mm.vfs.w6.j(q0Var.f361457e)) {
            com.p314xaae8f345.mm.vfs.w6.x(q0Var.f361457e, q0Var.f361458f, true);
            java.lang.String str = q0Var.f361459g;
            q0Var.f361456d.mo562xf8a76f8e(this.f361452e, this.f361453f);
        }
    }
}
