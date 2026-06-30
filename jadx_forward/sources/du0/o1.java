package du0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(du0.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f324938e = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du0.o1(this.f324938e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.o1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324937d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f324937d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        du0.p1 p1Var = this.f324938e;
        ev0.c cVar = p1Var.f324947q;
        if (cVar == null ? false : ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10933xa4cfa6f3) cVar.g().e()).r()) {
            try {
                ev0.c cVar2 = p1Var.f324947q;
                if (cVar2 != null) {
                    java.util.List mediaItems = p1Var.c7().N5();
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b76 = p1Var.b7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItems, "mediaItems");
                    ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10933xa4cfa6f3) cVar2.g().e()).t(cVar2.f303888e);
                    cVar2.p(mediaItems, b76);
                    ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10933xa4cfa6f3) cVar2.g().e()).w();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MusicTipUIC", "refreshRecommendData error: " + e17.getMessage());
            }
        }
        return jz5.f0.f384359a;
    }
}
