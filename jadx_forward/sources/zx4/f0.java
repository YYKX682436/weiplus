package zx4;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f558660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f558661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f558662g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558663h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f558664i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558665m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zx4.o f558666n;

    public f0(zx4.l0 l0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, boolean z18, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, zx4.l0 l0Var2, zx4.o oVar) {
        this.f558659d = l0Var;
        this.f558660e = z17;
        this.f558661f = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f558662g = z18;
        this.f558663h = str;
        this.f558664i = u3Var;
        this.f558665m = l0Var2;
        this.f558666n = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String sb6;
        zx4.l0 l0Var = this.f558659d;
        boolean z17 = this.f558660e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d context = this.f558661f;
        boolean z18 = this.f558662g;
        java.lang.String exifInfo = this.f558663h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f558664i;
        zx4.l0 l0Var2 = this.f558665m;
        zx4.n nVar = (zx4.n) this.f558666n;
        l0Var.getClass();
        if (z17) {
            com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(context.getDir("webview", 0));
            if (j17 != null) {
                j17.J();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(j17 != null ? j17.o() : null);
            sb7.append("/webviewscpictemp");
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(".png");
            sb6 = sb7.toString();
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb8.append(q75.c.d());
            sb8.append("webviewscpic");
            sb8.append(java.lang.System.currentTimeMillis());
            sb8.append(".png");
            sb6 = sb8.toString();
        }
        java.lang.String path = sb6;
        zx4.a0 a0Var = new zx4.a0(z17, l0Var, path, context, z18, u3Var);
        android.graphics.Bitmap bitmap = nVar.f558700a;
        zx4.z zVar = new zx4.z(l0Var, context, z18, u3Var);
        l0Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exifInfo, "exifInfo");
        ((ku5.t0) ku5.t0.f394148d).g(new zx4.e0(bitmap, path, exifInfo, a0Var, zVar));
    }
}
