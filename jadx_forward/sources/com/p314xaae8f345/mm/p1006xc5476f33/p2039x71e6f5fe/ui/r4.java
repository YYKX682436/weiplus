package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class r4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f241156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f241157e;

    /* renamed from: f, reason: collision with root package name */
    public w60.k f241158f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f241159g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f241160h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.q4(this), false);

    public r4(android.content.Context context) {
        this.f241156d = context;
    }

    public final void a(java.lang.String str, int i17, byte[] bArr) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("geta8key_session_id", i17);
        intent.putExtra("geta8key_cookie", bArr);
        ((com.p314xaae8f345.mm.app.y7) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.i1.a()).D(intent, this.f241156d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f241160h.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f241159g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        w60.k kVar = (w60.k) m1Var;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = (com.p314xaae8f345.mm.p957x53236a1b.k0) kVar;
            java.lang.String Q = k0Var.Q();
            if (Q == null || Q.length() == 0) {
                a(this.f241157e, k0Var.O(), k0Var.J());
                return;
            } else {
                a(Q, k0Var.O(), k0Var.J());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ViewMMURL", "getA8Key fail, errType = " + i17 + ", errCode = " + i18);
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var2 = (com.p314xaae8f345.mm.p957x53236a1b.k0) kVar;
        a(this.f241157e, k0Var2.O(), k0Var2.J());
    }
}
