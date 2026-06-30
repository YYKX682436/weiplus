package df2;

/* loaded from: classes3.dex */
public final class kv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lv f312135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(df2.lv lvVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312135e = lvVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.kv(this.f312135e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.kv) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312134d;
        df2.lv lvVar = this.f312135e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (((mm2.c1) lvVar.m56788xbba4bfc0(mm2.c1.class)).a8()) {
                boolean z17 = ((je2.n) lvVar.m56788xbba4bfc0(je2.n.class)).P6() != null;
                this.f312134d = 1;
                if (df2.lv.Z6(lvVar, "onViewMount_liveStarted", z17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = ((je2.n) lvVar.m56788xbba4bfc0(je2.n.class)).f380783n;
        df2.jv jvVar = new df2.jv(lvVar);
        this.f312134d = 2;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var;
        q2Var.getClass();
        if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(q2Var, jvVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
