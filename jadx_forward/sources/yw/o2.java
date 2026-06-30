package yw;

/* loaded from: classes9.dex */
public final class o2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547949f;

    public o2(yz5.l lVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a) {
        this.f547947d = lVar;
        this.f547948e = abstractActivityC21394xb3d2c0cf;
        this.f547949f = c23232x91bb1d7a;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        yz5.l lVar = this.f547947d;
        if (itemId != 3) {
            if (menuItem.getItemId() != 4 || lVar == null) {
                return;
            }
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23227xa6365ebf(3L, java.lang.Boolean.TRUE));
            return;
        }
        if (lVar != null) {
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23227xa6365ebf(2L, java.lang.Boolean.TRUE));
        }
        yw.q2 q2Var = yw.q2.f547967a;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a = this.f547949f;
        if (c23232x91bb1d7a.m85529x1e741da2() != null) {
            q2Var.c(c23232x91bb1d7a.m85529x1e741da2(), new yw.z1(new java.lang.ref.WeakReference(this.f547948e)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSaveImg img url is null");
        }
    }
}
