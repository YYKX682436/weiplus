package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f267356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.m1 f267357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f267358f;

    public t0(android.content.Context context, ot0.m1 m1Var, int i17) {
        this.f267356d = context;
        this.f267357e = m1Var;
        this.f267358f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f267358f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.a.f267272a;
        ot0.m1 msgInfo = this.f267357e;
        if (itemId == 1) {
            android.content.Context context = this.f267356d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265344d3.f267340a = msgInfo;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0.f267319a.b(context, msgInfo.f454876h, "", msgInfo.f454875g, msgInfo.f454872d, 2);
            aVar.a(1, i18, 3);
            return;
        }
        android.content.Context context2 = this.f267356d;
        if (itemId == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5 c19429x834b7ec5 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5();
            c19429x834b7ec5.f267266h = msgInfo;
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c19429x834b7ec5, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.o0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.p0.f267343d);
            db5.e1.T(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbq));
            aVar.a(2, i18, 3);
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.g0.f267310a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            g0Var.a(msgInfo, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, msgInfo.f430120y);
            aVar.a(4, i18, 3);
        }
    }
}
