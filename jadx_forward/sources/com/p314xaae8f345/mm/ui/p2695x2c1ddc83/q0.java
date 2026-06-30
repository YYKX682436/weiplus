package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class q0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI f289524d;

    public q0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f289524d = convBoxServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        int i18;
        int i19;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f289524d;
        o2Var = convBoxServiceConversationFmUI.f39567xbb6ca34f;
        convBoxServiceConversationFmUI.f39570x2c1ddc83 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) o2Var.getItem(i17);
        l4Var = convBoxServiceConversationFmUI.f39570x2c1ddc83;
        convBoxServiceConversationFmUI.f39575xcb7bc659 = l4Var.h1();
        rl5.r rVar = new rl5.r(convBoxServiceConversationFmUI.mo7438x76847179());
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n0 n0Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n0(this, i17);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p0 p0Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p0(this);
        i18 = convBoxServiceConversationFmUI.f39577xd22f6809;
        i19 = convBoxServiceConversationFmUI.f39578xd3e440a8;
        rVar.g(view, i17, j17, n0Var, p0Var, i18, i19);
        return true;
    }
}
