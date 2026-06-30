package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 f199275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199275e = i8Var;
        this.f199276f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a8(this.f199275e, this.f199276f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199274d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f199274d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(600L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        sf2.e0 e0Var = this.f199275e.H;
        e0Var.getClass();
        java.lang.String content = this.f199276f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(content, ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315412h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "have search content:" + content + '!');
        } else {
            e0Var.f488647p = content;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var = e0Var.f488644m;
            if (i8Var != null) {
                i8Var.j0(true);
            }
            ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315414j = 0;
            ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315413i = null;
            new ek2.k2(((mm2.e1) e0Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) e0Var.m56788xbba4bfc0(mm2.e1.class)).f410518o, xy2.c.e(e0Var.O6()), ((mm2.e1) e0Var.m56788xbba4bfc0(mm2.e1.class)).f410516m, content, ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().f315413i, new sf2.d0(e0Var, content)).l().f(e0Var.N6());
        }
        return jz5.f0.f384359a;
    }
}
