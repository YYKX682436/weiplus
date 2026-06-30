package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class s8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t8 f289600d;

    public s8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t8 t8Var) {
        this.f289600d = t8Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting loading cancel");
        this.f289600d.f289614a = true;
    }
}
