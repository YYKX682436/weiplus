package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f267308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267309e;

    public g(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c) {
        this.f267308d = context;
        this.f267309e = viewOnClickListenerC19428xb021cc2c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f267308d;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267309e;
        if (!z17 || viewOnClickListenerC19428xb021cc2c.f267258x == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(viewOnClickListenerC19428xb021cc2c.f267240d, "should not be here");
        } else {
            if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.l()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.v0.f267362a;
                ot0.m1 m1Var = viewOnClickListenerC19428xb021cc2c.f267258x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var);
                v0Var.a(context, m1Var, 5);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.n0 n0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265344d3;
                ot0.m1 m1Var2 = viewOnClickListenerC19428xb021cc2c.f267258x;
                n0Var.f267340a = m1Var2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0.f267319a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var2);
                java.lang.String str = m1Var2.f454876h;
                ot0.m1 m1Var3 = viewOnClickListenerC19428xb021cc2c.f267258x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var3);
                java.lang.String str2 = m1Var3.f454875g;
                ot0.m1 m1Var4 = viewOnClickListenerC19428xb021cc2c.f267258x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var4);
                j0Var.b(context, str, "", str2, m1Var4.f454872d, 2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18589, 16, 3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
