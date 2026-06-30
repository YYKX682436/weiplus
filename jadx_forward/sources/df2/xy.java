package df2;

/* loaded from: classes3.dex */
public final class xy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f313360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f313361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313360d = o4Var;
        this.f313361e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.xy(this.f313360d, this.f313361e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.xy xyVar = (df2.xy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        xyVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f313360d;
        java.lang.String[] b17 = o4Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "allKeys(...)");
        for (java.lang.String str : b17) {
            long j17 = o4Var.getLong(str, -1L);
            if (j17 > 0 && this.f313361e - j17 > 604800000) {
                o4Var.remove(str);
            }
        }
        return jz5.f0.f384359a;
    }
}
