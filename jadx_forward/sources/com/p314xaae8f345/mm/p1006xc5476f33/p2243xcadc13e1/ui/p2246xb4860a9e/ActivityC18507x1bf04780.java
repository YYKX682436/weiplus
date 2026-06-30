package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI */
/* loaded from: classes11.dex */
public class ActivityC18507x1bf04780 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public int f253715d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("friend_message_transfer_username");
        java.lang.String action = getIntent().getAction();
        if ("friend_message_verify_record".equals(action)) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(mo55332x76847179(), "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
            finish();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            finish();
            return;
        }
        if (r21.w.wi().W0() > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.J("fmessage", 2);
        }
        r21.w.wi().i1(stringExtra);
        java.lang.Runnable runnable = r21.w.wi().f276737e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 500L);
        java.lang.String str = "friend_message_accept_" + stringExtra;
        this.f253715d = (stringExtra.hashCode() & Integer.MAX_VALUE) | 2130706432;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(this.f253715d);
        if (str.equals(action)) {
            eg4.g1.a(mo55332x76847179(), null, stringExtra, true);
        }
        finish();
    }
}
