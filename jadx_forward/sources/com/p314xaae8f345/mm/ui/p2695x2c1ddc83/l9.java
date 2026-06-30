package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class l9 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI f289389d;

    public l9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f289389d = openImKefuServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f289389d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var = openImKefuServiceConversationFmUI.f288935g;
        openImKefuServiceConversationFmUI.f288937i = h8Var != null ? (com.p314xaae8f345.mm.p2621x8fb0427b.l4) h8Var.getItem(i17) : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = openImKefuServiceConversationFmUI.f288937i;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        if (h17 == null) {
            h17 = "";
        }
        openImKefuServiceConversationFmUI.f288936h = h17;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI2 = this.f289389d;
        rl5.r rVar = openImKefuServiceConversationFmUI2.f288939n;
        if (rVar != null) {
            rVar.g(view, i17, j17, openImKefuServiceConversationFmUI2, openImKefuServiceConversationFmUI2.f288944s, openImKefuServiceConversationFmUI2.f288940o, openImKefuServiceConversationFmUI2.f288941p);
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.k0.b(5, openImKefuServiceConversationFmUI.f288936h, openImKefuServiceConversationFmUI.f288937i);
        return true;
    }
}
