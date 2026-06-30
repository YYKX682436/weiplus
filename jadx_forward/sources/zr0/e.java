package zr0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f556653d;

    /* renamed from: e, reason: collision with root package name */
    public int f556654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr0.p f556655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ is0.c f556656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zr0.p pVar, is0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f556655f = pVar;
        this.f556656g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zr0.e(this.f556655f, this.f556656g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zr0.e) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zr0.p pVar;
        zr0.p pVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f556654e;
        is0.c cVar = this.f556656g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pVar = this.f556655f;
            nr0.c cVar2 = pVar.f556703m;
            if (cVar2 != null) {
                this.f556653d = pVar;
                this.f556654e = 1;
                java.lang.Object d17 = cVar2.d(cVar, this);
                if (d17 == aVar) {
                    return aVar;
                }
                pVar2 = pVar;
                obj = d17;
            }
            pVar2 = pVar;
            pVar2.f556704n = cVar;
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pVar2 = (zr0.p) this.f556653d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        is0.c cVar3 = (is0.c) obj;
        if (cVar3 != null) {
            cVar = cVar3;
            pVar2.f556704n = cVar;
            return jz5.f0.f384359a;
        }
        pVar = pVar2;
        pVar2 = pVar;
        pVar2.f556704n = cVar;
        return jz5.f0.f384359a;
    }
}
