package q10;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f441040d = str;
        this.f441041e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q10.g(this.f441040d, this.f441041e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        q10.g gVar = (q10.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f441040d;
        boolean z17 = str.length() > 0;
        yz5.l lVar = this.f441041e;
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e("Upload Result: " + str);
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "File uploaded! jobUrl copied to clipboard", 0).show();
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
