package kk5;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f390208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f390209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kk5.q qVar, wi5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390208d = qVar;
        this.f390209e = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kk5.p(this.f390208d, this.f390209e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kk5.p pVar = (kk5.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        kk5.q qVar = this.f390208d;
        boolean booleanExtra = qVar.m158354x19263085().getIntent().getBooleanExtra("KShowSelectExistChatroom", false);
        wi5.o0 o0Var = wi5.p0.f527866a;
        wi5.n0 n0Var = this.f390209e;
        java.util.List b17 = o0Var.b(n0Var.f527852o, n0Var.f527851n, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Header CREATE_CHATROOM_EXISTING_CHATROOM, ");
        sb6.append(booleanExtra);
        sb6.append(", selected=");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.isEmpty());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", sb6.toString());
        if (booleanExtra && arrayList.isEmpty() && g95.e.f351334a.a()) {
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = qVar.O6();
            if (O6 != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new kk5.o(qVar, null), 2, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "add Header CREATE_CHATROOM_EXISTING_CHATROOM, selected=" + arrayList.isEmpty());
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = qVar.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.s(ri5.j.I.a("fake_user_create_chatroom_select_chatroom", ri5.j.K, 0));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateChatRoomOtherHeaderStrictDupUIC", "remove Header CREATE_CHATROOM_EXISTING_CHATROOM");
        }
        return jz5.f0.f384359a;
    }
}
