package c43;

/* loaded from: classes8.dex */
public class b implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp f38392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.c f38393b;

    public b(c43.c cVar, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp) {
        this.f38393b = cVar;
        this.f38392a = chatroomMsgApp;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        this.f38393b.Z.post(new c43.a(this, bitmap));
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
