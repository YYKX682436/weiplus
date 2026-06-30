package ya2;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f542040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f542041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(zy2.i5 i5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542041e = i5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ya2.l1(this.f542041e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ya2.l1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f542040d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g92.b bVar = g92.b.f351302e;
            this.f542040d = 1;
            x17 = bVar.x1(8, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(x17)) {
            this.f542041e.a((r45.lk2) x17);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(x17) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderUserApi", "requestUserPrepare failed");
        }
        return jz5.f0.f384359a;
    }
}
