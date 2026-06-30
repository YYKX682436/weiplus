package b43;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest f17800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b43.d f17801e;

    public c(b43.d dVar, com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest getMyChatroomRequest) {
        this.f17801e = dVar;
        this.f17800d = getMyChatroomRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        b43.d dVar = this.f17801e;
        dVar.f17807i = false;
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest getMyChatroomRequest = this.f17800d;
        dVar.a(getMyChatroomRequest.chatroom_name_list, dVar.f17808m, getMyChatroomRequest.version);
    }
}
