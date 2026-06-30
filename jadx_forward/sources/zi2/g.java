package zi2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zi2.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554641e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zi2.g(this.f554641e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zi2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554640d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            km2.q a76 = ((mm2.o4) this.f554641e.P0(mm2.o4.class)).a7();
            r45.wx5 wx5Var = new r45.wx5();
            wx5Var.set(0, a76.f390703a);
            wx5Var.set(2, java.lang.Integer.valueOf(a76.f390725w));
            linkedList.add(wx5Var);
            java.util.List<km2.q> list = ((mm2.o4) this.f554641e.P0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar : list) {
                    r45.wx5 wx5Var2 = new r45.wx5();
                    wx5Var2.set(0, qVar.f390703a);
                    wx5Var2.set(1, qVar.f390708f);
                    wx5Var2.set(2, java.lang.Integer.valueOf(qVar.f390725w));
                    linkedList.add(wx5Var2);
                }
            }
            zi2.w wVar = this.f554641e;
            this.f554640d = 1;
            if (wVar.J1(linkedList, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
