package s72;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f485690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.LinkedList linkedList, s72.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485690d = linkedList;
        this.f485691e = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.u(this.f485690d, this.f485691e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        s72.u uVar = (s72.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        byte[] d17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        while (true) {
            java.util.LinkedList linkedList = this.f485690d;
            if (linkedList.isEmpty()) {
                return jz5.f0.f384359a;
            }
            r45.b50 b50Var = (r45.b50) linkedList.getFirst();
            linkedList.removeFirst();
            if (b50Var.f452063d == 229 && (d17 = x51.j1.d(b50Var.f452064e)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDBForTags] cmd id = " + b50Var.f452063d + ", buffer size = " + d17.length);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.nq0().mo11468x92b714fd(d17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavTag");
                s72.j0.T6(this.f485691e, (r45.nq0) mo11468x92b714fd);
            }
        }
    }
}
