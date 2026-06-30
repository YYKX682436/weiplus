package q85;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f442330d;

    /* renamed from: e, reason: collision with root package name */
    public int f442331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q85.g f442332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q85.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f442332f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q85.e(this.f442332f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((q85.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        fk4.u uVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f442331e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        q85.g gVar = this.f442332f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiscroMsg.PlayerState", "getPlayer snsId:" + gVar.f442335d + " isPlay:" + gVar.f442341m);
            pk4.d dVar = gVar.f442340i;
            if (dVar == null) {
                return f0Var;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            if (dVar.mo69420xf582434a()) {
                pk4.d dVar2 = gVar.f442340i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
                dVar2.m158666x360802();
            }
            if (gVar.f442342n == null) {
                int i18 = gVar.f442336e;
                r45.jj4 media = gVar.f442337f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
                gVar.f442342n = null;
            }
            if (gVar.f442342n != null) {
                pk4.d dVar3 = gVar.f442340i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar3);
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4) dVar3).mo69327xab3268fe(gVar.f442342n);
                pk4.d dVar4 = gVar.f442340i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar4);
                dVar4.m158663x360a109e(gVar);
                pk4.d dVar5 = gVar.f442340i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar5);
                dVar5.m158657x764cf626(true);
                pk4.d dVar6 = gVar.f442340i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar6);
                dVar6.mo69431xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                return f0Var;
            }
            int i19 = gVar.f442336e;
            r45.jj4 media2 = gVar.f442337f;
            int i27 = gVar.f442338g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media2, "media");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).getClass();
            fk4.k kVar = new fk4.k(null);
            kVar.o();
            this.f442330d = kVar;
            this.f442331e = 1;
            if (kVar.d(this) == aVar) {
                return aVar;
            }
            uVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (fk4.u) this.f442330d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pk4.d dVar7 = gVar.f442340i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar7);
        dVar7.mo69430x6a2d1de5(uVar);
        pk4.d dVar8 = gVar.f442340i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar8);
        dVar8.mo69422xed060d07();
        pk4.d dVar42 = gVar.f442340i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar42);
        dVar42.m158663x360a109e(gVar);
        pk4.d dVar52 = gVar.f442340i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar52);
        dVar52.m158657x764cf626(true);
        pk4.d dVar62 = gVar.f442340i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar62);
        dVar62.mo69431xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
        return f0Var;
    }
}
