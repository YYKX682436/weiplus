package zx4;

/* loaded from: classes8.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f558673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f558675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f558676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f558677h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f558678i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558679m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558680n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, zx4.l0 l0Var, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.l lVar, boolean z18, java.lang.String str, zx4.l0 l0Var2) {
        super(1);
        this.f558673d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f558674e = l0Var;
        this.f558675f = z17;
        this.f558676g = u3Var;
        this.f558677h = lVar;
        this.f558678i = z18;
        this.f558679m = str;
        this.f558680n = l0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zx4.h0 h0Var;
        zx4.o oVar = (zx4.o) obj;
        if (oVar instanceof zx4.n) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("captureResult sucess: h:");
            zx4.n nVar = (zx4.n) oVar;
            sb6.append(nVar.f558702c);
            sb6.append(" w:");
            sb6.append(nVar.f558701b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", sb6.toString());
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f558673d;
            zx4.l0 l0Var = this.f558674e;
            boolean z17 = this.f558678i;
            boolean z18 = this.f558675f;
            java.lang.String str = this.f558679m;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f558676g;
            ((yb0.g) b0Var).Ni(viewOnCreateContextMenuListenerC19337x37f3384d, new zx4.f0(l0Var, z17, viewOnCreateContextMenuListenerC19337x37f3384d, z18, str, u3Var, this.f558680n, oVar), new zx4.g0(l0Var, viewOnCreateContextMenuListenerC19337x37f3384d, z18, u3Var));
            h0Var = this;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "captureResult failed: capture failed");
            h0Var = this;
            zx4.l0.c(h0Var.f558674e, h0Var.f558673d, h0Var.f558675f, h0Var.f558676g);
        }
        yz5.l lVar = h0Var.f558677h;
        if (lVar != null) {
            if (oVar == null) {
                oVar = new zx4.m(null, 1, null);
            }
            lVar.mo146xb9724478(oVar);
        }
        return jz5.f0.f384359a;
    }
}
