package fd2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f342794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd2.j f342795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dq.b f342796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fd2.j jVar, dq.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f342795e = jVar;
        this.f342796f = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fd2.c(this.f342795e, this.f342796f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fd2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f342794d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f342794d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fd2.j jVar = this.f342795e;
        boolean P6 = jVar.P6().P6(ed2.a.f332786e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareTipsBubbleUIC", "onUpwardFastScrollListener, tryShow dislike edu tips result: " + P6);
        if (P6) {
            dq.b bVar = this.f342796f;
            bVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bVar.f323818b;
            if (o4Var != null) {
                o4Var.A("KEY_FINDER_EDU_TIPS_SHOW_TIME_".concat("dislike_edu_tips"), c01.id.e());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMMKVManager", "markEduTipsShowOnce key=".concat("dislike_edu_tips"));
            in5.s0 s0Var = jVar.P6().f332803f;
            fd2.j.O6(jVar, "view_exp", s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null);
        }
        return jz5.f0.f384359a;
    }
}
