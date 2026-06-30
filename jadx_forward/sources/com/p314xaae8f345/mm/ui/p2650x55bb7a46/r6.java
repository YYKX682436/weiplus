package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public final class r6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.t6 f284175d;

    public r6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.t6 t6Var) {
        this.f284175d = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$onClickListenerMobileQQ$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.t6 t6Var = this.f284175d;
        boolean f17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(t6Var.f284237b, "com.tencent.mobileqq");
        android.content.Context context = t6Var.f284237b;
        if (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "starting mobile qq");
            p95.a.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p6(t6Var, context.getPackageManager().getLaunchIntentForPackage("com.tencent.mobileqq")));
        } else if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            db5.e1.y(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572370n73), "", i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.n6z), null);
        } else if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            db5.e1.j(t6Var.f284237b, com.p314xaae8f345.mm.R.C30867xcad56011.f572367n70, 0, com.p314xaae8f345.mm.R.C30867xcad56011.n6y, com.p314xaae8f345.mm.R.C30867xcad56011.n6x, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q6(t6Var), null);
        } else if (context != null) {
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_tx3SGbyHv8FJrTQDWR";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$onClickListenerMobileQQ$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
