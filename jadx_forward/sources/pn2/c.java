package pn2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f438505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.f f438506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.Integer num, pn2.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438505e = num;
        this.f438506f = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pn2.c(this.f438505e, this.f438506f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        kn0.p pVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f438504d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pn2.f fVar = this.f438506f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                int intValue = this.f438505e.intValue();
                long j17 = ((mm2.e1) fVar.P0(mm2.e1.class)).f410516m;
                gk2.e eVar = gk2.e.f354004n;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f410518o : null);
                android.content.Context context = fVar.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ek2.i0 i0Var = new ek2.i0(intValue, j17, b17, xy2.c.e(context));
                this.f438504d = 1;
                obj = rm0.h.a(i0Var, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            r45.yk1 yk1Var = (r45.yk1) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition resp " + yk1Var.m75939xb282bd08(1));
            boolean V6 = ((on2.z2) fVar.P0(on2.z2.class)).V6();
            co0.s u07 = dk2.ef.f314905a.u0();
            boolean z17 = (u07 == null || (pVar = u07.D) == null || !pVar.i()) ? false : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "finallyRequestAttendLotteryWithFollowOrReserveCondition isRunning:" + V6 + ",normalMode:" + z17);
            if (V6) {
                if (yk1Var.m75939xb282bd08(1) == 1) {
                    if (z17) {
                        fVar.v1();
                    } else {
                        on2.z2 z2Var = (on2.z2) fVar.P0(on2.z2.class);
                        z2Var.f428631s = z2Var.f428625m;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "cacheLotteryInfo:" + z2Var.f428631s);
                    }
                } else if (pm0.v.z(yk1Var.m75939xb282bd08(2), 4)) {
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzd), 0).show();
                }
            }
            return f0Var;
        } catch (rm0.j e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition errorCode=" + e17.f478958f + " errorType=" + e17.f478957e + " error.message " + e17.f478959g);
            return f0Var;
        }
    }
}
