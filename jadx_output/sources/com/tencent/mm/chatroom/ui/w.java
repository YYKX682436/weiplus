package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class w implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64611a;

    public w(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64611a = chatroomInfoUI;
    }

    @Override // db5.r4
    public void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.Mj(view);
            aVar.pk(view, "delete_group_after_quit_confirm_button");
            aVar.Ai(view, new com.tencent.mm.chatroom.ui.v(this));
            aVar.ik(view, 8, 26501);
        }
    }
}
