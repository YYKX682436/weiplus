package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/ui/GameChatRoomAffinityUI;", "Lcom/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI;", "<init>", "()V", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomAffinityUI */
/* loaded from: classes8.dex */
public final class ActivityC15841xb112d221 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m53.f4 f4Var;
        super.onCreate(bundle);
        android.graphics.Bitmap a17 = m95.a.a(mo55332x76847179().getResources(), com.p314xaae8f345.mm.R.raw.f79428xf1af0e55, 3.0f);
        m53.t b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.b();
        java.lang.String str = (b17 == null || (f4Var = b17.f405597e) == null) ? null : f4Var.f405212d;
        if (str == null) {
            str = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573735fl4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        setTaskDescription(new android.app.ActivityManager.TaskDescription(str, a17, 0));
    }
}
