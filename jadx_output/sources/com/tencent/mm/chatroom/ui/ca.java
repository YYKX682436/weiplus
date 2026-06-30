package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class ca implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f64080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f64081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f64082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.da f64083g;

    public ca(boolean z17, android.app.ProgressDialog progressDialog, android.app.Activity activity, com.tencent.mm.chatroom.ui.da daVar) {
        this.f64080d = z17;
        this.f64081e = progressDialog;
        this.f64082f = activity;
        this.f64083g = daVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g.CTRL_INDEX, this);
        if (!this.f64080d) {
            this.f64081e.cancel();
        }
        this.f64082f.getString(com.tencent.mm.R.string.f492910i75);
        kn.e0 e0Var = (kn.e0) m1Var;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(e0Var.f309389f);
            if (z07 == null) {
                z07 = new com.tencent.mm.storage.a3();
            }
            z07.Y0(c01.z1.r(), e0Var.f309390g);
            c01.v1.M(z07);
            z17 = true;
        } else {
            z17 = false;
        }
        com.tencent.mm.chatroom.ui.da daVar = this.f64083g;
        if (daVar != null) {
            int i19 = e0Var.f309391h;
            com.tencent.mm.chatroom.ui.RoomAlphaProcessUI roomAlphaProcessUI = (com.tencent.mm.chatroom.ui.RoomAlphaProcessUI) daVar;
            if (z17) {
                db5.e1.V(roomAlphaProcessUI, roomAlphaProcessUI.getString(com.tencent.mm.R.string.i76), 0, null);
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.chatroom.ui.i8(roomAlphaProcessUI, z17, i19), 200L);
            } else {
                db5.e1.t(roomAlphaProcessUI, roomAlphaProcessUI.getString(com.tencent.mm.R.string.f492910i75), "", null);
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.chatroom.ui.j8(roomAlphaProcessUI, z17), 200L);
            }
        }
    }
}
