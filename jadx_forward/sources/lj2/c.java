package lj2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f400361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.d f400362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, lj2.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f400361e = str;
        this.f400362f = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lj2.c(this.f400361e, this.f400362f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lj2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vl2.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f400360d;
        lj2.d dVar = this.f400362f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f400361e;
            switch (str.hashCode()) {
                case -1236483807:
                    if (str.equals("finder_live_pk_result_win_streak.pag")) {
                        hVar = vl2.h.V;
                        break;
                    }
                    hVar = null;
                    break;
                case -1186992732:
                    if (str.equals("finder_live_pk_result_draw.pag")) {
                        hVar = vl2.h.R;
                        break;
                    }
                    hVar = null;
                    break;
                case -1001225868:
                    if (str.equals("finder_live_pk_result_draw_en.pag")) {
                        hVar = vl2.h.S;
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
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = dVar.f400380j;
                this.f400360d = 1;
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
        if (dVar.f400380j.getVisibility() == 0) {
            dVar.f400380j.g();
            dVar.f400380j.d();
        }
        return jz5.f0.f384359a;
    }
}
