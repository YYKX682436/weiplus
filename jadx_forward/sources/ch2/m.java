package ch2;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.q f122935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ch2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122935e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.m(this.f122935e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f122934d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ch2.q qVar = this.f122935e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = ((om2.g) qVar.m56788xbba4bfc0(om2.g.class)).f427836g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f3Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.tencent.mm.plugin.finder.live.viewmodel.data.business.ktv.SingState?>");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j n17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.n(f3Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
            ch2.l lVar = new ch2.l(qVar);
            this.f122934d = 1;
            if (n17.a(lVar, this) == aVar) {
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
