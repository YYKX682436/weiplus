package l41;

/* loaded from: classes4.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um3.b f397493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f397495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397496g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(um3.b bVar, java.lang.String str, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f397493d = bVar;
        this.f397494e = str;
        this.f397495f = z17;
        this.f397496g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l41.x1(this.f397493d, this.f397494e, this.f397495f, this.f397496g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        l41.x1 x1Var = (l41.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.j26 j26Var = new r45.j26();
        j26Var.f459053d = this.f397494e;
        j26Var.f459054e = 8589934592L;
        j26Var.f459055f = this.f397495f ? 8589934592L : 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11957;
        lVar.f152199c = "/cgi-bin/micromsg-bin/setopenimkefucontactflag";
        lVar.f152197a = j26Var;
        lVar.f152198b = new r45.k26();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar.a());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = this.f397493d.O6();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.c(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new l41.w1(a17, this.f397496g, null));
        return jz5.f0.f384359a;
    }
}
