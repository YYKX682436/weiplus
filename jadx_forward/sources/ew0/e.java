package ew0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f338545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew0.l f338546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ew0.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338546e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ew0.e(this.f338546e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ew0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String f17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f338545d;
        ew0.l lVar = this.f338546e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xw0.r u76 = lVar.u7();
            sw0.b bVar = lVar.f430651q;
            java.lang.String str = bVar != null ? bVar.f494948b : null;
            if (bVar == null || (f17 = bVar.f494949c) == null) {
                f17 = lVar.u7().f(ug.m.Narration);
            }
            java.lang.String str2 = lVar.u7().f539177h.f129757b;
            this.f338545d = 1;
            if (u76.g(str, f17, str2, this) == aVar) {
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
        xw0.r u77 = lVar.u7();
        sw0.b bVar2 = lVar.f430651q;
        java.lang.String str3 = bVar2 != null ? bVar2.f494950d : null;
        this.f338545d = 2;
        if (u77.n(str3, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
