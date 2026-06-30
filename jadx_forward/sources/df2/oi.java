package df2;

/* loaded from: classes3.dex */
public final class oi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wi f312502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e f312503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(df2.wi wiVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312502e = wiVar;
        this.f312503f = c19788xd7cfd73e;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.oi(this.f312502e, this.f312503f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.oi) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312501d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.wi wiVar = this.f312502e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wiVar.f313223m, "[continuePost] mainjob step2");
            zl2.r4 r4Var = zl2.r4.f555483a;
            gk2.e liveRoomData = wiVar.getStore().getLiveRoomData();
            df2.ni niVar = new df2.ni(wiVar, this.f312503f);
            this.f312501d = 1;
            if (r4Var.s2(liveRoomData, niVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
