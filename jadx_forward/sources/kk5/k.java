package kk5;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f390196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kk5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390196d = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kk5.k(this.f390196d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kk5.k kVar = (kk5.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3("fake_user_create_chatroom_choose_open_im");
        ti5.c cVar = ti5.d.f501196i;
        kk5.q qVar = this.f390196d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = qVar.m158354x19263085();
        ri5.h hVar = ri5.j.I;
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        int i17 = ri5.j.N;
        arrayList.add(cVar.b(m158354x19263085, hVar.a(d17, i17, 3), z3Var, i17, new ti5.d(null, null, 0, 0, 4, 0, null, false, 239, null)));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = qVar.U6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.n(arrayList, true);
        }
        return jz5.f0.f384359a;
    }
}
