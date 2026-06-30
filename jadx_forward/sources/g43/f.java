package g43;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f350289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350289d = m1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.f(this.f350289d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g43.f fVar = (g43.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g43.m mVar = g43.m.f350299d;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f350289d;
        java.util.LinkedList<java.lang.String> member_username_list = ((v33.w) m1Var).I().f36869x71fabd82;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(member_username_list, "member_username_list");
        java.lang.String chatroom_name = ((v33.w) m1Var).H().f36867x3923b317;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroom_name, "chatroom_name");
        java.util.LinkedList d17 = mVar.d(member_username_list, chatroom_name);
        com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
        java.lang.String chatroom_name2 = ((v33.w) m1Var).H().f36867x3923b317;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroom_name2, "chatroom_name");
        d18.g(new v33.l(d17, chatroom_name2, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d) mVar.b().get(((v33.w) m1Var).H().f36867x3923b317), true, null, 16, null));
        return jz5.f0.f384359a;
    }
}
