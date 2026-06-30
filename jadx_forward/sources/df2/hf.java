package df2;

/* loaded from: classes3.dex */
public final class hf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qf f311857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(df2.qf qfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311857e = qfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.hf(this.f311857e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.hf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311856d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.qf qfVar = this.f311857e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j j17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.j(((mm2.j2) qfVar.m56788xbba4bfc0(mm2.j2.class)).f410698m, 1);
            df2.gf gfVar = new df2.gf(qfVar);
            this.f311856d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.p0) j17).a(gfVar, this) == aVar) {
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
