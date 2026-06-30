package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes12.dex */
public final class n9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI f289438d;

    public n9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f289438d = openImKefuServiceConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent(this.f289438d.mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15605x7489b3b1.class);
        intent.putExtra("box_search_type", 2);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f289438d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(openImKefuServiceConversationFmUI, arrayList.toArray(), "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initView$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        openImKefuServiceConversationFmUI.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(openImKefuServiceConversationFmUI, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initView$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 c6662x813c26a0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0();
        c6662x813c26a0.q(g23.j.f349465c);
        c6662x813c26a0.f140076d = 2L;
        c6662x813c26a0.f140077e = g23.j.f349464b;
        c6662x813c26a0.p(g23.j.f349466d);
        c6662x813c26a0.f140079g = g23.j.f349467e;
        c6662x813c26a0.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + c6662x813c26a0.m());
        return true;
    }
}
