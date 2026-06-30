package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 f289586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289588f;

    public s0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t0 t0Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var, int i17, int i18) {
        this.f289586d = n2Var;
        this.f289587e = i17;
        this.f289588f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var = this.f289586d;
        java.lang.Object parent = n2Var.f289419c.getParent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "expected nicknameParent width: %d, nicknameParent width:%d, expected nickname width: %d, nickname width:%d", java.lang.Integer.valueOf(this.f289587e), java.lang.Integer.valueOf(parent instanceof android.view.View ? ((android.view.View) parent).getWidth() : 0), java.lang.Integer.valueOf(this.f289588f), java.lang.Integer.valueOf(n2Var.f289419c.getWidth()));
    }
}
