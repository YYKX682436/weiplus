package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class n0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q0 f289415e;

    public n0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q0 q0Var, int i17) {
        this.f289415e = q0Var;
        this.f289414d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.lang.String str;
        boolean m80511xf0724a7f;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f289415e.f289524d;
        str = convBoxServiceConversationFmUI.f39575xcb7bc659;
        m80511xf0724a7f = convBoxServiceConversationFmUI.m80511xf0724a7f(str);
        if (m80511xf0724a7f) {
            contextMenu.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqe);
        } else {
            contextMenu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqc);
        }
        int i17 = this.f289414d;
        contextMenu.add(i17, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gq6);
        contextMenu.add(i17, 4, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bl9);
    }
}
