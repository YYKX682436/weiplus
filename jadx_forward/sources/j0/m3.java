package j0;

/* loaded from: classes13.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f377983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.e f377984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(z.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377984e = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j0.m3(this.f377984e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.m3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377983d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z.e eVar = this.f377984e;
            java.lang.Float f17 = new java.lang.Float(0.0f);
            float f18 = j0.q3.f378051a;
            z.p0 a17 = z.q.a(z.q.b(j0.p3.f378032d), null, 0L, 6, null);
            this.f377983d = 1;
            if (z.e.c(eVar, f17, a17, null, null, this, 12, null) == aVar) {
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
