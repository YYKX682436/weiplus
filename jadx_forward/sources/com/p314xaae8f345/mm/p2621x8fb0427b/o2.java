package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s1 f276724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f276725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f276726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f276727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var, java.util.Map map, int i17, android.content.Context context) {
        super(0);
        this.f276724d = s1Var;
        this.f276725e = map;
        this.f276726f = i17;
        this.f276727g = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = this.f276724d;
        if (!(e0Var.n(s1Var.f67306x114ef53e, s1Var.f67292x297eb4f7).m124847x74d37ac6() == 0)) {
            java.lang.String str = s1Var.f67306x114ef53e;
            java.lang.String str2 = (java.lang.String) this.f276725e.get(".msg.appmsg.mmreader." + com.p314xaae8f345.mm.p2621x8fb0427b.s2.g(this.f276726f) + ".publisher_username");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str = str2;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("from_global_search", true);
            intent.putExtra("msg_local_id", s1Var.f67292x297eb4f7);
            intent.putExtra("specific_chat_from_scene", 9);
            intent.putExtra("preChatTYPE", 13);
            j45.l.u(this.f276727g, ".ui.chatting.ChattingUI", intent, null);
        }
        return jz5.f0.f384359a;
    }
}
