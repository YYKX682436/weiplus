package aq1;

/* loaded from: classes11.dex */
public class s0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f13090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13091b;

    public s0(aq1.t0 t0Var, com.tencent.mm.storage.a3 a3Var, java.lang.String str) {
        this.f13090a = a3Var;
        this.f13091b = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.storage.a3 a3Var = this.f13090a;
        if (a3Var == null || !a3Var.Q0()) {
            return;
        }
        com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = new com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent();
        java.lang.String str2 = this.f13091b;
        am.vk vkVar = netSceneGetChatroomMemberDetailEvent.f54524g;
        vkVar.f8199a = str2;
        vkVar.f8200b = a3Var.D0();
        netSceneGetChatroomMemberDetailEvent.e();
    }
}
