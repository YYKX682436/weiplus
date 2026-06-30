package lj2;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f400432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.p f400433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, lj2.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f400432e = str;
        this.f400433f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lj2.o(this.f400432e, this.f400433f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lj2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vl2.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f400431d;
        lj2.p pVar = this.f400433f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f400432e;
            switch (str.hashCode()) {
                case -1236483807:
                    if (str.equals("finder_live_pk_result_win_streak.pag")) {
                        hVar = vl2.h.V;
                        break;
                    }
                    hVar = null;
                    break;
                case 42444364:
                    if (str.equals("finder_live_pk_result_win_en.pag")) {
                        hVar = vl2.h.U;
                        break;
                    }
                    hVar = null;
                    break;
                case 2029041612:
                    if (str.equals("finder_live_pk_result_win.pag")) {
                        hVar = vl2.h.T;
                        break;
                    }
                    hVar = null;
                    break;
                case 2078908631:
                    if (str.equals("finder_live_pk_result_win_streak_en.pag")) {
                        hVar = vl2.h.W;
                        break;
                    }
                    hVar = null;
                    break;
                default:
                    hVar = null;
                    break;
            }
            if (hVar != null) {
                vl2.s sVar = vl2.s.f519401a;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = pVar.f400447g;
                this.f400431d = 1;
                if (sVar.d(hVar, c22789xd23e9a9b, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (pVar.f400447g.getVisibility() == 0) {
            pVar.f400447g.g();
            pVar.f400447g.d();
        }
        return jz5.f0.f384359a;
    }
}
