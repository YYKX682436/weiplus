package x03;

/* loaded from: classes15.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.y1 f532699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f532700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult f532701f;

    public x1(x03.y1 y1Var, java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        this.f532699d = y1Var;
        this.f532700e = str;
        this.f532701f = c2CDownloadResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.y1 y1Var = this.f532699d;
        if (com.p314xaae8f345.mm.vfs.w6.j(y1Var.f532704e)) {
            com.p314xaae8f345.mm.vfs.w6.x(y1Var.f532704e, y1Var.f532705f, true);
            java.lang.String str = y1Var.f532706g;
            y1Var.f532703d.mo562xf8a76f8e(this.f532700e, this.f532701f);
        }
    }
}
