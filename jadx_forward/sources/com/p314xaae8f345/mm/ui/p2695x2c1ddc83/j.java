package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 f289299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289301f;

    public j(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k kVar, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var, int i17, int i18) {
        this.f289299d = n2Var;
        this.f289300e = i17;
        this.f289301f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var = this.f289299d;
        java.lang.Object parent = n2Var.f289419c.getParent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "expected nicknameParent width: %d, nicknameParent width:%d, expected nickname width: %d, nickname width:%d", java.lang.Integer.valueOf(this.f289300e), java.lang.Integer.valueOf(parent instanceof android.view.View ? ((android.view.View) parent).getWidth() : 0), java.lang.Integer.valueOf(this.f289301f), java.lang.Integer.valueOf(n2Var.f289419c.getWidth()));
    }
}
