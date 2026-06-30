package sp2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f492524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492524e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.c(this.f492524e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492523d;
        long j17 = this.f492524e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRedDotEnterLive: clear preload live play core, liveId=");
            sb6.append(pm0.v.u(j17));
            sb6.append(", playerPreloadJob=");
            int i18 = uc.n.f507798k1;
            sb6.append(uc.m.f507797a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareNewEntranceUI", sb6.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var = uc.m.f507797a;
            if (r2Var != null) {
                this.f492523d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        co0.b.f125242e2.d(j17, true);
        return jz5.f0.f384359a;
    }
}
