package du3;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f325296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(du3.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325296d = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.x(this.f325296d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        du3.b0 b0Var = this.f325296d;
        b0Var.f325068t = b0Var.f325073y.contains("人物");
        jz5.g gVar = b0Var.f325072x;
        ((du3.q) ((jz5.n) gVar).mo141623x754a37bb()).x(b0Var.f325068t);
        du3.q qVar = (du3.q) ((jz5.n) gVar).mo141623x754a37bb();
        boolean z17 = b0Var.f325068t;
        qVar.f325215g = z17;
        r45.y86 y86Var = new r45.y86();
        y86Var.set(1, 1);
        y86Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 12053;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsgetconfigdata";
        lVar.f152197a = y86Var;
        lVar.f152198b = new r45.z86();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().K(new du3.p(qVar));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.Object mo141623x754a37bb = ((jz5.n) b0Var.f325070v).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        cy1.a aVar2 = (cy1.a) rVar;
        aVar2.fk((android.view.View) mo141623x754a37bb, "yb_content_type", new java.lang.Integer(b0Var.f325068t ? 1 : 2));
        return aVar2;
    }
}
