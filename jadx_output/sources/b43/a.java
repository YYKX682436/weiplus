package b43;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest f17794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b43.b f17795e;

    public a(b43.b bVar, com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest) {
        this.f17795e = bVar;
        this.f17794d = getChatroomRealtimeInfoRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        b43.b bVar = this.f17795e;
        bVar.f17799g = false;
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest = this.f17794d;
        bVar.a(getChatroomRealtimeInfoRequest.chatroom_name, getChatroomRealtimeInfoRequest.version);
    }
}
