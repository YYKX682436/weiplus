package bm2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f103525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.i f103526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.m f103527g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f103528h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, bm2.i iVar, bm2.m mVar, dk2.vg vgVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f103525e = c22789xd23e9a9b;
        this.f103526f = iVar;
        this.f103527g = mVar;
        this.f103528h = vgVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm2.j(this.f103525e, this.f103526f, this.f103527g, this.f103528h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f103524d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f103525e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vl2.s sVar = vl2.s.f519401a;
            vl2.h hVar = vl2.h.N;
            this.f103524d = 1;
            if (sVar.d(hVar, c22789xd23e9a9b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bm2.i iVar = this.f103526f;
        iVar.f103495n = true;
        android.view.View view = iVar.f103494m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-playingBg>(...)");
        this.f103527g.I(c22789xd23e9a9b, view, this.f103528h.f315788b);
        return jz5.f0.f384359a;
    }
}
