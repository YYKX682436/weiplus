package g43;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f350287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f350288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350287e = linkedList;
        this.f350288f = m1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.e(this.f350287e, this.f350288f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g43.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350286d;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f350288f;
        java.util.LinkedList userNames = this.f350287e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g43.m mVar = g43.m.f350299d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userNames, "$userNames");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((v33.n) m1Var).m171053x5a9a73ac().f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
            java.lang.String chatroom_name = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15775x8d72a343) fVar).f36728x3923b317;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroom_name, "chatroom_name");
            this.f350286d = 1;
            obj = g43.m.a(mVar, userNames, chatroom_name, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameChatRoom.ChatroomMemberPreloadManager", "getSimpleUsersFromDbOrNet  rawUserSize = " + userNames.size() + " resultSimpleUsers = " + list.size() + "  threadId = " + java.lang.Thread.currentThread().getId() + "   threadName =  " + java.lang.Thread.currentThread().getName());
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        g43.d dVar = new g43.d(m1Var, list, null);
        this.f350286d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, dVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
