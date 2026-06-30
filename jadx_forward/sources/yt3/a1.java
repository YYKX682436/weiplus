package yt3;

/* loaded from: classes5.dex */
public final class a1 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f546871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yt3.c1 f546872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(yt3.c1 c1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f546872e = c1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yt3.a1(this.f546872e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((yt3.a1) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f546871d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yz5.l lVar = this.f546872e.f546913g;
            this.f546871d = 1;
            obj = lVar.mo146xb9724478(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar2 = (jz5.l) obj;
        return new dw3.m0((java.util.List) lVar2.f384366d, (java.util.List) lVar2.f384367e);
    }
}
