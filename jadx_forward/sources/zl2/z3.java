package zl2;

/* loaded from: classes.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ba4 f555583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(gk2.e eVar, r45.ba4 ba4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555582e = eVar;
        this.f555583f = ba4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zl2.z3(this.f555582e, this.f555583f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.z3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f555581d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.xf k17 = dk2.ef.f314905a.k(this.f555582e);
            if (k17 == null) {
                return null;
            }
            this.f555581d = 1;
            dk2.r4 r4Var = (dk2.r4) k17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setAudioBg] liveRoomImg = ");
            r45.ba4 ba4Var = this.f555583f;
            sb6.append(pm0.b0.g(ba4Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, sb6.toString());
            long m75942xfb822ef2 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410516m;
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 7);
            hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ba4Var.mo14344x5f01b1f6()));
            obj = rm0.h.a(new ek2.r1(m75942xfb822ef2, j17, 1, hx0Var), 0L, null, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return (r45.m02) obj;
    }
}
