package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes5.dex */
public final class f9 implements j41.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI f289214a;

    public f9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f289214a = openImKefuServiceConversationFmUI;
    }

    @Override // j41.x
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "closeOpenImKfConversation success");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f289214a;
        android.app.Activity mo7438x76847179 = openImKefuServiceConversationFmUI.mo7438x76847179();
        android.app.Activity mo7438x768471792 = openImKefuServiceConversationFmUI.mo7438x76847179();
        db5.t7.i(mo7438x76847179, mo7438x768471792 != null ? mo7438x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hep) : null, com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
    }

    @Override // j41.x
    public void b(int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "closeOpenImKfConversation failed errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f289214a;
        android.app.Activity mo7438x76847179 = openImKefuServiceConversationFmUI.mo7438x76847179();
        android.app.Activity mo7438x768471792 = openImKefuServiceConversationFmUI.mo7438x76847179();
        db5.t7.i(mo7438x76847179, mo7438x768471792 != null ? mo7438x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hen) : null, com.p314xaae8f345.mm.R.raw.f79502x48ef2959);
    }
}
