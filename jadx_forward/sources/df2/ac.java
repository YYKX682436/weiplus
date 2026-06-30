package df2;

/* loaded from: classes3.dex */
public final class ac extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.jc f311239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(df2.jc jcVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311239e = jcVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ac(this.f311239e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ac) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311238d;
        df2.jc jcVar = this.f311239e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (((mm2.c1) jcVar.m56788xbba4bfc0(mm2.c1.class)).a8()) {
                this.f311238d = 1;
                if (df2.jc.a7(jcVar, this) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.jc.Z6(jcVar, "checkDataPanel");
        return jz5.f0.f384359a;
    }
}
