package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class s implements yb5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f289585d;

    public s(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        this.f289585d = activityC22359x66709fa8;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102;
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289585d;
        c22559x35245a10 = activityC22359x66709fa8.f39540xbb71960b;
        if (c22559x35245a10 == null) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI baseConversationFmUI = activityC22359x66709fa8.f39542x9c18d0aa;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.m80456xbbd77eb1(activityC22359x66709fa8, new android.content.Intent().putExtra("Chat_User", (baseConversationFmUI == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(baseConversationFmUI.getF288932d())) ? c01.z1.r() : activityC22359x66709fa8.f39542x9c18d0aa.getF288932d()), true);
            activityC22359x66709fa8.mo80483x6dbaeafd();
            c22559x35245a102 = activityC22359x66709fa8.f39540xbb71960b;
            c22559x35245a102.setVisibility(8);
            activityC22359x66709fa8.m80485x4b04c3f6();
        }
        java.lang.System.currentTimeMillis();
        return false;
    }
}
