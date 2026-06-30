package c43;

/* loaded from: classes15.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.UserRole f38484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.w0 f38485e;

    public v0(c43.w0 w0Var, com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole) {
        this.f38485e = w0Var;
        this.f38484d = userRole;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon roleIcon;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole = this.f38484d;
        if (userRole != null && (roleIcon = userRole.role_icon) != null) {
            c43.w0 w0Var = this.f38485e;
            s33.y.h(w0Var.f38487e.f38517a.f38492g, roleIcon.jump_info);
            if (w0Var.f38487e.f38517a.f38495m != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("role", userRole.role);
                } catch (org.json.JSONException unused) {
                }
                com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                c43.x xVar = w0Var.f38487e.f38517a;
                long j17 = xVar.f38494i;
                long j18 = xVar.f38493h;
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                fVar.h(21L, 2L, j17, j18, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0L, xVar.X, jSONObject.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$6$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
