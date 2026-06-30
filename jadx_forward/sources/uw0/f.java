package uw0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f513088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.o f513089e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uw0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513089e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new uw0.f(this.f513089e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String f17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f513088d;
        uw0.o oVar = this.f513089e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xw0.r u76 = oVar.u7();
            sw0.b bVar = oVar.f430651q;
            java.lang.String str = bVar != null ? bVar.f494948b : null;
            if (bVar == null || (f17 = bVar.f494949c) == null) {
                f17 = oVar.u7().f(ug.m.ContentDesc);
            }
            this.f513088d = 1;
            if (u76.g(str, f17, null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        xw0.r u77 = oVar.u7();
        sw0.b bVar2 = oVar.f430651q;
        java.lang.String str2 = bVar2 != null ? bVar2.f494950d : null;
        this.f513088d = 2;
        if (u77.n(str2, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
